package com.capstoneproject.BookMyShow.Dto.ResponseDto;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MovieNameAndIdObject {

    int id;
    String name;

}