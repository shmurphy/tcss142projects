/*
 * Course:     TCSS142 - Introduction to Object-Oriented Programming
 * File Name:  Assign4.java
 * Due Date:   July 22, 2014
 * Instructor: Mr. Schuessler
*/
import java.io.*;
import java.util.*;
/**
 * This program reads a text file containing data on clients - including their client number, name, and weight - 
 * and displays this information on the console. The user can make changes to the data if needed and the changes
 * will be displayed.
 * The program then prints out the number of clients, average weight, highest weight, and lowest weight
 * into an output text file.
 *
 * @author Shannon Murphy
 * @version July 21, 2014
*/

public class Assign7 {
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in); // For keyboard input
    Scanner input = null;                     // For file input
    PrintStream output = null;                // For file output
    String[] clientNames = null;              
    double[] clientWeights = null;
    boolean filesOK = false;
    try {
      input = new Scanner(new File("Clients.txt"));
      output = new PrintStream(new File("ClientOut.txt"));
      filesOK = true;
    }
    catch (FileNotFoundException e) {
      System.out.println(e);
    }
    if (filesOK) {
      // Create the correct number of elements in the clientNames array
      // Note the input.nextInt() used to acquire the size of the array.
      clientNames = new String[input.nextInt()];
			  
      // Create the correct number of elements in the clientWeights array
      clientWeights = new double[clientNames.length];
			
      readClientData(input, clientNames, clientWeights);
      input.close();
      updateWeights(console, clientNames, clientWeights);
      outputStatistics(output, clientNames, clientWeights);
			output.close();
    }
  }
   /**
    * This method reads from the input file starting on the second line, the clients'
    * ID, their weight, and their name.  The ID is used as an index into the names and
    * weights arrays.
    *
    * @param in Scanner to the file being read.
    * @param names is an array to hold each client's name.
    * @param weights is an array to hold each client's weight.
    */
   public static void readClientData(Scanner in, String[] names, double[] weights) { 
      int[] clients = new int[names.length];
      int clientID = 0;
      String name = "";
      int weight = 0;
         for(int i = 0; i < names.length; i++) {
            clientID = in.nextInt();
            weight = in.nextInt();
            name = in.nextLine();
            
            weights[clientID] = weight;
            names[clientID] = name;
            clients[clientID] = clientID;
         }    
         String headerID = "ID.";
         String headerName = "NAME";
         String headerWeight = "WEIGHT";
         System.out.printf("%s %15s %10s %n" , headerID, headerName, " " + headerWeight); 
         for(int j = 0; j < names.length; j++) {
            System.out.printf("%s %15s %10s %n" , " " + j + "." , names[j] , weights[j]);
         }          
   }  
   /**
    * This method allows the user to change the current weights of each client.
    *
    * @param console used for keyboard input
    * @param names is an array to hold each client's name.
    * @param weights is an array to hold each client's weight.
    */
   public static void updateWeights(Scanner console, String[] names, double[] weights) {
      int idChange = 0;
      int newWeight = 0;
      System.out.print("To change a client weight, type the ID (-1 to terminate): ");
      idChange = console.nextInt();
      
      while (idChange != -1) {
         System.out.print("Enter a new weight for " + names[idChange] + ": ");
         newWeight = console.nextInt();
         weights[idChange] = newWeight;
         String headerID = "ID.";
         String headerName = "NAME";
         String headerWeight = "WEIGHT";
         System.out.printf("%s %15s %10s %n" , headerID, headerName, " " + headerWeight); 
         for(int j = 0; j < names.length; j++) {
            System.out.printf("%s %15s %10s %n" , " " + j + "." , names[j] , weights[j]);
         }   
         System.out.print("To change a client weight, type the ID (-1 to terminate): ");
         idChange = console.nextInt();    
      }    
   }
   /**
    * This method writes to a file statistic regarding each client.  All the client's ID, 
    * Name, and Weight are listed in a table followed by statistics on how many clients
    * there are, the Average weight, the highest, and lowest weight.  
    *
    * @param output file to which the statistics are written.
    * @param names is an array to hold each client's name.
    * @param weights is an array to hold each client's weight.
    */
   public static void outputStatistics(PrintStream output, String[] names, double[] weights) {
      output.printf("Statistics on our clients:");
      output.println();
      output.printf("\r\n  Total number of clients: %10d" , weights.length);
      output.printf("\r\n           Average weight: %10s" , getAverage(weights));
      output.printf("\r\n           Highest weight: %10s" , getHighest(weights));
      output.printf("\r\n            Lowest weight: %10s" , getLowest(weights));
      output.println();
      String headerID = "ID.";
      String headerName = "NAME";
      String headerWeight = "WEIGHT";
      output.printf("\r\n%s %22s %10s %n" , headerID, headerName, " " + headerWeight); 
      for(int j = 0; j < names.length; j++) {
         output.printf("%s %22s %10s %n" , " " + j + "." , names[j] , weights[j]);
      }    
   }
   // The following methods are helper methods for outputStatistics:
   /**
    * This method returns the highest weight found in the array.
    *
    * @param weights is an array to hold each client's weight.
    * @return highest weight found in the array.
    */
   public static double getHighest(double[] weights) {
      double weight = 0;
      double highest = 0;
      for (int i = 0; i < weights.length; i++) {
         weight = weights[i];
         if(weight > highest) {
            highest = weight;
         }
         else {
            highest = highest;
         }
      }
      return highest;
   }  
   /**
    * This method returns the lowest weight found in the array.
    *
    * @param weights is an array to hold each client's weight.
    * @return lowest weight found in the array.
    */  
   public static double getLowest(double[] weights) { 
      double lowest = 0;
      double weight = 0;
      weight = weights[0];
      lowest = weight;
      for(int i = 1; i < weights.length; i++) {
         weight = weights[i];
         if(weight < lowest) {
            lowest = weight;
         }
         else if(weight > lowest) {
            lowest = lowest;
         }
      }
      return lowest;
   }
   /** 
    * This method returns the average of all the weights found in the array.
    *
    * @param weights is an array to hold each client's weight.
    * @return average weight found in the array.
    */
   public static double getAverage(double[] weights) { 
      double average = 0;
      double weight = 0;
      double sum = 0;
      for(int i = 0; i < weights.length; i++) {
         weight = weights[i];
         sum += weight;
      }
      average = sum / weights.length;
      return Math.round(average * 100.0) / 100.0;
   }		
}
			