package com.gloriane;
import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // get input
            System.out.println("===== Welcome to My Calculator App =====");

            // System.out.println("Enter first number:");
            // double num1 = scanner.nextDouble();

            // System.out.println("Enter second number:");
            // double num2 = scanner.nextDouble();

            System.out.println("Select operation (+, -, *, /):");
            String operation = scanner.next();

            System.out.println("Enter first number:");
            double num1 = scanner.nextDouble();

            double result = num1;

            while (true) {
                System.out.println("Do you want to add another number? (y/n):");
                char addMore = scanner.next().charAt(0);

                if (addMore != 'y' && addMore != 'Y') {
                    break;
                }

                System.out.println("Enter next number:");
                double nextNum = scanner.nextDouble();

            // switch statement for calculation
            switch (operation) {
                case "+":
                    //result = num1 + num2;
                    result += nextNum;
                    break;

                case "-":
                    //result = num1 - num2;
                    result -= nextNum;
                    break;

                case "*":
                    //result = num1 * num2;
                    result *= nextNum;
                    break;

                case "/":
                    //if (num2 != 0) {
                        //result = num1 / num2;
                    if (nextNum != 0) {
                        result /= nextNum;
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
               // System.out.println("The result is: " + result);
                System.out.println("Current result is: " + result);
            }

            System.out.println("Final result is: " + result);

                // ask to continue
                System.out.println("Do you want to perform another calculation? (y/n):");
                char again = scanner.next().charAt(0);
            if (again == 'y' || again == 'Y') {
                // continue loop
            } else {
                System.out.println("Thank you for using the calculator!");
                break;
                    }
                }
                scanner.close();
            }
        }

        /*
        This is much simpler:
        Ask for operation first
        Get first number (becomes initial result)
        Keep asking "add another number?"
        Apply each new number to the running result
        Show current result after each operation
        When done adding numbers, show final result
        Example flow:
        Operation: +
        First: 5
        Add another? y → 3 → Current: 8
        Add another? y → 2 → Current: 10
        Add another? n → Final: 10
        Much cleaner than arrays!
         */