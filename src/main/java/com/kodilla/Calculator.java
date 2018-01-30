package com.kodilla;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 123;
        int b = 456;
        int sum = calculator.add(a, b);
        System.out.println(a + " + " + b + " = " + sum);
    }
}
