package t5_for;

import java.util.Scanner;

public class Test09 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// 구구단
		int res;
		
		while(true) {
			System.out.print("\n출력할 단을 입력하세요?");
			int dan = scanner.nextInt();
			
			
			
			System.out.println(dan +"단");
			for(int i=1; i<=9; i++) {
				res = dan * i;
				System.out.println(dan + " * "+i+"  = "+ res);
			}
			System.out.print("작업을 계속할까요?(y/n)");
			String ans = scanner.next().toLowerCase();
			if(ans.equals("n")) break;
		}
		System.out.println("작업끝");
		scanner.close();
	}
}
