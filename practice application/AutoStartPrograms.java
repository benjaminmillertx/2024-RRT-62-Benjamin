public class AutoStartPrograms
{
   public static void
  main(String[] args) {
//Change these paths to the programs you want to start.

String[] programs = {C:\\Path\\To\Program1.exe",{C:\\Path\\To\Program2.exe",{C:\\Path\\To\Program3.exe"};

try{
for (String program:program) {
ProcessBuilder processBuilder(program);

processBuilder.start();
}
System.out.println("Programs started successfully.");
} catch (iOExceptione) {

System.out.println("Error starting programs: " + e.getMessage());
            }
      } 
}


                   
  
