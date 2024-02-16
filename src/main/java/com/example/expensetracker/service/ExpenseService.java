package com.example.expensetracker.service;

import com.example.expensetracker.entity.Expense;

import java.util.List;

public interface ExpenseService {
    List<Expense> findAll();

    Expense save(Expense expense);
    Expense findbyId(int id);
    void delete( int id);
}
