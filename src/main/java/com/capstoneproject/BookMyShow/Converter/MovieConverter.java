package com.capstoneproject.BookMyShow.Converter;

import com.capstoneproject.BookMyShow.Dto.EntryDto.MovieEntryDto;
import com.capstoneproject.BookMyShow.Dto.ResponseDto.MovieNameAndIdObject;
import com.capstoneproject.BookMyShow.Dto.ResponseDto.MovieResponseDto;
import com.capstoneproject.BookMyShow.Model.MovieEntity;
import lombok.experimental.UtilityClass;

@UtilityClass
public class MovieConverter {

    public static MovieEntity dtoToEntity(MovieEntryDto movieEntryDto){
        return MovieEntity
                .builder()
                .name(movieEntryDto.getName())
                .releaseDate(movieEntryDto.getReleaseDate())
                .build();
    }

    public static MovieResponseDto entityToDto(MovieEntity movieEntity){
        return MovieResponseDto
                .builder()
                .name(movieEntity.getName())
                .releaseDate(movieEntity.getReleaseDate())
                .build();
    }

    public static MovieNameAndIdObject convertEntityToThisObject(MovieEntity movieEntity){
        return MovieNameAndIdObject.builder().
                id(movieEntity.getId())
                .name(movieEntity.getName()).build();
    }
}
