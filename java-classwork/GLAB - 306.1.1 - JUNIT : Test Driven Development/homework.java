
Guided LAB - 306.1.1 - JUNIT: Test Driven Development
Learning Objective:
In this lab, we will write a Java JUnit5 test program for a requirement to validate if the password entered matches the criteria needed.
Project Example: Passwords are used for every web application to validate a user. A strong password is desired to safeguard the authenticated user and prevent against hacks and easy guesses by unwanted users. Below are the minimum criteria to authenticate a password entered. Password entered must be:
Criteria#1 - Length is greater or equal to 8.
Criteria#2 - Length is less than or equal to 12.
Criteria#3 - Has Alphanumeric characters.
Criteria#4 - Has at least one special character.
Criteria#5 - Does not already exist.
Criteria#6 - Not already in use.
Criteria#7 - Does not have “NOT ALLOWED” characters.
We will be writing a JUnit5 test case for some of the above criteria before actually validating the password.
We will write Java methods for each of the above seven criteria that will verify if the password is valid. For each of the methods, we will write JUnit test cases. The seven methods will be iteratively modified until the test cases pass, which is Test Driven Development.
Prerequisite:
Add following SQL queries in MySQL workbench
CREATE SCHEMA `PERSCHOLAS` ;
Prerequisite: JUnit5 libraries.
For this lab, we will be adding Junit5 libraries to the pom.xml file as below:
Step 1: Setup New project
Create a new Maven project by using the Eclipse IDE or STS (Spring Tool Suite4) and add JUnit5 dependencies.
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>
  <groupId>com.perscholas.javacasestudy</groupId>
  <artifactId>junit5</artifactId>
  <version>0.0.1-SNAPSHOT</version>
  <name>junit5</name>
  <properties>
      <maven.compiler.target>11</maven.compiler.target>
      <maven.compiler.source>11</maven.compiler.source>
      <junit.jupiter.version>5.4.0</junit.jupiter.version>
  </properties>
    <dependencies>      <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter-engine</artifactId>
            <version>${junit.jupiter.version}</version>
            <scope>test</scope>
      </dependency>
      <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter-api</artifactId>
            <version>${junit.jupiter.version}</version>
            <scope>test</scope>
      </dependency>  </dependencies>    <build>      <plugins>
            <plugin>
                  <artifactId>maven-surefire-plugin</artifactId>
                  <version>2.22.1</version>
            </plugin>      
      </plugins>
  </build>
</project>
