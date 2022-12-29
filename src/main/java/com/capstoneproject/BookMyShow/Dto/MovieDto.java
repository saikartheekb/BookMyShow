package com.capstoneproject.BookMyShow.Dto;

import com.capstoneproject.BookMyShow.Dto.EntryDto.ShowEntryDto;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MovieDto {

    private int id;
    private String name;
    private LocalDate releaseDate;
    private List<ShowEntryDto> moviesShow;
}
