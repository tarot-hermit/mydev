package t3_constructor;

public class Test01Run {
	public static void main(String[] args) {
		
		
		Test01 t1 = new Test01();
		System.out.println("1. su1 :" + t1.su1);
		
		Test01 t11 = new Test01(100);
		System.out.println("2. su1 :" + t11.su1);
		
		Test01 t12 = new Test01(10,20);
		System.out.println("3. su1 :" + t12.su1);
	
		
		Test01 t13 = new Test01(10,20.0);
		System.out.println("3. su1 :" + t13.su3);

		Test01 t14 = new Test01(10.0,20);
		System.out.println("3. su1 :" + t14.su3);
	
	}
}
