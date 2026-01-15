package t1;

public class Test8 {
	public static void main(String[] args) {
		int su1;
		double su2;
		
		su1 = 100;
		System.out.println("1.su1 : " + su1);
		su1 = (int) 100.0;
		System.out.println("2.su1 : " + su1);
		
		su2 =  200;
		System.out.println("3.su2 : " + su2);
		su2 = (double) 200;
		System.out.println("4.su2 : " + su2);
		su2 = 200.0;
		System.out.println("5.su2 : " + su2);
		
		su2 = su1;
		System.out.println("6.su2 : " + su2);
		
		su1 = (int) su2;
		System.out.println("7.su1 : " + su1);
		
		
		
	}
}
