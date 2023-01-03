package com.capstoneproject.BookMyShow.Controller;

import com.capstoneproject.BookMyShow.Dto.BookTicketRequestDto;
import com.capstoneproject.BookMyShow.Dto.ResponseDto.TicketResponseDto;
import com.capstoneproject.BookMyShow.Service.Impl.TicketServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("ticket")
public class TicketController {

    @Autowired
    TicketServiceImpl ticketService;

    @PostMapping("add")
    public TicketResponseDto addTicket(@RequestBody() BookTicketRequestDto bookTicketRequestDto){
        log.info("In ticket controller");
        return ticketService.bookTicket(bookTicketRequestDto);
    }

    @GetMapping("get/{id}")
    public TicketResponseDto getTicket(@PathVariable int id){
        return ticketService.getTicket(id);
    }
}
