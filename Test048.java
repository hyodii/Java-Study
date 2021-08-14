/* =======================================================
■■■ 실행 흐름의 컨트롤(제어문, 조건문과 반복문) ■■■
- 반복문(while) 실습
==========================================================*/

/*
○ 과제
사용자로부터 임의의 정수를 입력받아
1부터 입력받은 그 수 까지의
전체 합과, 짝수의 합과, 홀수의 합을 
각각 결과값으로 출력하는 프로그램을 구현한다.

실행 예)
임의의 정수 입력 : 270
>> 1 ~ 270 까지 정수의 합 : xxxx
>> 1 ~ 270 까지 짝수의 합 : xxxx
>> 1 ~ 270 까지 홀수의 합 : xxxx
계속하려면 아무 키나 누르세요...
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test048
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int n;              //입력받을 변수
		int i = 1;          //루프변수
		int sum, even, odd; //정수, 짝수, 홀수의 합
		sum = even = odd = 0;
	
		System.out.print("임의의 정수 입력 : ");
		n = Integer.parseInt(br.readLine());

		

		while (i <= n)        //1 ~ n까지 돌꺼다
		{
			sum += i;         //n까지의 정수의 합
			if (i%2 == 0)
			
				even += i;    //n까지의 짝수의 합
			
			else 
				odd += i;     //n까지의 홀수의 합
			
			i++;
			
		}
		System.out.println(">> 1 ~ " + n +  "까지 정수의 합 : " + sum);
		System.out.printf(">> 1 ~ %d 까지 짝수의 합 : %d\n",n,even);
		System.out.printf(">> 1 ~ %d 까지 홀수의 합 : %d\n",n,odd);
	}
}
/*
임의의 정수 입력 : 270
>> 1 ~ 270까지 정수의 합 : 36585
>> 1 ~ 270 까지 짝수의 합 : 18360
>> 1 ~ 270 까지 홀수의 합 : 18225
계속하려면 아무 키나 누르십시오 . . .
*/
