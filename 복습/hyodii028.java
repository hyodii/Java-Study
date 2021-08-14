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

public class hyodii028
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n;
		String res;

		System.out.print("임의의 연도 입력 : ");
		n = Integer.parseInt(br.readLine());

		res = (n%4==0) && (n%100!=0) || (n%400==0) ? "윤년":"평년";
		System.out.printf("%d -> %s\n",n,res);

	}
}
/*
임의의 연도 입력 : 2012
2012 -> 윤년
계속하려면 아무 키나 누르십시오 . . .

임의의 연도 입력 : 2020
2020 -> 윤년
계속하려면 아무 키나 누르십시오 . . .

임의의 연도 입력 : 2021
2021 -> 평년
계속하려면 아무 키나 누르십시오 . . .
*/