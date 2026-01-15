package api08_Regular;

import java.util.regex.Pattern;

// \\w "영문자 + 숫자 = 영숫자"
public class Test2 {
	public static void main(String[] args) {
		String regEx = "^[\\w]$";
		
		String str1 = "hello";
		String str2 = "hello1234";
		String str3 = "Hello";
		String str4 = "hello!!";
		String str5 = "안녕";
		
		String regEx2 = "^[]+$";
		System.out.println("1 : " + Pattern.matches(regEx, str1));
		System.out.println("1 : " + Pattern.matches(regEx, str2));
		System.out.println("1 : " + Pattern.matches(regEx, str3));
		System.out.println("1 : " + Pattern.matches(regEx, str4));
		System.out.println("1 : " + Pattern.matches(regEx, str5));
		System.out.println();
		
	//	if(Pattern.matches(regEx, str1)) System.out.println(" 입력자료는 영숫자형식입니다 " );
	//	else System.out.println("입력자료는 영숫자 형식이 아닙니다.");
		
		
	}
}
