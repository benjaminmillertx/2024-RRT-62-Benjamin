
Guided Lab - 303.13.1 - Reading a Delimited File
Introduction:
For separating a delimited file, we can use:
String class - has a split() method to identify the comma delimiter and split the row into fields.
Scanner class - has a useDelimiter() method to identify the comma delimiter and split the row into fields.
Objective:
In this Lab, we will demonstrate how to read a Delimited file by using Java. Below is one of the processes:
Create an object of type file. Set it to your file’s path, and then we will pass this file instance to the Scanner class for scanning. The Scanner class will read the file line-by-line.
Use the nextLine() method to read a line.
Split the file by delimiter by using String.split() method.
After the split, we can store data in ArrayList. We could store that line as a String[] array as shown below:
ArrayList<String[]>  
After that, for display, we can Iterate through Arraylist.
Learning Objective:
After this lab, learners will have demonstrated the ability to read a Delimited File using Java and using java methods.
Example 1
Click here to Download the Dummy file (Car.csv).
Remember the path or location of the downloaded file. We will use that file in this Lab.
Create a class named ScanDelimiterdFile, or give any name to the class. Write the code below in that class.
💡 Note: Do not forget to change the path or location of the file (cars.csv) at line number 9.
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
public class ScanDelimiterdFile{
   public static void main(String[] args) throws FileNotFoundException {
           try {
               String location = "C:/Users/Downloads/cars.csv";
               File file = new File(location);
               Scanner input = new Scanner(file);
               ArrayList<String[]> data = new ArrayList<String[]>();
               while (input.hasNextLine()) {
                   String Line = input.nextLine();
                   String[] splitedLine = Line.split(",");
                   data.add(splitedLine);
               }
               for (String[] line : data) {
             //System.out.println(line[0] + "|" + line[1] + "|" + line[2] + "|" + line[3]  + line[4] + "|" + line[5] + "|" + line[6] + "|" + line[7] + "|" + line[8]);
                       System.out.println("Car Name :" + line[0] );
                       System.out.println("MPG :" + line[1] );
                       System.out.println("Cylinder :" + line[2] );
                       System.out.println("Displacement :" + line[3]);
                       System.out.println("Horsepower :" + line[4]);
                       System.out.println("Weight :" + line[5]);
                       System.out.println("Acceleration :" + line[6]);
                       System.out.println("Model :" + line[7]);
                       System.out.println("Origin :" + line[8]);
                       System.out.println("===============================");
                   }
           } catch (FileNotFoundException e) {
               System.out.println("File not found! ");
               e.printStackTrace();
             
           }
       }
   }
