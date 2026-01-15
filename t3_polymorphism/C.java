package t3_polymorphism;

public class C extends A{
	public  int su = 30;
	
	public C() {
		System.out.println("이곳은 C클래스의 기본생성자 입니다.");
	}
	
	public void modC1() {
		System.out.println("이곳은 C클래스의 modC1메소드 입니다.");
	}
}

