/*
실행 예)
『연도』를 입력하세요 : 2021
『월』을 입력하세요 : 8

        [ 2020년 8월 ]

  일  월  화  수  목  금  토
 =============================
   1   2   3   4   5   6   7
   8   9  10  11  12  13  14
  15  16  17  18  19  20  21
  22  23  24  25  26  27  28
  29  30  31
 =============================
 계속하려면 아무키나 누르세요....

○ 문제 분석 및 접근
	- 서기 1년 1월 1일 : 월요일
	- 연도가 4의 배수이면서 100의 배수가 아니거나,
	  400의 배수이면 2월은 29일(윤년),
	  나머지는 2월 28일(평년)
	- 만약 2021년 8월 달력을 그린다고 가정하면
	  1.1.1 ~ 2021.7.31 까지의 날 수를 구한다.
	  그 날 수에 『+1』 연산을 수행하면... (1.1.1 ~ 2021.8.1) 날 수 확인
	  이 날 수를 통해 2021년 8월 1일의 요일 확인


*/

// 2021 8 3 --> 화요일
// 2021 8 -> 2021 8 1 --> 일요일
import java.util.Scanner;

public class hyodii101
{
	public static void main(String[] args)
	{
		int y, m, w, nalsu;
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.print("『연도』를 입력하세요 : ");
			y = sc.nextInt();
		}
		while (y<1);
		
		do
		{
			System.out.print("『월』을 입력하세요 : ");
			m = sc.nextInt();
		}
		while (m<1 || m>12);


		int months[] = {31,28,31,30,31,30,31,31,30,31,30,31};

		String week[] = {"일","월","화","수","목","금","토"};

		if ((y%4==0 && y%100!=0) || y%400==0)
			months[1] = 29;
		
		nalsu = (y-1)*365 + (y-1)/4 - (y-1)/100 + (y-1)/400;

		for (int i=0; i<m-1; i++)
		{
			nalsu += months[i];
		}

		nalsu += 1;

		w =nalsu % 7;


		System.out.println();
		System.out.printf("\t[ %4d년 %2d월 ]",y,m);
		System.out.println();
		System.out.println("  일  월  화  수  목  금  토");
		System.out.println("=============================");

		for (int i=0; i<w; i++)
		{
			System.out.print("    ");
		}

		for (int i=1; i<=months[m-1]; i++)   //--check~!!
		{
			System.out.printf("%4d",i);
			w++;

			if(w%7==0)
				System.out.println();
		}
		if (w%7!=0)
		{
			System.out.println();
		}
		
		System.out.println("=============================");

	}
}