package com.financialmanager.model;

public class Transaction {
    private String description;
    private double value;

    public Transaction(String description, double value) {
        this.description = description;
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return description + " - R$ " + value;
    }
}