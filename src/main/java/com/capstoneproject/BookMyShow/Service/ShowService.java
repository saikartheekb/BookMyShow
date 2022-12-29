package com.capstoneproject.BookMyShow.Service;

import com.capstoneproject.BookMyShow.Dto.EntryDto.ShowEntryDto;
import org.springframework.stereotype.Service;

@Service
public interface ShowService {

    ShowEntryDto addShow(ShowEntryDto showEntryDto);

    ShowEntryDto getShow(int id);
}
