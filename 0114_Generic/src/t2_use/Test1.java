package t2_use;

class Myclass1<T> {
	private T t;

	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
}


public class Test1 {
	public static void main(String[] args) {
		//Myclass1<String> mc1 = new Myclass1<String>();
		Myclass1<String> mc1 = new Myclass1<>();
		mc1.setT("안녕하세요");
		System.out.println(mc1.getT());
		System.out.println();
		
		Myclass1<Integer> mc2 = new Myclass1<>();
		mc2.setT(100);
		System.out.println(mc2.getT());
		
		
		// 강한 타입체크 제네릭을 사용했을때는 런타임 에러에서 발생하던 문제를 찾을수없던걸 강한타입체크로 찾을수 있게된다
		//		Myclass1<Integer> mc3 = new Myclass1<>();
		//		mc3.setT("문자"); 
	}
}
