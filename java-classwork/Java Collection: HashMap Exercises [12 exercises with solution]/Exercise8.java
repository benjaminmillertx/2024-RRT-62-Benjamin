Write a Java program to test if a map contains a mapping for the specified value.
import java.util.HashMap;
import java.util.Map;

public class MapContainsValue {
    public static void main(String[] args) {
        // Create a HashMap
        Map<Integer, String> map = new HashMap<>();

        // Add some key-value pairs
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");

        // Specify the value to test
        String valueToCheck = "Three";

        // Check if the map contains the specified value
        boolean containsValue = map.containsValue(valueToCheck);

        // Print the result
        if (containsValue) {
            System.out.println("The map contains the value: " + valueToCheck);
        } else {
            System.out.println("The map does not contain the value: " + valueToCheck);
        }
    }
}
