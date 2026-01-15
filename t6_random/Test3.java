package t6_random;

public class Test3 {
	public static void main(String[] args) {
		double su1 = Math.random(); // 0.0 <= su <1
		double su2 = Math.random(); // 0.0 <= su <1
		System.out.println("su1 : " + su1);
		
		// 형식 기호를 사용할때는  % 소수점 자리는.1,2,3 실수에 넣을때는 %.1,2,3,4이후 f를 넣을것 \n은 줄바꿈
		System.out.printf("su1 : %.2f\n", su1 );
		System.out.printf("su1 : %.3f\n", su1 );
		System.out.printf("su1 : %.4f\n", su1 );
		System.out.printf("su1 : %.4f , su2 : %.2f\n", su1 , su2 );
		System.out.printf("su1 : %.4f , su2 : %.2f , %.3f\n", su1 , su2 , su1+su2);
		System.out.printf("su1 : %10.1f , su2 : %.2f , %.3f\n", su1 , su2 , su1+su2);
	}
}
