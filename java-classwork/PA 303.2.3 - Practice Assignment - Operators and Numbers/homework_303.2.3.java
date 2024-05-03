//Write a program that declares an integer a variable x, assigns the value 2 to it, and prints out the binary string version of the number ( Integer.toBinaryString(x) ). Now, use the left shift operator (<<) to shift by 1 and assign the result to x. Before printing the results, write a comment with the predicted decimal value and binary string. Now, print out x in decimal form and in binary notation.
Perform the preceding exercise with the following values:

public class BinaryLeftShift {
  public static void
main(String [] args) {
  //Original value: 2 (binary:10)
int x = 2;

System.out.println("Original value of x:" + x + "(binary:"
+ Integer.toBinaryString(x) + ")");

          x = x <<1; // Predicted decimal value: 4, binary string: 100
System.out.println();

  //Original value:3 (binary:11)
    x=3;

System.out.println('Original value of x:" + x+ " (binary:" + Integer.toBinaryString(x)+
")");

    x = x << 1; //Predicted decimal value:6, binary string: 110


System.out.println("Shifted value of x: " + x + " (binary : " 
+ Integer.toBinaryString(x) ") ");
 }
}



  

