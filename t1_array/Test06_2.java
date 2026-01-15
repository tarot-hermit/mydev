package t1_array;

public class Test06_2 {
	public static void main(String[] args) {
		
		int[][] su1 = new int[2][3];
		
		su1[0][0] = 100;
		su1[0][1] = 90;
		su1[0][2] = 80;
		su1[1][0] = 70;
		su1[1][1] = 60;
		su1[1][2] = 50;
		
		
//	System.out.println(su1[0][0]);
//	System.out.println(su1[0][1]);
//	System.out.println(su1[0][2]);
//	System.out.println(su1[1][0]);
//	System.out.println(su1[1][1]);
//	System.out.println(su1[1][2]);
		
		for(int i=0; i<2; i++) {
			for(int j=0; j<3; j++) {
				System.out.println(su1[i][j]);
			}
		}
	}
}
