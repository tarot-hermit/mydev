package t2_Override;

import t1_Inheritance.temp.Test1;

public class Run1 {
	public static void main(String[] args) {
		B b = new B();
		System.out.println("========================");
	
		b.areaRec(5, 10);
		b.areatrai(2, 3);
		b.areaCircle(5);
		System.out.println("========================");
		
		C c = new C();
		c.areaRec(5, 10);
		c.areatrai(10, 5);
		c.areaCircle(10);
		
		System.out.println("1item1 : " + c.item1);
		System.out.println("2.su1 :" + c.su1);
		c.item1 = 400;
		System.out.println("3.item1 : " + c.item1);
		c.modc1();
		System.out.println("4.item1 : " + c.item1);
		
		Test1 t1 = new Test1();
		t1.mod1();
	}
}
