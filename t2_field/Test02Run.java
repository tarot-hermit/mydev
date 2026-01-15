package t2_field;

public class Test02Run {
	public static void main(String[] args) {
		Test02 t21 = new Test02();
		
		System.out.println("1. " + t21.su1);
		System.out.println("2. " + t21.su2);
		System.out.println("3. " + t21.su3);
		System.out.println("4. " +t21.su4);
		System.out.println("5. " +t21.su5);
		System.out.println();
//		int su3; 
//		System.out.println("3. " + su3);
		
		t21.su1 = 50000;
		t21.su2 = 40000;
		t21.su3 = 3.14;
		t21.su4 = true;
		t21.su5 = "서울";
		
		System.out.println("1. " + t21.su1);
		System.out.println("2. " + t21.su2);
		System.out.println("3. " + t21.su3);
		System.out.println("4. " +t21.su4);
		System.out.println("5. " +t21.su5);
		System.out.println();
		
		
	}
}
