package com.capstoneproject.BookMyShow.Service;

import com.capstoneproject.BookMyShow.Dto.EntryDto.TheaterEntryDto;
import com.capstoneproject.BookMyShow.Dto.ResponseDto.TheaterResponseDto;
import com.capstoneproject.BookMyShow.Model.TheaterEntity;
import org.springframework.stereotype.Service;

@Service
public interface TheaterService {

    void addTheater(TheaterEntryDto theaterEntryDto);

    TheaterResponseDto getTheater(int id);
}
