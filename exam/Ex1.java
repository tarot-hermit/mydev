package exam;

import java.util.Scanner;

// 문장을 입력받은후(nextLine) 찾고자 하는 문자(열)을 입력후 찾은위치값을 출력하시오.
public class Ex1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
			System.out.print("문장을 입력하세요 : ");
			String sentence = sc.nextLine();
		
			System.out.print("찾을 문자(문자열)를 입력하세요 : ");
			String search = sc.nextLine();

			int index = sentence.indexOf(search);

			if (index != -1) {
				System.out.println("찾은 위치 : " + index);
			} else {
				System.out.println("해당 문자(문자열)를 찾을 수 없습니다.");
			}
			sc.close();
		}
	}

