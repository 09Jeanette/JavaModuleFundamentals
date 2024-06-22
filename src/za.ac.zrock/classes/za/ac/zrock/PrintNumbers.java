/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.zrock;

/**
 *
 * @author Jeanette
 */
public class PrintNumbers {
    
public static void print() {
         //declare a variable that will store the results
        String result = "";
        
        //declare the initial value
        int i = 1;
        
        //while loop for printing numbers from 1 to 10
        while (i <= 10) {
            
            //concatinate the current number and a newline
            result += i + "\n";
            
            //Increment the loop counter
            i++;
        }
        
        //dsiplay the numbers
         System.out.println(result);
    }
}

