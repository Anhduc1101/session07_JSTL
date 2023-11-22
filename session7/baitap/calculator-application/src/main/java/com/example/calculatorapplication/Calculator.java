package com.example.calculatorapplication;

public class Calculator {
    public static double calculate(double operand1, double operand2, String operator) {
        double result = 0;

        switch (operator) {
            case "addition":
                result = operand1 + operand2;
                break;
            case "subtraction":
                result = operand1 - operand2;
                break;
            case "multiplication":
                result = operand1 * operand2;
                break;
            case "division":
                if (operand2 != 0) {
                    result = operand1 / operand2;
                } else {
                    throw new ArithmeticException("Cannot divide by zero");
                }
                break;
        }

        return result;
    }
}