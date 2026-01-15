package t1_array;

public class Test05 {
	public static void main(String[] args) {
		int[] su1 = new int[5];
		
		for(int i=0; i<su1.length; i++) {
			System.out.println(su1[i]);
		}
		System.out.println();
		
//		int atom;
//		System.out.println(atom);
		
		double[] su2 = new double[5];
		for(int i=0; i<su2.length; i++) {
			System.out.println(su2[i]);
		}
		System.out.println();
		
		char[] su3 = new char[5];
		for(int i=0; i<su3.length; i++) {
			System.out.println("char : " + su3[i]);
		}
		System.out.println();
		
		boolean[] su4 = new boolean[5];
		for(int i=0; i<su4.length; i++) {
			System.out.println("boolean : " + su4[i]);
		}
	}
}
