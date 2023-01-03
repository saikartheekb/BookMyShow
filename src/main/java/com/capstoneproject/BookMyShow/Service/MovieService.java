package com.capstoneproject.BookMyShow.Service;

import com.capstoneproject.BookMyShow.Dto.EntryDto.MovieEntryDto;
import com.capstoneproject.BookMyShow.Dto.ResponseDto.MovieNameAndIdObject;
import com.capstoneproject.BookMyShow.Dto.ResponseDto.MovieResponseDto;
import org.springframework.stereotype.Service;

@Service
public interface MovieService {

    MovieResponseDto addMovie(MovieEntryDto movieEntryDto);

    MovieResponseDto getMovie(int id);

    MovieNameAndIdObject getNameAndId(int id);


}
