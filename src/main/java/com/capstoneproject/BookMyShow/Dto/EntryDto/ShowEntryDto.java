package com.capstoneproject.BookMyShow.Dto.EntryDto;

import com.capstoneproject.BookMyShow.Dto.MovieDto;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ShowEntryDto {
    private int id;
    private LocalDate showDate;
    private LocalTime showTime;
    private MovieDto movieDto;
    private TheaterEntryDto theaterEntryDto;
}

