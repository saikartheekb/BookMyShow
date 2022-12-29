package com.capstoneproject.BookMyShow.Converter;

import com.capstoneproject.BookMyShow.Dto.EntryDto.UserEntryDto;
import com.capstoneproject.BookMyShow.Dto.ResponseDto.UserResponseDto;
import com.capstoneproject.BookMyShow.Model.UserEntity;
import lombok.experimental.UtilityClass;

@UtilityClass
public class UserConverter {

    public static UserEntity dtoToEntity(UserEntryDto userEntry){

        return UserEntity
                .builder()
                .name(userEntry.getName())
                .mobile(userEntry.getMobile())
                .build();
    }

    public static UserResponseDto entityToDto(UserEntity userEntity) {
        return UserResponseDto
                .builder()
                .id(userEntity.getId())
                .name(userEntity.getName())
                .mobile(userEntity.getMobile())
                .build();
    }
}
