package com.expenseTracker.userservice.controller;

import com.expenseTracker.userservice.dto.AddUserRequestDto;
import com.expenseTracker.userservice.dto.AddUserResponseDto;
import com.expenseTracker.userservice.dto.RemoveUserRequestDto;
import com.expenseTracker.userservice.dto.RemoveUserResponseDto;
import com.expenseTracker.userservice.service.AddUser;
import com.expenseTracker.userservice.service.RemoveUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/userService")
public class UserController {
    @Autowired
    AddUser addUser;

    @Autowired
    RemoveUser removeUser;

    @PostMapping("/register")
    public AddUserResponseDto addUser(@RequestBody AddUserRequestDto request){
        System.out.println(request.getName()+ request.getPhone()+ request.getEmail()+ request.getPassword());
        String response = addUser.addNewUser(request.getName(), request.getPhone(), request.getEmail(), request.getPassword());
        System.out.println(response);
        AddUserResponseDto addUserResponseDto = new AddUserResponseDto(response);
        return addUserResponseDto;
    }

    @PostMapping("/unregister")
    public RemoveUserResponseDto removeUser(@RequestBody RemoveUserRequestDto request){
        String response = removeUser.removeUser(request.getEmail(), request.getPhone());
        RemoveUserResponseDto removeUserResponseDto = new RemoveUserResponseDto(response);
        return removeUserResponseDto;
    }
}
