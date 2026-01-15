package t1;

public class Test3 {
	public static void main(String[] args) {
		int atom = 100;
		System.out.println("1.atom : " + atom);
		atom = 200;
		System.out.println("2.atom : " + atom);
		//		atom = "seoul" // atom은 정수형 변수이기에 문자 저장 불가
		
//		int su1 = 100;
//		int su2 = 200;
//		int result;
//		
		int su1=100, su2=200, res;
		System.out.println("su1 : " + su1 );
		System.out.println("su2 : " + su2 );
		System.out.println("result : " + (su1 + su2));
		res = su1 + su2; 
		System.out.println("result: " + res);
	}
}
