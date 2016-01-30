/* 
 * Course: TCSS142 – Introduction to Object-Oriented Programming Summer 2014 
 * File Name: Assign3.java 
 * Assignment: 3 
 * Due Date: July 14, 2014 
 * Instructor: Mr. Schuessler 
 */ 
import java.util.*; // Note this statement. Discussed in Wednesday’s class. 
/** 
 * This program calculates dimensions of various shapes. 
 * 
 * @author Shannon Murphy 
 * @version 2014 July 14 
 */ 
 
 public class Assign3 {
 
   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
      
      double radius = 0.0, height = 0.0, circumference = 0.0, area = 0.0, lineLength = 0.0, coneArea = 0.0, coneVolume = 0.0;
      double cylArea = 0.0, cylVolume = 0.0;
      double boxLength = 0.0, boxWidth = 0.0, boxHeight = 0.0, boxArea = 0.0, boxVolume = 0.0;
      String name, nameSwitch, nameReverse;
            
      System.out.println("For circular shapes, please enter a radius and height separated by a space: ");
      radius = console.nextDouble();
      height = console.nextDouble();
      
      System.out.println("For rectangular/box shapes, please enter a length, width, and height separated by a space: ");
      boxLength = console.nextDouble();
      boxWidth = console.nextDouble();
      boxHeight = console.nextDouble();    
      
      System.out.println("Circular shapes using a length of " + radius + " and a heighth of " + height + ":");
      circumference = getCircumference(radius);            
      System.out.println("Circle Circumference: " + round2(circumference));
      
      area = getArea(radius);
      System.out.println("Circle Area: " + round2(area));
      
      lineLength = getLineLength(radius, height);
      System.out.println("Line length up cone side: " + round2(lineLength));
      
      coneArea = getConeArea(area, radius, lineLength);
      System.out.println("Cone Surface Area: " + round2(coneArea));
      
      coneVolume = getConeVolume(area, height);
      System.out.println("Cone Volume: " + round2(coneVolume));
      
      cylArea = getCylArea(area, circumference, height);
      System.out.println("Cylinder Surface Area: " + round2(cylArea));
      
      cylVolume = getCylVolume(area, height);
      System.out.println("Cylinder Volume: " + round2(cylVolume) + "\n");
      
// box calculation outputs
      System.out.println("Box sizes using a length of " + boxLength + ", a width of " + boxWidth + ", and a height of " + boxHeight + ":");
      boxArea = getBoxArea(boxLength, boxWidth, boxHeight);
      System.out.println("Box Surface Area: " + round2(boxArea));
      
      boxVolume = getBoxVolume(boxLength, boxWidth, boxHeight);
      System.out.println("Box Volume: " + round2(boxVolume) + "\n");
      
      console.nextLine();
// name method outputs
      System.out.print("Please enter your First and Last Name: ");
      name = console.nextLine();      
      nameSwitch = switchNames(name);
      
      System.out.println(name + " in a LAST, FIRST format: " + nameSwitch + "\n");
      nameReverse = reverseName(name);
      System.out.println();
      System.out.println("Now isn't that silly!");
   }
   
/** 
 * getCircumference method receives a single parameter as a radius and 
 * calculates and returns the circumference to the calling method. 
 */
   public static double getCircumference(double theRadius) {
      return 2*Math.PI*theRadius;
   }

/** 
 * getArea method receives a single parameter as a radius and 
 * calculates and returns the area to the calling method. 
 */   
   public static double getArea(double theRadius) {
      return Math.PI*theRadius*theRadius;
   }

/** 
 * getLineLength method receives two parameters, one of a radius and one of a height, and 
 * calculates and returns the hypotenuse line length to the calling method. 
 */   
   public static double getLineLength(double theRadius, double theHeight) {
      return Math.sqrt((theRadius*theRadius)+(theHeight*theHeight));
   }

/** 
 * getConeArea method receives parameters as an area, a radius, and a line length, and 
 * calculates and returns the area of a cone to the calling method. 
 */   
   public static double getConeArea(double theArea, double theRadius, double theLineLength) {
      return theArea + Math.PI*theRadius*theLineLength;
   }

/** 
 * getConeVolume method receives parameters as an area and a height, and 
 * calculates and returns the volume of a cone to the calling method. 
 */   
   public static double getConeVolume(double theArea, double theHeight) {
      return (theArea*theHeight)/3;
   }

/** 
 * getCylArea method receives parameters as an area, a circumference, and a height, and 
 * calculates and returns the area of a cylinder to the calling method. 
 */   
   public static double getCylArea(double theArea, double theCircumference, double theHeight) {
      return (2*theArea)+(theCircumference*theHeight);
   }

/** 
 * getCylVolume method receives parameters as an area and a height, and 
 * calculates and returns the volume of a cylinder to the calling method. 
 */   
   public static double getCylVolume(double theArea, double theHeight) {
      return theArea*theHeight;
   }

/** 
 * getBoxArea method receives parameters as a length, a width, and a height, and 
 * calculates and returns the area of a box to the calling method. 
 */   
   public static double getBoxArea(double theLength, double theWidth, double theHeight) {
      return (2*theLength*theWidth)+(2*theLength*theHeight)+(2*theWidth*theHeight);
   }

/** 
 * getBoxVolume method receives parameters as a length, a width, and a height and 
 * calculates and returns the volume of a box to the calling method. 
 */   
   public static double getBoxVolume(double theLength, double theWidth, double theHeight) {
      return theLength*theWidth*theHeight;
   }

/** 
 * switchNames method receives a single parameter as a name and 
 * formats and returns the name in a LASTNAME, FIRSTNAME format. 
 */   
   public static String switchNames(String theName) {
      String firstName = theName.substring(0,theName.indexOf(" "));
      String lastName = theName.substring(theName.indexOf(" "),theName.length());
      String names = lastName + ", " + firstName;
      System.out.println();
      return names.toUpperCase();
   }

/** 
 * reverseName method receives a single parameter as a name and 
 * prints out the name backwards using a for loop. 
 */   
   public static String reverseName(String theName) {
      String fullName = theName;
      System.out.print(theName + " backwards is: ");
      for (int i = theName.length()-1; i >= 0; i--) {
         System.out.print(theName.charAt(i));
      } System.out.println();
      return fullName;
   } 
   
   public static double round2(double theNumber) {
      return Math.round(theNumber * 100.0)/100.0;
   }
} 
 
 