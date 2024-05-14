import java.util.Scanner;

public class BMI_Calculator {
   public static void
main(String[] args){
  Scanner scanner = new Scanner(System.in);

System.out.println("Welcome to the BMI Calculator!");

System.out.print('Enter your height in meters: ");
double height = scanner.nextDouble();

System.out.print("Enter your weight in kilograms: ")
double weight = scanner.nextDouble();

System.out.print("Enter your age in years: ");
int age= scanner.nextInt();

double bmi = calculateBMI(height,weight);

System.out.println("Your BMI is:" + bmi);

double idealWeight=calculateIdealWeight(height);

System.out.println("Your ideal weight should be around: " + idealWEight + 'kilograms")

scanner.close();
}
public static double
calculateBMI(double height,double weight) {
return weight/ (height * height);
}

public static double calculateIdealWeight(double height) {
//Formula for ideal weight: Ideal weight =22* height * height
return 22 * height * height;
  }
}
