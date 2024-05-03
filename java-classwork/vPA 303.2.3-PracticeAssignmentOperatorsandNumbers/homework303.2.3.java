
//Write a program that declares an integer a variable x, assigns the value 2 to it, and prints out the binary string version of the number ( Integer.toBinaryString(x) ). Now, use the left shift operator (<<) to shift by 1 and assign the result to x. Before printing the results, write a comment with the predicted decimal value and binary string. Now, print out x in decimal form and in binary notation.
//Perform the preceding exercise with the following values:


public class BinaryShift {
   public static void
main(String [] args){
     //orignal value: 2
(binary:10)
       int x = 2 
System.out.println("Original value: + x +" (binary:" +
Integer.toBinaryString(x) + ")");
    
//Left shift by 1: 
//Predicted decimal value: 4
//(binary:100)
  x=x<<1;

System.out.println("Shifted value:" + x +" (binary:" + Integer.toBinaryString(x) + ")");

// Repeat for other values
 x=9;

System.out.println("Origninal value: " + x +" (binary: " +
Integer.toBinaryString(x) +")");


      x=x << 1;

System.out.println("Original value:+ x+ " binary: " + 
Integer.toBinaryString(x) + ")");

x=88;

System.out.println("Original value:" + x + "(binary:"+
Integer.toBinaryString(x) +")");
    x=x <<1;

System.out.println("Shifted value:" + x+ "binary:"+
Integer.toBinaryString(x) +")");
      }
  }

//Write a program that declares a variable x, and assigns 150 to it, and prints out the binary string version of the number. Now use the right shift operator (>>) to shift by 2 and assign the result to x. Write a comment indicating what you anticipate the decimal and binary values to be. Now print the value of x and the binary string.
//Perform the preceding exercise with the following values:

//Initialize variable x and assign 150 to it
public class RightShiftExample
{
   public static void 
main(String [] args) {
// Initialize variable x and assign 150 to it
  int x = 150; 

  //Print original value of x in binary

  System.out.println('Original value of x: + 
  Integer.toBinaryString(X));

  //Right shift x by 2 and assign the result to x
  x>>2;

  //Print the value of x and its binary string after shifting
  System.out.println("Value of x after right shift;" + x);

  System.out.println("Binary representation of x after right shift:"
  +Integer.toBinaryString(x));

  //Values to test
  int[] values = { 255,1555,32456};

  for(int val : values)
    {
  //Initialize variable x with current value
    x= val;
  //Print original value of x in binary
  System.out.println("Original value of x:"+
  Integer.toBinaryString(x));

  //Right shift x by 2 and assign the result to x
  x>>= 2;

  //Print the value of x and its binary string after shifting

  System.out.println("Value of x after right shift: + x);

  System.out.println("Binary representation of x after after right shift: +x);
    } 
  }
}
//Write a program that declares three int variables: x, y, and z. Assign 7 to x and 17 to y. Write a comment that indicates what you predict will be the result of the bitwise and operation on x and y. Now use the bitwise AND (&) operator to derive the decimal and binary values, and assign the result to z.
public class BitwiseAndExample
  {
    public static void
main(String[] args) {
//Predicted results of bitwise AND operation on x and y: 1
        int x = 7;
        int y = 17;
        int z = x & y;
System.out.println("Decimal value of z:);

System.out.println("Decimal value z: " + z);

System.out.println("Binary value of z: " + 
Integer.toBinaryString(z)):
     } 
  }

//Now, with the preceding values, use the bitwise and operator to calculate the “or” value between x and y. As before, write a comment that indicates what you predict the values to be before printing them out
public class Main {
   public static void
main(String[] args) {
     int x = 0b1010;
     int y = 0b1100;

//Predicted value before printing: 1110
     int result = x| y;

System.out.println("Result: "
+
Integer.toBinaryString(results)
); // Output: 1110
    } 
}

//Write a program that declares an integer variable, assigns a number, and uses a postfix increment operator to increase the value. Print the value before and after the increment operator.
public class IncrementExample
{ 
    public static void
   main(String [] args){
          int num = 5;

   System.out.println("Value before increment: " + num);

   num++;

   System.out.println("Value after increment: " + num);
   }
}

//Write a program that demonstrates at least three ways to increment a variable by 1 and does this multiple times. Assign a value to an integer variable, print it, increment by 1, print it again, increment by 1, and then print it again.

public class IncrementDemo{
  public static void
main(String[] args) {
// Method 1: Using the += operator
   int num1= 5;

System.out.println("Original value: " + num1);
num1 += 1;

System.out.println("After incrementing using +=: " + num1);

//Method 2: Using the increment operator ++
int num2 = 5;

System.out.println("Original value: "+ num2);
   num2 = num2 + 1 ;

System.out.println("after incrementing using +: " + num2);

//Method 3: Using a method
 int num3 = 5;

System.out.println("Original value: " + num3);
num3=increment(num3);

System.out.println("After incrementing using a method: "+ num3);
}
// Method to increment by 1
public static int
increment(int value) {
   return value +1;
  }
}
//Write a program that declares two integer variables: x, and y, and then assigns 5 to x and 8 to y. Create another variable sum and assign the value of ++x added to y, and print the result. Notice the value of the sum (should be 14). Now change the increment operator to postfix (x++) and re-run the program. Notice what the value of 
public class Main {
   public static void
   main(String[] args) {
   int x, y;
   x = 5;
   y =8;

   int sum = ++x + y;

   System.out.println("Sum with prefix increment: " + sum);

   x = 5;//Reset x to 5
   sum = x++ + y;

   System.out.println("Sum with postfix increment: " + sum);
   }
}
