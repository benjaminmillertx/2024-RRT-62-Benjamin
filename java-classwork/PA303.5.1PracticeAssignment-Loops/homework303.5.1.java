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
