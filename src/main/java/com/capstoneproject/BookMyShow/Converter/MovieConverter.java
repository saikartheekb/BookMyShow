package com.capstoneproject.BookMyShow.Converter;

import com.capstoneproject.BookMyShow.Dto.MovieDto;
import com.capstoneproject.BookMyShow.Model.MovieEntity;
import lombok.experimental.UtilityClass;

@UtilityClass
public class MovieConverter {

    public static MovieEntity dtoToEntity(MovieDto movieDto){
        return MovieEntity
                .builder()
                .name(movieDto.getName())
                .releaseDate(movieDto.getReleaseDate())
                .build();
    }

    public static MovieDto entityToDto(MovieEntity movieEntity){
        return MovieDto
                .builder()
                .name(movieEntity.getName())
                .releaseDate(movieEntity.getReleaseDate())
                .build();
    }
}
