import java.util.*;

public class Name {
   public static void main(String[] args) {
      smallestLargest();
   }
   
   public static void smallestLargest() {
      Scanner console = new Scanner(System.in);
      System.out.print("How many numbers: ");
      int totalNumbers = console.nextInt();
     
      int numbers;
      int max = 0;
      int low = 0;
      
      for (int i = 1; i <= totalNumbers; i++) {
         System.out.print("Number " + i + ": ");
         numbers = console.nextInt();
               if(numbers > max) {
      max = numbers;
      }
      if(numbers < low) {
      low = numbers;
      }
      }


      System.out.println("The largest is: " + max);
      System.out.println("The smallest is: " + low);
  }
}   