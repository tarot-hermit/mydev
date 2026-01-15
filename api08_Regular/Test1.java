package api08_Regular;

import java.util.regex.Pattern;

public class Test1 {
	public static void main(String[] args) {
		String str1 = "1234";
		String str2 = "1A234";
		
		// 정규식을 만든후 입력데이터와 비교.
		String regEx = "^[\\d]*$";
		
		// 1번 방법
		Boolean pattern1 = Pattern.compile(regEx).matcher(str1).find();
		System.out.println("1 : " + pattern1);

		Boolean pattern2 = Pattern.compile(regEx).matcher(str2).find();
		System.out.println("2 : " + pattern2);
		System.out.println();
		
		// 2번 방법
		pattern1 = Pattern.matches(regEx, str1);
		System.out.println("3 : " + pattern1);
		pattern2 = Pattern.matches(regEx, str2);
		System.out.println("4 : " + pattern2);
		System.out.println();
		
		// 프로그램에 적용
		if(!Pattern.matches(regEx, str1)) System.out.println("나이는 숫자로 입력하셔야 합니다.");
		else System.out.println("계속 진행합니다.");
		
		
	}
}
