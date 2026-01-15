package api04_String;

public class Test03 {
	public static void main(String[] args) {
		// 성별코드가 '1/3'은 남자, '2/4' 는 여자
		String jumin = "123456-1234567";
		char gender = jumin.charAt(7);
		String strGender;
		
		if(gender == '1'|| gender == '3') strGender = "남자";
		else if(gender == '2' || gender == '4' ) strGender = "여자";
		else strGender = "당신은 간첩???";
		
		System.out.println("주민번호 : " + jumin + " , 성별 " + strGender);
	}
}
