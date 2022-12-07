package datatype;

import java.util.Scanner;

public class Gugudan {

   public static void main(String[] args) {
      Scanner scan1 = new Scanner(System.in);      
      
      int dan = 0;
      
      System.out.print(" 출력하고 싶은 단을 입력하세요: ");
      dan = scan1.nextInt();
      scan1.close();
     
      if(dan >= 2 && dan <= 9) {
    	  for(int i = 1; i<9;i++) {
        	  System.out.printf("%d x %d = %2d\n", dan, i ,dan*i);
      }
    
      }
      else System.out.println("구구단 2단~9단까지만 이용하세요");      
     
   }

}