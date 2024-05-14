Write a Java program to test if a map contains a mapping for the specified key.
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Creating a HashMap
        Map<String, Integer> map = new HashMap<>();

        // Adding some key-value pairs
        map.put("apple", 10);
        map.put("banana", 20);
        map.put("orange", 30);

        // Specified key to test
        String key = "banana";

        // Check if the map contains the key
        if (map.containsKey(key)) {
            System.out.println("Map contains a mapping for the key '" + key + "'");
        } else {
            System.out.println("Map does not contain a mapping for the key '" + key + "'");
        }
    }
}
