package t5_for;

import java.util.Scanner;

// 5개의 수를 입력받아 가장 큰 수를 출력하시오.(입력되는 정수는 양의 정수이다)
public class Test06 {
	public static void main(String[] args) {
		Scanner	scanner =new Scanner(System.in);
		
		int su = 0, max = 0;
		
		for(int i=1; i<=5; i++) {
			System.out.print(i + "수를 입력하세요");
			su = scanner.nextInt();
			if(su > max) max = su;
		}
		
		System.out.println("입력된 수의 최대값은? " + max);
		
		scanner.close();
	}
}
