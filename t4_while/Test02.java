package t4_while;

public class Test02 {
	public static void main(String[] args) {
		
		int i = 0;
		
		while(i <= 10) {
			i++;
			System.out.println(i + ".안녕");
			
			if(i == 5) break;
			
		}
		System.out.println("작업끝");
	}
}
