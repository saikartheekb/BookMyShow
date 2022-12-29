package com.capstoneproject.BookMyShow.Controller;

import com.capstoneproject.BookMyShow.Dto.EntryDto.TheaterEntryDto;
import com.capstoneproject.BookMyShow.Dto.ResponseDto.TheaterResponseDto;
import com.capstoneproject.BookMyShow.Service.Impl.TheaterServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("theater")
public class TheaterController {

    @Autowired
    TheaterServiceImpl theaterService;

    @PostMapping("add")
    ResponseEntity<TheaterEntryDto> addTheater(@RequestBody() TheaterEntryDto theaterEntryDto) {
        theaterService.addTheater(theaterEntryDto);
        return new ResponseEntity<>(theaterEntryDto, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    ResponseEntity<TheaterResponseDto> getTheater(int id) {
        TheaterResponseDto theater = theaterService.getTheater(id);
        return new ResponseEntity<>(theater, HttpStatus.FOUND);
    }

}
