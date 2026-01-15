package t1_array;

import java.util.Scanner;

public class Test04_5 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String[] title = {"국어","영어","수학","사회","과학","총점"};
		int[] jumsu = new int[6]; // jumsu[5]의 방의 의미는 total 을 기억 시키기 위한 방 
		double avg = 0.0;
		String name = "";
	
		System.out.println("성명을 입력하세요 :");
		name = scanner.next();
		for(int i=0; i<jumsu.length-1; i++) {
				System.out.println(title[i] + ".점수를 입력하세요" );		
				jumsu[i] = scanner.nextInt();
				jumsu[5] += jumsu[i];
		}
			avg = jumsu[5] / 5.0;
			System.out.println("================");
			System.out.println("성명" + name);
			for(int i=0; i<jumsu.length-1; i++) {
				System.out.println(title[i] + " : " + jumsu[i] );			
			}
			System.out.println(title[5] + " : " + jumsu[5]);
			System.out.printf("평균 : %.2f\n", avg);
			
			scanner.close();
	}
}
