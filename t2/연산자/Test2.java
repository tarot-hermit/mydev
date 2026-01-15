package t2.연산자;

public class Test2 {
	public static void main(String[] args) {
		int su1 = 100, su2 = 40, res;
		
		// 삼항연산자 
		// (조건식) ? 참 : 거짓;
		
		// 점수가 60점 이상은 '합격', 60점 미만은 '불합격' 처리하시오.
		String temp = (su2 >= 60) ? "합격" : "불합격";
		System.out.println("temp : " + temp);
		
		// su1과 su2를 비교하여 큰 수를 출력하시오.
	  res = (su1 > su2) ? su1 : su2;
		System.out.println("두수중 큰 수는 : " + res);
		
	}
}
