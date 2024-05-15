

import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scanner = new Scanner(System.in);
        
        // 
        int N = scanner.nextInt();
        
        List<Integer> L = new ArrayList<Integer>(N);
        
        for (int i = 0; i < N; i++)
        {
            L.add(scanner.nextInt());
        }
        
        
        int Q = scanner.nextInt();
        
        
        for (int i = 0; i < Q; i++)
        {
            String operation = scanner.next();
            
            
            if (operation.equals("Insert"))
            {
                int index = scanner.nextInt();
                int value = scanner.nextInt();
                
                L.add(index, value);
            }
            
            else if (operation.equals("Delete"))
            {
                int index = scanner.nextInt();
              
                L.remove(index);
            }
        }
        
        for (int element: L)
            
        {
            System.out.print(element + " ");
            }
       }
}
