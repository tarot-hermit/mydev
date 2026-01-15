package t5_for;

import java.util.Scanner;

public class Test08 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// 구구단(5단)
		int res;
		
		System.out.println("출력할 단을 입력하세요?");
		int dan = scanner.nextInt();
		
		
		
		System.out.println(dan +"단");
		for(int i=1; i<=9; i++) {
			res = dan * i;
			System.out.println(dan + " * "+i+"  = "+ res);
		}
		scanner.close();
	}
}
