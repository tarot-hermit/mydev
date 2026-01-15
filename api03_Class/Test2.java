package api03_Class;

@SuppressWarnings("rawtypes")
public class Test2 {
	public static void main(String[] args) {
		
		try {
			Class.forName("java.lang.String");
			System.out.println("String 객체가 존재합니다.");
			
			Class clazz = Test1.class;
			System.out.println("전체이름(패키지명+파일명) : " + clazz.getName());
			System.out.println("패키지명 : " + clazz.getPackageName());
			System.out.println("타입명 : " + clazz.getTypeName());
			System.out.println("simple이름 : " + clazz.getSimpleName());
			
			Class clazz2 = Test2.class;
			System.out.println("Test2.class의 경로 : " + clazz2.getResource("Test2.class").getPath());
			System.out.println("Test1.class의 경로 : " + clazz2.getResource("Test1.class").getPath());
			System.out.println("/(루트)의 경로 : " + clazz2.getResource("/").getPath());
			System.out.println("11.jpg의 상대경로 : " + clazz2.getResource("./images/11.jpg").getPath());
			System.out.println("11.jpg의 절대경로 : " + clazz2.getResource("/api03_Class/images/11.jpg").getPath());

			}catch (ClassNotFoundException e) {
			System.out.println("String 객체가 없습니다.");
			}finally {
			System.out.println("\n작업끝....");
			
		}
	}
}
