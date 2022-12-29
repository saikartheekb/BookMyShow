package com.capstoneproject.BookMyShow.Dto;

import com.capstoneproject.BookMyShow.Dto.EntryDto.ShowEntryDto;
import com.capstoneproject.BookMyShow.Dto.ResponseDto.UserResponseDto;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TicketDto {

    int id; // ticket id
    Set<String> allottedSeats;
    double amount;
    ShowEntryDto showEntryDto;
    UserResponseDto userDto;
}
