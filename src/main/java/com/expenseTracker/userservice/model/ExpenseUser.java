package com.expenseTracker.userservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.UUID;

@Entity
@Table(name = "expenseuser")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExpenseUser {

    @Id
    @GeneratedValue
    private UUID userId;
    private String name;
    private long phone;
    private String email;
    private ArrayList<ExpenseGroup> expenseGroups = new ArrayList<>();
    private String password;

    public ExpenseUser(String name, long phone, String email, String password) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.password = password;
    }
}
