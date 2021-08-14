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

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

public class hyodii032
{
	public static void main(String[] args) throws IOException
	{
		
		System.out.println("===========[Scanner 이용]============");
		Scanner sc = new Scanner(System.in);
		int n1, n2, res=0;
		char c;

		System.out.print("첫 번째 정수 입력 : ");
		n1 = sc.nextInt();
		System.out.print("두 번째 정수 입력 : ");
		n2 = sc.nextInt();
		System.out.print("연산자 입력[+ - * /] : ");
		c = sc.next().charAt(0);

		if (c == '+')
			res = n1 + n2;
		else if(c == '-')
			res = n1  -n2;
		else if(c =='*')
			res =  n1 * n2;
		else if (c =='/')
			res = n1 / n2;

		System.out.println();
		System.out.printf(">> %d %c %d = %d\n",n1,c,n2,res);

		System.out.println("===========[BufferedReader 이용]============");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("첫 번째 정수 입력 : ");
		n1 = Integer.parseInt(br.readLine());
		System.out.print("두 번째 정수 입력 : ");
		n2 = Integer.parseInt(br.readLine());
		System.out.print("연산자 입력[+ - * /] : ");
		c = (char)System.in.read();
		//        ============== 이 만큼은 int형 
		//read()메소드는 기본적으로 한 글자를 읽어오는 것이고, readLine()문자열을 읽어 오게 됨
		//System.in.skip(2); //값을 다시 입력하는 것이 아니니까 안써도 되고 실해되고 나면 값이 소멸됨!


		if (c == '+')
			res = n1 + n2;
		else if(c == '-')
			res = n1  - n2;
		else if(c =='*')
			res =  n1 * n2;
		else if (c =='/')
			res = n1 / n2;
		//else ---check~!! else 없을려면 result 초기값 설정해줘야함!!!

		System.out.println();
		System.out.printf(">> %d %c %d = %d\n",n1,c,n2,res);
	}
}
/*
===========[Scanner 이용]============
첫 번째 정수 입력 : 5
두 번째 정수 입력 : 2
연산자 입력[+ - * /] : +

>> 5 + 2 = 7
===========[BufferedReader 이용]============
첫 번째 정수 입력 : 2
두 번째 정수 입력 : 5
연산자 입력[+ - * /] : *

>> 2 * 5 = 10
계속하려면 아무 키나 누르십시오 . . .
*/
