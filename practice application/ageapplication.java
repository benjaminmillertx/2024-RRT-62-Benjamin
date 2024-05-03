import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class AgeCalculator {
   public static void
main(String[] args) {
Scanner scanner = new 
Scanner(System.in);

//Ask for birth year

System.out.println("Enter your birth year:");
int birthYear = scanner.nextInt();

//Get current date
LocalDate currentDate = LocalDate.now();

//Calculate age
int age = Period.between(LocalDate.of(birthYear,1,1),
currentDate).getYears();

//Display the result 
System.out.println("Your age is: " + age + "years.");
           scanner.close();
  }
}

