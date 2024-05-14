Write a Java program to get a set view of the keys contained in this map.
import java.util.*;

public class MapKeySetExample {
    public static void main(String[] args) {
        // Create a map
        Map<String, Integer> map = new HashMap<>();
        
        // Add some key-value pairs
        map.put("apple", 10);
        map.put("banana", 20);
        map.put("orange", 30);
        
        // Get the set view of keys
        Set<String> keySet = map.keySet();
        
        // Print the key set
        System.out.println("Keys: " + keySet);
    }
