package org.example>Slides_303_13

public class FileReaderExample{

public static void main(String[] args) {
try{

   File input= new file (postname: "output.txt");
  FileReader reader = new FileReader(input);
  BufferedReader br = new BufferedReader(reader);

  String line =br.readline();
  while (line != null) {
    System.out.println(line);
    line = br.readLine();
  }
}
