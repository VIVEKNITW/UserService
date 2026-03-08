package com.expenseTracker.userservice.service;

import com.expenseTracker.userservice.model.ExpenseUser;
import com.expenseTracker.userservice.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;


@Service
public class ImplAddUser implements AddUser{
    @Autowired
    UserRepo userRepo;

    @Override
    public String addNewUser(String name, long phone, String email, String password) {
        ExpenseUser request = new ExpenseUser(name, phone, email, password);
        ExpenseUser resp = userRepo.save(request);
        return "Added "+name +" successfully";
    }
}
