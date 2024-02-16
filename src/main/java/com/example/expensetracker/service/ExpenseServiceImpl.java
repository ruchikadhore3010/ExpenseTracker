package com.example.expensetracker.service;

import com.example.expensetracker.entity.Expense;
import com.example.expensetracker.repository.ExpenseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ExpenseServiceImpl implements ExpenseService{

    @Autowired
    ExpenseRepo expenseRepo;
    @Override
    public List<Expense> findAll() {
        return expenseRepo.findAll();

    }

    @Override
    public Expense save(Expense expense) {
        expenseRepo.save(expense);
        return expense;
    }

    @Override
    public Expense findbyId(int id) {
        if(expenseRepo.findById(id).isPresent()){
            return expenseRepo.findById(id).get();
        }
        return null;
    }

    @Override
    public void delete(int id) {
        Expense expense = findbyId(id);
        expenseRepo.delete(expense);
    }
}
