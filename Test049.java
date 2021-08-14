/* =======================================================
■■■ 실행 흐름의 컨트롤(제어문, 조건문과 반복문) ■■■
- 반복문(while) 실습
==========================================================*/

/*
○ 과제
사용자로부터 원하는 단(구구단)을 입력받아
해당하는 구구단을 출력하는 프로그램을 구현한다.
단, 1단 ~ 9단 사이의 수를 입력받은 상황이 아니라면
프로그램을 종료해 버릴 수 있도록 처리한다.


실행 예)
원하는 단(1단~9단) 입력 : 7
7 * 1 = 7
7 * 2 = 14
    :
7 * 9 = 63
계속하려면 아무 키나 누르세요...


원하는 단(1단~9단) 입력 : 11
1 부터 9까지의 정수만 입력이 가능합니다.
계속하려면 아무 키나 누르세요...
*/

/*----------------------------------------------------------------------
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
-------------------------------------------------------------------*/
import java.util.Scanner;

public class Test049
{
	public static void main(String[] args) //throws IOException
	{
		//InputStreamReader isr = new InputStreamReader(System.in);
		//BufferedReader br = new BufferedReader(isr);
		Scanner sc = new Scanner(System.in);

		int n;    //입력 받을 변수
		int i=1;    //루프 변수
		System.out.print("원하는 단(1단~9단) 입력 : ");
		//n = Integer.parseInt(br.readLine());
		
		n = sc.nextInt();

		if (n>=1 && n<=9) //1 ~ 9까지만 입력받겠다
		{
			System.out.println("[" + n +"단]을 출력합니다.");

			while (i<=9) //1~9까지 곱하겠다
		{
				
				System.out.println(+ n +" * " + i + " = " + n*i);
				i++;
		}

		}
		else
			System.out.println("1 부터 9까지의 정수만 입력이 가능합니다.");
		


	}

}

/*
원하는 단(1단~9단) 입력 : 5
[5단]을 출력합니다.
5 * 1 = 5
5 * 2 = 10
5 * 3 = 15
5 * 4 = 20
5 * 5 = 25
5 * 6 = 30
5 * 7 = 35
5 * 8 = 40
5 * 9 = 45
계속하려면 아무 키나 누르십시오 . . .

원하는 단(1단~9단) 입력 : 11
1 부터 9까지의 정수만 입력이 가능합니다.
계속하려면 아무 키나 누르십시오 . . .
*/