package api04_String;

import java.util.Objects;

// compare()  객체 비교
public class Test09 {
	public static void main(String[] args) {
		String str = "Seoul";
		str += "/Busan";
		str += "/ChungJu";
		
		System.out.println("1. " + str);
		
		String a = "Seoul";
		String b = "seoul";
		String c = a + b; // Seoulseoul
		String d = "seoul";
		System.out.println("2. " + c);
	
		// compareTo() : 문자열비교 (앞의 문자열이 크면 양수, 같으면 0, 작으면 음수가나온다) 
		//System.out.println("3. " + (a > b)); (X)
		
		System.out.println("3. " + a.compareTo(b));
		System.out.println("4. " + b.compareTo(d));
		System.out.println("5. " + b.compareTo(a));
		
		// 공백비교 : equals(), isBlank() isEmpty()
		
		System.out.println("6. " + c.equals("")); // false
		System.out.println("7. " + c.equals(" ")); // false
		System.out.println("8. " + c.isBlank()); // false
		System.out.println("9. " + c.isEmpty()); // false
		System.out.println();
		
		String e = "";
		String f = null;
		System.out.println("10. " + e.equals("")); // true
		System.out.println("11. " + e.equals(" ")); // false
		System.out.println("12. " + e.isBlank()); // true
		System.out.println("13. " + e.isEmpty()); // true
		System.out.println("14. null? " + Objects.isNull(d)); // false
		System.out.println("15. null? " + Objects.isNull(f)); // true
		System.out.println();
		
		System.out.println("16. " + (e + "1234")); // 1234
		System.out.println("16. " + (f + "1234")); // null1234
		
		// concat() : 문자열 결합연산자
		
		String str1 = "서울";
		String str2 = "부산";
		String gubun = "%";
		String res;
		
		res = str1 + str2;//서울부산
		System.out.println("18. " + res);
		res = str1 + gubun + str2;//서울%부산
		System.out.println("19. " + res);
		
		res = str1.concat(str2);
		System.out.println("20. " + res);//서울부산
		res = str1.concat(gubun).concat(str2);
		System.out.println("21. " + res);// 서울%부산
		System.out.println();
		
		res = gubun.concat(str1).concat(gubun); // %서울%
		System.out.println("22. " + res);
		
		
		
	}

	
}
