/* 
 * Course: TCSS142 – Introduction to Object-Oriented Programming Summer 2014 
 * File Name: Guess.java 
 * Assignment: 5 
 * Due Date: August 4, 2014 
 * Instructor: Mr. Schuessler 
 */ 

import java.util.*;

 /** 
 * This program plays a game where the user must guess a random number.
 * The game can be continuously played until the user decides to stop. 
 * 
 * @author Shannon Murphy 
 * @version 2014 August 4 
 */ 

public class Guess {
   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
      Scanner input = new Scanner(System.in);      
      Random rand = new Random();          
      intro();
      playGame(console, input, rand);

   }

/**
 * The playGame method receives two Scanners, and a Random object as its parameters.
 * It controls the guessing game, while calling getRange() and getNumber() to produce
 * different random numbers for each round of the game. It then calls playMore(), and
 * if the return value of playMore() is true, it starts the game over again.
 */  
   public static void playGame(Scanner console, Scanner input, Random rand) {
      int guess = 1;
      do {
      int range = getRange(rand);
      int randNum = getNumber(range, rand);
      System.out.print("Pick a number from 1 to " + range + ": ");      
      guess = console.nextInt();
      int count = 1;
      while(guess != randNum) {
         hints(guess, randNum);
         System.out.print("Guess again: ");
         guess = console.nextInt();
         count++;
      }
      System.out.println("Finally! It took you " + count + " tries to guess the number. \n");
      } while(playMore(input));
   }
   
/**
 * The getRange method receives a Random as a parameter. It creates a random number between 1 and 3
 * and then raises 10 by that number, creating a range of either 1-10, 1-100, 1-1000. 
 */   
   public static int getRange(Random rand) {
      int rangePower = rand.nextInt(3) + 1;
      int range = (int) Math.pow(10, rangePower);
      return range;
   }
   
/**
 * The getNumber method receives the range from getRange, and receives a Random to generate a random
 * number in between the given randomly generated range. This number is then used in the playGame method.
 */   
   public static int getNumber(int range, Random rand) {
      int randNum = rand.nextInt(range) + 1;
      return randNum;
   }

/**
 * The hints method receives the user's guess and the random number as parameters. It
 * gives hints throughout the game whenever the user makes an incorrect guess by telling 
 * the user whether his/her guess is higher or lower than the mystery number.
 */   
   public static void hints (int guess, int randNum) {
      if(guess > randNum) {
         System.out.println("Oh my gosh dude, your guess is too high man. \n");
      }
      if(guess < randNum) {
         System.out.println("Aww, dude... Your guess is too low. \n");
      }
   }

/**
 * The method getResponse receives a Scanner as a parameter, and prompts the user to play again. It reads
 * the user's response and returns the character that the user typed. It is called in playMore() to 
 * determine whether the response was a Y or y.
 */   
   public static char getResponse (Scanner input) {
      System.out.print("Dude, come on. You can do better than that. \nPlay again?? [Y/N] ");
      String response = input.next();
      char y = response.charAt(0);
      return y;
   }

/**
 * The playMore method receives a Scanner as a parameter, and calls getResponse to determine whether
 * the user typed a Y, y, or a different letter. It returns true if the character was a Y or a y. The
 * game starts over if playMore() returns true, otherwise the game ends.
 */   
   public static boolean playMore (Scanner input) {
      char response = getResponse(input);
      return response == 'Y' || response == 'y';
   }

/**
 * The method intro prints out an introduction of what the program does.
 */   
   public static void intro() {
      System.out.println("This program prompts the user to play a game, where the user must guess a number");
      System.out.println("from 1-10, 1-100, or 1-1000.");
      System.out.println();
      System.out.println("The program displays hints for the user until they guess the correct number.");
      System.out.println("Once a correct guess is made, the number of guesses is displayed and the user is ");
      System.out.println("prompted to play again.");
      System.out.println();
      System.out.println("The game continues until the user types something other than a Y or y.");
      System.out.println();
   }
}