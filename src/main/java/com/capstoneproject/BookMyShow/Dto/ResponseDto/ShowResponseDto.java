package com.capstoneproject.BookMyShow.Dto.ResponseDto;

import com.capstoneproject.BookMyShow.Dto.EntryDto.TheaterEntryDto;
import com.capstoneproject.BookMyShow.Dto.EntryDto.MovieEntryDto;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ShowResponseDto {
    int id;
    LocalDate showDate;
    LocalTime showTime;
    MovieResponseDto movieResponseDto;
    TheaterResponseDto theaterResponseDto;
}
