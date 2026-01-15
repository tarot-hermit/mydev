package t6_random;

public class Test2 {
	public static void main(String[] args) {
		double su1 = Math.random(); //   0.0 <= su < 1 		
		System.out.println("su1 : " + su1);
		//  (int) Math.random (); duble 변수를 int 로 강제 타입변환
		int su2 =(int) Math.random(); 
		System.out.println("su2 : " + su2);
		// (Math.random()*10) + 1; Math.random 을 괄호안에 넣으면서 먼저 계산하며 0.난수를 *10이후 +1 하며 수를 바꾸게됨
		int su3 =(int) (Math.random()*10) + 1; 
		System.out.println("su3 : " + su3);
		System.out.println();
		
		//45까지의 난수 
		int su4 =(int) (Math.random()*45) + 1; 
		System.out.println("su4 : " + su4);
		System.out.println();
		
		
		for(int i=1; i<=6; i++) {
		int su5 =(int) (Math.random()*45) + 1; 
		System.out.print(su5 + " / ");
		}
	}
}