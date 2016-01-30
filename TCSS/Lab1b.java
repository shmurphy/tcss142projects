/* 
 * TCSS Lab1a Summer 2014 
 */ 
 
 /** 
 * This is a program using decomposition and the elimination of redundancy 
 * @Shannon Murphy
 * @Jason Sexton 
 * @version June 27, 2014 
 */
 
 public class Lab1b {
 
   public static void main(String[] args) {
      hat();
      System.out.println();
      lantern();
      System.out.println();
      spaceShip();
   }
   
   public static void hat() {
      System.out.println("    *****");
      System.out.println("  *********");
      System.out.println("*************");
   }
   
   public static void lantern() {
      hat();
      windowPanel();
      longLine();
      hat();
   }
   
   public static void spaceShip() {
      hat();
      shortLine();
      windowPanel();
      windowPanel();
      shortLine();
      shortLine();      
   }
   
   public static void longLine() {
      System.out.println("*************");      
   }
   
   public static void shortLine() {
      System.out.println("    *****");
   }
   
   public static void windowPanel() {
      System.out.println("* | | | | | *");
   }
 }