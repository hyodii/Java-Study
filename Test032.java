/* =======================================================
■■■ 실행 흐름의 컨트롤(제어문, 조건문과 반복문) ■■■
- if ~ else 문 실습
==========================================================*/
/*
사용자로부터 임의의 두 정수와 연산자를 입력받아
해당 연산자의 연산 처리 결과를 출력하는 프로그램을 구현한다.
단, if 조건문을 활용하여 처리할 수 있도록 하며,
연산 결과는 편의상 정수형으로 처리될 수 있도록 한다.

실행 예)
첫 번째 정수 입력 : 20
두 번째 정수 입력 : 14
연산자 입력[+ - * /] : +

>> 20 + 14 = 34
계속하려면 아무 키나 누르세요...
*/

//주석처리
// /**/안에 /**/ 못함!!

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test032
{
	public static void main(String[] args) throws IOException //BufferedReader의 리드라인때문에 써줌
	{
		/* 방법 ① 기본풀이
		//주요 변수 선언
		int num1, num2;
		char O;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//연산 및 처리
		System.out.print("첫 번째 정수 입력 : ");
		num1 = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 : ");
		num2 = Integer.parseInt(br.readLine());
		//"1234"-> Integer.parseInt() -> 1234
		//"abcd" -> Integer.parseInt() -> (변환 X, 숫자모양을 가지고 있어야 정수형태로 바꿔줌)

		
		System.out.print("연산자 입력[+ - * /] : ");
		O = (char)System.in.read();
		//        ============== 이 만큼은 int형 
		//read()메소드는 기본적으로 한 글자를 읽어오는 것이고, readLine()문자열을 읽어 오게 됨
		//System.in.skip(2); //값을 다시 입력하는 것이 아니니까 안써도 되고 실해되고 나면 값이 소멸됨!

		
		//if 및 결과 출력
		if(O == '+') //43==43
		{
			System.out.printf("\n>> %d + %d = %d\n",num1,num2,(num1 + num2));
		}else if(O == '-') //45==45
		{
			System.out.printf("\n>> %d - %d = %d\n",num1,num2,(num1 - num2));
		}else if(O == '*') //42==42
		{
			System.out.printf("\n>> %d * %d = %d\n",num1,num2,(num1 * num2));
		}else if(O == '/') //47==47
		{
			System.out.printf("\n>> %d / %d = %d\n",num1,num2,(num1 / num2));
		}else
		{
			System.out.printf("\n올바른 연산기호를 입력하십시오 \n");
		}
		*/

		/*
		// 방법 ② 연산자를 숫자로 취급
		//----check~!!
		int num1, num2, O;  //---- 첫 번째, 두 번째 정수, 그리고 연산자
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//연산 및 처리
		System.out.print("첫 번째 정수 입력 : ");
		num1 = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 : ");
		num2 = Integer.parseInt(br.readLine());
		//"1234"-> Integer.parseInt() -> 1234
		//"abcd" -> Integer.parseInt() -> (변환 X, 숫자모양을 가지고 있어야 정수형태로 바꿔줌)

		
		System.out.print("연산자 입력[+ - * /] : ");
		O = (char)System.in.read(); //문자열을 아스키코드값으로 가져오는 것 버퍼드 리더는 문자열을 고대로 가져오는 것

		//if 라인이 한줄일때는 블레이스 생략 가능한~! ----check~!!
		if(O == 43) //43==43
		
			System.out.printf("\n>> %d + %d = %d\n",num1,num2,(num1 + num2));
		else if(O == 45) //45==45
		
			System.out.printf("\n>> %d - %d = %d\n",num1,num2,(num1 - num2));
		else if(O == 42) //42==42
		
			System.out.printf("\n>> %d * %d = %d\n",num1,num2,(num1 * num2));
		else if(O == 47) //47==47
		
			System.out.printf("\n>> %d / %d = %d\n",num1,num2,(num1 / num2));
		else
		
			System.out.printf("\n올바른 연산기호를 입력하십시오 \n");
		
		*/

		// 방법 ③ : 출력구문을 하나로 만들 것
		int num1, num2, result = 0;
		char op;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//연산 및 처리
		System.out.print("첫 번째 정수 입력 : ");
		num1 = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 : ");
		num2 = Integer.parseInt(br.readLine());

		
		System.out.print("연산자 입력[+ - * /] : ");
		op = (char)System.in.read();

		//if 라인이 한줄일때는 블레이스 생략 가능한~! ----check~!!
		if(op == '+') //43==43
		
			result = num1 + num2;
		else if(op == '-') //45==45
		
			result = num1 - num2;
		else if(op == '*') //42==42
		
			result = num1 * num2;
		else if(op == '/') //47==47
		
			result = num1 / num2;
		//else ---check~!! else 없을려면 result 초기값 설정해줘야함!!!
		
		System.out.printf("\n>> %d %c %d = %d\n",num1, op,num2, result);
		

	}
}
/* 실행 결과
첫 번째 정수 입력 : 5
두 번째 정수 입력 : 2
연산자 입력[+ - * /] : +
>> 5 + 2 = 7
계속하려면 아무 키나 누르십시오 . . .

첫 번째 정수 입력 : 5
두 번째 정수 입력 : 2
연산자 입력[+ - * /] : -
>> 5 - 2 = 3
계속하려면 아무 키나 누르십시오 . . .

첫 번째 정수 입력 : 5
두 번째 정수 입력 : 2
연산자 입력[+ - * /] : *
>> 5 * 2 = 10
계속하려면 아무 키나 누르십시오 . . .

첫 번째 정수 입력 : 5
두 번째 정수 입력 : 2
연산자 입력[+ - * /] : /
>> 5 / 2 = 2
계속하려면 아무 키나 누르십시오 . . .

첫 번째 정수 입력 : 5
두 번째 정수 입력 : 2
연산자 입력[+ - * /] : d
올바른 연산기호를 입력하십시오
계속하려면 아무 키나 누르십시오 . . .
*/