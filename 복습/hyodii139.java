/*=======================================
  ■■■ 자바의 주요(중요) 클래스 ■■■
  - Calendar 클래스
=======================================*/

// ○ 실습 문제
//    사용자로부터 연, 월을 입력받아
//    달력을 그려주는(출력하는) 프로그램을 구현한다.
//    단, 만년달력이 아니라 Calendar 클래스를 활용하여 작성할 수 있도록 한다.

// 실행 예)
// 연도 입력 : 0
// 연도 입력 : 2021
// 월 입력   : -2
// 월 입력   : 16
// 월 입력   : 8
/*
	[ 2021년 8월 ] 
  
  일  월  화  수  목  금  토
============================
   1   2   3   4   5   6   7
   8   9  10  11  12  13  14
  15  16  17  18  19  20  21
  22  23  24  25  26  27  28
  29  30  31
============================
계속하려면 아무 키나 누르세요...
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Calendar;

public class hyodii139
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int y, m, w;

		// 달력 인스턴스 생성
		Calendar cal = Calendar.getInstance();

		do
		{
			System.out.print("연도 입력 : ");
			y = Integer.parseInt(br.readLine());
		}
		while (y<1);

		do
		{
			System.out.print("월 입력   : ");
			m = Integer.parseInt(br.readLine());
		}
		while (m<1 || m>12);

		// 달력 셋팅
		cal.set(y,m-1,1);

		//요일 받아오기
		w = cal.get(Calendar.DAY_OF_WEEK);

		//테스트
		//System.out.println(w);
		//--==>> 1 -> 2021년 8월 기준 -> 일요일 -> 2021년 8월 1일은 일요일~!!!

		System.out.println();
		System.out.println("\t[ " + y + "년 " + m + "월 ]"); 
		System.out.println("  일  월  화  수  목  금  토");
		System.out.println(" ============================");
		
		for (int i=1; i<w; i++)  //--check~!!  여기선 1!!! 왜냐면 일요일이 1이니까!!
			System.out.print("    ");

		//.getActualMaximum(Calendar.DATE)
		//System.out.println(cal.getActualMaximum(Calendar.DATE));

		for (int i=1; i<cal.getActualMaximum(Calendar.DATE); i++) //--check~!!  여기선 1!!! 왜냐면 일요일이 1이니까!!
		{		
			System.out.printf("%4d",i);
			w++;

			if(w%7==1)  //--check~!!  여기선 1!!! 왜냐면 일요일이 1이니까!!
				System.out.println();
		}

		if(w%7!=1)
			System.out.println();



		System.out.println(" ============================");

	}
}
/*
연도 입력 : 0
연도 입력 : 2021
월 입력   : 0
월 입력   : 13
월 입력   : -2
월 입력   : 8

        [ 2021년 8월 ]
  일  월  화  수  목  금  토
 ============================
   1   2   3   4   5   6   7
   8   9  10  11  12  13  14
  15  16  17  18  19  20  21
  22  23  24  25  26  27  28
  29  30
 ============================
계속하려면 아무 키나 누르십시오 . . .
*/
