package t1_exception;

class Parent {}

class Child extends Parent {}


public class T8_ClassCast {
	public static void main(String[] args) {
		Child child = new Child();
		Parent pChild = child;
		System.out.println("UpCasting OK!!!");
		
		Child chSub = (Child)pChild;
		System.out.println("DownCasting OK!!!");
		System.out.println();
		
		Parent pChild2 = new Parent();
		try {
			Child chSub2 = (Child) pChild2;
			System.out.println("정상처리");
		} catch (ClassCastException e) {
			System.out.println("캐스팅 오류...." + e.getMessage());
		}finally {
			System.out.println("작업끝....");
		}
//		System.out.println("부모타입으로 변환");
//		
//		System.out.println("자식 타입변환실패");
		
	}
}
