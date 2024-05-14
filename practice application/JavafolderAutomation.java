import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class MoveJavaFiles{
public static void
main(String[] args) {
String sourceFolder ="/path/to/source/folder";
String destinationFolder ="/path/to/destination/folder/Java";

//Create File objects for source and destination folders

File sourceDir= new File(sourceFolder);
File destinnationDir = new File(destinationFolder);

//Ensure that the source folder exists
if(!sourceDir.exists() || ! sourceDir.isDirectory()) {

System.err.println("Source folder does not exist or is not a directory.");
return;
}
//Ensure that the destination folder exists , create it if necessary
if(!destinationDir.exists()) {
destinationDir.mkdirs();
}
//get a list of .java file to the destination folder
if(javaFiles != null)
{
  for(File javaFile : javaFiles) {
    try{
      Path
sourcePath=javaFile.toPath();
Path destinationPath=new File(destinationDir,java.File.getName()).toPath();

Files


  

