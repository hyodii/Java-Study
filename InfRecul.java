public class InfRecul
{
	public static void main(String[] args)
	{
		showHi(5);
	}

	/*----------------------------------------------------------------------
	public static void showHi(int cnt) //5
	{
		System.out.println("Hi~"); //showHi(5)
		showHi(cnt--);
		if(cnt==1)
			return;
	}

}

-------------------------------------------------------------------*/

/* 에러남
Hi~
Hi~
 :
 :

 왤까? -> 포스트픽스로 cnt-- 니까 계속 showHi(5)만 호출
*/
	/*----------------------------------------------------------------------
	//showHi(--cnt);로 바꿈
	public static void showHi(int cnt) //5
		{
			System.out.println("Hi~"); //showHi(5)
			showHi(--cnt);
			if(cnt==1)
				return;
		}

}
-------------------------------------------------------------------*/
/*
그런데 포스트픽스를 프리픽스로 바꿨는데도 에러나고 if 조건문을 확인할 일이 없음
*/

//showHi(--cnt);위치 바꿈
	public static void showHi(int cnt) //5
		{
			System.out.println("Hi~"); //showHi(5)
			
			if(cnt==1)
				return;
			showHi(--cnt);
		}

}
/*
Hi~
Hi~
Hi~
Hi~
Hi~
계속하려면 아무 키나 누르십시오 . . .

*/

