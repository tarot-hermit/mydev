package t5_for;

// 1~100까지의 짝수합
public class Test05 {
	public static void main(String[] args) {
		
		int tot = 0;
		
		for(int i =1;	i <=100; i+=2)	{
			tot += i; // tot = tot + i
		}
		
		System.out.println("1부터 100까지의 홀수합은"+tot+" ");
		
	}
}
