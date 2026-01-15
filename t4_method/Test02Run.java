package t4_method;

public class Test02Run {
	public static void main(String[] args) {
		
		Test02 t21 = new Test02();
		
		System.out.println("t21.su1 : " + t21.su1);
		t21.su1 = 100;
		System.out.println("t21.su1 : " + t21.su1);
		
		t21.mod1();
		int su = t21.mod2();
		System.out.println("su : " + su);
		
		int res = t21.mod2(5, 10);
		System.out.println("res : " + res);
		System.out.println();
		
		Test02 t22 = new Test02(200, 300);
		System.out.println("t22.su1 : " + t22.su1);
		t22.su1 = 100;
		System.out.println("t22.su1 : " + t22.su1);
		
		t22.mod1();
		int su2 = t22.mod2();
		System.out.println("t22.su2 : " + su2);
	}
}
