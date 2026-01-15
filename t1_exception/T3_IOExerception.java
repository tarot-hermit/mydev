package t1_exception;

import java.io.IOException;
import java.io.InputStreamReader;



public class T3_IOExerception {
	public static void main(String[] args) {
		
		
		try {
		  InputStreamReader is = new InputStreamReader(System.in);
			System.out.println("입력하세요...");
		  is.read();
			System.out.println("표준 입력 성공...");
		} catch (IOException e) {
			System.out.println("입출력 오류....");
			e.printStackTrace();
		}
		System.out.println("작업끝...");
	}
}
