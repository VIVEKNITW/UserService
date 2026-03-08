package com.expenseTracker.userservice.dto;


import lombok.Data;

@Data
public class AddUserRequestDto {
    String name;
    long phone;
    String email;
    String password;
}
