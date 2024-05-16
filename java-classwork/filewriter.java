package org.example.Slides_303_13;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample{

public static void main(String[] args){

try{
File output=new file(postname: "output.txt";

FileWriter filewriter =new FileWriter(output);

FileWriter fileWriter= new Filewriter(output, append true):

fileWriter.write("This is my first sentence writing to i flile \n);
fileWriter.flush()

}catch (IOException) {
e.printStackTrace();
      }
   ]
}
