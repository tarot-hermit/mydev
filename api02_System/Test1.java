package api02_System;

public class Test1 {
	public static void main(String[] args) {
		
		int tot = 0;
		//tot의 값이 1000이하일때까지만 출력하시오.
		for(int i=1; i<=100; i++) {
			tot += i;
			if(tot > 1000)	{
				//break;
				//return;
				System.exit(0);
				}
			System.out.println("1부터 "+i+"까지의 합은 "+tot+" 입니다.");
		}
		System.out.println("작업끝........");
		
	}
}
