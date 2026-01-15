package exam;

import java.util.Scanner;
import java.util.regex.Pattern;

// 전화번호 체크
// 아이디 체크 : 3자 이상의 영문자 숫자 _만 가능 처리
// 성명 체크 : 2자 이상의 영문자와 한글만 가능

public class Ex4 {
	public static void main(String[] args) {
		String num = "^\\d{3}-\\d{3,4}-\\d{4}$";
		String id = "^[a-zA-Z0-9_]{3,}$";
		String sung = "^\\w+{2,}$";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("전화 번호 및 아이디 성명 체크");
		
		System.out.println("전화번호를 입력 하세요");
		String str = sc.next();
		if(Pattern.matches(num, str)) {
			System.out.println("전화번호가 맞습니다");
		}
		else  {
			System.out.println("전화번호가 맞지 않습니다.");
		}
		
		System.out.println("아이디를 입력해 주세요");
		str = sc.next();
		if(Pattern.matches(id, str)) {
			System.out.println("아이디 가 맞습니다. ");
		}
		else {
			System.out.println("아이디가 틀립니다.");
		}
		
		System.out.println("성명 입력 해주세요.");
		str = sc.next();
		if(Pattern.matches(sung, str)) {
			System.out.println("성명이 일치합니다.");
		}
		else {
			System.out.println("성명을 잘못입력하였습니다.");
		}
		System.out.println("작업 끝.");
		sc.close();
	}
}
