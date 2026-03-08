package com.expenseTracker.userservice.repository;

import com.expenseTracker.userservice.model.ExpenseUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepo extends JpaRepository<ExpenseUser, UUID> {
    ExpenseUser findByEmail(String email);
    ExpenseUser findByPhone(long phone);
}
