/* =================================================
■■■ 자바 기본 프로그래밍 ■■■
- 산술 연산자
- BufferedReader
- printf()
===================================================*/

// 사용자로부터 임의의 정수를 두 번 입력받아
// 사칙연산 및 나머지 연산을 수행하여
// 그 결과를 출력하는 프로그램을 구현한다.
// 단, 입력받은 과정은 BuferedReader 를 활용할 수 잇도록 하고
// 출력하는 과정은 print() 메소드를 활요할 수 있도록 한다.
// 또한, 나눗셈 연산은 편의상 정수 기반으로 처리한다.

// 실행 예)
// 첫 번째 정수 입력 : 10
// 두 번째 정수 입력 : 2

// ====[결과]====
// 10 + 2 = 12
// 10 - 2 = 10
// 10 * 2 = 20
// 10 / 2 = 5
// 10 % 2 = 0
// =============

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test019
{
	public static void main(String[] args) throws IOException
	{
		// ○ 주요 변수 선언
		int fir, sec;	// 사용자 입력값을 담을 변수
		int res1, res2, res3, res4, res5; // 각 연산에 대한 결과를 담을 변수
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// ○ 연산 및 처리
		System.out.print("첫 번째 정수 입력 : ");
		fir = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 : ");
		sec = Integer.parseInt(br.readLine());

		res1 = fir + sec;
		res2 = fir - sec;
		res3 = fir * sec;
		res4 = fir / sec;
		res5 = fir % sec;



		// ○ 결과 출력
		System.out.printf("\n====[결과]====\n");
		System.out.printf("%d + %d = %d\n",fir, sec, res1);
		System.out.printf("%d - %d = %d\n",fir, sec, res2);
		System.out.printf("%d * %d = %d\n",fir, sec, res3);
		System.out.printf("%d / %d = %d\n",fir, sec, res4);
		System.out.printf("%d %% %d = %d\n",fir, sec, res5); // %% check~!! %에서 에러가남
		// 자바에서는 %문자열이 등장하면 그뒤에 s,c,f이런게 뒤에 올줄 알았는데 안오니까 누락됬구나 라고 생각함
		//그래서 나누기는 %%이렇게 하면 됨!

		System.out.printf("==============\n");
	}

}
/* 실행 결과
첫 번째 정수 입력 : 10
두 번째 정수 입력 : 2

====[결과]====
10 + 2 = 12
10 - 2 = 8
10 * 2 = 20
10 / 2 = 5
10 % 2 = 0
==============
계속하려면 아무 키나 누르십시오 . . .
*/