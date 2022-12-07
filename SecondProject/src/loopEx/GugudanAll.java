package loopEx;

public class GugudanAll {
	public static void main(String[] args) {
		System.out.println("\n                        ++++++++++ 구구단 테이블 ++++++++++ \n");
		
		for (int i = 1; i<10; i++) {
			for (int j = 2; j<10; j++) {
				System.out.printf("%d X %d = %2d ", j,i,i*j);
			}
			System.out.println();
			
		}
	}
}
