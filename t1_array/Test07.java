package t1_array;

public class Test07 {
	public static void main(String[] args) {
		int[] atom = {1,2,3,4,5,6,7,8,9,10};
		
		for(int i=0; i<atom.length; i++) {
			System.out.print(atom[i] + "/");
		}
		System.out.println();
		System.out.println("==============");
		
		// 향상된 for문
		for(int aa: atom) {
			System.out.print(aa+ "/");
		}
	}
	
}
