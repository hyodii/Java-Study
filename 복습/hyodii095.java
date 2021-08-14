/*
사용자로부터 년, 월, 일을 입력받아
해당 날짜의 요일을 출력하는 프로그램을 구현한다.
단, 달력 클래스(Calendar)는 사용하지 않는다.
또한, 클래스의 개념을 활용하여 작성할 수 있도록 한다.(-> WeekDay 클래스 설계)
그리고 배열의 개념도 적용시켜 작성할 수 있도록 한다.
접근제어지시자의 개념도 확인하여 작성할 수 있도록 한다.
최종적으로
WeekDay클래스 설계를 통해
Test095 클래스의 main() 메소드가 정상적으로 프로그램 실행될 수 있도록 한다.

실행 예)
 년 월 일 입력(공백 구분) : 1996 8 16

 1996년 8월 16일 → x요일
 계속하려면 아무 키나 누르세요...

※ 1년 1월 1일 -> 월요일
※ 1년은 365일이 아닐 때도 있다.

[힌트]
1년 1월 1일 ~ 1996년 8월 16일 ====> 전체 날 수

1. nalsu = 1.1.1 ~ 1995.12.31  작년까지의 날수구하고

2. nalsu += 1966.1.1 ~ 1996.7.31  입력한달 저달까지의 날수 구하고

3. nalsu += 1996.8.1 ~ 1996.8.16   나누기 7하면 요일 구해낼 수 있음!
*/

import java.util.Scanner;

class WeekDay
{
	private int y, m, d;

	public void input()
	{	
		Scanner sc = new Scanner(System.in);

		System.out.print("년 월 일 입력(공백 구분) : ");		// 2021 7 30
		y = sc.nextInt();
		m = sc.nextInt();
		d = sc.nextInt();
	}

	public String week()
	{
		int[] months = {31, 0, 31, 30, 31, 30,31,31, 30,31, 30,31};
		
		String[] weekNames = {"일","월","화","수","목","금","토"};

		int nalsu;

		if ((y%4==0 && y%100!=0) || y%400==0)
			months[1] = 29;
		else
			months[1] = 28;

		nalsu = (y-1)*365 + (y-1)/4 - (y-1)/100 + (y-1)/400;

		for (int i=0; i<(m-1); i++)
		{
			nalsu += months[i];
		}

		nalsu += d;

		int w = nalsu % 7;

		return weekNames[w];
	}

	public void print(String day)
	{
		System.out.printf(" %d년 %d월 %d일 -> %s\n", y, m, d, day);
	}

}
public class hyodii095
{
	public static void main(String[] args)
	{
		WeekDay ob = new WeekDay();

		ob.input();

		String result = ob.week();

		ob.print(result);
	}
}