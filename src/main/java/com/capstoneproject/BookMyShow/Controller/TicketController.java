package com.capstoneproject.BookMyShow.Controller;

import com.capstoneproject.BookMyShow.Dto.BookTicketRequestDto;
import com.capstoneproject.BookMyShow.Dto.ResponseDto.TicketResponseDto;
import com.capstoneproject.BookMyShow.Service.Impl.TicketServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("ticket")
public class TicketController {

    @Autowired
    TicketServiceImpl ticketService;

    @PostMapping("add")
    public ResponseEntity<TicketResponseDto> addTicket(@RequestBody() BookTicketRequestDto bookTicketRequestDto){
        TicketResponseDto ticketResponse = ticketService.bookTicket(bookTicketRequestDto);
        return new ResponseEntity<>(ticketResponse, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<TicketResponseDto> getTicket(int id){
        TicketResponseDto ticketResponse = ticketService.getTicket(id);
        return new ResponseEntity<>(ticketResponse, HttpStatus.FOUND);
    }
}
