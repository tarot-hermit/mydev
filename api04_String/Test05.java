package api04_String;

 //getChar()
public class Test05 {
	public static void main(String[] args) {
		
		String str1 = "Hello!";
		
		char[] strArr = new char[str1.length()];
		str1.getChars(0, str1.length(), strArr, 0); // 배열복사
		System.out.println("str1 : " + str1);
		System.out.println("strArr : " + strArr);
		System.out.println();
	
		String temp = "";
		for(char ch : strArr ) {
			temp += ch + "/";
		}
		System.out.println(temp);
		System.out.println(temp.substring(0,11)); //출력부에 바로 출력시킬때 사용법.
		
		temp = temp.substring(0, temp.length()-1); //변수를 다른곳으로 이동시킬때 사용법.
		System.out.println(temp);
	}
}
