package t1_array;

public class Test03 {
	public static void main(String[] args) {
		
		int[] jumsu = new int[5];
		int tot = 0;
		double avg = 0.0;
		
		
		jumsu[0] = 100;
		jumsu[1] = 70;
		jumsu[2] = 90;
		jumsu[3] = 80;
		jumsu[4] = 50;
	
//		tot = jumsu[0] + jumsu[1] + jumsu[2] + jumsu[3] + jumsu[4];
//		avg = tot / 5.0;
		
			// tot 
			for(int i=0; i<5; i++) {
				tot += jumsu[i]; 
				System.out.println("jumsu["+i+"] = " + jumsu[i] );			
		}
			avg = tot / 5.0;
			System.out.println("================");
			
			
			System.out.println("점수");
			for(int i=0; i<5; i++) {
				System.out.println("jumsu["+i+"] = " + jumsu[i] );			
			}
			System.out.println("총점 : " + tot);
			System.out.printf("평균 : %.2f\n", avg);
	}
}
