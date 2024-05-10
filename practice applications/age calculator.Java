import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class AgeCalculator{
public static void
main(String[] args) {
        Scanner scanner=new 
Scanner(System.in);

System.out.println("Please enter your birth year:");
int birthYear=scanner.nextInt();

LocalDate currentDate = localDate.now();
int curentYear = currentDate.getYear();

int age= currentYear - birthYear;

System.out.println("Your age is:" + age);
         scanner.close.();
   }
}
