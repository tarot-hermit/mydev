package t9_etc_class.t2.nested2;

public class Test1 {
	int su = 300;
	
	public Test1() {
		System.out.println("이곳은 Test1클래스 입니다.");
	}
	public void modT1() {
		System.out.println("이곳은 Test1클래스의 modT1메소드 입니다. : su = " + su);
	}
	public static class Aa {
		int su = 100;
		static int su2 = 400;
		
		public Aa() {
			System.out.println("이곳은 Test1클래스안의 Aa클래스 입니다.");
		}
		
		public void modAaT1() {
			System.out.println("이곳은 Test1클래스안의 Aa클래스의 modAaT1메소드 입니다. : su ="+ su);
		}
		
		public static void modAaT2() {
			System.out.println("이곳은 Test1클래스안의 Aa클래스의 modAaT1메소드 입니다. : su2 ="+ su2);
		}
	}
	
}

class Aa{
	public Aa() {
		System.out.println("이곳은 Aa클래스 입니다.");
	}
}