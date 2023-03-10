package com.capstoneproject.BookMyShow.Dto.EntryDto;

import com.capstoneproject.BookMyShow.Enums.TheaterType;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TheaterEntryDto {

    String name;
    String city;
    String address;
}
