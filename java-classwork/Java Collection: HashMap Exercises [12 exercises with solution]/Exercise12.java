Write a Java program to get a collection view of the values contained in this map.
import java.util.*;

public class MapValueCollection {
    public static void main(String[] args) {
        // Create a map
        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 1);
        map.put("banana", 2);
        map.put("orange", 3);
        
        // Get a collection view of the values
        Collection<Integer> values = map.values();
        
        // Print the values
        System.out.println("Values in the map:");
        for (Integer value : values) {
            System.out.println(value);
        }
    }
}
