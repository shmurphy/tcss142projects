/*
 * Course:     TCSS142 - Introduction to Object-Oriented Programming
 * File Name:  Assign6.java
 * Due Date:   August 11, 2014
 * Instructor: Mr. Schuessler
 */

import java.util.*;
import java.io.*;

/**
 * This program reads a file, prints the contents of the file to the console,
 * and prints information about the file to a new output file created by the user.
 * This information includes the number of lines, words, and occurences of
 * the commonly used words "the", "to", "of", "and", and "a".
 * @author Shannon Murphy
 * @version August 11, 2014
 */

public class Assign6 {
   public static void main(String[] args) throws FileNotFoundException {
      Scanner console = new Scanner(System.in);          // Scanner to read user input
      String fileName = getFileName(console);
      String outputName = getOutputName(console);
      
      Scanner input = new Scanner(new File(fileName));  // Scanner used to count lines   
      PrintStream output = new PrintStream(new File(outputName));
      
      getLines(input, output, fileName);
      input = new Scanner(new File(fileName));         // new input Scanner used to count words
      getWords(input, output);
      
   }
   
   /** 
    * The getFileName method receives a Scanner as its parameter and prompts the user to enter the file name.
    * The Scanner in the main method uses this file name to open up a new file.
    */
   public static String getFileName(Scanner console) {
      System.out.print("Please enter the input file name: ");
      String fileName = console.next();
      return fileName;
   }
   
   /** 
    * The getOutputName method receives a Scanner as its parameter and prompts the user to enter the name of
    * the output file. This name is used in main to create a new file for output.
    */
   public static String getOutputName(Scanner console) {
      System.out.print("Please enter the output file name: ");
      String outputName = console.next();
      return outputName;
   }
   
   /** 
    * The getLines method receives a Scanner to read the lines in the file, a PrintStream to print out the
    * number of lines to the output file, and a String of the name of the file being read. 
    */
   public static void getLines(Scanner input, PrintStream output, String fileName) {
      int lineCount = 0;
      
      while (input.hasNextLine()) {
         String text = input.nextLine();
         System.out.println(text);
         lineCount++;
      }
      output.println("The input file \"" + fileName + "\" has the following qualities: \r\n\r\n");
      output.println("A total number of: \r\n");
      output.printf("       Lines - %5d" , lineCount);
   }
   
   /**
    * The getWords method receives a Scanner to read the text in the file, and a PrintStream to print
    * information out to the output file. It counts the number of words in the file and the number of 
    * occurences of the five commonly used words, and prints that information to the output file.
    */
   public static void getWords(Scanner input, PrintStream output) {
      int wordCount = 0;
      int theCount = 0;
      int ofCount = 0;
      int toCount = 0;
      int andCount = 0;
      int aCount = 0;
      String words = "";
      while(input.hasNext()) {
         words = input.next();
         wordCount++;
         
         // count the number of specific words in the text       
         if(words.equalsIgnoreCase("the")) {
            theCount++;
         }
         if(words.equalsIgnoreCase("of")) {
            ofCount++;
         }
         if(words.equalsIgnoreCase("to")) {
            toCount++;
         }
         if(words.equalsIgnoreCase("and")) {
            andCount++;
         }
         if(words.equalsIgnoreCase("a")) {
            aCount++;
         }         
      }
      output.printf("\r\n       Words - %5d" , wordCount);
      output.printf("\r\nThe word THE - %5d" , theCount);
      output.printf("\r\n The word OF - %5d" , ofCount);
      output.printf("\r\n The word TO - %5d" , toCount);
      output.printf("\r\nThe word AND - %5d" , andCount);
      output.printf("\r\n  The word A - %5d" , aCount);
   }
   
}