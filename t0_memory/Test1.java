package t0_memory;

public class Test1 {
	public static void main(String[] args) {
	//	int atom = 100;
	//  기본 타입은 스택의 값을비교 참조타입은 힙 영역의 주소를 가져와서 비교한다.	
		String name1 = "홍길동";
//		String name2 = "홍길동";
		String name3 = new String("홍길동");
	//	String name4 = "김말숙";
		
		if(name1 == name3) {
			System.out.println("name1 과 name3는 같다");
		}
		else {
			System.out.println("name1 과 name3는 다르다");
		}
		// String 은 힙 영역의 주소 값을 가져오기때문에 같은 글자이더라도 같은 주소값을 가져오려하면 .equals () 를 사용 하여야한다.
		if(name1.equals(name3)) {
			System.out.println("name1 과 name3는 같다");
		}
		else {
			System.out.println("name1 과 name3는 다르다");
		}
	}
}
