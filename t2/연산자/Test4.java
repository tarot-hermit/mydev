package t2.연산자;

public class Test4 {
	public static void main(String[] args) {
		int su1=0, su2=0, res;
		
		su1 = su1 + 1;   // su1++, ++su1
		System.out.println("su1 : " + su1);
		
		su2 += 1; // su2 = su2 + 1, su2++, ++su2
		System.out.println("su2 : " + su2);
		
		su2 -= 2; // su2 = su2 - 2;
		System.out.println("su2 : " + su2);
		
		
		//res += 1; // res = res + 1
		su1 *= 10; //su1 = su1 * 10;
		System.out.println("su1 : " + su1);
		
		res = su1 / 10;
		System.out.println("res : " + res);
		System.out.println();
		
		System.out.println(su1 + su2);
	
		System.out.println("su1 + su2 = " + su1 + su2);
		System.out.println("su1 + su2 = " + (su1 + su2));
		System.out.println(su1 + su2 + " = su1 + su2 = ");
		
		int seoul_total = 0; //snake 표기법
		
		int seoulTotal = 0; //camel 표기법
		
		
		
		
	}
}
