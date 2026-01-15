package t4_while;

public class Test03 {
	public static void main(String[] args) {
		
		int i = 0;
		
		while(i < 10) {
			
			i++;
			if(i % 2 == 0) {
				System.out.println(i + ".안녕(짝수)");
			}
			else {
				System.out.println(i + ".안녕(홀수)");
				
			}
			
			
		}
		System.out.println("작업끝");
	}
}
