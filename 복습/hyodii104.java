public class hyodii104
{
	public static void main(String[] args)
	{
		int[] a = {52,42,12,62,60};

		System.out.print("Source Data : ");
		// 향상된 for 문(forEach 구문)  
		for (int n : a)
			System.out.print(n + " ");
		System.out.println();


		// Bubble Sort
		int i=0;
		for (i=1; i<a.length;i++ )  // 뒤에서 비교 대상을 하나씩 줄여주는 역할
		{
			for (int j=0; j<a.length-i;j++ )   //--check~!! a.length-i
			{
				if (a[j]>a[j+1])
				{
					a[j] = a[j]^a[j+1];
					a[j+1] = a[j+1]^a[j];
					a[j] = a[j]^a[j+1];
				}
			}
		}
		System.out.print("Sorted Data : ");
		for (int n : a )
			System.out.print(n + " ");
		System.out.println();
	}
}
/*
Source Data : 52 42 12 62 60
Sorted Data : 12 42 52 60 62
계속하려면 아무 키나 누르십시오 . . .
*/

/* 버블소트는 인접해있는 것들끼리 비교

		42 52 12 62 60     0   1            기준(=) 0 1 2 3
		== --
		42 12 52 62 60     1   2
		   == --
		42 12 52 62 60     2   3
		      == --
		42 12 52 60 62     3   4
		         == --
		-------------------------------------1회전  (가장 큰수 젤 오른쪽fix)
		12 42 52 60 62     0   1             기준(=) 0 1 2 
		== --
		12 42 52 60 62     1   2
		   == --
		12 42 52 60 62     2   3
		      == --
		-------------------------------------2회전  (그래서 2회전때 62까지안감 60까지 자리잡음)
		12 42 52 60 62     0   1             기준(=) 0 1
		== --
		12 42 52 60 62     1   2
		   == --
		-------------------------------------3회전  (52 자리잡음)
		12 42 52 60 62     0   1             기준(=) 0
		== --
		-------------------------------------4회전  (42 자리잡음)
		
*/