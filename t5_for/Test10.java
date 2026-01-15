package t5_for;

// 2단~5단까지 출력
public class Test10 {
	public static void main(String[] args) {
		
		for(int i=2; i<=5; i++) {
			System.out.println(i +"단");
			for(int j=1; j<=9; j++) {
				System.out.println(i+" * "+j+" = " + (i*j));
		}
		System.out.println();
	}
		
		/*
		for(int i=1; i<=9; i++) {
			System.out.println("3 * "+i+" = " + (3*i));
		}
		System.out.println();
		
		for(int i=1; i<=9; i++) {
			System.out.println("4 * "+i+" = " + (4*i));
		}
		System.out.println();
		
		for(int i=1; i<=9; i++) {
			System.out.println("5 * "+i+" = " + (5*i));
		}
		System.out.println();
	  */
	}
}
