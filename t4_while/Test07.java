package t4_while;

// 1~100 까지의 짝수합
public class Test07 {
	public static void main(String[] args) {
		
		int i = 0, tot = 0;
		
		while(i <100) {
			//i++;			// i = i + 1
			i += 2;			// i = i + 2
			tot += i; 	// tot = tot + i
		}
		
		System.out.println("1부터 100까지의 짝수합은 " + tot + "입니다");
	}
}
