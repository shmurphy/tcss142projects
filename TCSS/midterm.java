public class midterm {
   public static void main(String[] args) {
      secondHalfLetters("ruminates");
   }
   
   public static void secondHalfLetters (String word) {
      char letters = 0;
      int count = 0;
      
      for(int i = 0; i < word.length(); i++) {
         letters = word.charAt(i);
         if(letters >= 'm' && letters <= 'z') {
            count++;
         }
         if(letters >= 'M' && letters <= 'Z') {
            count++;
         }
      }
      System.out.println(count);
   } 
}