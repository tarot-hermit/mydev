package t10_singleton;

public class Singleton {
	// 2.정적 필드를 선언, 초기값으로 객체를 생성시켜준다.
	private static Singleton singleton = new Singleton();
	
	
	//1.객체를 생성시 외부에서 생성하지 못하도록 private 접근제한자를 붙인다.
	private Singleton() {}
	
	
	//3.외부에서 호출하기 위해 getter(정적메소드)를 사용한다.
	public static Singleton getInstance() {
			return singleton;
		}
}
