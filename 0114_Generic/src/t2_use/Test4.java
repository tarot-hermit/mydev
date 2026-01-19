package t2_use;

class Test4VO<T> {
	private T t;

	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
}

class Test4Service {
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Test4Service [name=" + name + ", age=" + age + "]";
	}
	
	
}

public class Test4 {
	public static void main(String[] args) {
		Test4VO<Test4Service> vo = new Test4VO<>();
		Test4Service service = new Test4Service();
		
		service.setName("홍길동");
		service.setAge(25);
		
		vo.setT(service);
		
		System.out.println("1 : " + vo.getT());
		System.out.println("2 : " + vo.getT().getName());
		System.out.println("3 : " + vo.getT().getAge());
		System.out.println("4 : " + vo.getT().toString());
		
		
	}
}
