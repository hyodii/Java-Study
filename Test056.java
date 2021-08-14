/* =======================================================
■■■ 실행 흐름의 컨트롤(제어문, 조건문과 반복문) ■■■
- 반복문(for문) 실습
- 별찍기 실습
==========================================================*/
/*
○ 과제
다음과 같은 내용이 출력될 수 있도록
반목문의 중첩 구문을 작성하여 프로그램을 구현한다.

실행 예)

----*
---**
--***
-****
*****

공백 4 3 2 1 0 
  별 1 2 3 4 5
*/


public class Test056
{
	public static void main(String[] args)
	{
		
		System.out.println("방법1");
		for (int i=0; i<5; i++)      // 행 0 1 2 3 4번 반복
		{
			for (int j = 4; j>=0; j--) //열  4 3 2 1 0
			{
				if(i<j) //0<4 0<3 0<2 0<1
					System.out.print("-"); //공백헷갈려서 -로 표현함 
				else //0<0
					System.out.print("*");
			}
			System.out.println();
		}
		
		
		System.out.println("방법2");
		for (int i=0; i<5;i++)
		{
			
			for (int j=4; j>i; j--)
			{
				System.out.print("-");

			}
			for (int k=0; k<i+1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}


	}
}
/*
방법1
----*
---**
--***
-****
*****
방법2
----*
---**
--***
-****
*****
계속하려면 아무 키나 누르십시오 . . .
*/