package t5_test;

public class CalcRun {
	public static void main(String[] args) {
		 
	//	Calculator calc2 = new Calculator();
		Calculator calc = new Calculator(5, 10);
		
		calc.add();
		calc.sub();
		
		int res = calc.mul();
		System.out.println("res(su1*su2) : " + res);
		
		double res2 =calc.dev();
		System.out.println("res2(su1/su2) : " + res2);
		
	}
}
