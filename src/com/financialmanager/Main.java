package com.financialmanager;

import com.financialmanager.service.TransactionService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        TransactionService service = new TransactionService();

        while (true) {
            System.out.println("\n=== FINANCIAL MANAGER ===");
            System.out.println("1 - Adicionar transação");
            System.out.println("2 - Listar transações");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            int option = scanner.nextInt();
            scanner.nextLine();

            if (option == 0) break;

            switch (option) {
                case 1 -> {
                    System.out.print("Descrição: ");
                    String desc = scanner.nextLine();

                    System.out.print("Valor: ");
                    double value = scanner.nextDouble();
                    scanner.nextLine();

                    service.addTransaction(desc, value);
                }

                case 2 -> service.listTransactions();

                default -> System.out.println("Opção inválida");
            }
        }

        System.out.println("Sistema finalizado.");
    }
}