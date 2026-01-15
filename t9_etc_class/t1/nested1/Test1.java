package t9_etc_class.t1.nested1;

public class Test1 {
	int su = 100;
	
	public Test1() {
		System.out.println("이곳은 Test1클래스 입니다.");
	}
	public void modTest1() {
		System.out.println("이곳은 Test1클래스의 modTest1메소드 입니다.su =" +su);
	}
	
	public class Aa {
		int suT1 = 200;
		
		public Aa() {
			System.out.println("이곳은 Test1클래스안의 Aa클래스 입니다.");
		}
		
		public void modAa() {
			System.out.println("이곳은 Test1클래스안의 Aa클래스의 modAa메소드 입니다.");
		}
	}
	
}

class Aa {
	public Aa() {
		System.out.println("이곳은 Aa클래스 입니다.");
	}
}