package com.capstoneproject.BookMyShow.Controller;

import com.capstoneproject.BookMyShow.Dto.EntryDto.MovieEntryDto;
import com.capstoneproject.BookMyShow.Dto.ResponseDto.MovieNameAndIdObject;
import com.capstoneproject.BookMyShow.Dto.ResponseDto.MovieResponseDto;
import com.capstoneproject.BookMyShow.Service.Impl.MovieServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("movie")
public class MovieController {

    @Autowired
    MovieServiceImpl movieService;

    @PostMapping("add")
    public MovieResponseDto addMovie(@RequestBody() MovieEntryDto movieEntryDto){
        MovieResponseDto movieResponseDto = movieService.addMovie(movieEntryDto);
        log.info("The movieResponseDto is ", movieResponseDto);
        return movieResponseDto;
    }

    @GetMapping("get/{id}")
    public MovieNameAndIdObject getMovie(@RequestBody()int id){
        return movieService.getNameAndId(id);
    }
}
