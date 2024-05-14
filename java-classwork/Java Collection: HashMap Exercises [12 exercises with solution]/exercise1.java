Write a Java program to associate the specified value with the specified key in a HashMap.
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Creating a HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Associating a value with a key
        hashMap.put("key1", 10);
        hashMap.put("key2", 20);
        hashMap.put("key3", 30);

        // Printing the HashMap
        System.out.println("HashMap: " + hashMap);
    }
}
