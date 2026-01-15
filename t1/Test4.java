package t1;

public class Test4 {
	public static void main(String[] args) {
		int su1 = 100;
		int res;
		
		res = su1 + 200;
		System.out.println("res : " + res);
		
		int su2 = 0;
		
		res = su2 + 200;
		System.out.println("res : " + res);
		
		{
			int su3 = 0;
			res = su3 + 300;
			System.out.println("res : " + res);
		}
		
//		System.out.println("su3 : " + su3);
		
		System.out.println();
	
		
		System.out.println("su");
		
	}
}
