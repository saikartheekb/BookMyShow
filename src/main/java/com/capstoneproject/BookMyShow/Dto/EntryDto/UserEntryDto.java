package com.capstoneproject.BookMyShow.Dto.EntryDto;

import lombok.*;

@Data
@Builder
public class UserEntryDto {

    @NonNull
    String name;

    @NonNull
    String mobile;

}
