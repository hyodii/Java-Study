/* ======================================
  ■■■ 예외(Exception) 처리 ■■■
=========================================*/

// Test146.java 파일과 비교~!!!  예외를 발생시켜서 해결!

class Demo2
{
	private int value;

	public void setValue(int value) throws Exception   //check~!!!   Exception 은 lang패키지에 있어서 import생략 가능한~!
	{
		if(value<=0)
		{
			// 예외 생성(발생) - 폭발물 제작을 여기서 한 것!
			throw new Exception("value 는 0보다 작거나 같을 수 없습니다.");
			// throw 예외를 발생시킬때 사용하는 키워드!!   ==> 이렇게 실행하면 에러! throws Exception 작성해줘야함!!
		}

		this.value = value;
	}

	public int getValue()
	{
		return value;
	}
}

public class Test147
{
	public static void main(String[] args) //throws Exception   //check~!!!  이렇게 해주던지 아니면 try-catch로 잡아내!
	{
		Demo2 ob = new Demo2();

		try
		{
			ob.setValue(-3);
			int result = ob.getValue();
			System.out.println(result);
		}
		catch (Exception e)  // checked Exception
		{
			System.out.println(e.toString());
		}
		
	}
}
/*
java.lang.Exception: value 는 0보다 작거나 같을 수 없습니다.
계속하려면 아무 키나 누르십시오 . . .
*/