package t4_method;

public class Test01 {
	
	// 메소드
	// 메소드는 리턴타입이 있어야 하거나 리턴타입이 없을경우 void가 붙어있어야한다.
	
	public int mbc() {
		return 0;
	}
	//메소드 오버로딩 () 괄호 안에 타입의 개수 순서 타입 에 따라 다른 주소로 인식된다.
	public void kbs() {
		System.out.println("이곳은 kbs메소드");
	}
	
	void kbs(int su) {
		System.out.println("이곳은 kbs메소드");
	}
	
	void kbs(int su1, int su2) {
		System.out.println("이곳은 kbs메소드");
	}

 	void kbs(int su1, double su2) {
		System.out.println("이곳은 kbs메소드");
	}
 	// 마지막 줄은 int kbs2는 기존 void kbs와 같은 오버로딩으로 연결이 되지 않는다.
 	// 그 이유는 기존 void가 int 와 다르기에 같은 오버로딩으로 인식하지않는다.
  int	kbs2(int su1, double su2) {
 		System.out.println("이곳은 kbs메소드");
 		return 0;
  }
  
  
  void test01() {
  	System.out.println("Test01....");
  }
}
