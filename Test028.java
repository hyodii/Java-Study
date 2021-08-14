/* =================================================
■■■ 연산자(Operator) ■■■
- 삼항 연산자 == 조건 연산자
===================================================*/
/*
사용자로부터 임의의 연도를 입력받아
입력받은 연도가... 윤년인지 평년인지 판별하여
그 결과를 출력하는 프로그램을 구현한다.
단, 입력은 BufferedReader를 활용하고
처리 과정은 조건 연산자를 활용하여 수행할 수 있도록 한다.

실행 예)
임의의 연도 임력 : 2021
2021년 -> 평년
계속하려면 아무 키나 누르세요...

임의의 연도 임력 : 2020
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

public class Test028
{
	public static void main(String[] args) throws IOException
	{
		// 주요 변수 선언
		int year;
		String strResult;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//연산 및 처리
		System.out.print("임의의 연도 입력 :");
		year = Integer.parseInt(br.readLine());
		
		// ※ 하나의 공간에 두개이상의 조건이 오면 무조건 논리연산(&&, ||, !)이 와야함!!
		strResult = (year%4 == 0)&&(year%100 !=0)||(year%400==0) ? "윤년":"평년";  

		//출력 결과
		System.out.print("임의의 연도 입력 : ");
		System.out.printf("%d년 -> %s\n", year, strResult);


	}
}
/*
임의의 연도 입력 :2021
임의의 연도 입력 : 2021년 -> 평년
계속하려면 아무 키나 누르십시오 . . .

임의의 연도 입력 :2020
임의의 연도 입력 : 2020년 -> 윤년
계속하려면 아무 키나 누르십시오 . . .

임의의 연도 입력 :2012
임의의 연도 입력 : 2012년 -> 윤년
계속하려면 아무 키나 누르십시오 . . .
*/