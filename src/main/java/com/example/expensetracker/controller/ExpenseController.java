package com.example.expensetracker.controller;

import com.example.expensetracker.entity.Expense;
import com.example.expensetracker.repository.ExpenseRepo;
import com.example.expensetracker.service.ExpenseService;
import com.sun.jdi.event.StepEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class ExpenseController {

    @Autowired
    private ExpenseService expenseService;

    @GetMapping("/expenses")
    public ResponseEntity<List<Expense>> getAllExpenses() {
        List<Expense> expenseList = expenseService.findAll();
        return new ResponseEntity<List<Expense>>(expenseList, HttpStatus.OK);
    }

    @PostMapping("/addexpenses")
    public ResponseEntity<Expense> addExpense(@RequestBody Expense expense) {
        Expense expenses = expenseService.save(expense);
        return new ResponseEntity<>(expenses, HttpStatus.OK);
    }
    @GetMapping("/expenses/{id}")
    public ResponseEntity<Expense> getById(@PathVariable("id") Integer id) {
        Expense expense = expenseService.findbyId(id);
        return new ResponseEntity<Expense>(expense, HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable int id){
        expenseService.delete(id);
        return new ResponseEntity<String>("Expense deleted successfully!", HttpStatus.OK);
    }
}
