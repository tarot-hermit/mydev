package t3_if;

// 다중 조건문 처리시에 사용 : switch ~ case
// 직급코드에 따른 직급명을 출력하세요.
// 1.부장 , 2.과장 , 3.대리 , 4.사원
public class Test6_1 {
	public static void main(String[] args) {
		int code = 3;
		String jikkub;
		
		if(code == 1) jikkub = "부장";
		else if(code == 2) jikkub = "과장";
		else if(code == 3) jikkub = "대리";
		else jikkub = "사원";
		
		System.out.println("직급코드 "+code+" 는 "+jikkub+" 입니다.");
	}
}
