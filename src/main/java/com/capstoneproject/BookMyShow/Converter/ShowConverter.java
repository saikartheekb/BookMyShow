package com.capstoneproject.BookMyShow.Converter;

import com.capstoneproject.BookMyShow.Dto.EntryDto.ShowEntryDto;
import com.capstoneproject.BookMyShow.Dto.ResponseDto.ShowResponseDto;
import com.capstoneproject.BookMyShow.Model.ShowEntity;
import lombok.experimental.UtilityClass;

@UtilityClass
public class ShowConverter {

    public static ShowEntity dtoToEntity(ShowEntryDto showEntryDto){
        return ShowEntity.builder()
                .showTime(showEntryDto.getShowTime())
                .showDate(showEntryDto.getShowDate())
                .build();
    }

    public static ShowResponseDto entityToDto(ShowEntity showEntity, ShowEntryDto showEntryDto){
        return ShowResponseDto.builder()
                .id(showEntity.getId())
                .showTime(showEntity.getShowTime())
                .showDate(showEntity.getShowDate())
                .movieResponseDto(showEntryDto.getMovieResponseDto())
//                .theaterDto(showEntryDto.getTheaterResponseDto())
                .build();
    }
}
