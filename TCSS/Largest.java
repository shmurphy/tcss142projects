import java.util.*;
public class Largest {

public static void main(String[] args) {

smallestLargest();

}
public static void smallestLargest() {

    int smallest=0; int large=0; int num;
    System.out.print("Enter the amount of numbers: ");//how many number you want to enter
    Scanner input=new Scanner(System.in);
    int n=input.nextInt();
    num=input.nextInt();
    smallest = num; //assume first entered number as small one
    for(int i=2;i<n;i++)// i starts from 2 because we already took one num value
        {
            num=input.nextInt();
            if(num>large)//comparing each time entered number with large one
          {
           large=num;
          }
            if(num<smallest)//comparing each time entered number with smallest one
            {
                smallest=num;
            }
        }
   System.out.println("the largest is:" + large);
   System.out.println("Smallest no is : "  + smallest);
   
   }
   
}   