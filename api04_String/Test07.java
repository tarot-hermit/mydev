package api04_String;

// format()
public class Test07 {
	public static void main(String[] args) {
		int su = 1234567;
		String str;
		
		str = "변수 su 의 값은 "+su+" 입니다.";
		System.out.println("1.str : " + str);
		
		//정수 : %d
		str = String.format("2.변수 su의 값은 %d 입니다.", su);
		System.out.println("2.str" + str);
		System.out.println(String.format("3.변수 su의 값은 %,d 입니다.", su)); //%d 를 %,d로 바꾸면 출력시 1,234,567 로 천단위 마다 쉼표입력
		
		su = 100;
		System.out.println(String.format("4.변수 su의 값은 8진수 %o 입니다.", su)); //%o 는 8진수 계산법
		System.out.println(String.format("5.변수 su의 값은 16진수 %x 입니다.", su));//%x 는 16진수 계산법
		System.out.println(String.format("6.변수 su의 값은 %10d 입니다.", su)); // %10d 는 앞에 10자리 확보후 출력
		System.out.println(String.format("7.변수 su의 값은 %-10d 입니다.", su));// %-10d 는 뒤에 10자리 확보후 출력
		System.out.println(String.format("8.변수 su의 값은 %010d 입니다.", su));// %010d 는 빈자리에 0을 출력
		
		// 실수 : %f
		
		double pi = Math.PI;
		String str2 = String.format("9.원주율은 %f 얼마입니다.", pi); 
		System.out.println("11. " + str2); 
		System.out.println(String.format("10.원주율은 %.3f 얼마입니다.", pi)); // %.3f 는 소수점 3자리만 출력으로 변경
		System.out.println(String.format("11.원주율은 %10.3f 얼마입니다.", pi)); 
		System.out.println(String.format("11.원주율은 %010.3f 얼마입니다.", pi));
		System.out.println();
		
		//1개문자값 (%c)
		char grdae = 'A';
		str2 = String.format("13.당신의 학점은 %c 학점 입니다.", grdae);
		System.out.println(str2);
		
		
		// 문자열(%s)
		String info = "서울";
		str2 = String.format("14-1. 당신의 거주지는 %s 입니다.", info);
		System.out.println(str2);
		str2 = String.format("14-2. 당신의 거주지는 %10s 입니다.", info);
		str2 = String.format("14-3. 당신의 거주지는 %-10s 입니다.", info);
		
		// boolean : 참(true) / 거짓(false) : %b
		boolean bb = 100 >200;
		str2 = String.format("100>200 의 결과는 ? %b ", bb);
		System.out.println(str2);
	}
}
