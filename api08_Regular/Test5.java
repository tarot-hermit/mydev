package api08_Regular;

import java.util.Scanner;
import java.util.regex.Pattern;

// 이메일 체크
public class Test5 {
	public static void main(String[] args) {
		// ab0_-A@naver.com
		String regEx1 = "^[a-zA-z0-9_-]+@[a-zA-z0-9_-]+\\.[a-zA-z]+$";
		String regEx2 = "^[a-zA-z0-9_-]{3,}@[a-zA-z0-9_-]+\\.[a-zA-z]$";
		String regEx3 = "^[a-zA-z0-9_-]{3,15}@[a-zA-z0-9_-]+\\.[a-zA-z]$";
		String regEx4 = "^[a-zA-z0-9_-]{3,15}@[a-zA-z0-9_-]+\\.[a-zA-z0-9]+\\.[a-zA-z]$";
		String regEx5 = "^[a-zA-z0-9_-]{3,15}@[a-zA-z0-9_-]+(\\.[a-zA-z])+$";
		String regEx6 = "\\w+@\\w\\.\\w+";
		String regEx7 = "\\w+@[a-zA-z0-9]+\\.[a-zA-z0-9]+";
		String regEx8 = "\\w{3,}+@[a-zA-z0-9]+{1,8}\\.[a-z]{1,4}";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이메일 주소를 입력하세요?");
		String email = sc.next();
		
		if(!Pattern.matches(regEx1, email)) System.out.println("regEx1 위반");
		else System.out.println("");
		
		sc.close();
	}
}
