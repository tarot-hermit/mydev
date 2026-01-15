package api04_String;

public class Test06 {
	public static void main(String[] args) {
		//						0					1			 2
		// 						012345678012345678
		String msg1 = "Welcome to Korea!!!";
		String msg2 = "한국에 방문하신것을 환영합니다.!!!";
		
		System.out.println("1 : " + msg1);
		System.out.println("2 : " + msg2);
		
		// replace
		System.out.println("3 : " + msg1.replace("Korea", "USA"));
		System.out.println("4 : " + msg2.replace("한국", "미국"));
		
		// 대문자 / 소문자 변환 : toUpperCase() / toLowerCase()
		System.out.println("5 : " + msg1.toUpperCase());
		System.out.println("6 : " + msg1.toLowerCase());
		System.out.println();
		
		// 주소의 위치 파악 indexOf(), 포함(참,거짓구분) : contains()
		System.out.println("7-1 : " + msg1.indexOf("K"));
		System.out.println("7-2 : " + msg1.indexOf("k"));
		System.out.println("8-1 : " + msg1.contains("K"));
		System.out.println("8-2 : " + msg1.contains("k"));
		
		// 특정문자열을 '지정한문자' 로 분리 : split()
		String[] strArray = msg1.split(" ");
		System.out.println("9-1 : " + strArray[0]);
		System.out.println("9-2 : " + strArray[1]);
		System.out.println("9-3 : " + strArray[2]);
		
		for(String str : strArray) {
			System.out.println("10 : " + str);
		}
		System.out.println();
		
		
		String msg3 = "951025-1234567";
  
    String[] ms = msg3.split("-");

    String birth = ms[0];   
    String info  = ms[1];   

   
    String year = birth.substring(0, 2);
    String month = birth.substring(2, 4);
    String day = birth.substring(4, 6);

    
    char genderCode = info.charAt(0);
    String gender = "";

    if (genderCode == '1' || genderCode == '3') {
        gender = "남자";
    } else if (genderCode == '2' || genderCode == '4') {
        gender = "여자";
    }

    System.out.println("생년월일 : " + year + "년 " + month + "월 " + day + "일");
    System.out.println("년도 : " + year);
    System.out.println("월 : " + month);
    System.out.println("일 : " + day);
    System.out.println("성별 : " + gender);
		System.out.println("체크디짓 : " + ms[1].charAt(ms[1].length()-1));
	}
}
