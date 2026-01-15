package t1_Inheritance;

public class D extends B{
	int item4 = item3;
	int item5 = item2;
	
	public D() {
		//super();
		super(666);
		System.out.println("이곳은 D 클래스 입니다.");
	
	new B();	
	}
}
