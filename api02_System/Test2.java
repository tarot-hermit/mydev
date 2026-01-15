package api02_System;

public class Test2 {
	public static void main(String[] args) {
		int tot = 0;
		long startTime = 0, endTime = 0;
		
		startTime = System.nanoTime();
		for(int i=1; i<=1000000000; i++) {
			tot += i;
			
		}
		endTime = System.nanoTime();
		System.out.println("1~100까지의 합?(for)" + tot);
		System.out.println("for문 수행 시간 : " +(endTime - startTime));
		System.out.println();
		
		int i = 0;
		tot = 0;
		startTime = 0;
		endTime = 0;
		
		startTime = System.nanoTime();
		while(i < 1000000000) {
			i++;
			tot += i;
		}
		endTime = System.nanoTime();
		System.out.println("1~100까지의합?(while)" + tot);
		System.out.println("while문 수행 시간 : " +(endTime - startTime));
	}
}
