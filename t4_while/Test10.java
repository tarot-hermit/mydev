package t4_while;

//1~100까지의 짝수합과 홀수합을 구하시오(스위칭기법을 이용하여 만드시오)

public class Test10 {
	public static void main(String[] args) {
		int i=0, odd=0, even=0, sw =0;
		
		while(i<100) {
			
			i++;
			if(sw == 0) {
				odd +=i;
				sw = 1;
			}
			else {
				even += i;
				sw =0;
			}
		}
		System.out.println("1부터 100까지의"+odd+" 홀수합과"+even+" 짝수합");

		
		
	}
}
