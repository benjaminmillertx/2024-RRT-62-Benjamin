 Write a Java program to remove all mappings from a map.
import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        // Creating a map
        Map<String, Integer> map = new HashMap<>();
        
        // Adding some entries
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        
        System.out.println("Map before removal: " + map);
        
        // Removing all mappings
        map.clear();
        
        System.out.println("Map after removal: " + map);
    }
}
