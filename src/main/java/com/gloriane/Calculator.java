package com.gloriane;

public class Calculator {
    
    public static double add(int[] numbers) {
        double sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }
    
    public static double subtract(int[] numbers) {
        if (numbers.length == 0) return 0;
        double result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result -= numbers[i];
        }
        return result;
    }
    
    public static double multiply(int[] numbers) {
        if (numbers.length == 0) return 0;
        double result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result *= numbers[i];
        }
        return result;
    }
    
    public static double divide(double num1, double num2) {
        return num1 / num2;
    }
}