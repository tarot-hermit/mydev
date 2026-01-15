package t1_exception;

public class T4_Arithmetic {
	public static void main(String[] args) {
		//double su1 = 10, su2 = 20;
		int su1 = 10, su2 = 0;
		
		try {
			System.out.println("su1 / su2 = " + (su1 / su2));			
		} catch (ArithmeticException e) {
			//System.out.println("분모가 0 이 될수없습니다." +e.getMessage());
			e.printStackTrace();
		}
		System.out.println("작업끝...");
	}
}
