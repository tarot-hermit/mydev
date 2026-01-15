package t9_gettersetter;

public class Test1Run {
	public static void main(String[] args) {
		
		Test1 t1 = new Test1();
		
//		t1.name = "홍길동";
//		t1.age = 25;
//		t1.gender = true;
//		t1.address = "청주";
		t1.setName("홍길동");
//		t1.setAge(25);
		t1.setAge(-5);
		t1.setGender("1"); //"1/3" 남자, "2/4" 여자.
		t1.setAddress("청주");
		
		System.out.println("이름:"+t1.getName()+" , 나이:"+t1.getAge()+" , 성별:"+t1.getGender()+" , 주소:" +t1.getAddress() );
		
	}
}
