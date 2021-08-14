/* ====================================
■■■ 클래스와 인스턴스 ■■■
=======================================*/

// ※ Test066.java 파일과 세트~!!!

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class CircleTest //원 클래스 설계
{
	// 주요 속성
	int r;                       //원의 반지름
	final double PI = 3.141592;  //원주율 (파이널을 통해서 변수의 상수화)  //double형 체크(밑에 전반적으로 다 반환형 다 체크!!)

	// 기능(동작, 행위)
	// 반지름 입력 기능
	void input() throws IOException
	{
							//실제 인스턴스를 생성하는 구문 new
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("반지름 입력 : ");
		r = Integer.parseInt(br.readLine());
	}
	// 넓이 연산 기능
	double calArea()  //원의 넓이
	{
		double result = 0; //값이 없을 때 초기화해놓으면 에러가 발생안해서 초기화함!
		result = r * r * PI;
		return result;
		
	}
	// 둘레 연산 기능
	double calLength() //원의 둘레
	{
		double result = 0;
		result = r * 2 * PI;
		return result;		
	}
	// 출력 기능
	void print(double a, double l)
	{
		System.out.printf("\n반지름이 %d인 원의\n",r);
		System.out.printf("넓이 : %.2f\n", a);
		System.out.printf("둘레 : %.2f\n" ,l);
	}
}