package t4_while;

// 1~100까지의 짝수합과 홀수합을 구하시오
public class Test09 {
	public static void main(String[] args) {
		
		int i =0, odd=0, even=0;
		
		while(i<100) {
			i++;
			odd += i;
			i++;
			even += i;
			
		}
		
		System.out.println("1부터 100까지의 홀수합은"+odd+" 입니다.");
		System.out.println("1부터 100까지의 짝수합은 "+even+"입니다.");
		System.out.println("1부터 100까지의 짝수합은 "+(odd+even)+"입니다.");
	}

}
