package datatype;

import java.util.Scanner;

public class Calculator {

   public static void main(String[] args) {
      System.out.println("++++++++++++++++++++++++");
      System.out.println("+  계산기  프로그램  +");
      System.out.println("+    개발자: 엄규식    +");
      System.out.println("+     버  전: 1.0      +");
      System.out.println("++++++++++++++++++++++++");
      
      Scanner scan = new Scanner(System.in);
      int num1;
      int num2;
      char calc;
      double result = 0;
      String input;
      while (true) {
         num1 = 0; num2 = 0; calc = 0; result = 0;
         System.out.print("연산자 입력('+, -, *, /' 종료 시 'x'): ");
         input = scan.next();
         calc =  input.charAt(0); // String에 한 문자만 있는 경우
         if (calc == 'x') break;
         System.out.print("첫 번째 정수 입력: ");
         num1 = scan.nextInt();         
         System.out.print("두 번째 정수 입력: ");
         num2 = scan.nextInt();                        
      
         switch(calc) {
         case '+': 
            result = num1 + num2;
            break;
         case '-': 
            result = num1 - num2;
            break;
         case '*': 
            result = num1 * num2;
            break;
         case '/': 
            result = (double)num1 / (double)num2;
            break;
         }      
         System.out.printf("%d %c %d = %.2f\n", num1, calc, num2, result);
      }      
      scan.close();
      System.out.println("***프로그램을 종료합니다.***");
   }
}