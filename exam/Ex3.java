package exam;

public class Ex3 {
	public static void main(String[] args) {
		
		String msg3 = "951025-1234567";
	  
    String[] ms = msg3.split("-");

    
    char genderCode = ms[1].charAt(0);
    String gender = "";

    if (genderCode == '1' || genderCode == '3') {
        gender = "남자";
    } else if (genderCode == '2' || genderCode == '4') {
        gender = "여자";
    }

    System.out.println("생년월일 : " + ms[0]  );
    System.out.println("년도 : " + ms[0].substring(0, 2) + "년도");
    System.out.println("월 : " + ms[0].substring(2, 4) + "월" );
    System.out.println("일 : " + ms[0].substring(4) + "일" );
    System.out.println("성별 : " + gender);
    System.out.println("체크디짓 : " + ms[1].charAt(ms[1].length()-1));
		
	}
}
