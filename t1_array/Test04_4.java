package t1_array;

import java.util.Scanner;

public class Test04_4 {
	public static void main(String[] args) {
		// 선언문
		Scanner scanner = new Scanner(System.in);
		// String 객체 선언후 = {} 중괄호 사에이 넣는만큼 주소 생성.
		String[] title = {"국어","영어","수학","사회","과학"};
		int[] jumsu = new int[5];
		int tot = 0;
		double avg = 0.0;
		
		//배열의 크기?
		//System.out.println("크기 : " + title.length);
		
		//입력부
//		title[0] = "국어";
//		title[1] = "영어";
//		title[2] = "수학";
//		title[3] = "사회";
//		title[4] = "과학";	
		
		//title.length 배열의 크기만큼 실행.
		
		for(int i=0; i<title.length; i++) {
			System.out.print(title[i] + ".점수를 입력하세요");			
			jumsu[i] = scanner.nextInt();	
		}
		
		
			// 처리(계산)부 
			for(int i=0; i<jumsu.length; i++) {
				tot += jumsu[i]; 
				//출력부
				System.out.println(title[i] + " : "  + jumsu[i] );			
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
