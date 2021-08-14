/* =================================================
■■■ 연산자(Operator) ■■■
- 삼항 연산자 == 조건 연산자
- 분할(?)조건식
===================================================*/

//사용자로부터 임의의 정수를 입력받아
//입력받은 정수가 양수인지, 음수인지, 0인지 구분하여
//이 결과를 출력하는 프로그램을 구현한다.
//단, 입력 데이터는 BufferedReader의 readLine()을 통해 넘겨받을 수 있도록 한다.
//또한, 조건 연산자(삼항연산자)를 활용하여 기능을 구현할 수 있도록 한다.

//  실행예)
// 임의의 정수 입력 : -12
// -12 -> 음수
//계속...

// 임의의 정수 입력 : 257
// 257 -> 양수
//계속...

// 임의의 정수 입력 : 0 
// 0 -> 영
//계속...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
//import java.io.*;   -> 이렇게 써도됨 but! 메모리량을 줄이기위해 소스를 줄이는 것이 좋음

public class Test027
{
	public static void main(String[] args) throws IOException
	{
		// 주요 변수 선언
		int n;
		String strResult;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 연산 및 처리
		System.out.print("임의의 정수 입력 :");
		n = Integer.parseInt(br.readLine());

		//strResult = (n==0) ? "영" : (n>0) ? "양수" : "음수"; //이중으로 가능!!	
		strResult = (n>0) ? "양수" : ((n<0) ? ("음수") : ("영"));
		/*
		n이 0보다 크다 -> true -> n은 양수
					   -> false -> n이 보다 작다 -> true -> n은 음수
					   							 -> false -> n은 영
		*/

		
		// 결과 출력
		System.out.printf("%d → %s\n", n, strResult);
		

	}
}
/*
임의의 정수 입력 :-12
-12 → 음수
계속하려면 아무 키나 누르십시오 . . .

임의의 정수 입력 :257
257 → 양수
계속하려면 아무 키나 누르십시오 . . .

임의의 정수 입력 :0
0 → 영
계속하려면 아무 키나 누르십시오 . . .
*/