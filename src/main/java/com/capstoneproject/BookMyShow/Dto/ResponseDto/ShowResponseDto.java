package com.capstoneproject.BookMyShow.Dto.ResponseDto;

import com.capstoneproject.BookMyShow.Dto.EntryDto.TheaterEntryDto;
import com.capstoneproject.BookMyShow.Dto.MovieDto;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ShowResponseDto {
    private int id;
    private LocalDate showDate;
    private LocalTime showTime;
    private MovieDto movieDto;
    private TheaterEntryDto theater;
}
