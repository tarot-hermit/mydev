package t5_for;

// 3.for문을 이용해서 1부터 100까지의 정수 중에서 3의 배수의 총합을 구하는 코드를 작성해보세요.
public class Test04 {
	public static void main(String[] args) {
		
		int tot = 0;
		
		for(int i =0;	i <=100; i+=3)	{			
			tot += i; 
		}
		
		System.out.println("1부터 100까지의 3의배수합은"+tot+" ");
		
	}
}
