package t9_etc_class.t3.nested3;

public class TestRun {
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		
		System.out.println("Test1클래스 안의 su : " + t1.su);
		t1.modT1();
		System.out.println();
		t1.modClass2();
		System.out.println("작업끝");
		
	}
}
