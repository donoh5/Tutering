package assignment;

public class Temp {
   public static void main(String[] args) {
      
      int i;
      int j;
      char a = 'a';
      for (i=0; i<5; i++) {
         for (j=0; j<5; j++) {
            System.out.print((char)((int)a + i));
            System.out.println((char)((int)a + j));
         }
      }
   }
}