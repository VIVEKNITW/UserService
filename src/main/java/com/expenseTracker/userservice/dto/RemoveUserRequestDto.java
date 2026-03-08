package com.expenseTracker.userservice.dto;

import lombok.Data;

@Data
public class RemoveUserRequestDto {
    String email;
    long phone;
}
