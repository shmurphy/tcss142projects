import java.util.*;

/*  
 * Name: Shannon Murphy
 * Course: TCSS142
 * Date: July 18, 2014
 * Partners: Jason Sexton, Sukhpreet Jawandha
 * Lab: Lab 3
 */
 
 public class Lab3 {
   public static void main(String[] args) {
    
    Scanner console = new Scanner(System.in);
    processEmployees(console, getTotalEmployees(console));
      
   }
   
   public static int getTotalEmployees(Scanner console) {
      System.out.print("How many employees are on the staff? ");
      int employee = console.nextInt();
      return employee;
   }
   
   public static String processEmployees(Scanner console, int totalEmployees) {
      int hours = 0;
      String lastName = "";
      String topName = "";
      String secondName = "";
      int topHours = 0;
      int secondHours = 0;
      String name = "";
      
      System.out.println("Please enter the number of hours and the employee's last name, and hit enter " + totalEmployees + " times:");
      for(int i = 1; i <= totalEmployees; i++) {
         System.out.print(i + ". ");
         hours = console.nextInt();
         name = console.next();
         lastName = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
         
         if(hours > topHours) {
            secondHours = topHours;
            secondName = topName;
            topHours = hours;
            topName = lastName;
         }
         else if(hours > secondHours) {
          secondHours = hours;
          secondName = lastName;  
         }
      }
      System.out.println("Great Job, " + secondName + "! You almost matched " + topName + "!");
      return topHours + topName;
   }
   
 }