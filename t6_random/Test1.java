package t6_random;

public class Test1 {
	public static void main(String[] args) {
		// random() : 난수(무작위수)를 발생시키는 메소드 , Math클래스안에 있다.
		
		// double su1 = Math.
		double su1;
		
		for(int i=1; i<=10; i++ ) {
			su1 = Math.random();
			System.out.println("su1 : " +su1);
		}
	}
}