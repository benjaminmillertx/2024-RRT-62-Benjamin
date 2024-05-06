public class
MultiplicationTable{
public static void
main(String[] args) {
int size =10; //Size of the multiplication table

//Outer loop for rows
for(int i=1; i <= size; i++) {

//Inner loop for columns 
for(int j =1; j <= size; J++) {

//Print the product of i and j

System.out.print(i * j + "\t");
}
//Move to the next line after printing each row
System.out.println();
   } 
  }
}

//question 2
import java.util.Scanner;

public class GCDCalculator {
public static void 
main(String [] args) {
   Scanner scanner = new
Scanner(System.in);

System.out.print("Enter the first postive integer: ");
int n1 = scanner.nextInt();

System.out.print("Enter the second postive integer:");
int n2 = scanner.nextInt();

int gcd= findGCD(n1,n2);

System.out.println("The gcd of" +n1+ " and" + n2 + " is" +gcd + ".");

scanner.close();
}

//funtion to find the greatest common divisor(GCD)
public static int 
findGCD(int a , int b) {
 while(b != 0) {
int temp=b;
b= a % b;
a=temp;
 }
return a;
}
}

public class TutitionCalculator 
   }
public static void 
main(String[] args) {
double tuition =
10000; //intitial tuition
double targetTuition =20000;
//Double the intial tuition
int years=0;

while ( tuition < targetTuition) {
tuition *= 1.07;
//increase tuition by 7% each year
years++;
}

System.out.println("Tution will be doubled in" + years + "years");
 }
}

