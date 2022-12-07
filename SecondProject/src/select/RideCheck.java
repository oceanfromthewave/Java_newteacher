package select;

import java.util.Scanner;

public class RideCheck {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	// 필요 변수 선언
	double height,weight;
	System.out.print("키 입력(cm): ");
	height = scan.nextDouble();
	System.out.print("몸무게 입력(kg): ");
	weight = scan.nextDouble();
	
	if(height > 190)
		System.out.println("키가 190cm가 넘어 이 놀이기구를 탈 수 없습니다.");
	else {
		if (weight > 120) System.out.println("몸무게가 120kg이 넘어 이 놀이기구를 탈 수 없습니다.");
		else
		{
		System.out.println("어서오세요, 즐거운 시간 되세요!!");
	}
	System.out.println("시스템을 종료합니다");
	}
}
}