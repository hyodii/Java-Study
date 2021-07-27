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

import java.io.IOException;
import java.util.Scanner;

class Calculate
{
	//주요 변수 선언
	int n1, n2;   //사용자로부터 입력받은 두 정수를 담아둘 변수
	char op;      //사용자로부터 입력받은 연산자를 담아둘 변수
	
	Calculate() //컴파일하는 과정에서 사용자정의 생성자가 없다면 자동으로 삽입이 됨

	{
		
	}

	void input() throws IOException   // System.in.read때문에 사용
	{
		//int n1, n2; 위에 선언했기 때문에 또해줄 필요없음!!! -> 이거때매 계속 >> 0 + 0 = 0.00에러남 -_ㅠ
		Scanner sc = new Scanner(System.in);
		System.out.print("임의의 두 정수 입력(공백 구분) : "); //Scanner쓰면 토큰을 분할해서 받아올 수 있음
		//sc = new Scanner(sc.next()).useDelimiter("\\s*,\\s*");
		n1 = sc.nextInt();
		n2 = sc.nextInt();

		System.out.print("임의의 연산자 입력(+ - * /)    : ");
		op = (char)System.in.read();
	}

	double cal()
	{
		int res=0;

		switch(op)
		{
			case '+' : res = n1 + n2; break;
			case '-' : res = n1 - n2; break;
			case '*' : res = n1 * n2; break;
			case '/' : res = n1 / n2; break;
		}
					
		return res;
	}

	void print(double res)
	{
		System.out.printf(">> %d %c %d = %.2f\n",n1,op,n2,res);		
	}

}

public class Test068
{
	public static void main(String[] args) throws IOException
	{
		//Calculate 클래스 인스턴스 생성
		Calculate ob = new Calculate();
						   //Calculate()이걸 정의한적 없는데 데려올수 있어? -> 27번 라인 확인!!
		ob.input();

		double res = ob.cal();

		ob.print(res);
	}
}
/*
임의의 두 정수 입력(공백 구분) : 10 5
임의의 연산자 입력(+ - * /)    : /
>> 10 / 5 = 2.00
계속하려면 아무 키나 누르십시오 . . .
*/
