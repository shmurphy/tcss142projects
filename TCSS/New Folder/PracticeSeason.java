import java.util.*;
public class PracticeSeason {

   public static void main(String[] args) {
      season(12, 25);
      season(3, 28);
      season(9, 31);
   }
   
   public static void season (int month, int day) {
      String season = "";
      
      if(month == 12 && day >= 16 || month == 1 || month == 2 || month == 3 && day <= 15) {
         season = "Winter";
      }
      if(month == 3 && day >= 16 || month == 4 || month == 5 || month == 6 && day <= 15) {
         season = "Spring";
      }
      if(month == 6 && day >= 16 || month == 7 || month == 8 || month == 9 && day <= 15) {
         season = "Summer";
      }
      if(month == 9 && day >= 16 || month == 10 || month == 11 || month == 12 && day <= 15) {
         season = "Fall";
      }

      System.out.println(season);
      
   }
  
}

/* public static String season(int month, int day) {
    String season = "";
    if(month >= 12 && day >= 16 && month <= 3 && day <= 15) {
        season = "Winter";
    }
    if(month >= 3 && day >= 16 && month <= 6 && day <= 15) {
        season = "Spring";
    }
    if(month >= 6 && day >= 16 && month <= 9 && day <= 15) {
     season = "Summer";   
    }
    if(month >= 9 && day >= 16 && month <= 12 && day <= 15) {
     season = "Fall";   
    }
    return season;
}
*/