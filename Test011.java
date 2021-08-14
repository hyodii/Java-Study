/* =================================================
■■■ 자바 기본 프로그래밍 ■■■
- 변수와 자료형
- 자바의 기본 입출력 : BufferedReader 클래스
===================================================*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test011
{
	public static void main(String[]args) throws IOException //입출력 문제가 발생하면 조취를 취하는(throws 던져)명령어
	{
		//자바에 키보드를 연결하는 부분
		//키보드는 각각의 바이트 스트림으로 입력됨 
		//키보드를 통해 눌려오는 특정 입력값을 가져오는게 System.in
		//문자를 읽어오는 장치(바이트를 입력해서 문자로 변환(키보드가 넘겨주는 키값을)) 우측부터 읽으삼 
		
		//BufferedReader 인스턴스 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int r;
		final double PI = 3.14;
		double a, b;

		//위에 애들처럼 자료형이 정해진게 아니기 때문에 만들어야함
		//그래서 맨위에 import 경로안에 설계도있어 그러니까 가서 보고 메모리공간 확보해
		//BufferedReader br = new BufferedReader;

		//연산 및 처리
		//① 사용자에게 안내 메세지 출력
		System.out.print("원의 반지름 입력 : ");

		//②사용자가 입력한 값을 받아와 반지름 변수 r 에 담아내
		//br 안에 readLine이라는 함수(메소드)를 가지고 사용자가 입력한 값을 얻어서 담음
		//r = br.readLine(); ->이거는 throws없으면 실행 안댐
		//r = "20"; -> 이러면 int에 문자열 넣는거여서 안됨

		//Integer.parseInt() -> 매개변수로 넘겨받은 문자열 데이터를 정수형으로 변환
		r = Integer.parseInt(br.readLine());
		//r = Inter.parseInt("20");
		//r = 20;
		// 사용자가 입력한 값을 BufferedReader(br)의 readLine() 메소드를 활용하여 문자열 형태로 읽어들인 후
		// 그 값을 Integer.parseInt() 를 통해 숫자형(정수형)으로 변환한 후 정수 형태의 반지름 변수 r에 담아내기

		//③ 넓이 및 둘레 연산
		a = r * r * PI;
		b = r * 2 * PI;
		
		//결과 출력
		System.out.println(">> 넓이 : " + a);
		System.out.println(">> 둘레 : " + b);

		System.out.printf(">> 넓이 : %f\n", a);
		System.out.printf(">> 둘레 : %f\n", b);

		System.out.printf(">> 넓이 : %.2f\n", a);
		System.out.printf(">> 둘레 : %.2f\n", b);
		//%f는 서식 출력용 메소드에서 실수형을 담아내는 옵션 문다
		//%.2f는 소수점 이하 둘째자리까지 표현하겠다는 의미 3번째에서 반올림됨


	}
}

/*
원의 반지름 입력 : 25
>> 넓이 : 1962.5
>> 둘레 : 157.0
>> 넓이 : 1962.500000
>> 둘레 : 157.000000
>> 넓이 : 1962.50
>> 둘레 : 157.00
계속하려면 아무 키나 누르십시오 . . .

*/