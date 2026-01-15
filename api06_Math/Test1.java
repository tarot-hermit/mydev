package api06_Math;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;

public class Test1 {
	public static void main(String[] args) {
		
	int su1 = 100;
	int su2 = -100;
	
	// 절대값 : abs()
	System.out.println("1-1. " + su1);
	System.out.println("1-2. " + su2);
	System.out.println("1-3. " + Math.abs(su1));
	System.out.println("1-4. " + Math.abs(su2));
	System.out.println();
	
	// 반올림 : round()
	double d1 = 1234.5678;	
	double d2 = -1234.5678;
	
		System.out.println("2-1. " + d1);
		System.out.println("2-2. " + d2);
		System.out.println("2-3. " + Math.round(d1));
		System.out.println("2-4. " + Math.round(d2));
		System.out.println();
		
		//소수 첫째자리에서의 반올림(1235) : 1234.5678 + 0.5 = (int)1235.0678 = 1235 
		//소수 둘째자리에서의 반올림(1234.6) : 1234.5678 + 0.5 = (int)1234.6178 *10 = (int)12346.178 / 10 = 1234.6  
		
		System.out.println("3-1 : 소수첫째반올림 " +Math.round(d1 * 10) / 10.0);
		System.out.println("3-2 : 소수둘째반올림 " +Math.round(d1 * 100) / 100.0);
		System.out.println("3-3 : 소수셋째반올림 " +Math.round(d1 * 1000) / 1000.0);
		System.out.println();
		
		
		//출력용 포맷(String.format
		System.out.println("4 : " + String.format("%.0f", d1));
		System.out.println("4 : " + String.format("%.1f", d1));
		System.out.println("4 : " + String.format("%.2f", d1));
		System.out.println("4 : " + String.format("%.3f", d1));
		
		// 소수부 무조건 올림 : ceil(), 무조건 내림 : floor()
		
		double d3 = 123.45;
		System.out.println("7-1 : " + Math.ceil(d3));
		System.out.println("7-2 : " + Math.floor(d3));
		System.out.println("7-3 : " + ((int)d3));
		System.out.println();
		
		//최대값 : max(), 최소값 : min()
		int su3 = 100, su4 = -100;
		System.out.println("8-1 : " + Math.max(su3, su4) );
		System.out.println("8-2 : " + Math.min(su3, su4) );
		//System.out.println("8-2 : " + Math.count(su3)); (X)
		
		
		// 난수 : Math.random() : 0이상 1미만의 실수형 난수 :(int)(Math.random()*6)+1 (끝+1-시작))+시작
		
		// Random클래스 
		Random random = new Random();
		System.out.println("9-1 : " + random.nextInt()); // 2의 32승
		System.out.println("9-2 : " + random.nextInt(10)); // 10미만의 양의 정수 : 0~9
		System.out.println("9-3 : " + (random.nextInt(10) + 1)); // 10미만의 양의 정수 : 0~10
		System.out.println("9-4 : " + (random.nextInt(10+1 -5) + 5)); // 10미만의 양의 정수 : 5~10
		
		// DecimalFormat클래스 : 데이터 출력용 포맷을 지정한다.
		DecimalFormat df = new DecimalFormat();
		double d4 = 12345.1260;
		System.out.println("1 : " + df.format(d4));
		
		df = new DecimalFormat("0"); 
		System.out.println("2 : " + df.format(d4));

		df = new DecimalFormat("0,000"); 
		System.out.println("3 : " + df.format(d4));
		
		df = new DecimalFormat("0,000.00"); 
		System.out.println("4 : " + df.format(d4));
		
		df = new DecimalFormat("0,000,000,000.0000"); 
		System.out.println("5 : " + df.format(d4));
		
		double d5 = 12.3;
		df = new DecimalFormat("0,000.00"); 
		System.out.println("6 : " + df.format(d5));

		df = new DecimalFormat("#,##0.0##"); 
		System.out.println("7 : " + df.format(d5));

		df = new DecimalFormat("@@@@@@@@@@@@.#"); 
		System.out.println("8 : " + df.format(d4));
		
		// US 달러 표시
		NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
		nf.setMinimumFractionDigits(3);
		System.out.println("9-1 : " + su3);
		System.out.println("9-2 : " + nf.format(su3));
		
		
	}
}
