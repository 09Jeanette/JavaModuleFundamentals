/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.zrock;

import java.util.Scanner;

/**
 *
 * @author Jeanette
 */
public class DivideNumbers {
    
 public static void divideTwoNumbers() {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the input of numbers
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        // Check if the divisor is not zero before performing division
        if (num2 != 0) {
            double result = num1 / num2;
            System.out.println(num1 + " divided by " + num2 + " is: " + result);
        } else {
            System.out.println("Division by zero is impossible");
        }

       
    }
}

