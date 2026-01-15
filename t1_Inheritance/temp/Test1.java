package t1_Inheritance.temp;

import t2_Override.A;

public class Test1 extends A {
	
	public void mod1() {
		A a = new A();
		System.out.println("11:a.item5 : " + a.item5);
		a.item5 = 20000;
		System.out.println("12.item5 : " + a.item5);
		item6 = 30000;
		System.out.println("13:.item6 : " + item6);
	}
	
}
