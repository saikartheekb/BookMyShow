package com.capstoneproject.BookMyShow.Dto;

import com.capstoneproject.BookMyShow.Enums.SeatType;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BookTicketRequestDto {

    int id; // userid
    int showId;
    SeatType seatType;
    Set<String> requestedSeats;

}
