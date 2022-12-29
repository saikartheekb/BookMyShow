package com.capstoneproject.BookMyShow.Controller;

import com.capstoneproject.BookMyShow.Dto.EntryDto.ShowEntryDto;
import com.capstoneproject.BookMyShow.Service.Impl.ShowServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("show")
public class ShowController {

    @Autowired
    ShowServiceImpl showService;

    @PostMapping("add")
    ResponseEntity<ShowEntryDto> addShow(@RequestBody() ShowEntryDto show){
        showService.addShow(show);
        return new ResponseEntity<>(show, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    ResponseEntity<ShowEntryDto> getShow(int id){
        ShowEntryDto showEntryDto = showService.getShow(id);
        return new ResponseEntity<>(showEntryDto, HttpStatus.FOUND);
    }
}
