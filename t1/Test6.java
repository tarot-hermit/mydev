package t1;

public class Test6 {
	public static void main(String[] args) {
		char ch1 = 'a';
		String str1 = "abc";
		
		System.out.println("ch1 : " + ch1);
		System.out.println("str1 : " + str1);
		System.out.println();
		
		char ch2 = 'a' + 1;
		System.out.println("ch2 : " + ch2);
		
		String str2 = str1 + 1;
		System.out.println("str2 : " + str2);
		System.out.println();
		
		System.out.println(str1 +"\t" + str2);
		System.out.println(str1 +"\n" + str2);
		System.out.println(str1 +"\\" + str2);
		System.out.println(str1 +"'" + str2);
		System.out.println(str1 +"\"" + str2);
		
	}
}
