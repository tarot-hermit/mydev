package api07_Date;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class T1_Date {
	public static void main(String[] args) {
		// Date 객체
		
		Date date = new Date();
		System.out.println("1. " + date);
		// 날짜형식을 지정해주는 객체 : SimpleDateFormat();
		SimpleDateFormat sdf = new SimpleDateFormat();
		String strdate = sdf.format(date);
		System.out.println("2. " + strdate);
		
		sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		strdate = sdf.format(date);
		System.out.println("3. " + strdate);
		
		sdf = new SimpleDateFormat("yy-M-d HH:mm:ss");
		strdate = sdf.format(date);
		System.out.println("4-1 :" + sdf.format(date));
		System.out.println("4-2 :" + strdate);
		
		sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		strdate = sdf.format(date);
		System.out.println("5. " + strdate);
		
		sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초 ");
		strdate = sdf.format(date);
		System.out.println("6. " + strdate);
		System.out.println();
		
		sdf = new SimpleDateFormat("오늘은 E요일");
		strdate = sdf.format(date);
		System.out.println("7. " + strdate);
		
		sdf = new SimpleDateFormat("오늘은 올해의 D번째날");
		strdate = sdf.format(date);
		System.out.println("8. " + strdate);
		
	//	Date date2 = new Date(2025-12-25);
	//	sdf = new SimpleDateFormat("yyyy-MM-dd ");
	//	strdate = sdf.format(date2);
	//	System.out.println("7. " + strdate);
		
		sdf = new SimpleDateFormat("오늘은 올해의 d번째날");
		strdate = sdf.format(date);
		System.out.println("8. " + strdate);
		
		sdf = new SimpleDateFormat("E, d MMM yyyy HH:mm:ss", Locale.ENGLISH);
		strdate = sdf.format(date);
		System.out.println("9. " + strdate);
		
	}
}
