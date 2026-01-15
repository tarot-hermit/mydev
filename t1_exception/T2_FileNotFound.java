package t1_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class T2_FileNotFound {
	public static void main(String[] args) {
		
		try {
			//new FileInputStream("D:\\springgreen\\java\\works\\0112\\src\\t1_exception\\t1_ClassNotFound.java");
			new FileInputStream("D:\\springgreen\\java\\works\\0112\\src\\t1_exception\\t1_ClassNotFound2.java");
			System.out.println("파일이 존재합니다.");
		}
		catch (FileNotFoundException e) {
			System.out.println("파일이없습니다.");			
			e.printStackTrace();
		}
		System.out.println("작업끝....");
	}
}
