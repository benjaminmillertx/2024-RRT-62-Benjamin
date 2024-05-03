
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

//
          
