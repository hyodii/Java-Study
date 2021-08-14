/* =======================================================
■■■ 실행 흐름의 컨트롤(제어문, 조건문과 반복문) ■■■
- switch 문 실습
==========================================================*/
/*
사용자로부터 임의의 두 정수와 연산자를 입력받아
해당 연산자의 연산 처리 결과를 출력하는 프로그램을 구현한다.
단, switch 조건문을 활용하여 처리할 수 있도록 하며,
연산 결과는 편의상 정수형으로 처리될 수 있도록 한다.

실행 예)
첫 번째 정수 입력 : 20
두 번째 정수 입력 : 14
연산자 입력[+ - * /] : +

>> 20 + 14 = 34
계속하려면 아무 키나 누르세요...
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test038
{
	public static void main(String[] args) throws IOException
	{
		
		/* 내가 푼 코드
		int a, b, result=0;
		char op;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("첫 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());
		System.out.print("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());
		System.out.print("연산자 입력[+ - * /] : ");
		op = (char)System.in.read();

		switch (op)
		{
		case '+': result = a + b; break;
		case '-': result = a - b; break;
		case '*': result = a * b; break;
		case '/': result = a / b; break;
		
		}
		
		System.out.printf("\n>> %d %c %d = %d\n",a,op,b,result);
		*/
		
		
		//함께 푼 코드 1  -> case 상수 숫자로 받기
		/*
		int a, b, result;
		int op;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("첫 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());
		System.out.print("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());
		System.out.print("연산자 입력[+ - * /] : ");
		op = (char)System.in.read();

		// + : 43 / - : 45 / * : 42 / / : 47 
		// op는 byte, short, int, long 이어야한다.
		switch (op)
		{
			case 43: result = a + b; break;
			case 45: result = a - b; break;
			case 42: result = a * b; break;
			case 47: result = a / b; break;
			default: return; //check~!!
			
		}
		// ※ return 키워드가 지니는 두 가지 의미
		// 1. 값의 반환
		// 2. 메소드의 종료 -> main()메소드 종료 -> 프로그램 끝
        // (return을 발견하면 **어느 메소드**에 들어있는지 꼭 확인!! 지금은 main)
		
		System.out.printf("\n>> %d %c %d = %d\n",a,op,b,result);
		System.out.printf("\n>> %d %d %d = %d\n",a,op,b,result); //이렇게 하면 연산자 값 아스키코드 값이 출력됨!!
		*/
		
		//함께 푼 코드 2  -> case에 '+' 사용
		/*
		int a, b, result;
		int op;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("첫 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());
		System.out.print("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());
		System.out.print("연산자 입력[+ - * /] : ");
		op = (char)System.in.read();

		// + : 43 / - : 45 / * : 42 / / : 47 
		// op는 byte, short, int, long 이어야한다.
		switch (op)
		{
			//JDK 1.5부터 가능한 문법
			case '+': result = a + b; break;
			case '-': result = a - b; break;
			case '*': result = a * b; break;
			case '/': result = a / b; break;
			default: return;
			
		}
		
		System.out.printf("\n>> %d %c %d = %d\n",a,op,b,result);
		System.out.printf("\n>> %d %d %d = %d\n",a,op,b,result); //이렇게 하면 연산자 값 아스키코드 값이 출력됨!!
		*/

		//함께 푼 코드 3 -> String   case"+" 사용
		
		int a, b, result;
		String op;  //-------check~!!!

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("첫 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());
		System.out.print("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());
		System.out.print("연산자 입력[+ - * /] : ");
		op = br.readLine(); //-------check~!!!

		// + : 43 / - : 45 / * : 42 / / : 47 
		// op는 byte, short, int, long 이어야한다.
		switch (op)
		{
			//JDK 1.7부터 가능한 문법
			case "+": result = a + b; break;
			case "-": result = a - b; break;
			case "*": result = a * b; break;
			case "/": result = a / b; break;
			default: return;
			
		}
		
		System.out.printf("\n>> %d %s %d = %d\n",a,op,b,result); //-------check~!!! %s
		

	}
}
/* 1.
첫 번째 정수 입력 : 2
두 번째 정수 입력 : 5
연산자 입력[+ - * /] : +

>> 2 + 5 = 7

>> 2 43 5 = 7
계속하려면 아무 키나 누르십시오 . . .

첫 번째 정수 입력 : 2
두 번째 정수 입력 : 2
연산자 입력[+ - * /] : 2
계속하려면 아무 키나 누르십시오 . . .
*/

/* 2.
첫 번째 정수 입력 : 13
두 번째 정수 입력 : 5
연산자 입력[+ - * /] : *

>> 13 * 5 = 65

>> 13 42 5 = 65
계속하려면 아무 키나 누르십시오 . . .
*/

/* 3.
첫 번째 정수 입력 : 131
두 번째 정수 입력 : 5
연산자 입력[+ - * /] : *

>> 131 * 5 = 655
계속하려면 아무 키나 누르십시오 . . .
*/

