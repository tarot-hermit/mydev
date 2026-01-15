package t1_Inheritance;

public class A {
	
	private int item1 = 500;
	int item2 = 600;
	int item22;
	
//	public A() {
//	System.out.println("1.이곳은 A 클래스 입니다.");
//	}	

public A(int item22) {
	this.item22 = item22;
	System.out.println("2.이곳은 A 클래스 입니다.");
	areaRec(2, 2);
}	
	
	// 사각형의 면적
	void areaRec(int x, int y) {
		int area = x * y;
		System.out.println("사각형의 면적(가로 :"+x+", 세로 :"+y+") :" + area);
	}
}
