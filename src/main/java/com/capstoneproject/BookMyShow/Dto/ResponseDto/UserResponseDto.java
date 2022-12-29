package com.capstoneproject.BookMyShow.Dto.ResponseDto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserResponseDto {

    private int id;

    @NonNull
    private String name;

    @NonNull
    private String mobile;

}
