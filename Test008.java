/* ============================================
■■■ 변수와 자료형 ■■■
- 변수와 자료형 실습 및 테스트 : char(2바이트)
==============================================*/

public class Test008
{
	public static void main(String[] args)
	{
		//주요 변수 선언
		char ch1, ch2, ch3;
		int a; //--check~!!!

		//연산 및 처리(대입연산)
		//ch1 = "A"; -> 문자열 ""로 표현하면 안된다.
		ch1 = 'A';
		ch2 = '\n'; //개행문자 1개
		ch3 = '대';
		a = (int)ch1; //자동형변환(A문자형으로 보이지만 실제로는 A(65)a(97)의 아스키코드 값이 담김)

		//결과 출력
		System.out.println("ch1 : " + ch1);
		System.out.println("ch2 : " + ch2);
		System.out.println("ch3 : " + ch3);
		System.out.println("a : " + a);
	}
}

/*
ch1 : A
ch2 :

ch3 : 대
a : 65
계속하려면 아무 키나 누르십시오 . . .
*/