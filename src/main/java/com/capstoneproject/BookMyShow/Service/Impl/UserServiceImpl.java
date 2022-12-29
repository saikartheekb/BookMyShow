package com.capstoneproject.BookMyShow.Service.Impl;

import com.capstoneproject.BookMyShow.Converter.UserConverter;
import com.capstoneproject.BookMyShow.Dto.EntryDto.UserEntryDto;
import com.capstoneproject.BookMyShow.Dto.ResponseDto.UserResponseDto;
import com.capstoneproject.BookMyShow.Model.UserEntity;
import com.capstoneproject.BookMyShow.Repository.UserRepository;
import com.capstoneproject.BookMyShow.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public void addUser(UserEntryDto userEntry) {
        UserEntity userEntity = UserConverter.dtoToEntity(userEntry);
        userRepository.save(userEntity);
    }

    @Override
    public UserResponseDto getUser(int id) {
        UserEntity userEntity = userRepository.findById(id).get();
        return UserConverter.entityToDto(userEntity);
    }

    @Override
    public UserResponseDto deleteUser(int id) {
        UserEntity userEntity = userRepository.findById(id).get();
        userRepository.deleteById(id);
        return UserConverter.entityToDto(userEntity);
    }

}
