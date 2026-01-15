package t2_Override;

public class C extends A{
	
	int su1 = item1;
	//		item1 = 600;
	
	public C() {
		System.out.println("이곳은 C클래스의 기본생성자 : " + su1);
	}
	//삼각형의 면적.
	void areatrai(int x, int h) {
		double res = x * h * 0.5;
		System.out.println("삼각형("+x+","+h+")면적 : "+ res);
	}
	
	
 //원넓이
	@Override
	void areaCircle(int r) {
		double res = r * r * Math.PI;
		System.out.println("원넓이 ("+r+") :" + res);
	}
	
	void modc1() {
		item1 = 500;
	}
	
	void modc2(int su1) {
		super.areaCircle(su1);
		
	}
	// final로 선언된 메소드는 재정의 할수없다.
	//	void modAA() {
	//		modAA();
	//	}
	
	
	
	
}
