package Heaps;

import java.util.HashMap;

public class hashMap {
    public static void main(String[] args) {
            // Step 1: Create a HashMap
            HashMap<Integer, String> map = new HashMap<>();

            // Step 2: Add key-value pairs
            map.put(1, "Apple");
            map.put(2, "Banana");
            map.put(3, "Cherry");

            // Step 3: Access values using keys
            System.out.println("Value at key 2: " + map.get(2));

            // Step 4: Check if a key exists
            if (map.containsKey(3)) {
                System.out.println("Key 3 exists with value: " + map.get(3));
            }

            // Step 5: Remove a key-value pair
            map.remove(1);

            // Step 6: Iterate through HashMap
            for (Integer key : map.keySet()) {
                System.out.println("Key: " + key + ", Value: " + map.get(key));
            }
        }
    }


