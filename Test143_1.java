/* ======================================
  ■■■ 예외(Exception) 처리 ■■■
=========================================*/
//p.414
//어려워도 당황하지마! 원래그래


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test143_1
{										//---------[예외 처리하는 방법 ①]: throws IOException로 던지기
	public static void main(String[] args) throws IOException
	{
		//BufferdReader 인스턴스 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 주요 변수 선언
		int a, b, c;


		//-----------------[예외 처리하는 방법 ②] : try-catch 구문에 문제될 부분 넣기
		/*
		try
		{
			System.out.print("첫 번째 정수 입력 : ");
			a = Integer.parseInt(br.readLine());
			System.out.print("두 번째 정수 입력 : ");
			b = Integer.parseInt(br.readLine());
			//error: unreported exception IOException; must be caught or declared to be thrown 
			//                  ---------------------

			c = a + b;

			System.out.println("결과 : " + c);


		}
		catch (IOException e)  //IOException을 이름붙여서(e)
		{
			// IOExcepiton → checked exception
			//-- 메소드를 정의하는 과정에서 throws 한 예외
			// 잡아내거나 던지지 않을 경우 컴파일 에러 발생.
			System.out.println(e.toString());   //별도로 처리하겠다! 여기선 toString 함
		}
		*/

		
		//----------------- [예외 처리하는 방법 ③] : 숫자형태 이외에 값 입력
		/*
		try
		{
			System.out.print("첫 번째 정수 입력 : ");
			a = Integer.parseInt(br.readLine());
			System.out.print("두 번째 정수 입력 : ");
			b = Integer.parseInt(br.readLine());
			
			c = a + b;

			System.out.println("결과 : " + c);


		}
		catch (IOException e1)  //IOException을 이름붙여서(e)
		{
			// IOExcepiton → checked exception
			//-- 메소드를 정의하는 과정에서 throws 한 예외
			// 잡아내거나 던지지 않을 경우 컴파일 에러 발생.
			System.out.println(e1.toString());   //별도로 처리하겠다! 여기선 toString 함
		}
		catch(NumberFormatException e2)
		{
			System.out.println(e2.toString());
			System.out.println("숫자 형태의 데이터를 입력해야 합니다~!!!");
		}
		
		// catch 되서 처리되고 있음!
		//첫 번째 정수 입력 : abc
		//java.lang.NumberFormatException: For input string: "abc"
		//숫자 형태의 데이터를 입력해야 합니다~!!!
		//계속하려면 아무 키나 누르십시오 . . .
		*/

		//----------------- [예외 처리하는 방법 ④] : catch 안에 한번에 처리 e.printStackTrace()사용
		/*
		try
		{
			System.out.print("첫 번째 정수 입력 : ");
			a = Integer.parseInt(br.readLine());
			System.out.print("두 번째 정수 입력 : ");
			b = Integer.parseInt(br.readLine());
			//error: unreported exception IOException; must be caught or declared to be thrown 
			//                  ---------------------

			c = a + b;

			System.out.println("결과 : " + c);


		}
		catch (IOException e)  //IOException을 이름붙여서(e)
		{
			System.out.println(e.toString());   //별도로 처리하겠다! 여기선 toString 함
			System.out.println(e.getMessage());

			System.out.println("pringStackTrace...");
			e.printStackTrace();
		}
		*/

		//----------------- [예외 처리하는 방법 etc...]s : finally사용
		try
		{
			System.out.print("첫 번째 정수 입력 : ");
			a = Integer.parseInt(br.readLine());
			System.out.print("두 번째 정수 입력 : ");
			b = Integer.parseInt(br.readLine());
			//error: unreported exception IOException; must be caught or declared to be thrown 
			//                  ---------------------

			c = a + b;

			System.out.println("결과 : " + c);


		}
		catch (IOException e)  //IOException을 이름붙여서(e)
		{
			// IOExcepiton → checked exception
			//-- 메소드를 정의하는 과정에서 throws 한 예외
			// 잡아내거나 던지지 않을 경우 컴파일 에러 발생.
			System.out.println(e.toString());   //별도로 처리하겠다! 여기선 toString 함
		}

		finally  //check~!!!
		{
			// 예외가 발생하거나 발생하지 않거나...
			// 언제나 실행되는 영역~!!!

			System.out.println("고생 많으셨습니다. 점심 맛있게 먹읍시다.");
		}



	}
}
