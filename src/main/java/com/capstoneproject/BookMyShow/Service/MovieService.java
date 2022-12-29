package com.capstoneproject.BookMyShow.Service;

import com.capstoneproject.BookMyShow.Dto.MovieDto;
import org.springframework.stereotype.Service;

@Service
public interface MovieService {

    MovieDto addMovie(MovieDto movieDto);

    MovieDto getMovie(int id);
}
