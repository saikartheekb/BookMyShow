package com.capstoneproject.BookMyShow.Dto.ResponseDto;

import com.capstoneproject.BookMyShow.Enums.TheaterType;
import com.sun.istack.NotNull;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TheaterResponseDto {

    @NotNull
    int id;
    String name;
    String city;
    String address;
    TheaterType type;

}
