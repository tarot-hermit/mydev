package t9_etc_class.t2.nested2;

public class TestRun {
	public static void main(String[] args) {
		System.out.println("이곳은 TestRun 클래스의 main 메소드 입니다.");
		
		Test1 t1 = new Test1();
		t1.modT1();
		
		new Aa();
		System.out.println();
		
		Test1.Aa aat1 = new Test1.Aa();
		aat1.modAaT1();
		System.out.println("Test1클래스안의 Aa클래스안의 su2필드값은?" + Test1.Aa.su2);
		Test1.Aa.modAaT2();
	}
}
