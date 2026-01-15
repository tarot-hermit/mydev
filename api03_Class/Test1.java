package api03_Class;

public class Test1 {
	public static void main(String[] args) {
		
		try {
			Class.forName("java.lang.String");
			System.out.println("String 객체가 존재합니다.");
			return;
		} catch (ClassNotFoundException e) {
			System.out.println("String 객체가 없습니다.");
			}finally {
			System.out.println("작업끝....");
		}
		System.out.println("작업끝2....");
	}
}
