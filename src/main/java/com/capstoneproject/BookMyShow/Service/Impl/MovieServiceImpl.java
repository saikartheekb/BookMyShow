package com.capstoneproject.BookMyShow.Service.Impl;

import com.capstoneproject.BookMyShow.Converter.MovieConverter;
import com.capstoneproject.BookMyShow.Dto.EntryDto.MovieEntryDto;
import com.capstoneproject.BookMyShow.Dto.ResponseDto.MovieNameAndIdObject;
import com.capstoneproject.BookMyShow.Dto.ResponseDto.MovieResponseDto;
import com.capstoneproject.BookMyShow.Model.MovieEntity;
import com.capstoneproject.BookMyShow.Repository.MovieRepository;
import com.capstoneproject.BookMyShow.Service.MovieService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MovieServiceImpl implements MovieService {

    @Autowired
    MovieRepository movieRepository;

    @Override
    public MovieResponseDto addMovie(MovieEntryDto movieEntryDto) {
        MovieResponseDto movieResponseDto = null;
        if(movieRepository.existsByName(movieEntryDto.getName())){
            movieResponseDto.setName("This movie already exists");
            return movieResponseDto;
        }

        log.info("In the function add movie" + movieEntryDto);

        // Creating Movie Entity object
        MovieEntity movie = MovieConverter.dtoToEntity(movieEntryDto);
        movie = movieRepository.save(movie); // Adds Id field

        return MovieConverter.entityToDto(movie);
    }

    @Override
    public MovieResponseDto getMovie(int id) {
        MovieEntity movie = movieRepository.findById(id).get();
        return MovieConverter.entityToDto(movie);
    }

    @Override
    public MovieNameAndIdObject getNameAndId(int id) {
        MovieEntity movieEntity = movieRepository.findById(id).get();

        MovieNameAndIdObject obj = MovieConverter.convertEntityToThisObject(movieEntity);

        return obj;
    }
}
