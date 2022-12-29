package com.capstoneproject.BookMyShow.Controller;

import com.capstoneproject.BookMyShow.Dto.MovieDto;
import com.capstoneproject.BookMyShow.Service.Impl.MovieServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("movie")
public class MovieController {

    @Autowired
    MovieServiceImpl movieService;

    @PostMapping("add")
    ResponseEntity<MovieDto> addMovie(@RequestBody()MovieDto movieDto){
        movieService.addMovie(movieDto);
        return new ResponseEntity<>(movieDto, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    ResponseEntity<MovieDto> getMovie(@RequestBody()int id){
        MovieDto movieDto = movieService.getMovie(id);
        return new ResponseEntity<>(movieDto, HttpStatus.FOUND);
    }

}
