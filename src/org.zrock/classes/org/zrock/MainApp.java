/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zrock;

import java.util.Scanner;
import za.ac.zrock.DivideNumbers;
import za.ac.zrock.PrintNumbers;
import za.ac.zrock.RemoveKeyValue;
import za.ac.zrock.ReverseArray;
import za.ac.zrock.StringToLowerCase;
/**
 *
 * @author Jeanette
 */
public class MainApp {
    
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DivideNumbers d = new DivideNumbers();
        PrintNumbers p = new PrintNumbers();
        StringToLowerCase s = new StringToLowerCase();
        ReverseArray r = new ReverseArray();
        RemoveKeyValue rk = new RemoveKeyValue();

        int choice;
        do {
            // Display menu options
            System.out.println("\nMenu");
            System.out.println("1. Divide Numbers");
            System.out.println("2. Convert String to Lowercase");
            System.out.println("3. Reverse an Array");
            System.out.println("4. Remove Key-Value Pair from HashMap");
            System.out.println("5. Print Numbers 1 to 10 using a while loop");
            System.out.println("6. Exit");

            // Prompt user to enter a choice
            System.out.print("\nEnter your choice (1-6): ");
            choice = sc.nextInt();

            // Perform action based on user choice using switch statement
            switch (choice) {
                case 1:
                    d.divideTwoNumbers();
                    break;
                case 2:
                    s.convertStringToLowerCase();
                    break;
                case 3:
                    r.reverse();
                    break;
                case 4:
                    rk.removeKeyValuePair();
                    break;
                case 5:
                    p.print();
                    break;
                case 6:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
            }

        } while (choice != 6);

   
    }
}

    

