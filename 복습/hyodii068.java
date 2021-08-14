/* ====================================
■■■ 클래스와 인스턴스 ■■■
=======================================*/

/*
사용자로부터 임의의 두 정수와 연산자를 입력받아
사친연산을 수행하는 프로그램을 구현한다.
단, 클래스와 인스턴스의 개념을 활용하여 작성할 수 있도록 한다.

실행 예)
임의의 두 정수 입력(공백 구분) : 10 5
임의의 연산자 입력(+ - * /)    : +
>> 10 + 5 = 15
계속하려면 아무 키나 누르세요...

*/

import java.util.Scanner;
import java.io.IOException; // System.in.read때문에 사용

class Calculate
{
	int a,b;
	char c;

	void input() throws IOException  // System.in.read때문에 사용
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("임의의 두 정수 입력(공백 구분) : ");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.print("임의의 연산자 입력(+ - * /)    :");
		c = (char)System.in.read();
	}

	double cal()
	{
		double res=0;
		if(c=='+')
			res = a + b;
		else if(c=='-')
			res = a - b;
		else if(c=='*')
			res = a * b;
		else if(c=='/')
			res = a / b;
		return res;			
	}

	void print(double r)
	{
		System.out.printf(">> %d %c %d = %.2f\n",a,c,b,r);
	}

}

public class hyodii068
{
	public static void main(String[] args) throws IOExceptiond  // System.in.read때문에 사용
	{
		Calculate ob = new Calculate();
		ob.input();
		double c = ob.cal();
		ob.print(c);
	}
}
/*
임의의 두 정수 입력(공백 구분) : 5 2
임의의 연산자 입력(+ - * /)    :-
>> 5 - 2 = 3.00
계속하려면 아무 키나 누르십시오 . . .
*/