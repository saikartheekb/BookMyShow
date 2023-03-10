package com.capstoneproject.BookMyShow.Converter;

import com.capstoneproject.BookMyShow.Dto.EntryDto.TheaterEntryDto;
import com.capstoneproject.BookMyShow.Dto.ResponseDto.TheaterResponseDto;
import com.capstoneproject.BookMyShow.Model.TheaterEntity;
import lombok.experimental.UtilityClass;

@UtilityClass
public class TheaterConverter {

    public static TheaterEntity dtoToEntity(TheaterEntryDto theaterEntryDto){
        return TheaterEntity
                .builder()
                .name(theaterEntryDto.getName())
                .city(theaterEntryDto.getCity())
                .address(theaterEntryDto.getAddress())
                .build();
    }

    public static TheaterResponseDto entityToDto(TheaterEntity theaterEntity){
        return TheaterResponseDto
                .builder()
                .id(theaterEntity.getId())
                .name(theaterEntity.getName())
                .city(theaterEntity.getCity())
                .address(theaterEntity.getAddress())
                .type(theaterEntity.getType())
                .build();
    }
}
