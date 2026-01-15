package t7_static;

public class Test4Run {
	public static void main(String[] args) {
		
		String nation;
		String jumin = "1234-456";
		String name = "홍길동";
		
		Test4 t4 = new Test4(jumin);
		
		t4.name = name;
		
		nation = t4.getNation();
		
		System.out.println("1.국적 :"+nation+", 주민번호 :"+t4.jumin+", 성명 :"
		+ t4.name );
		
		//t4.nation = "USA";
		//t4.jumin = "111-222";
		//nation = Test4.NATION; (o)
		t4.name = "홍철수";
		System.out.println("2.국적 :"+t4.NATION+", 주민번호 :"+t4.jumin+", 성명 :"	+ t4.name );
		
		System.out.println("3.국적 :"+t4.getNation()+", 주민번호 :"+t4.getJumin()+", 성명 :"+t4.getName());
	}
}
