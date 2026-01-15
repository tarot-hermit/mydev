package t2.연산자;

public class Test3 {
	public static void main(String[] args) {
		// 증가/감소 연산자 : ++ , --
		// 전위(전치)연산자 : ++변수, --변수
		// 후위(후치)연산자 : 변수++, 변수--
		
		int a = 0;
		a = a + 1;
		System.out.println("1.a : " + a);		// 1
		
		++a;	// a = a + 1
		System.out.println("2.a : " + a);		// 2
		
		a++;	// a = a + 1
		System.out.println("3.a : " + a);		// 3
		
		a = a - 1;
		System.out.println("4.a : " + a);		// 2
		
		--a; 	// a = a - 1;
		System.out.println("5.a : " + a);		// 1
		
		a--; 	// a = a - 1;
		System.out.println("6.a : " + a);		// a = 0
		
		int b = 0;
		int c;
		
		c = a + b;
		System.out.println("7.c : " + c);	// c = 0
		
		c = ++a + b;
		System.out.println("8.a:" + a + ",b:" + b + ",c:" + c);	// a=1, b=0, c=1
		
		c = ++a + ++b;
		System.out.println("9.a:" + a + ",b:" + b + ",c:" + c);	// a=2, b=1, c=3
		
		c = a++ + b;
		System.out.println("10.a:" + a + ",b:" + b + ",c:" + c);	// a=3, b=1, c=3
		
		c = a++ + ++b + c--;
		System.out.println("11.a:" + a + ",b:" + b + ",c:" + c);	// a=4, b=2, c=8
		
		
	}
}
