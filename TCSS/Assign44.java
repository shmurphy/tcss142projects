/*
 * Course:     TCSS142 - Introduction to Object-Oriented Programming
 * File Name:  Assign4.java
 * Due Date:   July 22, 2014
 * Instructor: Mr. Schuessler
*/
import java.util.*;
/**
 * Based on a user input value for the number of employees to process, this program will also prompt
 * the user for number of hours worked, hourly pay rate, and name. The program then calculates each
 * employee's total gross pay, and will then print out their name, hours worked, pay rate, and their
 * gross pay. It then prints out which employee worked the most hours, and how many hours they worked.
 *
 * @author Shannon Murphy
 * @version July 21, 2014
*/
public class Assign44 {
   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
      int employeeNum = getEmployeeCnt(console);
      processEmployeePay(console, employeeNum);
      
   }
   
   /* getEmployeeCnt() receives input from the scanner, prompts the user for the number of employees,
    * and returns the number of employees
    */
   public static int getEmployeeCnt (Scanner console) {
      System.out.print("How many employees are there? ");
      int employeeNum = console.nextInt();
      return employeeNum;
   }
   
   /* The processEmployeePay method receives input from the scanner and the number of employees, and prompts the user to 
    * enter hours worked, pay rate, and the employee's name for each employee. 
    * It also stores the employee's name with the most hours worked and the number of hours they worked, and displays
    * these values by calling the displayTopEmployee method.
    */
   public static void processEmployeePay(Scanner console, int employeeNum) {           
      double topHours = 0;
      String topName = "";
            
      for(int i = 1; i <= employeeNum; i++) {
         System.out.print("Enter Hours Worked, Pay Rate, and Employee name separated by a space: ");
         double hours = console.nextDouble();
         double payRate = console.nextDouble();
         String name = console.nextLine();
         double grossPay = getGrossPay(hours, payRate);
         displayEmployeePay(name, hours, payRate, grossPay);
         
         if(hours > topHours) {
            topHours = hours;
            topName = name;
         }
         else if(hours < topHours) {
            topHours = topHours;
            topName = topName;
         }
      }   
      
      displayTopEmployee(topHours, topName);
   }
   
   /* The getGrossPay method receives the number of hours worked and the pay rate to calculate the gross pay based
    * on how many hours the employee worked. It returns the gross pay, and is called in the processEmployeePay method.
    */
 public static double getGrossPay(double hours, double payRate) {
       double doubleOverTime = 0;
       double overTime = 0;

       if(hours > 48) {
          doubleOverTime = (hours - 48) * 2 * payRate;
          overTime = 8 * 1.5 * payRate;
          hours = 40;
       } else if (hours > 40) {
          overTime = (hours - 40) * 1.5 * payRate;
          hours = 40;
       }
       return doubleOverTime + overTime + (hours * payRate);
    }
   
   /* The displayEmployeePay method receives an employee name, hours, pay rate, and gross pay, and prints out this 
    * information for each employee.
    */
   public static void displayEmployeePay(String name, double hours, double payRate, double grossPay) {
      String spaces = " ";
      String dollarSign = "$";
      System.out.println("Employee Name: " + name);
      System.out.printf("Hours Worked: %-2s%12.2f \n", spaces, hours);
      System.out.printf("Pay Rate:     %-2s%12.2f \n", spaces, payRate);
      System.out.printf("Gross Pay:   %-2s%s%12.2f \n", spaces, dollarSign, grossPay);
   }
   
   /* The displayTopEmployee method receives the hours and name of the top employee. It prints out a statement for
    * the employee with the most hours worked. The statement printed changes based on how many hours the employee worked.
    */
   public static void displayTopEmployee(double hours, String name) {
      if(hours > 56) {
         System.out.println("WOW!!!! What a Dynamo! " + name + " Worked " + hours + " Hours this WEEK!");
      }
      else if(hours > 48 && hours <= 56) {
         System.out.println(name + " is Such a WorkHorse! Looks Like You Worked " + hours + " Hours this WEEK!");
      }
      else if(hours > 40 && hours <= 48) {
         System.out.println("Well, Good for YOU" + name + ", Who Worked " + hours + " Hours this WEEK!");
      }
      else {
         System.out.println(name + " Worked " + hours + " Hours this WEEK!");
      }
   }  
}