package t7_static;

public class Test3Run {
	public static void main(String[] args) {
		
		String nation;
		String jumin = "1234-456";
		String name = "홍길동";
		
		Test3 t3 = new Test3(jumin);
		
		t3.name = name;
		
		nation = t3.getNation();
		
		System.out.println("1.국적 :"+nation+", 주민번호 :"+t3.jumin+", 성명 :"
		+ t3.name );
		
		//t3.nation = "USA";
		//t3.jumin = "111-222";
		t3.name = "홍철수";
		System.out.println("2.국적 :"+nation+", 주민번호 :"+t3.jumin+", 성명 :"	+ t3.name );
		
		System.out.println("3.국적 :"+t3.getNation()+", 주민번호 :"+t3.getJumin()+", 성명 :"+t3.getName());
	}
}
