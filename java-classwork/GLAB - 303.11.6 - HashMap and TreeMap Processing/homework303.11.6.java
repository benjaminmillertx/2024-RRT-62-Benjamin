import java.util.HashMap;

public class ExampleOneHashMap {
  public static void main(String[] args) {

    HashMap<Integer, String> languages = new HashMap<>();
    languages.put(1, "Java");
    languages.put(2, "Python");
    languages.put(3, "JavaScript");
    languages.put(4, "C Sharp");

    System.out.println("HashMap: " + languages);
    import java.util.HashMap;

public class ExampleOneHashMap {
  public static void main(String[] args) {

    HashMap<Integer, String> languages = new HashMap<>();
    languages.put(1, "Java");
    languages.put(2, "Python");
    languages.put(3, "JavaScript");
    languages.put(4, "C Sharp");

    System.out.println("HashMap: " + languages);

    import java.util.HashMap;
public class ExampletwoHashMap {
   public static void main(String[] args) {
       HashMap<String, String> newHashMap = new HashMap<>();
// Addition of key and value
       newHashMap.put("Key1", "Lenovo");
       newHashMap.put("Key2", "Motorola");
       newHashMap.put("Key3", "Nokia");
       newHashMap.put("Key4", null);
       newHashMap.put(null, "Sony");
       System.out.println("Original map contains:" + newHashMap);
//getting size of Hashmap
       System.out.println("Size of original Map is:" + newHashMap.size());
//copy contains of one Hashmap to another
       HashMap<String, String> copyHashMap = new HashMap<>();
       copyHashMap.putAll(newHashMap);
       System.out.println("copyHashMap mappings= " + copyHashMap);
//Removal of null key
       String nullKeyValue = copyHashMap.remove(null);
       System.out.println("copyHashMap null key value = " + nullKeyValue);
       System.out.println("copyHashMap after removing null key = " + copyHashMap);
       System.out.println("Size of copyHashMap is:" + copyHashMap.size());
   }
}

import java.util.TreeMap;

public class exampleTreemapOne {
    public static void main(String[] args) {

        TreeMap<String, Integer> numbers = new TreeMap<>();
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        System.out.println("TreeMap: " + numbers);

        // remove method with single parameter
        int value = numbers.remove("Two");
        System.out.println("Removed value: " + value);

        // remove method with two parameters
        boolean result = numbers.remove("Three", 3);
        System.out.println("Is the entry {Three=3} removed? " + result);
        System.out.println("Updated TreeMap: " + numbers);
    }
import java.util.TreeMap;
public class exampleTreemapTwo {
    public static void main(String[] args) {
        TreeMap<String, Integer> numbers = new TreeMap<>();
        numbers.put("First", 1);
        numbers.put("Second", 2);
        numbers.put("Third", 3);
        System.out.println("TreeMap: " + numbers);

        // Using the firstKey() method
        String firstKey = numbers.firstKey();
        System.out.println("First Key: " + firstKey);
import java.util.Comparator;
public  class CustomComparator implements Comparator<String> {

   @Override
   public int compare(String number1, String number2) {
       int value =  number1.compareTo(number2);
import java.util.TreeMap;
public class maincomparator {

   public static void main(String[] args) {

       // Creating a treemap with a customized comparator
       TreeMap<String, Integer> numbers = new TreeMap<>(new CustomComparator());

       numbers.put("First", 1);
       numbers.put("Second", 2);
       numbers.put("Third", 3);
       numbers.put("Fourth", 4);
       System.out.println("TreeMap: " + numbers);
}
}
