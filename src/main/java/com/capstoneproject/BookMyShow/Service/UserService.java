package com.capstoneproject.BookMyShow.Service;

import com.capstoneproject.BookMyShow.Dto.EntryDto.UserEntryDto;
import com.capstoneproject.BookMyShow.Dto.ResponseDto.UserResponseDto;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    void addUser(UserEntryDto userEntry);

    UserResponseDto getUser(int id);

    UserResponseDto deleteUser(int id);
}
