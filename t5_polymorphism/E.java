package t5_polymorphism;

public class E extends C{
public  int su = 50;
	
	public E() {
		System.out.println("이곳은 E클래스의 기본생성자 입니다.");
	}
	
	public void modE1() {
		System.out.println("이곳은 E클래스의 modE1메소드 입니다.");
	}
	
	@Override
	public void modEC1() {
		System.out.println("이곳은 E클래스의 modEC1메소드 입니다.");
	}
}



