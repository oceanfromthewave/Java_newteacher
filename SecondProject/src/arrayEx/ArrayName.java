package arrayEx;
import java.util.Scanner;
public class ArrayName {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] num = new String[5];
		for(int i = 0; i<num.length; i++) {
			System.out.print(i+1+ "번째 학생 이름 입력:");
			num[i] = scan.next();
			
		}
		scan.close();
		System.out.println("이름 입력이 완료되었습니다!!");
		for(int i = 0; i<num.length; i++) {
			System.out.println(i+1+ "번째 학생의 이름: " + num[i]);
			
		}
		
		
	
	
		System.out.println("+++++ 프로그램을 종료합니다 +++++");
		
	}
}
