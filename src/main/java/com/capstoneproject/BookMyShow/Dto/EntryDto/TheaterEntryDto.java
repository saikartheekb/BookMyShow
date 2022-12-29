package com.capstoneproject.BookMyShow.Dto.EntryDto;

import com.capstoneproject.BookMyShow.Enums.TheaterType;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TheaterEntryDto {

    private int id;
    private String name;
    private String city;
    private String address;
    TheaterType type;
    ShowEntryDto showEntryDto;
}
