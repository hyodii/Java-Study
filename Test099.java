public class Test099
{
	public static void main(String[] args)
	{
		drawLine();
		//--==>> ====================
		drawLine('+');
		//--==>> ++++++++++++++++++++

		drawLine('>');
		//--==>> >>>>>>>>>>>>>>>>>>>>
	}

	// 선을 그리는 메소드 정의
	public static void drawLine()
	{
		System.out.println("====================");	
	}

	// 선의 형태를 바꾸어 그리는 메소드 정의    ====> 이거는 메소드 오버로딩이 아니다!
	/*
	public static void drawLine()
	{
		System.out.println("++++++++++++++++++++")
	}
	*/

	public static void drawLine(char c)
	{
		for (int i=0; i<20; i++)
		{
			System.out.print(c);
		}
		System.out.println();	
	}
}
