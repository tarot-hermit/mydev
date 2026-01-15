package t7_static;

public class Test01_Run {
	public static void main(String[] args) {
		
	Test1 t1 = new Test1();
	
	System.out.println("pi : " + t1.pi);
	
	int r = 10;
	double res = t1.cicleArea(r);
	
	System.out.printf("반지름이 "+r+" 인 원넓이는? %.2f" , res);
	System.out.println("\n======================");
	
	System.out.println("pi : " + Test1.pi);
	
	res = Test1.cicleArea(20);
	System.out.printf("반지름이 "+r+" 인 원넓이는? %.2f" , res);
	}
}
