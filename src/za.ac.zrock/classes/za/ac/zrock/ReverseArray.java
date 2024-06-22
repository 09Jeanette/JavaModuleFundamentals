/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.zrock;

/**
 *
 * @author Jeanette
 */
public class ReverseArray {
    
 public static void reverse() {
        // Declare an array of numbers
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        // Display the original array
        System.out.print("Array of numbers: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println(); // Print a newline after displaying the array

        // Call a method to reverse the array
        reverseArray(numbers);

        // Display the reversed array
        System.out.print("Reversed array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println(); // Print a newline after displaying the reversed array
    }

    public static void reverseArray(int[] numbers) {
        // Initialize two pointers: num1 starting at the beginning and num2 starting at the end of the array
        int num1 = 0, num2 = numbers.length - 1;

        // Loop until the two pointers meet in the middle of the array
        while (num1 < num2) {
            // Swap the elements at num1 and num2
            int temp = numbers[num1];
            numbers[num1] = numbers[num2];
            numbers[num2] = temp;

            // Move num1 pointer to the right and num2 pointer to the left
            num1++;
            num2--;
        }
    }
}

