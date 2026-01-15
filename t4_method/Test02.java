package t4_method;

public class Test02 {
	int su1;
	int su2;
	double res;
	
	public Test02() {
		System.out.println("이곳은 기본 생성자 입니다.");
	}
	
	Test02(int su1, int su2) {
		this.su1 = su1;
		this.su2 = su2;
	}
	
	void mod1() {
		System.out.println("이곳은 Test02클래스의 mod1메소드 입니다.");
	}
	
	
	int mod2() {
		return su1 + su2;
	}
	int mod2(int su1, int su2) {
		return su1 + su2;
	}
	
}
