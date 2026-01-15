package t1_exception;

public class T9_MultiException1 {
	public static void main(String[] args) {
		
		try {
			//String data0 = args[0];
			int data0 = Integer.parseInt(args[0]);
			System.out.println("args[0] = " + data0);			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("첨자 변수의 값 오류");
		}catch (NumberFormatException e) {
			System.out.println("숫자값만 입력하셔야 합니다. 오류...");
		}finally {
			System.out.println("작업끝....");
		}
		
		
	}
}
