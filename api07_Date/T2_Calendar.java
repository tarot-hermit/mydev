package api07_Date;

import java.util.Calendar;

public class T2_Calendar {
	public static void main(String[] args) {
		Calendar cal =	Calendar.getInstance();
		System.out.println("년도 : " + cal.get(Calendar.YEAR));
		System.out.println("월 : " + (cal.get(Calendar.MONTH) + 1));
		System.out.println("일 : " + cal.get(Calendar.DATE));
		System.out.println("시 : " + cal.get(Calendar.HOUR));
		System.out.println("시 : " + cal.get(Calendar.HOUR_OF_DAY));
		System.out.println("시(오전/오후) : " + cal.get(Calendar.AM_PM));
		System.out.println("분 : " + cal.get(Calendar.MINUTE));
		System.out.println("초 : " + cal.get(Calendar.SECOND));
		System.out.println("오늘은 요일? " + cal.get(Calendar.DAY_OF_WEEK));
		
		int amPm = cal.get(Calendar.AM_PM);
		String strAmPm;
		if (amPm == Calendar.AM) strAmPm = "오전";
		else strAmPm = "오후";
		
		int week = cal.get(Calendar.DAY_OF_WEEK);
		String strweek = "";
		switch (week) {
			case 1:	strweek="일"; break;
			case 2:	strweek="월"; break;
			case 3:	strweek="화"; break;
			case 4:	strweek="수"; break;
			case 5:	strweek="목"; break;
			case 6:	strweek="금"; break;
			case 7:	strweek="토"; 
			
		}
		
		
		
		System.out.println("오늘은 "+cal.get(Calendar.YEAR)+"년"+(cal.get(Calendar.MONTH) + 1)+"월"+cal.get(Calendar.DATE)+
				"일 "+strweek+"요일 "+strAmPm+" "+cal.get(Calendar.HOUR)+"시"+cal.get(Calendar.MINUTE)+"분"+cal.get(Calendar.SECOND)+"초");
		System.out.println();
		
		// 날짜 세팅 : set(년,월,일)
		cal = Calendar.getInstance();
		cal.set(2025, 12-1, 1);
		System.out.println("년도 : " + cal.get(Calendar.YEAR));
		System.out.println("월 : " + (cal.get(Calendar.MONTH)+1));
		System.out.println("일 : " + cal.get(Calendar.DATE));
		
	}
}
