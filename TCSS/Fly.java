/**
 * TCSS142 - Introduction to Object-Oriented Programming Summer 2014
 * SeattleSpaceNeedle.java
 * Programming Assignment 2
 * Due July 7, 2014
 * Mr. Schuessler
 *
 * This program outputs the lyrics to "There Was An Old Woman"
 */
 
 public class Fly {
 
 /**
   * The main() method - displays the lyrics to There Was An Old Woman by each verse
   */
   public static void main(String[] args) {
      firstVerse();
      secondVerse();
      thirdVerse();
      fourthVerse();
      fifthVerse();
      sixthVerse();
   }
   
   // firstVerse() outputs the fly verse
   public static void firstVerse() {
      System.out.println("There was an old woman who swallowed a fly,");
      fly();
   
   }
   // secondVerse() outputs the spider verse
   public static void secondVerse() {
      System.out.println("There was an old woman who swallowed a spider,");
      spider();
   }
   
   // thirdVerse() outputs the bird verse
   public static void thirdVerse() {
      System.out.println("There was an old woman who swallowed a bird,");
      System.out.println("How absurd! to swallow a bird,");      
      bird();
   }
   
   // fourthVerse() outputs the cat verse
   public static void fourthVerse() {
      System.out.println("There was an old woman who swallowed a cat,");
      System.out.println("Imagine that! to swallow a cat,");      
      cat();
   }
   
   // fifthVerse() outputs the dog verse
   public static void fifthVerse() {
      System.out.println("There was an old woman who swallowed a dog,");
      System.out.println("What a hog! to swallow a dog,");
      dog();
   }
   
   // sixthVerse() outputs the very last verse 
   public static void sixthVerse() {
      System.out.println("There was an old woman who swallowed a horse.\nShe's dead - of course!");
   }
   
   // fly() outputs the fly line
   public static void fly() {
      System.out.println("I don't know why she swallowed a fly,\nPerhaps she'll die.\n");
   }
   
   // spider() outputs the spider line
   public static void spider() {
      System.out.println("That wriggled and jiggled and tickled inside her,");
      System.out.println("She swallowed the spider to catch the fly,");
      fly();
   }
   
   // bird() outputs the bird line
   public static void bird() {
      System.out.println("She swallowed a bird to catch the spider,");
      spider();
   }
   
   // cat() outputs the cat line
   public static void cat() {
      System.out.println("She swallowed the cat to catch the bird,");
      bird();
   }
   
   // dog() outputs the dog line
   public static void dog() {
      System.out.println("She swallowed the dog to catch the cat,");
      cat();
   }
 } 