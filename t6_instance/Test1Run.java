package t6_instance;

public class Test1Run {
	public static void main(String[] args) {
		
		Test1 t1 = new Test1();
		
		System.out.println("pi : " + t1.pi);
		
		int r = 10;
		double res = t1.cicleArea(r);
		
		System.out.printf("반지름이 "+r+" 인 원넓이는? %.2f" , res);
		
	}
}
