package com.expenseTracker.userservice.service;

import com.expenseTracker.userservice.model.ExpenseUser;
import com.expenseTracker.userservice.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImplRemoveUser implements RemoveUser{
    @Autowired
    UserRepo userRepo;

    @Override
    public String removeUser(String email, long phone) {
        ExpenseUser expenseUser = userRepo.findByEmail(email);
        if (expenseUser==null){
            expenseUser = userRepo.findByPhone(phone);
        }
        userRepo.delete(expenseUser);
        return "Successfully deleted the user "+expenseUser.getName();
    }
}
