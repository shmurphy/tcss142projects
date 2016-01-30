/*
 * TCSS142 - Introduction to Object-Oriented Programming Summer 2014
 * SeattleSpaceNeedle.java
 * Programming Assignment 2
 * Due July 7, 2014
 * Mr. Schuessler
 */
 
 /**
 * This program draws an image of the Space Needle
 *
 * @author Shannon Murphy
 * @version 2014 July 7
 */
 
 public class SeattleSpaceNeedle {
   public static final int SIZE = 6;
   
   public static void main(String[] args) {
      needleTip();
      needleRoof();
      needleLowerDeck();
      needleTip();
      needleElevator();
      needleRoof();
   } 
   
   /** 
     * needleTip() draws the tip of the needle
     * This method is also called to draw the straight line below LowerDeck()
     */
   public static void needleTip() {
      // sets the number of lines printed to the value of SIZE
      for (int line = 1; line <= SIZE; line++) {
         // prints specified amount of spaces
         for (int spaces = 1; spaces <= 3 * SIZE; spaces++) {
            System.out.print(" ");
         }
         System.out.println("||");
      }
   }
   
   /**
     * needleRoof() draws the roof of the Space Needle's observatory/restaurant
     * This method is also called to draw the Space Needle's base
     */
   public static void needleRoof() {
      // sets the number of lines printed to the value of SIZE
      for (int line = 1; line <= SIZE; line ++) {
         // prints specified amount of spaces
         for (int spaces = 1; spaces <= -3 * line + (SIZE * 3); spaces++) {
            System.out.print(" ");
         }
         System.out.print("__/");
         colons(line);
         System.out.print("||");
         colons(line);
         System.out.println("\\__");
      }
      quoteLine(); 
   }  
   
   /**
     * needleLowerDeck() draws the lower deck of the Space Needle's observatory/restaurant
   */   
   public static void needleLowerDeck() {
      // sets the number of lines printed to the value of SIZE
      for (int line = 1; line <= SIZE; line++) {
         // prints specified amount of spaces
         for (int spaces = 1; spaces <= 2 * line - 2; spaces++) {
            System.out.print(" ");
         }
         System.out.print("\\_");
         // prints specified amount of repeating /\
         for (int slashes = 1; slashes <= -2 * line + (3 * SIZE + 1); slashes++) {
            System.out.print("/\\");
         }   
         System.out.println("_/");
      }
   }
   
   /**
     * needleElevator() draws the long elevator portion of the Space Needle
   */  
   public static void needleElevator() {
      // sets the number of lines printed to the value of SIZE * 4
      for (int line = 1; line <= 4 * SIZE; line++) {
         // prints specified amount of spaces
         for (int spaces = 1; spaces <= 3 * SIZE - 3; spaces++) {
            System.out.print(" ");
         }
         System.out.println("|%%||%%|");
      }
   }
       
   /**
     * colons() prints a set of : to be used in the needleRoof method
   */    
   public static void colons(int line) {
      // prints specified amount of :
      for (int colon = 1; colon <= line * 3 - 3; colon++) {
         System.out.print(":");
      }
   }
   
   /**
     * quoteLine() prints a line of quotes with one | on each end
   */   
   public static void quoteLine() {
      System.out.print("|");
      // prints specified amount of "
      for (int quotes = 1; quotes <= SIZE * 6; quotes++) {
         System.out.print("\"");
      }
      System.out.println("|");   
   }   
   
} // end class