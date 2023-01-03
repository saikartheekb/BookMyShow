package com.capstoneproject.BookMyShow.Dto.EntryDto;

import com.capstoneproject.BookMyShow.Dto.ResponseDto.MovieResponseDto;
import com.capstoneproject.BookMyShow.Dto.ResponseDto.TheaterResponseDto;
import com.sun.istack.NotNull;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ShowEntryDto {
    @NotNull
    LocalDate showDate;
    @NotNull
    LocalTime showTime;
    @NotNull
    MovieResponseDto movieResponseDto;
    @NotNull
    TheaterResponseDto theaterResponseDto;
}

