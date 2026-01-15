package t9_etc_class.t1.nested1;

public class TestRun {
	public static void main(String[] args) {
		
		System.out.println("이곳은 TsetRun1입니다");
		
		Test1 t1 = new Test1(); 
		t1.modTest1();
		
		Test1.Aa aa1 = t1.new Aa();
		aa1.modAa();
	}
}
