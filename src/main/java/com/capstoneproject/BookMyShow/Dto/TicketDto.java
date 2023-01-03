package com.capstoneproject.BookMyShow.Dto;

import com.capstoneproject.BookMyShow.Dto.EntryDto.ShowEntryDto;
import com.capstoneproject.BookMyShow.Dto.ResponseDto.ShowResponseDto;
import com.capstoneproject.BookMyShow.Dto.ResponseDto.UserResponseDto;
import com.sun.istack.NotNull;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TicketDto {

    int id; // ticket id
    String allottedSeats;
    double amount;
    ShowResponseDto showResponseDto;

    @NotNull
    UserResponseDto userDto;
}
