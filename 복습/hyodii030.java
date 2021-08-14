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

public class hyodii030
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n;
		String res = "판별불가";
		
		System.out.print("임의의 정수 입력 : ");
		n = Integer.parseInt(br.readLine());
		

		if (n==0)
		
			res = "영";
		
		else if (n%2==0)
		
			res = "짝수";
		
		else if(n%2!=0)		
			res = "홀수";

		System.out.printf("%d -> %s\n",n,res);
	}
}
/*
임의의 정수 입력 : 0
0 -> 영
계속하려면 아무 키나 누르십시오 . . .

임의의 정수 입력 : 12
12 -> 짝수
계속하려면 아무 키나 누르십시오 . . .

임의의 정수 입력 : 15
15 -> 홀수
계속하려면 아무 키나 누르십시오 . . .
*/