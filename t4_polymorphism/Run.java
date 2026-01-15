package t4_polymorphism;

public class Run {
	public static void main(String[] args) {
		A a = new A();
		//a.
		// B ab = a;
		
		// 아래 경우는 실행 오류발생.
		//	B ab = (B) a;
		//	ab.modB1();
		
		// UP Casting
		A ba = new B();
		//ba.
		
	 B	bab =(B) ba;
	 bab.modB1();
	 
	 // A객체가 D로 다운캐스팅되고자 한다면?
	 A da = new D();
	 D dad = (D)da;
	 dad.modA1();
	 dad.modB1();
	 dad.modD1();
	 System.out.println("==========================");
	 
	 A a1 = new A();
	 if(a1 instanceof E) {
		 E ae = (E) a1;
		 ae.modE1();
	 }
	 else { 
		 System.out.println("강제타입 변환불가.");		 
	 }
  }
}
