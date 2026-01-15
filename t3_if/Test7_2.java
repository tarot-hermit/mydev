package t3_if;

public class Test7_2 {
	public static void main(String[] args) {
		String name1 = "홍길동";
		String name2 = "홍길동";
		String name3 = new String("홍길동");
		
		if(name1 == name2) {
			System.out.println("name1과 name2는 같습니다");
		}
		else {
			System.out.println("name1과 name2는 다릅니다");
		}
		if(name1 == name3) {
			System.out.println("name1과 name3는 같습니다");
		}
		else {
			System.out.println("name2과 name3는 다릅니다");
		}
		//.equals 는 문자열을 사용할때 주소의 값을 계산할때 사용한다 
		if(name1.equals(name3)) {
			System.out.println("2.name1과 name3는 같습니다");
		}
		else {
			System.out.println("2.name1과 name3는 다릅니다");
			
		}
	}
}