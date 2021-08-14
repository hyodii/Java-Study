/* ======================================
■■■ 정렬(sort) 알고리즘 ■■■
- 향상된 버블 정렬(Bubble Sort)
=========================================*/

/*
※ 앞에서 확인해 본 Selection Sort(Test103) 나 Bubble Sort(Test104)의 성능은 같다.
	(-> 반복의 획수로 추정)
	하지만, 향상된 Bubble Sort는 대상 데이터의 구조에 따라서
	일단 Bubble Sort 나 Selestion Sort 보다 성능이 좋을 수 있다.

원본 데이터 : 61 15 20 22 30
			  15 20 22 30 61   - 1회전 (스왑 발생 -> true) -> 다음 회전 진행 ○
			  15 20 22 30 61   - 2회전 (스왑 발생 -> false) -> 다음 회전 진행 X

==> 1회전 수행...2회전 수행...을 해보았더니
	2회전에서 스왑(자리바꿈)이 전혀 일어나지 않았지 대문에
	불필요한 추가 연산(더 이상의 회전)은 무의미한 것으로 판단하여
	수행하지 않는다.
*/

// 실행 예)
// Source Data : 10 50 20 30 40
// Sorted Data : 10 20 30 40 50
// 계속하려면 아무키나 누르세요...

public class Test105
{
	public static void main(String[] args)
	{

		int[] a = {10, 50, 20, 30, 40};

		/*
		10 50 20 30 40     0    1
		== --
		10 20 50 30 40     1    2
		   == --
		10 20 30 50 40     2    3
			  == --
		10 20 30 40 50     3    4
				 == --
		---------------------------- 1회전 -> 스왑 발생
		10 20 30 40 50     0    1
		== --
		10 20 30 40 50     1    2
		   == --
		10 20 30 40 50     2    3
		      == --
		---------------------------- 2회전 -> 스왑 발생하지 않음
			X
			X
		---------------------------- 3회전 -> X
			X
		---------------------------- 4회전 -> X
		*/

		System.out.print("Source Data : ");
		for(int n : a)
			System.out.print(n + " ");
		System.out.println();
		
		boolean flag;
		int temp;
		int pass=0;
		
		
		do
		{
			flag = false;
			pass++;

			
			int i=0;
			for (i=1; i<a.length-pass; i++)
			{					
				
				//테스트
				//System.out.print(i + "쑝");

				if (a[i]>a[i+1])  // 01 12 23 34
								  // 01 12 23
								  // 01 12
								  // 01
				{
					//자리바꾸기
					temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
					
					flag = true;
					//-- 단 한 번이라도 스왑(자리바꿈)이 발생하게 되면
					//	flag 변수는 true로 변경~!!!
				}
			}
			
			System.out.println("웅~!!");	//2회전 웅 웅~
		}
		while (flag);
		//-- flag 변수가 false라는 것은
		// 회전이 구분적으로 발생하는 동안 스왑이 일어나지 않은 경우로
		// 더 이상의 반복문 수행은 무의미한 것으로 판단 가능~!!!

		
		/*----------------------------------------------------------------------
		int i=0;
		for (i=1; i<a.length; i++)         
		{
			flag = false;
			for (int j=0; j<a.length-i;j++)
			{
				if (a[j]>a[j+1]) 
				{
					a[j] = a[j]^a[j+1];
					a[j+1] = a[j+1]^a[j];
					a[j] = a[j]^a[j+1];

					flag = true;
				}
				//테스트
				System.out.print(j + " ");

				if(j==a.length-i-1 && flag==false)
					break;
			}
		}
		-------------------------------------------------------------------*/
	
		System.out.print("Sorted Data : ");
		for(int n : a)
			System.out.print(n + " ");
		System.out.println();
		
	}

}
/*
Source Data : 10 50 20 30 40
웅~!!
웅~!!
Sorted Data : 10 20 30 40 50
계속하려면 아무 키나 누르십시오 . . .
*/


//삽입, 힙, 쉘 정렬도 찾아서 구현해보기!!