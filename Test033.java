/*
사용자로부터 임의의 정수 세 개를 입력받아
작은 수에서 큰 수 순으로 출력하는 프로그램을 구현한다.

실행 예)
첫 번째 정수 입력 : 5
두 번째 정수 입력 : 15
세 번재 정수 입력 : 10

>> 정렬 결과 : 5 10 15
계속하려면 아무 키나 누르세요...

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test033
{
	public static void main(String[] args) throws IOException
	{
		int a,b,c;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("첫 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());
		System.out.print("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());
		System.out.print("세 번재 정수 입력 : ");
		c = Integer.parseInt(br.readLine());

		// 7 8 2    8 6 13    10 50 30    9 30 45
		// ---      ---       -----       ----        첫 번째 두 번째 비교
		//          6 8 13
		// -   -    -   --	  --    --    -    --     첫 번째 세 번째 비교
		// 2 8 7    
		//   - -      -  -        -  -       -   -    두 번째 세 번째 비교
		// 2 7 8    6 8 13     10 30 50    9 30 45

		// if 를 따로따로 만드는 이유는 전부다 수행해야하니까! else아님!!  ---check~!! 
		
		if(a>b)// 만약 첫 번째 정수(a)가 두 번째 정수(b)보다 크다면...
		{
			// a 와 b 두 정수의 자리를 바꾼다.
			a=a^b;
			b=b^a;
			a=a^b;
			//테스트
			System.out.println("자리바꿈 발생~!!!");
		}
		
		if(a>c)// 만약 첫 번째 정수(a)가 세 번째 정수(c)보다 크다면...
		{
			// a 와 c 두 정수의 자리를 바꾼다.
			a=a^c;
			c=c^a;
			a=a^c;
			//테스트
			System.out.println("자리바꿈 발생~!!!");
		}
		if(b>c)// 만약 두 번째 정수(b)가 세 번째 정수(c)보다 크다면...
		{
			// b 와 c 두 정수의 자리를 바꾼다.
			b=b^c;
			c=c^b;
			b=b^c;
			//테스트
			System.out.println("자리바꿈 발생~!!!");
		}


		/* if(a>b)
		{
			a = a^b; 
			b = b^a; 
			a = a^b;
			
			//temp = a;
			//a = b;
			//b = temp;

		}
		if(b>c)
		{
			b = b^c; 
			c = c^b; 
			b = b^c;
		}

		if(a>b)
		{
			a = a^b; 
			b = b^a; 
			a = a^b;
		} */
		
		/*  이거 헷갈려....
		if(a<b)
		{
			if(b<c)
				System.out.printf("정렬 결과 : %d %d %d\n",a,b,c);
			else
				System.out.printf("정렬 결과 : %d %d %d\n",a,c,b);
		}
		else if(b<a)
		{
			if(a<c)
				System.out.printf("정렬 결과 : %d %d %d\n",b,a,c);
			else
				System.out.printf("정렬 결과 : %d %d %d\n",b,c,a);
		}
		else if(c<a)
		{
			if (a<b)
				System.out.printf("정렬 결과 : %d %d %d\n",c,a,b);
			else
				System.out.printf("정렬 결과 : %d %d %d\n",b,c,a);
		}

		*/


		System.out.printf("\n>> 정렬 결과 : %d %d %d\n",a,b,c);
		
	}
}
/* 실행 결과
첫 번째 정수 입력 : 5
두 번째 정수 입력 : 15
세 번재 정수 입력 : 10

>> 정렬 결과 : 5 10 15계속하려면 아무 키나 누르십시오 . . .
*/
