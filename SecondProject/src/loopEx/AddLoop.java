package loopEx;
import java.util.Scanner;
public class AddLoop {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num, sumOdd = 0, sumEven = 0, sumThree = 0;
//		System.out.print("얼마까지 더할지 정수를 입력하세요: (종료 시 0)");
//		num = scan.nextInt();
		while (true) {
			sumOdd=0; sumEven=0; sumThree=0;
			System.out.print("얼마까지 더할지 정수를 입력하세요: (종료 시 0):");
			num = scan.nextInt();
			if (num == 0) break;
			for (int i = 1; i< num; i++) {
				if(i%2==0) sumEven += i;
				if (i%2!=0) sumOdd += i;
				if(i%3==0) sumThree += i;
			}
			System.out.printf("1부터 %d까지 짝수의 합은 %d입니다.\n",num,sumEven);
			System.out.printf("1부터 %d까지 홀수의 합은 %d입니다.\n",num,sumOdd);
			System.out.printf("1부터 %d까지 3의 배수의 합은 %d입니다.\n",num,sumThree);
		}
		
//			System.out.print("얼마까지 더할지 정수를 입력하세요: (종료 시 0):");
//			num = scan.nextInt();
//		}
		scan.close();
		System.out.println("*** 프로그램을 종료합니다. ***");
		}
		
	
	}



