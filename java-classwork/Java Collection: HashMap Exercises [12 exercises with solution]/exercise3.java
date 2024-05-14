Write a Java program to copy all mappings from the specified map to another import java.util.HashMap;
import java.util.Map;

public class MapCopyExample {
    public static void main(String[] args) {
        // Creating the first map
        Map<String, Integer> originalMap = new HashMap<>();
        originalMap.put("A", 1);
        originalMap.put("B", 2);
        originalMap.put("C", 3);

        // Creating the second map
        Map<String, Integer> copiedMap = new HashMap<>();

        // Copying mappings from originalMap to copiedMap
        copiedMap.putAll(originalMap);

        // Displaying the contents of copiedMap
        System.out.println("Copied Map: " + copiedMap);
    }
}
