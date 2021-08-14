/* ======================================
■■■ 클래스 고급 ■■■
- 상속(Inheritance)
=========================================*/
/*
다음과 같은 프로그램을 구현한다.
단, 상속의 개념을 적용하여 작성할 수 있도록 한다.

실행 예)
임의의 두 정수 입력(공백 구분) : 20 15
연산자 입력(+ - * /) : -
>> 20 - 15 = 5.00
계속하려면 아무 키나 누르세요...
*/
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

//super class
class Aclass
{
	protected int x, y;
	protected char op;

	Aclass()
	{
		
	}

	void write(double result)
	{
		System.out.printf(">> %d %c %d = %.2f%n", x,op,y,result);
	}
}


// sub class -> Aclass 를 상속받는 클래스
class Bclass extends Aclass
{
	/* 이렇게 상속받음

	protected int x, y;
	protected char op;


	// 생성자는 상속안됨! 그러나 생성자가 만들어지지 않아도 이게 만들어짐
	//Bclass()
	//{
	//	 super();
	//}
	//


	void write(double result)
	{
		System.out.printf(">> %d %c %d = %.2f%n", x,op,y,result);
	}
	*/

	
	// 입력 
	boolean input()  throws IOException   //원래는 void 해도됨 새로운 방법
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //원래는 Scanner 사용하는데 버퍼드로 문자열자르는거 해볼것!

		System.out.print("임의의 두 정수 입력(공백 구분) : ");  // : 20 15
		String temp = br.readLine();     // "20 15"
		String[] strArr = temp.split("\\s"); //구분자 -> 공백
		// String[] strArr = {"20", "15"};


		// ※ 문자열.split("구분자")
		//		ex) "10 20 30 40".split("\\s");    //원래 \s가 공백!
		//		-> {"10", "20", "30", "40"} 반환

		if(strArr.length != 2)
			return false;
		//-- false를 반환하며 input()메소드 종료
		//	이 조건을 수행할 경우....
		//	이 코드의 아래에 수행해야 할 코드가 남아있더라도
		//	결과값을 반환하며 메소드는 종료된다~!!

		x = Integer.parseInt(strArr[0]);
		y = Integer.parseInt(strArr[1]);

		System.out.print("연산자 입력(+ - * /) : ");
		op = (char)System.in.read();
		
		/*
		// 논리연산자 부정  &&
		if(op != '+' && op != '-' && op != '*' && op != '/')
		{
			return false;
		}

		return true;
		*/
			
		
		// 논리연산자 ||  => true false 부분도 바꿔써야함!!ㄴ
		if(op=='+' || op=='-' || op=='*' || op=='/')
		{
			return true;  //-- check~!!
		}

		return false;    //-- check~!!
		

	}// end input()

	double calc()
	{
		double result = 0;
		
		switch(op)
		{
			case '+' : result = x + y; break;
			case '-' : result = x - y; break;
			case '*' : result = x * y; break;
			case '/' : result = (double)x / y; break;  //나누기는 결과가 실수니까 한쪽에 double 붙여주기!

		}

		return result;

	}//end calc()
	
	
	/* 내가 푼것...
	private int x, y;
	private char op;
	private double result;

	
	public void calc(char op)
	{
		if (op=='+')
		{
			result = x + y;
		}
		if (op=='-')
		{
			result = x - y;
		}
		if (op=='*')
		{
			result = x * y;
		}
		if (op=='/')
		{
			result = x / y;
		}

	}

	@Override
	void write(double result)
	{
		System.out.printf(">> %d %c %d = %.2f%n", x,op,y,result);
	}
	*/


}// end Bclass

// main() 메소드를 포함하는 외부의 다른 클래스
public class Test109
{
	public static void main(String[] args) throws IOException
	{
		Bclass ob = new Bclass();

		if (!ob.input())
		{
			System.out.println("Error...");
			return; // 프로그램 종료
		}

		double result = ob.calc();

		ob.write(result);

	}//end main()
}//end class Test109

/*
임의의 두 정수 입력(공백 구분) : 20 15
연산자 입력(+ - * /) : +
>> 20 + 15 = 35.00
계속하려면 아무 키나 누르십시오 . . .

임의의 두 정수 입력(공백 구분) : 20 15
연산자 입력(+ - * /) : -
>> 20 - 15 = 5.00
계속하려면 아무 키나 누르십시오 . . .

임의의 두 정수 입력(공백 구분) : 20 15
연산자 입력(+ - * /) : *
>> 20 * 15 = 300.00
계속하려면 아무 키나 누르십시오 . . .

임의의 두 정수 입력(공백 구분) : 20 15
연산자 입력(+ - * /) : /
>> 20 / 15 = 1.33
계속하려면 아무 키나 누르십시오 . . .
*/