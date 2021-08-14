/* =======================================================
■■■ 실행 흐름의 컨트롤(제어문, 조건문과 반복문) ■■■
- 반복문(while) 실습
==========================================================*/

/*
사용자로부터 임의의 두 정수를 입력받아
★작은 수 부터 큰 수 까지★의 합을 구하여
결과를 출력하는 프로그램을 구현한다.

실행 예)
첫 번째 정수 입력 : 10
두 번째 정수 입력 : 20
>> 10 ~ 20 까지의 합 : xxx
계속하려면 아무 키나.....

첫 번째 정수 입력 : 10
두 번째 정수 입력 : 2
>> 2 ~ 10 까지의 합 : 54
계속하려면 아무 키나.....
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test047
{
	public static void main(String[] args) throws IOException
	{
		/*----------------------------------------------------------------------
		int n1,n2; //사용자로부터 입력받을 두정수를 담을 변수
		int sum = 0;  //두 정수의 합을 담을 변수
		int i;  //증가시킬 변수

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("첫 번째 정수 입력 : ");
		n1 = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 : ");
		n2 = Integer.parseInt(br.readLine());

		if(n1>n2) //일단 작은 수 ~ 큰 수 정렬
		{
			n1=n1^n2;
			n2=n2^n1;
			n1=n1^n2;
		}

		i = n1; //n1 을 증가시킬 변수에 담고 결과 출력될 때 값이 변하면 안되니까!
		while (i<=n2)
		{
			sum += i;
			i++;	
		}
		
		System.out.printf(">>%d ~ %d 까지의 합 : %d\n",n1,n2,sum);
		-------------------------------------------------------------------*/
		//○주요 변수 선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//반복문 == 루프문
		int n;          // 루프 변수(반복문을 제어하게 될 변수)로 활용할 변수
		int su1, su2;   // 첫 번째, 두 번째 입력값을 담을 변수
		int result =0;  // 작은 수 부터 큰 수 까지누적합을 담을 변수

		//○연산 및 처리
		System.out.print("첫 번째 정수 입력 : ");
		su1 = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 : ");
		su2 = Integer.parseInt(br.readLine());

		// 입력받은 두 수의 크기 비교 및 자리 바꿈
		// 즉, su1 이 su2 보다 큰 경우 두 수의 자리를 바꿀 수 있도록 처리

		if(su1>su2)
		{
			//자리 바꿈
			su1 = su1^su2;
			su2 = su2^su1;
			su1 = su2^su1;

		}

		//반복 연산 수행
		//★반복 연산을 수행하기 전에 작은 수를 따로 저장하여 루프 변수로 활용한다.결과 출력 과정에서 필요하기 때문★
		// 10
		// 2
		// 2 10 정렬 후 2부터 1씩 증가시켜서 더해야하니까 2가 변하게 됨
		//그렇기 때문데 n 에 su1을 담아
		n = su1;

		while (n<=su2)
		{
			result += n;
			n++;
		}


		//○ 결과 출력
		System.out.printf(">> %d ~ %d 까지의 합 : %d\n",su1,su2,result);
		//su1에 n 을 넣으면 증가된 값이 나옴!!!!그래서 ★su1을 넣어야함★


	}
}

/*
첫 번째 정수 입력 : 10
두 번째 정수 입력 : 20
10 ~ 20 까지의 합 : 165
계속하려면 아무 키나 누르십시오 . . .

첫 번째 정수 입력 : 10
두 번째 정수 입력 : 2
2 ~ 10 까지의 합 : 54
계속하려면 아무 키나 누르십시오 . . .
*/