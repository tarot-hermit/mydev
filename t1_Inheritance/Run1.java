package t1_Inheritance;

public class Run1 {
	public static void main(String[] args) {
		/*
		B b = new B();
		b.mod1();
		
		b.mod2();
		System.out.println("----------------");
		
		C c = new C();
		System.out.println("item2 : " + c.item2);
		System.out.print("m2: " );
		c.areaRec(10, 20);
		*/
		
		D d = new D();
		System.out.println("m3 : item3 : " +d.item3);
		System.out.println("m4 : item4 : " +d.item4);
		System.out.println("m5 : item5 : " +d.item5);
		
		d.areaRec(3, 4);
		d.areatrai(5, 2);
	}
}
