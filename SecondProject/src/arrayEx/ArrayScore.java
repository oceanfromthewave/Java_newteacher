package arrayEx;

import java.util.Scanner;

public class ArrayScore {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] num = new int[5];
		String[] Num = new String[5];
		float avgScore;
		int totalScore = 0;
		for (int i = 0; i < num.length; i++) {
			System.out.print(i + 1 + "번째 학생 이름 입력:");
			Num[i] = scan.next();
			System.out.print("점수 입력:");
			num[i] = scan.nextInt();

		}
		scan.close();
		System.out.println("입력이 완료되었습니다!!");
		System.out.println("+++++ 학생별 점수 +++++");

		for (int i = 0; i < num.length; i++) {
			System.out.println(Num[i] + "      : " + num[i]);
			totalScore += num[i];
		}

		avgScore = ((float) totalScore / 5);
		System.out.println("총점: " + totalScore);
		System.out.printf("평균: %.1f\n", avgScore);

		System.out.println("+++++ 프로그램을 종료합니다 +++++");

	}
}
