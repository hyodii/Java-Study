/* ======================================
  ■■■ 자바의 주요(중요) 클래스 ■■■
  - Calendar 클래스
=========================================*/

/*
○ 실습문제
오늘을 기준으로 입력받은 날짜만큼 후의 년, 월, 일, 요일을 확인하여
결과를 출력하는 프로그램을 구현한다.

실행 예)
오늘 날짜 : 2021-8-11 수요일
몇 일 수의 날짜를 확인하고자 하십니까? : 200

========[확인결과]=========
200일 후 : xxxx-xx-xx x요일
===========================
계속하려면....

※ 현재 날짜를 기준으로 날 수를 더하는 연산 메소드
『객체.add(Calendar.DATE, 날수);』

★사용 후 꼭 갱신!!★

*/

import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;



public class Test140
{
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		Calendar cal = Calendar.getInstance();


		
		int y = cal.get(Calendar.YEAR);
		int m = cal.get(Calendar.MONTH)+1;
		int d = cal.get(Calendar.DATE);
		int w = cal.get(Calendar.DAY_OF_WEEK);
		int addDate;     //--더해줄 날수 

		
		String week = " ";

		
		switch (w)
		{
			case Calendar.SUNDAY: week = "일요일"; break;

			case Calendar.MONDAY: week = "월요일"; break;

			case Calendar.TUESDAY: week = "화요일"; break;

			case Calendar.WEDNESDAY: week = "수요일"; break;

			case Calendar.THURSDAY: week = "목요일"; break;

			case Calendar.FRIDAY: week = "금요일"; break;

			case Calendar.SATURDAY: week = "토요일"; break;

		}
		

		//오늘 날짜
		System.out.println(y + "-" + m + "-" + d + " " + week);

		do
		{
			System.out.print("몇 일 수의 날짜를 확인하고자 하십니까? : ");
			addDate = sc.nextInt();

		}
		while (addDate<1);
		
		
		//※ 현재 날짜를 기준으로 날 수를 더하는 연산 메소드
		//『객체.add(Calendar.DATE, 날수);』
		cal.add(Calendar.DATE, addDate);
		
		
		
		//--check~!!! ★사용 후 꼭 갱신★
		y = cal.get(Calendar.YEAR);
		m = cal.get(Calendar.MONTH)+1;
		d = cal.get(Calendar.DATE);
		w = cal.get(Calendar.DAY_OF_WEEK);

		
		
		switch (w)
		{
			case Calendar.SUNDAY: week = "일요일"; break;

			case Calendar.MONDAY: week = "월요일"; break;

			case Calendar.TUESDAY: week = "화요일"; break;

			case Calendar.WEDNESDAY: week = "수요일"; break;

			case Calendar.THURSDAY: week = "목요일"; break;

			case Calendar.FRIDAY: week = "금요일"; break;

			case Calendar.SATURDAY: week = "토요일"; break;

		}
		


		System.out.println("\n===========[확인결과]===========");

		System.out.printf("%d일 후 : %d-%d-%d %s\n", addDate, y, m, d, week);

		System.out.println("================================");

	}
}

/*
2021-8-11 수요일
몇 일 수의 날짜를 확인하고자 하십니까? : 0
몇 일 수의 날짜를 확인하고자 하십니까? : -1
몇 일 수의 날짜를 확인하고자 하십니까? : 200

===========[확인결과]===========
200일 후 : 2022-2-27 일요일
================================
계속하려면 아무 키나 누르십시오 . . .

*/