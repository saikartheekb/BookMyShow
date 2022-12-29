package com.capstoneproject.BookMyShow.Service.Impl;

import com.capstoneproject.BookMyShow.Converter.MovieConverter;
import com.capstoneproject.BookMyShow.Dto.MovieDto;
import com.capstoneproject.BookMyShow.Model.MovieEntity;
import com.capstoneproject.BookMyShow.Repository.MovieRepository;
import com.capstoneproject.BookMyShow.Service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    MovieRepository movieRepository;

    @Override
    public MovieDto addMovie(MovieDto movieDto) {

        if(movieRepository.findByName(movieDto.getName()))
            return movieDto;

        MovieEntity movie = MovieConverter.dtoToEntity(movieDto);
        movieRepository.save(movie);
        return movieDto;
    }

    @Override
    public MovieDto getMovie(int id) {
        MovieEntity movie = movieRepository.findById(id).get();
        return MovieConverter.entityToDto(movie);
    }
}
