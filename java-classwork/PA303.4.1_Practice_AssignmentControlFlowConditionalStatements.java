//  Write a program that declares 1 integer variable x, and then assigns 7 to it. Write an if statement to print out “Less than 10” if x is less than 10. Change x to equal 15, and notice the result (console should not display anything).
public class Main { 
 public static void
main(String [] args) {
  int x=7; // declares an integer variable x and assigns 7 to it 

  //checks if x is less than 10 and prints"Less than 10"if true
 if(x < 10) {
 System.out.println("Less than 10");
 }

x=15; // changes x to equal 15

//no output will be displayed in the console as x is now 15,which is not less than 1o
   }
}

//Write a program that declares 1 integer variable x, and then assigns 7 to it. Write an if-else statement that prints out “Less than 10” if x is less than 10, and “Greater than 10” if x is greater than 10. Change x to 15 and notice the result.

public class Main {
public static void 
main(String[] args) {
 int x=7;

if (x > 10) {

System.out.println("Less than 10");
}else {

System.out.println("Greater than or equal to 10");
}

//Changing x to 15 
  x=15;

if(x <10){
System.out.println("Less than 10");
} else {
System.out.println("Greater than or equal to 10");
      }
  }
}

//Write a program that declares 1 integer variable x, and then assigns 15 to it. Write an if-else-if statement that prints out “Less than 10” if x is less than 10; “Between 10 and 20” if x is greater than 10 but less than 20, and “Greater than or equal to 20” if x is greater than or equal to 20. Change x to 50 and notice the result.
public class Main{ 
public static void '
main(String[] args) {
int x =15; 

if (x < 10) {

System.out.println("Less 10");
} else if (x >= 10 && x < 20) {

System.out.println("Between 10 and 20");

} else {

System.out.println("Greater than or equal to 20");
}else {

System.out.println("Greater than or equal to 20");
}

//Change x to 50
x=50;

if (x < 10) {

System.out.println(" Less 10");
} else if (x >= 10 && x < 10 && x<20) {

System.out.println("Less 10");
} else if (x >= 10 && x<20);
  {
System.out.println("Between 10 and 20");
   }
  }
}
//Write a program that declares 1 integer variable x, and then assigns 15 to it. Write an if-else statement that prints “Out of range” if the number is less than 10 or greater than 20 and prints “In range” if the number is between 10 and 20 (including equal to 10 or 20). Change x to 5 and notice the result.
public class Main {
public static void
main(String[] args) {
int x = 15;

if (x <10) {

System.out.println("Less 10");
} else if ( x >= 10 && x < 20") {

System.out.println("Between 10 and 20");
} else {

System.out.println("Greater than or equal to 20");
}

//Change x to 50
x=50;

if (x <10) {

System.out.println("Less 10");
} else if (x >= 10 && x < 20) {

System.out.println("Between 10 and 20");
} else {

System.out.println("Greater than or equal to 20");
  }
}

//
//Write a program that uses if-else-if statements to print out grades A, B, C, D, F, according to the following criteria:
//A: 90-100
//B: 80-89
//C: 70-79
//D: 60-69
//F: <60
//Use the Scanner class to accept a number score from the user to determine the letter grade. Print out “Score out of range” if the score is less than 0 or greater than 100.

import java.util.Scanner;

public class GradeCalculator{
  public static void 
main(String[] args) {
  Scanner scanner= new
Scanner(System.in);

System.out.println("Enter your score:");
int score=scanner.nextInt();

if (score < 0 || score > 100) {

System.out.println("Score out of range");
} else if (score >= 90 && score <= 100) {

System.out.println("Grade: A");

} else if (score >= 80) {

System.out.println("Grade: B");
} else if ( score >=70) {

System.out.println("Grade:C");
} else if (score >= 60) {

System.out.println("Grade: D");
}else {

System.out.println("Grade: F");
   }
  
  scanner.close();
  }
}

//Write a program that accepts an integer between 1 and 7 from the user. Use a switch statement to print out the corresponding weekday. Print “Out of range” if the number is less than 1 or greater than 7. Do not forget to include “break” statements in each of your cases.

import java.util.Scanner;

public class WeekdayPrinter { 
  public static void
main(String[] args) {
Scanner scanner=new
Scanner(System.in);

System.out.print("Enter a number between 1 and 7: ");
int number = scanner.nextInt();

switch (number { 
  case 1:

System.out.println("Monday");
break;
  case 2:

System.out.println("Tuesday");
    break;
  case 3:

System.out.println("Wednesday");
  break;
  case 4:

System.out.println("Thursday");
  break
    case 5:

System.out.println("Friday");
    break 
    case 6:

System.out.println("Saturday");
    break
    case 7:
System.out.println("Sunday");
    break;
  default:
System.out.println("Out of range");
    } 
  }
}

//
  



  
