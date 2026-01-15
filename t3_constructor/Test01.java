package t3_constructor;
// 생성자 오버로딩 하나의 클래스 안에서 여러가지 생성자를 만들수 있는데 개수 타입 순서 가 중요하다.
public class Test01 {
		int su1;
		int su2;
		double su3;

//	Test01() {}
	Test01() {
		su1 = 100;
		su2 = 200;
		System.out.println(su1 + su2);
	}
// class에 부여된 int su1 을 정수형 변수에 넣어 호출할때에는 su1 = su1; 이 아닌 this.su1 =su1; 으로 this. 을 붙여준다. 

	Test01(int su1) {
		this.su1 = su1;		
	}
	
	Test01(int su1, int su2) {
		this.su1 = su1;
		this.su2 = su2;
	}
	
	Test01(int su1, double su2) {
		this.su1 = su1;
		this.su3 = su2;
	}
	
		Test01(double su2, int su1) {
			this.su1 = su1;
			this.su3 = su2;
			
	}
	
}
