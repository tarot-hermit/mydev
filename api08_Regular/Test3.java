package api08_Regular;

import java.util.regex.Pattern;

public class Test3 {
	public static void main(String[] args) {
		
	String regex = "^[\\s]*$";

	String str1 = "1234";
	String str2 = "12   3  4";
	String str3 = "12!!";
	String str4 = "1234";
	String str5 = "12  ";
	String str6 = "    ";
	
	
	System.out.println("1: " + Pattern.matches(regex, str1));	
	System.out.println("2: " + Pattern.matches(regex, str1));	
	System.out.println("3: " + Pattern.matches(regex, str1));	
	System.out.println("4: " + Pattern.matches(regex, str1));	
	System.out.println("5: " + Pattern.matches(regex, str1));	
	System.out.println("6: " + Pattern.matches(regex, str1));	
	}
}
