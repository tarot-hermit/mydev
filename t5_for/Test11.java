package t5_for;

import java.util.Scanner;

// 시작단 ~ 끝단까지 출력(시작단과 끝단을 입력하여 처리하시오)
public class Test11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("시작단 입력?");
		int startDan = scanner.nextInt();
		System.out.print("끝단 입력?");
		int endDan = scanner.nextInt();
		
		int temp;
		
		if(startDan > endDan) {
	//		temp = startDan;
	//		startDan = endDan;
	//		endDan = temp;
			temp = startDan; startDan = endDan; endDan = temp;
		}
		
		for(int i=startDan; i<=endDan; i++) {
			System.out.println(i +"단");
			for(int j=1; j<=9; j++) {
				System.out.println(i+" * "+j+" = " + (i*j));
		}			
		System.out.println();
	}
	System.out.println("작업끝.");
	
	scanner.close();
	}
}
