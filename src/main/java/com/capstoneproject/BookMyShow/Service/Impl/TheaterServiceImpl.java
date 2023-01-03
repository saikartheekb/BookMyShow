package com.capstoneproject.BookMyShow.Service.Impl;

import com.capstoneproject.BookMyShow.Converter.TheaterConverter;
import com.capstoneproject.BookMyShow.Dto.EntryDto.TheaterEntryDto;
import com.capstoneproject.BookMyShow.Dto.ResponseDto.TheaterResponseDto;
import com.capstoneproject.BookMyShow.Enums.SeatType;
import com.capstoneproject.BookMyShow.Enums.TheaterType;
import com.capstoneproject.BookMyShow.Model.TheaterEntity;
import com.capstoneproject.BookMyShow.Model.TheaterSeatsEntity;
import com.capstoneproject.BookMyShow.Repository.TheaterRepository;
import com.capstoneproject.BookMyShow.Repository.TheaterSeatsRepository;
import com.capstoneproject.BookMyShow.Service.TheaterService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class TheaterServiceImpl implements TheaterService {
    @Autowired
    TheaterSeatsRepository theaterSeatsRepository;

    @Autowired
    TheaterRepository theaterRepository;

    @Override
    public TheaterResponseDto addTheater(TheaterEntryDto theaterEntryDto) {
        TheaterEntity theaterEntity = TheaterConverter.dtoToEntity(theaterEntryDto);

        List<TheaterSeatsEntity> seats = createTheaterSeats();

        theaterEntity.setSeats(seats);
        theaterEntity.setShows(null);

        for(TheaterSeatsEntity theaterSeat : seats){
            theaterSeat.setTheater(theaterEntity);
        }

        theaterEntity.setType(TheaterType.SINGLE);

        log.info("the theater entity is "+theaterEntity);

        theaterEntity = theaterRepository.save(theaterEntity);

        return TheaterConverter.entityToDto(theaterEntity);
    }

    private List<TheaterSeatsEntity> createTheaterSeats() {
        List<TheaterSeatsEntity> seats = new ArrayList<>();
        seats.add(getTheaterSeat("A10", 100, SeatType.CLASSIC));
        seats.add(getTheaterSeat("A11", 100, SeatType.CLASSIC));
        seats.add(getTheaterSeat("A12", 100, SeatType.CLASSIC));
        seats.add(getTheaterSeat("P10", 150, SeatType.PREMIUM));
        seats.add(getTheaterSeat("P11", 150, SeatType.PREMIUM));
        seats.add(getTheaterSeat("P12", 150, SeatType.PREMIUM));

        theaterSeatsRepository.saveAll(seats);
        return seats;
    }

    private TheaterSeatsEntity getTheaterSeat(String seatNo, int price, SeatType seatType) {
        return TheaterSeatsEntity
                .builder()
                .seatNumber(seatNo)
                .price(price)
                .seatType(seatType)
                .build();
    }

    @Override
    public TheaterResponseDto getTheater(int id) {
        TheaterEntity theater = theaterRepository.findById(id).get();
        return TheaterConverter.entityToDto(theater);
    }
}
