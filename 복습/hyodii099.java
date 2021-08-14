//메소드 오버로딩/ 오버라이딩은 면접 단골 문제이기 때문에 말로 설명할수 있어야함!!

/*
○  메소드 오버로딩(Method Overloading) 개요

 	메소드 오버로딩이란
	메소드가 처리하는 기능은 같고,
	메소드 괄호 속에 오는 인수(인자, 매개변수, 파라미터)의 갯수가 다르거나
	자료형(Date Type)이 다른 경우
	메소드의 이름을 동일한 이름으로 부여하여 메소드를 정의할 수 있도록
	문법적으로 허용하게 되는데
	이를 메소드 오버로딩(Method Overloading)이라고 한다.

*/
public class hyodii099
{
	public static void main(String[] args)
	{
		drawLine();

		drawLine('+');

		drawLine('/',50);

		drawLine('+',50);
	}

	public static void drawLine()
	{
		System.out.println("==================");
	}

	public static void drawLine(char c)
	{
		for (int i=0; i<20; i++)
			System.out.print(c);
		System.out.println();
	}

	public static void drawLine(char c, int n)
	{
		{
			for (int i=0; i<n; i++)
				System.out.print(c);
			System.out.println();
		}
	}
}
/*
==================
++++++++++++++++++++
//////////////////////////////////////////////////
++++++++++++++++++++++++++++++++++++++++++++++++++
계속하려면 아무 키나 누르십시오 . . .

*/
