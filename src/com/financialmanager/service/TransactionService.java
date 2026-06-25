package com.financialmanager.service;

import com.financialmanager.model.Transaction;

import java.util.ArrayList;
import java.util.List;

public class TransactionService {

    private List<Transaction> transactions = new ArrayList<>();

    public void addTransaction(String description, double value) {
        transactions.add(new Transaction(description, value));
    }

    public void listTransactions() {
        if (transactions.isEmpty()) {
            System.out.println("Nenhuma transação.");
            return;
        }

        for (Transaction t : transactions) {
            System.out.println(t);
        }
    }
}