package operator;
import java.util.Scanner; // Scanner 클래스 사용하기 위해 임포트
public class InputOperation {
	public static void main(String[] args) {
		// 클래스 정보 출력
		System.out.println("++++++++++++++++++");
		System.out.println("+ 점수 계산 프로그램 +");
		System.out.println("+ 개발자: 엄규식 +");
		System.out.println("+ 버전: 1.0 + ");
		System.out.println("++++++++++++++++++");
		// scanner 객체 생성
		Scanner scan = new Scanner(System.in);
		// 필요 변수 선언
		float korScore, engScore, mathScore, siScore, totalScore;
		double avgScore;
		String outputMessage;
		
		// 입력 처리
		System.out.print(" 국어점수: ");
		korScore = scan.nextFloat();
		System.out.print(" 영어점수: ");
		engScore = scan.nextFloat();
		System.out.print(" 수학 점수 ");
		mathScore = scan.nextFloat();
		System.out.print(" 과학 점수 ");
		siScore = scan.nextFloat();
		scan.close();
		
		// 계산
		totalScore = korScore + engScore + mathScore + siScore;
		avgScore = totalScore / 4;
		
		//출력
		System.out.println("총점: " + totalScore);
	    System.out.printf("평균: %.1f\n", avgScore);
	    outputMessage = avgScore >= 90 ? "우등생입니다!!" : "수고했어요!";
		// 결과 출력하기
		System.out.println(outputMessage);
		// 종료 안내 메세지
		System.out.println("프로그램을 이용해 주셔서 감사합니다!");
	}
	
}
