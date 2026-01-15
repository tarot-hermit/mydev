package t5_polymorphism;

public class Run {
	public static void main(String[] args) {
		A a = new A();
		a.modA1();
		System.out.println();
		
		B db = new D();
		db.modA1();
		db.modB1();
		System.out.println();
		
		D dbd = (D) db;
		dbd.modA1();
		dbd.modB1();
		dbd.modD1();
		System.out.println();
		
		C ec = new E();
		ec.modEC1();
		
	}
}
