package com.capstoneproject.BookMyShow.Dto.ResponseDto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TicketResponseDto {

    int id;
    String allottedSeats;
    double amount;

}
