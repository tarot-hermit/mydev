package t3_if;

import java.util.Scanner;

public class Tsc1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("성명을 입력 하세요?");
		String name = sc.next();
		
		System.out.print("국어 점수를 입력하세요? ");
		int kor = sc.nextInt();

		System.out.print("영어 점수를 입력하세요? ");
		int eng = sc.nextInt();
		
		System.out.println("name : " + name);
		System.out.println("kor : " + kor);
		System.out.println("eng : " + eng);
				
		int tot = 0;
		tot = kor + eng;
		System.out.println("tot : " +tot);
		
		
		sc.close();
	}
}
