/* =======================================================
■■■ 실행 흐름의 컨트롤(제어문, 조건문과 반복문) ■■■
- break
	멈춘다 (+ 그리고 빠져나간다.)
==========================================================*/
/*
아래와 같은 처리가 이루어지는 프로그램을 구현한다.
단, 입력받는 정수는 1 ~ 100 범위 안에서만 가능하도록 작성한다.

실행 예)

임의의 정수 입력 : -20

임의의 정수 입력 : 0

임의의 정수 입력 : 2021

임의의 정수 입력 : 10
>> 1 ~ 10 까지의 합 : 55
계속하시겠습니까?(Y/N)? : y

임의의 정수 입력 : 100
>> 1 ~ 100 까지의 합 : 5050
계속하시겠습니까?(Y/N)? : n
계속하려면 아무 키나 누르세요... -> 프로그램 종료

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class hyodii060
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n,sum,i;
		char ch;
		
		while(true)
		{
			do
			{
				System.out.print("임의의 정수 입력 : ");
				n = Integer.parseInt(br.readLine());

			}
			while(n<1 || n>100);   //check~!!

			sum = 0;

			for (i=1;i<=n;i++)
			{
				sum += i;
			}

			System.out.printf(">> 1 ~ %d 까지의 합 : %d\n",n,sum);
			System.out.print("계속하시겠습니까?(Y/N)? : ");
			ch = (char)System.in.read();
			System.out.println();

			if (ch!='Y' && ch!='y') //논리연산자 부정조건이기 때문에 or가 아니라 ★and★!!!! ---check~!! 
			{
				break;
			}
			System.in.skip(2);

		}//end while

		
	}

}
/*
임의의 정수 입력 : 5
>> 1 ~ 5 까지의 합 : 15
계속하시겠습니까?(Y/N)? : y

임의의 정수 입력 : 4
>> 1 ~ 4 까지의 합 : 10
계속하시겠습니까?(Y/N)? : Y

임의의 정수 입력 : 2
>> 1 ~ 2 까지의 합 : 3
계속하시겠습니까?(Y/N)? : N

계속하려면 아무 키나 누르십시오 . . .

*/