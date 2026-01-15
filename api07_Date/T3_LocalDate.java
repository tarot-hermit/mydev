package api07_Date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class T3_LocalDate {
	public static void main(String[] args) {
		// LocalDate
		LocalDate now = LocalDate.now();
		System.out.println("1 : " + now);
		System.out.println("1-2 : " + now.getYear());
		System.out.println("1-3 : " + now.getMonth());
		System.out.println("1-4 : " + now.getMonthValue());
		System.out.println("1-5 : " + now.getDayOfMonth());
		System.out.println("1-6 : " + now.getDayOfWeek());
		
		//날짜셋팅
		now = LocalDate.of(2025, 12, 25);
		System.out.println("2 : " + now);
		
		//시간 : LocalTime
		LocalTime curTime = LocalTime.now();
		System.out.println("3-1 : " + curTime);
		System.out.println("3-2 : " + (curTime+"").substring(0, 8));
		System.out.println("3-3 : " + curTime.getHour());
		System.out.println("3-4 : " + curTime.getMinute());
		System.out.println("3-5 : " + curTime.getSecond());
		System.out.println();

		
		
		// 날짜 + 시간 : LocalDateTime
		LocalDateTime cur = LocalDateTime.now();
		String[] strCur = cur.toString().split("T");
		System.out.println("4-1 : " + cur);
		System.out.println("4-2 : " + strCur[0]);
		System.out.println("4-3 : " + strCur[1].substring(0, 8));
		System.out.println();
		
		// 날짜 연산 
		LocalDateTime res = LocalDateTime.now();
		cur = res.plusYears(1);		
		System.out.println("5-1 : " + cur);
		cur = res.minusYears(1);		
		System.out.println("5-2 : " + cur);

		cur = res.plusMonths(1);		
		System.out.println("6-1 : " + cur);
		cur = res.minusMonths(1);		
		System.out.println("6-2 : " + cur);

		cur = res.plusDays(10);		
		System.out.println("7-1 : " + cur);
		cur = res.minusDays(10);		
		System.out.println("7-2 : " + cur);
		
		//날짜 비교
		LocalDateTime res1 = LocalDateTime.of(2025, 12, 25, 0, 0, 0); //2025년 12월 25일 0시 0분 0초
		LocalDateTime res2 = LocalDateTime.of(2025, 12, 25, 0, 0, 0); //2025년 12월 25일 0시 0분 0초
		LocalDateTime res3 = LocalDateTime.of(2025, 12, 26, 0, 0, 0); //2025년 12월 26일 0시 0분 0초
		
		if(res1.isEqual(res2)) System.out.println("8 : 같은 날짜/시간");
		else System.out.println("8 : 다른 날짜/시간");

		if(res1.isEqual(res3)) System.out.println("9 : 같은 날짜/시간");
		else System.out.println("9 : 다른 날짜/시간");

		if(res1.isBefore(res3)) System.out.println("10 : res1이 res3날짜보다 빠릅니다.");
		else System.out.println("10 : res1이 res3날짜보다 늦습니다");

		if(res1.isAfter(res3)) System.out.println("10 : res1이 res3날짜보다 느립니다.");
		else System.out.println("10 : res1이 res3날짜보다 빠릅니다");
		
		if(res1.compareTo(res2) == 0) System.out.println("12 : 같은 날짜" );
		else System.out.println("12 : 다른 날짜");

		if(res1.compareTo(res3) > 0) System.out.println("13 : 같은 날짜" );
		else System.out.println("13 : 다른 날짜");

		if(res1.compareTo(res3) < 0) System.out.println("14 : 같은 날짜" );
		else System.out.println("14 : 다른 날짜");
		
	}
}
