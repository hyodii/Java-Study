/* =======================================================
■■■ 실행 흐름의 컨트롤(제어문, 조건문과 반복문) ■■■
- if ~ else 문 실습
==========================================================*/
/*
사용자로부터 임의의 정수를 입력받아
입력받은 정수가... 짝수인지, 홀수인지, 영인지
결과를 판별하여 출력하는 프로그램을 구현한다.

실행 예)
임의의 정수 입력 : 14
14 -> 짝수
계속하려면.....

임의의 정수 입력 : 3
3 -> 홀수
계속하려면....
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test030
{
	public static void main(String[] args) throws IOException
	{
		
		//초기 변수 선언
		int n;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//연산 및 처리
		System.out.print("임의의 정수 입력 : ");
		n = Integer.parseInt(br.readLine());
		
		//핵심은 0을 제일 처음에 걸러내는 것이 제일 중요!!! ----check~!!
		String strResult = "판별불가";

		if(n==0)
		{
			strResult = "영";
		}else if(n%2!=0)
		{
			strResult = "홀수";
		}
		else if(n%2==0)
		{
			strResult = "짝수";
		}

		//결과 출력
		System.out.printf("%d -> %s\n",n,strResult);
	}
}
/*
임의의 정수 입력 : 12
12 -> 짝수
계속하려면 아무 키나 누르십시오 . . .

임의의 정수 입력 : 11
11 -> 홀수
계속하려면 아무 키나 누르십시오 . . .

임의의 정수 입력 : 0
0 -> 영
계속하려면 아무 키나 누르십시오 . . .
*/