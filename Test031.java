/* =======================================================
■■■ 실행 흐름의 컨트롤(제어문, 조건문과 반복문) ■■■
- if ~ else 문 실습
==========================================================*/
// 과제
/*
사용자로부터 임의의 연도를 입력받아
입력받은 연도가... 윤년인지 평년인지 판별하여
그 결과를 출력하는 프로그램을 구현한다.
단, 입력은 BufferedReader를 활용하고
처리 과정은 if 조건문을 활용하여 수행할 수 있도록 한다.

실행 예)
임의의 연도 입력 : 2021
2021년 -> 평년
계속하려면 아무 키나 누르세요...

임의의 연도 입력 : 2020
2020년 -> 윤년
계속하려면 아무 키나 누르세요...

임의의 연도 입력 : 2012
2012년 -> 윤년
계속하려면 아무 키나 누르세요...

// ※ 2월이 28일까지 있는 해 -> 평년
//          29일까지 있는 해 -> 윤년

// ※ 윤년의 판별 조건
연도가 4의 배수이면서 100의 배수가 아니거나 400의 배수이면 윤년 ~!! 그렇지 않으면 평년~!!
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test031
{
	public static void main(String[] args) throws IOException
	{
		// 주요 변수 선언
		int year;
		//String result;
		String result = "다시 입력"; //--->초기화

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		
		//연산 및 처리
		System.out.print("임의의 연도 입력 : ");
		year = Integer.parseInt(br.readLine());

		/* 방법 ①
		//연도가 4의 배수이면서 100의 배수가 아니거나 400의 배수이면 윤년 ~!! 그렇지 않으면 평년~!!
		if(year%4==0 && year%100!=0 || year%400==0)
			result = "윤년";
		else
			result = "평년";
		*/

		// 방법 ②
		if(year%4==0) //-----------4의 배수 확인
		{
			if(year%100!=0) //------4의 배수 중 100의 배수가 아닌 것 윤년
				result = "윤년";
			else if(year%400==0) //-4의 배수 중 100의 배수인 것 평년 
				result = "평년";

		}else
		{
			result = "평년"; //-----연도가 4의 배수가 아니고 아닌 것 평년
		}
		

		//출력 결과
		System.out.printf("%d년 -> %s\n", year, result);


	}
}
/*
임의의 연도 입력 : 2021
2021년 -> 평년
계속하려면 아무 키나 누르십시오 . . .

임의의 연도 입력 : 2020
2020년 -> 윤년
계속하려면 아무 키나 누르십시오 . . .

임의의 연도 입력 : 2012
2012년 -> 윤년
계속하려면 아무 키나 누르십시오 . . .
*/