/* =======================================================
■■■ 실행 흐름의 컨트롤(제어문, 조건문과 반복문) ■■■
- if ~ else 문 실습
==========================================================*/

/* ○ 과제
사용자로부터 알파벳 한 문자를 입력받아
이를 판별하여 입력받은 알파벳이 모음(아에이오우)일 경우만
결과를 출력하는 프로그램을 구현한다.
단, 대소문자를 모두 적용할 수 있도록 처리한다.
또한, 알파벳 이외의 문자가 입력되었을 경우
입력 오류에 대한 내용을 사용자에게 안내해 줄 수 있도록 한다.

// 실행 예)
// 알파벳 한 문자 입력 : A
// >> 모음 ok~!!!
// 계속하려면...

// 알파벳 한 문자 입력 : e
// >> 모음 ok~!!!
// 계속하려면...

// 알파벳 한 문자 입력 : B
// 계속하려면...

// 알파벳 한 문자 입력 : t
// 계속하려면...

// 알파벳 한 문자 입력 : 1
// >> 입력 오류~!!!
// 계속하려면...

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test034
{
	public static void main(String[] args) throws IOException

	{
		//주요 변수 선언
		int c ;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("알파벳 한 문자 입력 : ");
		c = System.in.read();

		//반복문 및 출력
		//A(65),E(69),I(73),O(79),U(85) /  a(97),e(101),i(105),o(111),u(117)
		if ((c>=65 && c<=90) || (c>=97 && c<=122)) //대문자와 소문자 중에
		{
			if(c==65 ||c==69||c==73||c==79||c==85||c==97 ||c==101||c==105||c==111||c==117) // 대문자모음과 소문자모음이면
				System.out.println(">> 모음 ok~!!!");
		}else //모음이 아닐경우
		{
			System.out.println(">> 입력 오류~!!!"); 
		}

	}
}
/*
알파벳 한 문자 입력 : A
>> 모음 ok~!!!
계속하려면 아무 키나 누르십시오 . . .

알파벳 한 문자 입력 : a
>> 모음 ok~!!!
계속하려면 아무 키나 누르십시오 . . .

알파벳 한 문자 입력 : w
계속하려면 아무 키나 누르십시오 . . .

알파벳 한 문자 입력 : 4
>> 입력 오류~!!!
계속하려면 아무 키나 누르십시오 . . .
*/