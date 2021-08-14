//사용자로부터 임의의 정수를 입력받아
//입력받은 정수가 짝수인지 홀수인지 판별하는 프로그램을 구현한다.
//단, 조건 연산자(삼항연산자)를 활용하여 작성할 수 있도록 한다.

//실행 예)
//임의의 정수 입력 : 10

//==[판별 결과]==
//10 -> 짝수
//===============
//계속하려면 아무 키나 누르세요...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class hyodii026
{
	public static void main(String[] args) throws IOException
	{
		int n; //입력 받을 변수
		String res; //결과값 받을 변수
		InputStreamReader isr = new InputStreamReader(System.in); 
		BufferedReader br = new BufferedReader(isr);

		System.out.print("임의의 정수 입력 : ");
		n = Integer.parseInt(br.readLine());

		res = (n%2==0 ? "짝수" : "음수");

		System.out.printf("%d -> %s\n",n,res);
	}
}
/*
임의의 정수 입력 : 23
23 -> 음수
계속하려면 아무 키나 누르십시오 . . .

임의의 정수 입력 : 28
28 -> 짝수
계속하려면 아무 키나 누르십시오 . . .
*/