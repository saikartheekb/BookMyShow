package com.capstoneproject.BookMyShow.Dto.ResponseDto;

import com.capstoneproject.BookMyShow.Dto.TicketDto;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserResponseDto {

    int id;

    String name;

    String mobile;

    //Optional
    List<TicketDto> tickets;

}
