package t1_basic;

public class Test02 {
	public static void main(String[] args) {
		Test01 t1 = new Test01();
		Test01 t2 = new Test01();
		
		System.out.println("t1: " + t1);
		System.out.println("t2: " + t2);
	
		if(t1 == t2 ) {
			System.out.println("1.t1객체와 t2객체는 같은 객체입니다.");
		}
		else {
			System.out.println("1.t1객체와 t2객체는 다른 객체입니다.");
		}
		
		Test01 t3; 
		t3 = t1;
		
		if(t1 == t3 ) {
			System.out.println("2.t1객체와 t3객체는 같은 객체입니다.");
		}
		else {
			System.out.println("2.t1객체와 t3객체는 다른 객체입니다.");
		}
		System.out.println("3. t3 : " + t3);
		
	//	 t3 = null;
			if(t1 == t3 ) {
				System.out.println("4.t1객체와 t3객체는 같은 객체입니다.");
			}
			else {
				System.out.println("4.t1객체와 t3객체는 다른 객체입니다.");
			}
			System.out.println("5. t3 : " + t3);
	}
}
