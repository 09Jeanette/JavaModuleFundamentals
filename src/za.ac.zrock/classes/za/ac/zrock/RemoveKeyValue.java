/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.zrock;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Jeanette
 */
public class RemoveKeyValue {
    
  public static void removeKeyValuePair() {
        Scanner sc = new Scanner(System.in);
        // Declare a map
        HashMap<Integer, String> map = new HashMap<>();
        //
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");
        map.put(5, "Five");

        // Display the map
        System.out.println("HashMap contents:");
        for (Integer key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }

        // Prompt for user input
        System.out.print("Enter a key to remove a value: ");
        int keyToRemove = sc.nextInt();

        // Check if the map contains the key
        if (map.containsKey(keyToRemove)) {
            map.remove(keyToRemove);

            // Display the updated map
            System.out.println("HashMap after removing key " + keyToRemove + ":");
            for (Integer key : map.keySet()) {
                System.out.println("Key: " + key + ", Value: " + map.get(key));
            }
        } else {
            System.out.println("Key not found in the HashMap.");
        }

       
    }
}

