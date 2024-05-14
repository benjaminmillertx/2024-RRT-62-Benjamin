Write a Java program to count the number of key-value (size) mappings in a map.
import java.util.Map;

public class MapSizeCounter {
    public static void main(String[] args) {
        // Create a sample map
        Map<String, Integer> sampleMap = Map.of(
                "One", 1,
                "Two", 2,
                "Three", 3,
                "Four", 4
        );

        // Call the method to count the size of the map
        int size = countMapSize(sampleMap);

        // Print the size
        System.out.println("Size of the map: " + size);
    }

    // Method to count the size of the map
    public static <K, V> int countMapSize(Map<K, V> map) {
        return map.size();
    }
}
