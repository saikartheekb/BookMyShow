package com.capstoneproject.BookMyShow.Service.Impl;

import com.capstoneproject.BookMyShow.Converter.ShowConverter;
import com.capstoneproject.BookMyShow.Dto.EntryDto.ShowEntryDto;
import com.capstoneproject.BookMyShow.Model.*;
import com.capstoneproject.BookMyShow.Repository.*;
import com.capstoneproject.BookMyShow.Service.ShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ShowServiceImpl implements ShowService {

    @Autowired
    MovieRepository movieRepository;

    @Autowired
    TheaterRepository theaterRepository;

    @Autowired
    ShowSeatsRepository showSeatsRepository;

    @Autowired
    ShowRepository showRepository;

    @Override
    public ShowEntryDto addShow(ShowEntryDto showEntryDto) {
        ShowEntity showEntity = ShowConverter.dtoToEntity(showEntryDto);

        MovieEntity movie = movieRepository.findById(showEntryDto.getMovieDto().getId()).get();
        showEntity.setMovie(movie);

        TheaterEntity theater = theaterRepository.findById(showEntryDto.getTheaterEntryDto().getId()).get();
        showEntity.setTheater(theater);
        
        List<ShowSeatsEntity> seats = createShowSeatsEntity(theater.getSeats(), showEntity);
        showEntity.setSeats(seats);

        showRepository.save(showEntity);

        return showEntryDto;
    }

    private List<ShowSeatsEntity> createShowSeatsEntity(List<TheaterSeatsEntity> theaterSeats, ShowEntity showEntity) {

        List<ShowSeatsEntity> showSeats = new ArrayList<>();
        for(TheaterSeatsEntity seat: theaterSeats){
            ShowSeatsEntity showSeat = ShowSeatsEntity
                                                .builder()
                                                .id(seat.getId())
                                                .seatType(seat.getSeatType())
                                                .seatNumber(seat.getSeatNumber())
                                                .show(showEntity)
                                                .build();
            showSeats.add(showSeat);
        }
        showSeatsRepository.saveAll(showSeats);
        return showSeats;
    }

    @Override
    public ShowEntryDto getShow(int id) {
        ShowEntity show = showRepository.findById(id).get();
        return ShowConverter.entityToDto(show);
    }
}
