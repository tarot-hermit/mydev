package t4_while;

public class Test04 {
	public static void main(String[] args) {
		
		int i = 0;
		
		while(i < 100) {
			i++;
			if(i % 2 != 0) {
				System.out.println(i + ".");
			}
			
			
		}
		System.out.println("작업끝");
	}
}
