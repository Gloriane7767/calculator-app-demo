package com.gloriane;
import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // get input
            System.out.println("===== Welcome to My Calculator App =====");

            System.out.println("Enter first number:");
            double num1 = scanner.nextDouble();

            System.out.println("Enter second number:");
            double num2 = scanner.nextDouble();

            System.out.println("Select operation (+, -, *, /):");
            String operation = scanner.next();

            double result = 0;

            // switch statement for calculation
            switch (operation) {
                case "+":
                    result = num1 + num2;
                    break;

                case "-":
                    result = num1 - num2;
                    break;

                case "*":
                    result = num1 * num2;
                    break;

                case "/":
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                        return;
                    }
                    break;

                default:
                    System.out.println("Error: Invalid operation.");
                    return;
            }
                // show result
                System.out.println("The result is: " + result);

                // ask to continue
                System.out.println("Do you want to perform another calculation? (y/n):");
                char again = scanner.next().charAt(0);
            if (!again.equalsIgnoreCase("y")) {
                System.out.println("Thank you for using the calculator!");
                break;
                    }
                }
                scanner.close();
            }
        }
