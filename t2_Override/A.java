package t2_Override;

public class A {
	
	int item1 = 100;
	int item2 = 200;
 	public int item5 = 500;
 	//int item6 = 600;
 	protected int item6 = 600;
	
	public A() {
		System.out.println("이곳은 A클래스의 기본생성자 : " + item1);
	}
	
	public A(int item1) {
		this.item1 = item1;
		System.out.println("이곳은 A클래스의 사용자 정의 생성자 : " + item1);
	}
	
	
	
	public A(int item1, int item2) {
		this.item1 = item1;
		this.item2 = item2;
	}

	// 사각형의 면적
	void areaRec(int x, int y) {
		int area = x * y;
		System.out.println("사각형의 면적(가로 :"+x+", 세로 :"+y+") :" + area);
	}
	
	//원넓이
	 void areaCircle(int r) {
		double res = r * r * 3.14;
		System.out.println("원넓이 ("+r+") :" + res);
	}
	
	 void modAA() {
		System.out.println("이곳은 A클래스의 modAA 입니다.");
	}
}
