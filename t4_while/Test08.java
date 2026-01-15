package t4_while;

// 1~100 까지의 홀수합
public class Test08 {
	public static void main(String[] args) {
		
		int i = -1, tot = 0;
		
		while(i < 99) {
			//i++;			// i = i + 1
			i += 2;			// i = i + 2
			tot += i; 	// tot = tot + i
		}
		
		System.out.println("1부터 100까지의 홀수합은 " + tot + "입니다");
	}
}
