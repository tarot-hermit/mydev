package api05_Wrapper;

// Character 클래스의 기본형 데이터 타입 'char' 타입의 참조형(래퍼클래스)
public class Test2_Character {
	public static void main(String[] args) {
		char str = 'A';
		System.out.println("1. " + Character.isUpperCase(str));
		System.out.println("2. " + Character.isLowerCase(str));
		System.out.println("3. " + Character.isAlphabetic(str));
		System.out.println("4. " + Character.isDigit(str));
		System.out.println();
		
		str = '1';
		System.out.println("5. " + Character.isUpperCase(str));
		System.out.println("6. " + Character.isLowerCase(str));
		System.out.println("7. " + Character.isAlphabetic(str));
		System.out.println("8. " + Character.isDigit(str));
		System.out.println();
		
		String string = "Hello, World!(안녕)~~ 1234";
		int cnt = 0;
		for(int i=0; i<string.length(); i++) {
			if(Character.isLetter(string.charAt(i))) cnt++; // 한글,영문의 문자 개수만 확인 (기호,공백,숫자는 미포함)
		}
		System.out.println("2. string 전체 문자 개수 : " + cnt);
		System.out.println("3. string 전체 문자 개수 : " + string.length());
		
	}
}
