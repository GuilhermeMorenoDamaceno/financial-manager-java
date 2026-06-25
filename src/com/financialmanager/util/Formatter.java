package com.financialmanager.util;

public class Formatter {

    public static String formatMoney(double value) {
        return "R$ " + String.format("%.2f", value);
    }
}