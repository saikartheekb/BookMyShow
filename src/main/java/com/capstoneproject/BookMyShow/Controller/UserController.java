package com.capstoneproject.BookMyShow.Controller;

import com.capstoneproject.BookMyShow.Dto.EntryDto.UserEntryDto;
import com.capstoneproject.BookMyShow.Dto.ResponseDto.UserResponseDto;
import com.capstoneproject.BookMyShow.Service.Impl.UserServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("user")
public class UserController {

    @Autowired
    UserServiceImpl userService;

    @PostMapping("add")
    public ResponseEntity addUser(@RequestBody UserEntryDto userEntry){
        userService.addUser(userEntry);
        return new ResponseEntity<>("User added successfully", HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<UserResponseDto> getUser(@PathVariable() int id){
        UserResponseDto user = userService.getUser(id);
        return new ResponseEntity<>(user, HttpStatus.ACCEPTED);
    }

    @DeleteMapping("delete_user/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable() int id){
        UserResponseDto user = userService.deleteUser(id);
        return new ResponseEntity<>(user + "is deleted from DB", HttpStatus.ACCEPTED);
    }
}
