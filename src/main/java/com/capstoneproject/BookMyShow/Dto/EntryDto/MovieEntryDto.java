package com.capstoneproject.BookMyShow.Dto.EntryDto;

import com.sun.istack.NotNull;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MovieEntryDto {

    String name;

    @NotNull
    LocalDate releaseDate;
}
