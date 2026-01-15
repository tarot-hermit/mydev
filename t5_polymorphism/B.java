package t5_polymorphism;

public class B extends A{
	public  int su = 20;
	
	public B() {
		System.out.println("이곳은 B클래스의 기본생성자 입니다.");
	}
	
	public void modB1() {
		System.out.println("이곳은 B클래스의 modB1메소드 입니다.");
	}
}

