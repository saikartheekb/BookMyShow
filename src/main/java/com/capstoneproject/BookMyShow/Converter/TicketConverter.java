package com.capstoneproject.BookMyShow.Converter;

import com.capstoneproject.BookMyShow.Dto.ResponseDto.TicketResponseDto;
import com.capstoneproject.BookMyShow.Dto.TicketDto;
import com.capstoneproject.BookMyShow.Model.TicketEntity;
import lombok.experimental.UtilityClass;

@UtilityClass
public class TicketConverter {
    public static TicketResponseDto entityToDto(TicketEntity ticketEntity) {

        return TicketResponseDto
                .builder()
                .id(ticketEntity.getId())
                .amount(ticketEntity.getAmount())
                .allottedSeats(ticketEntity.getAllottedSeats())
                .build();
    }
}
