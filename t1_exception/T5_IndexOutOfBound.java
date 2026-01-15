package t1_exception;

public class T5_IndexOutOfBound {
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5};
		
		for(int i=0; i<=array.length; i++) {
			try {			
				System.out.println(array[i]);		
				System.out.println("정상처리");
			} catch (ArrayIndexOutOfBoundsException e) {			
				System.out.println("오류처리 : 첨자범위 초과 :" + e.getMessage());
			}
		}
		System.out.println("작업끝....");
	}
}
