package com.capstoneproject.BookMyShow.Dto.ResponseDto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TheaterResponseDto {

    private int id;
    private String name;
    private String city;
    private String address;
}
