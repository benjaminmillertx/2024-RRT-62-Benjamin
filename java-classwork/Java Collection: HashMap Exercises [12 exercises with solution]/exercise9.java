//Write a Java program to create a set view of the mappings contained in a map.
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapSetView {
    public static void main(String[] args) {
        // Create a HashMap
        Map<String, Integer> map = new HashMap<>();

        // Add some key-value pairs to the map
        map.put("apple", 1);
        map.put("banana", 2);
        map.put("orange", 3);
        map.put("grape", 4);

        // Get the set view of mappings contained in the map
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();

        // Print the set view
        System.out.println("Set view of mappings:");
        for (Map.Entry<String, Integer> entry : entrySet) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
