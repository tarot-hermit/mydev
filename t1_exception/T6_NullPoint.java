package t1_exception;

public class T6_NullPoint {
	public static void main(String[] args) {
		
		String str1 = "seoul1";
		String str2 = null;
		
		System.out.println("o : " + str1.charAt(2));

		try {
			System.out.println("o : " + str2.charAt(2));
			System.out.println("정상처리");
		} 	catch (NullPointerException e) {
			System.out.println("null값 오류...");
			System.out.println("null값 오류..." + e.getMessage());
			e.printStackTrace();
			} finally {
				System.out.println("작업끝...");				
			}
	} 
	
}
