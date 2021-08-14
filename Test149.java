/* ======================================
  ■■■ 예외(Exception) 처리 ■■■
=========================================*/

// 다른 예외 다시 던진다

public class Test149
{
	public int getValue(int value)  throws Exception            // ⑦ 예외 던지기(파란 폭발물)
	{
		int a = 0;

		try
		{
			a = getData(-2);									//③ 예외 발생	
		}														//   빨간 폭발물
		catch (Exception e)										//④ 예외 잡아내기
		{														//   빨간 폭발물
			// ⑤ 예외 처리(빨간 폭발물)
			System.out.println("printStackTrace..............");
			e.printStackTrace();
			
			// ⑥예외 생성
			throw new Exception("value 가 음수입니다.");        
			// 아까는 같은 e던지는 거였는데 지금은 새로운 예외 발생!
			// (파란 폭발물)
		}

		return a;
	}

	public int getData(int data) throws Exception                //② 예외 던지기
	{															 //   빨간 폭발물
		if(data<0)
			throw new Exception("date 가 0 보다 작습니다.");     //① 예외 발생
																 //   빨간 폭발물
		return data + 10;
	}
	
	public static void main(String[] args)      // ⑨
	{
		Test149 ob = new Test149();

		try
		{
			int a = ob.getValue(-1);                                //⑧ 예외 발생 //파란 폭발물
			System.out.println("a: " + a);
		}
		catch (Exception e)								     		// ⑨ 예외 잡아내기  //파란 폭발물
		{
			// ⑩ 예외 처리(파란 폭발물)
			System.out.println("printStackTrace..............");
			e.printStackTrace();
		}
		
	}
}


/*
e.getMessage() = 에러 이벤트와 함께 들어오는 메세지를 출력한다.

e.toString() = 에러 이벤트의 toString()을 호출해서 간단한 에러 메시지를 확인한다.

e.printStackTrace() = 에러 메세지의 발생 근원지를 찾아서 단계별로 에러를 출력한다.

*/