package t1_array;

import java.util.Scanner;

public class Test04_2 {
	public static void main(String[] args) {
		// 선언문
		Scanner scanner = new Scanner(System.in);
		int[] jumsu = new int[5];
		int tot = 0;
		double avg = 0.0;
		
		//입력부
		for(int i=0; i<5; i++) {
			System.out.print((i+1) + ".수를 입력하세요");			
			jumsu[i] = scanner.nextInt();	
		}
		
		
			// 처리(계산)부 
			for(int i=0; i<5; i++) {
				tot += jumsu[i]; 
				//출력부
				System.out.println("jumsu["+i+"] = " + jumsu[i] );			
		}
			avg = tot / 5.0;
			System.out.println("================");
			
			
			System.out.println("점수");
			for(int i=0; i<5; i++) {
				System.out.println("jumsu["+i+"] = " + jumsu[i] );			
			}
			System.out.println("총점 : " + tot);
			System.out.printf("평균 : %.2f\n", avg);
			
			scanner.close();
	}
}
