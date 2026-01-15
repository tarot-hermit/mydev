package t1_exception;

public class T1_ClassNotFound {
	public static void main(String[] args) {
		
		try {
			Class.forName("java.lang.Object");
			System.out.println("Object클래스는 java.lang패키지 안에 있습니다.");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			//System.out.println("현재 공사중입니다.");
			//e.getMessage();
			//System.out.println("\nObject2클래스가 없습니다." + e.getMessage());
		}
		System.out.println("작업 진행중....");
	}
}
