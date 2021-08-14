/* =======================================================
■■■ 실행 흐름의 컨트롤(제어문, 조건문과 반복문) ■■■
- switch 문 실습
==========================================================*/

/*
1부터 3까지의 정수 중 하나를 사용자로부터 입력받아
입력받은 정수만큼의 별문자(★)가 출력되는 프로그램을 작성한다.
단, 두 가지 방법으로 구현할 수 있도록 한다.

1. swich 문의 일반 모델을 사용하여 해결한다.
2. swich 문의 기본 모델을 사용하되, break;를 딱 한 번만 사용할 수 있도록 구성한다.

실행 예)
임의의 정수 입력(1~3) : 3
★★★
계속하려면...

임의의 정수 입력(1~3) : 7
입력 오류~!!
계속하려면...
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test037
{
	public static void main(String[] args) throws IOException
	{
		int n;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("임의의 정수 입력(1~3) : ");
		n = Integer.parseInt(br.readLine());

		// 일반모델
		System.out.print("\n<일반모델>\n");
		switch (n)
		{
			//case문 쓸때 띄어쓰기 중요!!!!! case 띄고 상수 :이거는 붙여도 상관없음!!
			case 1 : System.out.println("★"); break;
			case 2 : System.out.println("★★"); break;
			case 3 : System.out.println("★★★"); break;
			default : System.out.println("입력 오류~!!!"); break;
		}

		//기본모델  print()사용
		System.out.print("\n<기본모델>\n");
		switch (n)
		{
			case 3 : System.out.print("★");
			case 2 : System.out.print("★");
			case 1 : System.out.print("★\n"); 
			break;
			default : System.out.println("입력 오류~!!!");			
		}

	}
}

/* 실행 결과
임의의 정수 입력(1~3) : 2

<일반모델>
★★

<기본모델>
★★
계속하려면 아무 키나 누르십시오 . . .


임의의 정수 입력(1~3) : 5

<일반모델>
입력 오류~!!!

<기본모델>
입력 오류~!!!
계속하려면 아무 키나 누르십시오 . . .
*/