package t3_polymorphism;

public class Run {
	public static void main(String[] args) {
		A a = new A();
		
		B b = new B();
		A ba = b;
		if(b == ba) 
			System.out.println("b와 ba는 같은 객체");
		else System.out.println("b와 ba는 다른 객체");
		//ba.
		// b.
		
		B bb = new B();
		if(b == bb)System.out.println("b와 bb는 같은 객체");
		else System.out.println("b와 bb는 다른 객체");
		
		A bba = new B();
		//bba.
		
		C c = new C();	
		A ca = c;
		//ca.
		
		A cca = new C();
		// cca.
	
		D d = new D();
		// d.
		
		B db = new D();
		//db.
		
		E e = new E();
		// e.
		
		C ec = new E();
		// ec.
	 
		A da = new D();
	  // da.	
	 
	  A ea = new E();
	  //ea.
	}
}
