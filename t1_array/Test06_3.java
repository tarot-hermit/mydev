package t1_array;

public class Test06_3 {
	public static void main(String[] args) {
		
		int[][] su1 = new int[2][3];
		
		
		for(int i=0; i<2; i++) {
			for(int j=0; j<3; j++) {
				System.out.println(su1[i][j]);
			}
		}
		System.out.println("===============");
		//su1.length 는 행의크기 su1[0].length는 그 행의 열의 크기이다.
		for(int i=0; i<su1.length; i++) {
			for(int j=0; j<su1[i].length; j++) {
				System.out.print(su1[i][j] + "/");
			}
			System.out.println();
		}
		System.out.println("============");
//	int  [][] su2 = new int [3][];		
//			su2 [0][0] = 1;
//			su2 [0][1] = 2;
//			su2 [0][2] = 3;
//			su2 [0][3] = 4;
//			su2 [1][0] = 5;
//			su2 [1][1] = 6;
//			su2 [1][2] = 7;
//			su2 [1][3] = 8;
//			su2 [1][4] = 9;
//			su2 [2][0] = 10;
//			su2 [2][1] = 11;
//			su2 [2][2] = 12; 

		int[][] su2 = {
				{1,2,3,4},
				{5,6,7,8,9},
				{10,11,12}
		};
		
		
			for(int i=0; i<su2.length; i++) {
				for(int j=0; j<su2[i].length; j++) {
					System.out.print(su2[i][j] + "/");
				}
				System.out.println();
			}

	}
	
}
