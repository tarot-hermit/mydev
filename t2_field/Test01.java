package t2_field;

public class Test01 {
	public static void main(String[] args) {
		
	Test2 t21 = new Test2();
	Test2 t22 = new Test2();
	Test2 t23;
	t23 = t21;
	
	
		System.out.println("1. " + t21);
		System.out.println("2. " + t21.su);
		System.out.println("3. " + t23.su);
		System.out.println("4. " + t22.su);
		
		t21.su = 300;
		System.out.println("5. " + t21.su);
		System.out.println("6. " + t22.su);
		
	}
}


class Test2 {
	int su = 100;
	
}