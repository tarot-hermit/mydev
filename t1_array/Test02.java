package t1_array;

public class Test02 {
	public static void main(String[] args) {
		// 배열 타입을 이요하려면 객체 new를 생성후 타입명을 동일시 하고 중괄호에 숫자를 입력
		//	int jumsu[] = new int[5];
		// 배열 타입 선언을 하는 두번째 방식.
		//		int[] jumsu = new int[5];
		//		double[] jumsu = new double[5];

		int[] jumsu = new int[5];
		
		jumsu[0] = 100;
		jumsu[1] = 70;
		jumsu[2] = 90;
		jumsu[3] = 80;
		jumsu[4] = 50;
		
		System.out.println(jumsu[0]);
		System.out.println(jumsu[1]);
		System.out.println(jumsu[2]);
		System.out.println(jumsu[3]);
		System.out.println(jumsu[4]);

		// new int[5]까지 만들었다면 
		//System.out.println(jumsu[5]);
		System.out.println();
		// i=0 i<5 i++ = i=0 i<=4 i++ 은 같은 방식 
		for(int i=0; i<5; i++) {
			System.out.println("jumsu["+i+"] = " + jumsu[i] );
			System.out.println();
		}
		
		
			for(int i=1; i<=5; i++) {
				System.out.println("jumsu["+(i-1)+"] = " + jumsu[i-1] );
				
			
		}
	}
}
