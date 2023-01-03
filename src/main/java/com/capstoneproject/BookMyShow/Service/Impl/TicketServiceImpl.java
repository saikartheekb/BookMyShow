package com.capstoneproject.BookMyShow.Service.Impl;

import com.capstoneproject.BookMyShow.Converter.TicketConverter;
import com.capstoneproject.BookMyShow.Dto.BookTicketRequestDto;
import com.capstoneproject.BookMyShow.Dto.ResponseDto.TicketResponseDto;
import com.capstoneproject.BookMyShow.Dto.TicketDto;
import com.capstoneproject.BookMyShow.Model.ShowEntity;
import com.capstoneproject.BookMyShow.Model.ShowSeatsEntity;
import com.capstoneproject.BookMyShow.Model.TicketEntity;
import com.capstoneproject.BookMyShow.Model.UserEntity;
import com.capstoneproject.BookMyShow.Repository.ShowRepository;
import com.capstoneproject.BookMyShow.Repository.TicketRepository;
import com.capstoneproject.BookMyShow.Repository.UserRepository;
import com.capstoneproject.BookMyShow.Service.TicketService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Service
@Slf4j
public class TicketServiceImpl implements TicketService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    ShowRepository showRepository;
    @Autowired
    private TicketRepository ticketRepository;

    @Override
    public TicketResponseDto bookTicket(BookTicketRequestDto bookTicketRequestDto) {

        UserEntity userEntity = userRepository.findById(bookTicketRequestDto.getId()).get();
        ShowEntity showEntity = showRepository.findById(bookTicketRequestDto.getShowId()).get();

        log.info("Ticket half processed");

        Set<String> requestSeats = bookTicketRequestDto.getRequestedSeats();

        List<ShowSeatsEntity> showSeatsEntityList = showEntity.getSeats();

        List<ShowSeatsEntity> bookedSeats = new ArrayList<>();

        for(ShowSeatsEntity seat :showSeatsEntityList){

            if(!seat.isBooked()&&seat.getSeatType().equals(bookTicketRequestDto.getSeatType())&&requestSeats.contains(seat.getSeatNumber())){
                bookedSeats.add(seat);
            }
        }

        for(ShowSeatsEntity seat: bookedSeats) System.out.println(seat);
        if(bookedSeats.size()!=requestSeats.size()){
            //All the seats are not available
            throw new Error("All Seats not available");
        }

        //Step 2

        TicketEntity ticketEntity = TicketEntity.builder().
                user(userEntity)
                .show(showEntity)
                .seats(bookedSeats).
                build();

        //Step 3 :

        double amount = 0;

        for(ShowSeatsEntity showSeatsEntity: bookedSeats){

            showSeatsEntity.setBooked(true);
            showSeatsEntity.setBookedOn(new Date());
            showSeatsEntity.setTicket(ticketEntity);

            amount = amount + showSeatsEntity.getPrice();
        }

        ticketEntity.setBookedOn(new Date());
        ticketEntity.setAllottedSeats(convertListOfSeatsEntityToString(bookedSeats));
        ticketEntity.setAmount(amount);


        //Connect in thw Show and the user

        showEntity.getTickets().add(ticketEntity);


        //Add the ticket in the tickets list of the user Entity
        userEntity.getTickets().add(ticketEntity);

        ticketEntity = ticketRepository.save(ticketEntity);

//        ShowConvertor TicketConvertor;
        return TicketConverter.entityToDto(ticketEntity);
    }

    private String convertListOfSeatsEntityToString(List<ShowSeatsEntity> bookedSeats) {
        String str = "";
        for(ShowSeatsEntity showSeatsEntity : bookedSeats){

            str = str + showSeatsEntity.getSeatNumber()+" ";
        }

        return str;
    }

    @Override
    public TicketResponseDto getTicket(int id) {
        TicketEntity ticket = ticketRepository.findById(id).get();
        return TicketConverter.entityToDto(ticket);
    }
}
