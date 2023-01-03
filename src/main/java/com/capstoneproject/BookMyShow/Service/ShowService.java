package com.capstoneproject.BookMyShow.Service;

import com.capstoneproject.BookMyShow.Dto.EntryDto.ShowEntryDto;
import com.capstoneproject.BookMyShow.Dto.ResponseDto.ShowResponseDto;
import org.springframework.stereotype.Service;

@Service
public interface ShowService {

    ShowResponseDto addShow(ShowEntryDto showEntryDto);

}
