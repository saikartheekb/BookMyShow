package com.capstoneproject.BookMyShow.Converter;

import com.capstoneproject.BookMyShow.Dto.EntryDto.ShowEntryDto;
import com.capstoneproject.BookMyShow.Model.ShowEntity;
import lombok.experimental.UtilityClass;

@UtilityClass
public class ShowConverter {

    public static ShowEntity dtoToEntity(ShowEntryDto showEntryDto){
        return ShowEntity
                .builder()
                .id(showEntryDto.getId())
                .showTime(showEntryDto.getShowTime())
                .showDate(showEntryDto.getShowDate())
                .build();
    }

    public static ShowEntryDto entityToDto(ShowEntity showEntity){
        return ShowEntryDto
                .builder()
                .id(showEntity.getId())
                .showTime(showEntity.getShowTime())
                .showDate(showEntity.getShowDate())
                .build();
    }
}
