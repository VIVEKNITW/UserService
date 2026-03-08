package com.expenseTracker.userservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.UUID;

@Entity
@Table(name = "expensegroup")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExpenseGroup {

    @Id
    @GeneratedValue
    private UUID groupId;
    private String name;

    @ManyToMany
    @JoinTable(
            name = "group_users",
            joinColumns = @JoinColumn(name = "group_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id")
    )
    private ArrayList<ExpenseUser> members = new ArrayList<>();
}
