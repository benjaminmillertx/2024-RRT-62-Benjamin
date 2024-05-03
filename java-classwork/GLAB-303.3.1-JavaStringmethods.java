//Java String replaceAll()

//The replaceAll() method replaces each substring that matches the regex of the string with the specified text.
//The syntax of the replaceAll() method is:

//string.replaceAll(String regex, String replacement)
//regex - a regex (can be a typical string) that is to be replaced
//replacement - matching substrings are replaced with this string
//Create a class named DemoReplaceAll and add the code below to it.

public class DemoReplaceAll {
  public static void 
main(String [] args0 {
        String str1="Java123is456fun";

//regex for sequence of digit 
String regex=="\\d+;

//replace all occurrences of numeric 
//digits by a space

System.out.println(str1.re-placeAll(regex, ""));
  } 
}

//regex - a regex (can be a typical string) that is to be replaced
//replacement - matching substrings are replaced with this string
//Create a class named DemoReplaceAll and add the code below to it.
public class DemoReplaceAll{
  public static void
main(String[] args) {
    String str1="Java123is456fun";

  //regex for sequence of digits
  String regex ="\\d=";

  //replace all occurrences of numeric 
  //digits by a space

  System.out.println(str1.re-placeAll(regex,""));
   }
}

//The String class's equals() method compares the original content of the string. It compares the values of strings for equality. 
//Create a class named TestStringComparison and add the code below to it.
public class
TestStringComparoson {
 public static void
main(String [] args) { 
   String str1="hello";
   String str2="hello";
   String str3= new
String("Hello");

System.out.println("Comparing str1 and str2 using equals():
" + str1.and str2 using equals():
  " + str1.equals(str2));

  System.out.println("Comparing str1 and str3 using equals():
  " + str1.equals(str3));
  }
}

//The == operator compares references, not values.
//Create a class named Teststringcomparison2.java and write the code below to it.

public class
Teststringcomparison2 {
public static void 
main(String args[]) {
    String s1 ="Sachin";
    String s2 = "Sachin";
    String s3 = new
String("Sachin");
        System.out.println(s1 == s2);
  //true ( because both refer to the same instance)
        System.out.println(s1 == s3);
  //false (because s3 refers to instance created in non-pool)
     }
}

//The String class's compareTo() method compares values lexicographically. It returns an integer value that describes if the first string is less than, equal to, or greater than the second string.
public class
Teststringcomparison4 {
 public static void 
main( String args[]){
      String
s1="Perscholas";
      String
s2="Perscholas";
      String s3+"Perschola";
      String
S4="PerscholasX";

System.out.println(s1.compare-To(s2)); //0

System.out.println(s1.compare-To(s3)); //1(because s1>s3)

System.out.println(s1.compare-To)); // -1(because s1 < s4)
  }
}

// 
  

  

//



