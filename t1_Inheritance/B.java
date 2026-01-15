package t1_Inheritance;

public class B extends A {
	int item3 = 5000;
	
	public B() {
		super(999);
		areaRec(2, 3);
		System.out.println("이곳은 B 클래스 입니다.");
	}
	
	public B(int item22) {
		super(999);
		this.item22 = item22;
	}
	
	void mod1() {
		A a = new A(888);
		System.out.println("1.:a.item2 : " + a.item2);
		a.item2 = 1000;
		System.out.println("2.:a.item2 : " + a.item2);
		
	}
	void mod2() {
		System.out.println("3: item2 :" + item2);
		areaRec(5, 10);
	}
	//삼각형의 면적.
	void areatrai(int x, int h) {
		double res = x * h * 0.5;
		System.out.println("삼각형("+x+","+h+"면적 : "+ res);
	}
}
