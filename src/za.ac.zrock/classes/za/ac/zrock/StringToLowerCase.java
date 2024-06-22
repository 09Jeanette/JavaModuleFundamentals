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
public class StringToLowerCase {
    
 public static void convertStringToLowerCase() {
        Scanner sc = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Convert the string to lowercase
        String lowerCaseString = input.toLowerCase();

        // Display the original and lowercase strings
        System.out.println("Original string: " + input);
        System.out.println("Lowercase string: " + lowerCaseString);


    }
}

