/* ==============================
■■■자바 기본 프로그래밍■■■
- 변수와 자료형
=================================*/
//tab하면 들여써지고 s+tab하면 들여써짐

public class Test003
{
	public static void main(String[] args)
	{
		//변수 선언
		int a;
		//변수 초기화(변수 a에 10 대입)
		a = 10;
		//변소 선언 및 초기화(선언과 대입을 한 번에 처리)
		int b = 20;
		//변수 선언
		int c;

		//출력문을 통해 확인(테스트)
		//System.out.println(c);
		//에러 발생(컴파일 에러)

		//연산 및 처리
		c = a + b;
		System.out.println(c);
		//결과 : 30

		//결과출력
		//System.out.println(a b c);
		//에러 발생(컴파일 에러)

		//※덧셈 연산자(+)
		/*피연산자 중 어느 하나라도 문자열 형태의 데이터가 존재한다면 
		산술연산자로써 기능을 수행하는 것일 아니라 문자열 결합 연산자로써의
		기능을 수행하게 된다. */

		//테스트
		System.out.println(1+2);
		//결과 : 3

		//테스트
		System.out.println("1" + 2);
		//결과 : 12

		//테스트
		System.out.println(a + " " + b + " " + c);
		//결과 : 10 20 30

		System.out.println("a 의 값은 " +a+" 입니다.");
		System.out.println("b 의 값은 2"+b+" 입니다.");
		System.out.println("a 와 b 를 더한 결과값 : "+c);
		/*
		a 의 값은 10 입니다.
		b 의 값은 20 입니다.
		a 와 b 를 더한 결과값 : 30

		+연산자를 사용하는 과정에서 피연산자 중 문자열이 포함되어 있을 경우
		문자열 결합 연산자로 활용되며
		처리 결과는 문자열의 형태로 반환된다.
		*/


		System.out.println(1+2);//산술연산자 +
		System.out.println("1"+2);//문자연결합연산자+
		System.out.println(1+"2");//문자연결합연산자+
		System.out.println("1"+"2");//문자연결합연산자+
		/* 결과
		3
		12
		12
		12
		*/
		




	}
}