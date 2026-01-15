package t1_exception;

public class T7_NumberFormat {
	public static void main(String[] args) {
		String strNum = "100a";
		
		System.out.println("strNum + 200 =" +(strNum +200) );
		//System.out.println("strNum + 200 =" +(Integer.parseInt(strNum) +200) ); // int -> Integer 인트 기본타입을 참조형으로 변경하는 명령어
		
		try {
			int num = Integer.parseInt(strNum);
			System.out.println("num + 200 = " +(num + 200));
			System.out.println("정상처리");
		} catch (NumberFormatException e) {
			System.out.println("숫자를 입력해 주세요... :" + e.getMessage());
		}	finally {
			System.out.println("작업끝....");			
		} 
	}
}
