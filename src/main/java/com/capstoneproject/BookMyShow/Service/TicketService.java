package com.capstoneproject.BookMyShow.Service;

import com.capstoneproject.BookMyShow.Dto.BookTicketRequestDto;
import com.capstoneproject.BookMyShow.Dto.ResponseDto.TicketResponseDto;
import com.capstoneproject.BookMyShow.Dto.TicketDto;
import org.springframework.stereotype.Service;

@Service
public interface TicketService {

    TicketResponseDto bookTicket(BookTicketRequestDto bookRequestDto);

    TicketResponseDto getTicket(int id);

}
