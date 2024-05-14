Write a Java program to check whether a map contains key-value mappings (empty) or not.
import java.util.Map;

public class MapChecker {
    public static void main(String[] args) {
        // Create a map (you can replace this with your own map)
        Map<String, Integer> map = new HashMap<>();

        // Check if the map is empty
        if (map.isEmpty()) {
            System.out.println("Map is empty");
        } else {
            System.out.println("Map is not empty");
        }
    }
}
