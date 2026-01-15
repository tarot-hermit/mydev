package t2.연산자;

public class Test1 {
	public static void main(String[] args) {
		int atom = 0;
		int su = 100;
		int res;
		
		res = atom + su;
		
		System.out.println("res : " + res);
		
		int su1 = 10, su2 = 3;
		res = su1 / su2; 
		System.out.println("res : " + res);
		
		
		double res2;
		res2 = su1 / su2; 
		System.out.println("res2 : " + res2);
		

		res2 = (double) su1 / su2; 
		System.out.println("res2 : " + res2);
		
		res = su1 / su2;
		System.out.println("res(몱) : " + res);
		
		// 나머지 연산자 : % 
		res = su1 % su2;
		System.out.println("res(나머지) : " + res);
		
	}
}
