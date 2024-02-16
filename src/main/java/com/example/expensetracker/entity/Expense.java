package com.example.expensetracker.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table
@Entity
public class Expense {

    @Id
    private int id;
    private String Category;
    private double Amount;

    public Expense() {
    }

    public Expense(int id, String Category, double Amount){
        super();
        this.id = id;
        this.Category=Category;
        this.Amount = Amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public double getAmount() {
        return Amount;
    }

    public void setAmount(double amount) {
        Amount = amount;
    }

    @Override
    public String toString() {
        return "Expense{" +
                "id=" + id +
                ", Category='" + Category + '\'' +
                ", Amount=" + Amount +
                '}';
    }
}

