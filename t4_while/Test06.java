package t4_while;

//짝수와 홀수를 출력하되, 3의 배수는 출력하지 마시오.
public class Test06 {
	public static void main(String[] args) {
		
		int i = 0;
		
		while(i < 10) {
			
			i++;
			
			if(i % 3 != 0) {
				if(i % 2 == 0) {
					System.out.println(i + ".안녕(짝수)");
				}
				else {
					System.out.println(i + ".안녕(홀수)");
				 }
				}						
			}
			System.out.println("작업끝");
		}
}
