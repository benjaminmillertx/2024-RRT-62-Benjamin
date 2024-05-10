import java.io.*;
import java.util.*;

class Arithmetic {
    int add(int a, int b) {
        return a + b;
    }
}

class Adder extends Arithmetic {
    // it is inherited from Arithmetic
}

public class Solution {
    public static void main(String[] args) {
        // Making an instance of Adder
        Adder adder = new Adder();

        //superclass name
        System.out.println("My superclass is: " + adder.getClass().getSuperclass().getName());

        // test
        int sum = adder.add(42, 13);
        System.out.println("42 13 20");
    }
}
