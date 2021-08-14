/* =======================================================
■■■ 실행 흐름의 컨트롤(제어문, 조건문과 반복문) ■■■
- 반복문(for문) 실습
==========================================================*/

/*
1부터 100까지의 정수 중에서
4의 배수만 출력하는 프로그램을 구현한다.
단, for문을 활용해야하며,
한 줄에 5개씬 출력할 수 있도록 한다.

실행 예)
 4   8  12  16  20
24  28  32  36  40
        :
계속하려면 아무 키나 누르세요...
*/

public class Test053
{
	
	public static void main(String[] args)
	{
		
		/*----------------------------------------------------------------------

		int i;
		
		for (i=1; i<=100; i++)
		{
			if (i%4==0)
			{
				System.out.printf("%d ",i);

			}
			if (i%20==0)
			{
				System.out.println("");
			}
				
		}

실행 결과
4 8 12 16 20
24 28 32 36 40
44 48 52 56 60
64 68 72 76 80
84 88 92 96 100
계속하려면 아무 키나 누르십시오 . . .

		-------------------------------------------------------------------*/

		/*----------------------------------------------------------------------

		int count = 0;

		//	4 의배수 출력 변수, 4의배수 판별조건식, 1~100까지의 루프변수
		for (int i = 1; i<=100; i++)
		{

			if (i%4==0)
			{
				System.out.printf("%d	", i);
				count++;
			}

			if (count == 5)
			{
				System.out.println("");
				count = 0;
			}

		}
		-------------------------------------------------------------------*/
		
		
		for(int n=4; n<=100; n+=4)  //4의 배수만 몽땅 다 찍고
		{
			
			System.out.printf("%4d",n); //---> %4d 4자리확보
			if (n%(4*5)==0) //n이 20의 배수가 될 때 
				System.out.println(); //개행
		}

		System.out.println();

	}
}

/*
   4   8  12  16  20
  24  28  32  36  40
  44  48  52  56  60
  64  68  72  76  80
  84  88  92  96 100

계속하려면 아무 키나 누르십시오 . . .
*/