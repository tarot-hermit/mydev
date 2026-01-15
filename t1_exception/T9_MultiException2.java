package t1_exception;

public class T9_MultiException2 {
	public static void main(String[] args) {
		
		try {
			//String data0 = args[0];
			int data0 = Integer.parseInt(args[0]);
			int data1 = Integer.parseInt(args[1]);
			int data2 = Integer.parseInt(args[2]);
			
			System.out.println("args[0] = " + data0);			
			System.out.println("args[1] = " + data1);
			System.out.println("args[2] = " + data2 / 0);
		} catch (ArrayIndexOutOfBoundsException e) {
//		} catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
		}catch (NumberFormatException e) {
				System.out.println("첨자 변수의 값 오류");			
			}
			catch (Exception e) {
			System.out.println("오류 체크하세요..." + e.getMessage());		
		}finally {
			System.out.println("작업끝....");
		}
		
		
	}
}
