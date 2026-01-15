package api04_String;

import java.io.UnsupportedEncodingException;

// getByte()
public class Test04 {
	public static void main(String[] args) {
		// 아스키 코드 : 영문1글자 기준 1Byte, 한글1글자 : 2Byte
		// EUC-KR : 영문1글자 기준 1Byte, 한글1글자 : 2Byte
		// 유니코드(UTF-8) : 영문1글자 기준 1Byte, 한글1글자 : 3Byte
		
		String str1 = "안녕하세요!";
		String str2 = "Hello!";
		
		System.out.println("1:str1의 길이 :" + str1.length());
		System.out.println("2:str2의 길이 :" + str2.length());
		
		byte[] b1 = str1.getBytes();
		System.out.println("3:b1(str1)의 길이 : " + b1.length );
		
		byte[] b2 = str2.getBytes();
		System.out.println("4:b2(str2)의 길이 : " + b2.length );
		
		try {
			//byte[] b3 = str1.getBytes("EUC-KR");
			byte[] b3 = str2.getBytes("EUC-KR");
			System.out.println("5 : b3(str1)의 길이 :" + b3.length);
			System.out.println("5 : " + b3.toString());
			System.out.println("5 : " + b3);
			System.out.println("5-0 : " + b3[0]);
			System.out.println("5-1 : " + b3[1]);
			System.out.println("5-2 : " + b3[2]);
			System.out.print("전송중 : ");
			for(int i =1; i<=5; i++) {
				System.out.print(">");
				Thread.sleep(500);
			}
			System.out.println();
			System.out.println("=".repeat(30));

			// 한글 디코딩
			b3 = str1.getBytes("UTF-8");
			System.out.println("=".repeat(30));
			System.out.println("5 : b3(str1)의 길이 :" + b3.length);
			System.out.println("5 : " + b3.toString());
			System.out.println("5 : " + b3);
			System.out.println("5-0 : " + b3[0]);
			System.out.println("5-1 : " + b3[1]);
			System.out.println("5-2 : " + b3[2]);
			
		} catch (UnsupportedEncodingException | InterruptedException e) {
			e.printStackTrace();
		}
	}
}
