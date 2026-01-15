package api04_String;

public class Test01 {
	public static void main(String[] args) {
		String str1 = "안 1 A a + a 녕 a";
		String str2 = "   안   녕    ";
		String str3 = "12345";
		String res;
		
		int intRes;
		
		System.out.println(" str1길이 " + str1.length()); // length()
		System.out.println("1 : " + str1 + str2 + str3);					//  +
		System.out.println("2 : " + str1 + str2.trim() + str3);	// trim()
		System.out.println("3 : " + str1 + str2.replace(" ", "") + str3); //replace
		System.out.println("4 : " + str1 + " " + str3.replace("123", "하나둘셋") + " " + str3);
		
		System.out.println("5-1 : " + str1.indexOf("a")); // indexOf()
		System.out.println("5-2 : " + str1.indexOf("a",str1.indexOf("a")+1)); // indexOf()
		System.out.println("6 : " + str1.indexOf("b")); // indexOf() .. 찾고자하는 문자가 없으면 -1출력
		System.out.println("7 : " + str3.indexOf("345")); // indexOf()
		
		System.out.println("8 : " + str1.lastIndexOf("a")); // lastIndexOf()
	}
}
