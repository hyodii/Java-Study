/* ====================================
■■■ 클래스와 인스턴스 ■■■
=======================================*/

/*
사용자로부터 임의의 정수를 입력받아
1부터 입력받은 수 까지의 합을 연산하여
결과값을 출력하는 프로그램을 구현한다.

단, 클래스와 인스턴스의 개념을 활용하여 처리할 수 있도록 한다.
또한, 입력 처리 과정에서 BufferedReader를 활용하며,
입력 데이터가 1 보다 작거나 1000 보다 큰 경우
다시 입력받을 수 있는 처리를 포함하여 프로그램을 구현할 수 있도록 한다.

실행 예)
임의의 정수 입력(1~1000) : 1022
임의의 정수 입력(1~1000) : -20
임의의 정수 입력(1~1000) : 100
>> 1 ~ 100 까지의 합 : 5050
계속하려면 아무 키나 누르세요...
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Hap
{
	int n;  //입력받을 정수 값 (전역 변수)

	//입력기능
	void input() throws IOException
	{                       //실제 인스턴스를 생성하는 구문 new
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		do
		{
			System.out.print("임의의 정수 입력(1~1000) : ");
			n = Integer.parseInt(br.readLine());
		}
		while (n<1 || n>1000);	
		
	}

	//누적합 연산 처리 메소드 정의
	int cal()
	{
		// 결과값으로 반환하게 될 변수 선언 및 초기화
		int result = 0;  //값이 없을 때 초기화해놓으면 에러가 발생안해서 초기화함!
		for (int i=1; i<=n;i++ )
		{
			result += i;

		}
		// 최종 결과 값 반환
		return result;   //위치 check~!!
	}  
	
	//출력기능
	void print(int cal)  //결과 출력()  -> 누적합 매개변수로 받아줘야함
	                     //메소드의 값을 반환할 수 있는 방법은 return 뿐
						 //반환 값이 없고 그냥 출력하기때문에 void
	{
		System.out.printf(">> 1 ~ %d 까지의 합 : %d\n",n,cal);
	}
}

//import java.io.IOException;   ----->  클래스 사이에 import쓰는거 아님!! 클래스 이전에 모든 import구문 쓴다!(제일 위)

public class Test067
{
										    //예외처리 CircleTest에서도 했지만 main에 나와도
										    // main안에 CircleTest가 있는 것이므로 여기서도 예외처리 해줘야!
	public static void main(String[] args) throws IOException
	{
		//Hap클래스 인스턴스 생성
		Hap ob = new Hap();  ////Hap 메모리를 생성해서 ob라는 참조변수를 만들었음
		//생성된 인스턴스 ob를 통해 정수 입력 메소드 호출
		
		ob.input(); //리턴자료형이 void면 = 으로 받을꺼 없음

		//생성된 인스턴스 ob를 통해 누적합 연산 메소드 호출
		int cal = ob.cal();
		
		//생성된 인스턴스 ob를 통해 출력 메소드 호출
		ob.print(cal);


	}
}
/*
임의의 정수 입력(1~1000) : 0
임의의 정수 입력(1~1000) : -20
임의의 정수 입력(1~1000) : 1005
임의의 정수 입력(1~1000) : 100
>> 1 ~ 100 까지의 합 : 5050
계속하려면 아무 키나 누르십시오 . . .
*/

