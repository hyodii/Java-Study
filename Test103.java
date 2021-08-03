// 실행 예)
// Source Data : 52 42 12 62 60
// Sorted Data : 12 42 82 60 62
// 계속하려면 아무 키나 누르세요....

public class Test103
{
	public static void main(String[] args)
	{
		int[] a = {52,42,12,62,60};

		System.out.print("Source Data : ");
		// 향상된 for 문(forEach 구문)  
		for (int n : a)
			System.out.print(n + " ");
		System.out.println();
		
		//Selection Sort
		for (int i=0; i<a.length-1; i++)
		{
			for (int j=i+1;j< a.length; j++)
			{
				if (a[i]>a[j])
				{
					a[i] = a[i]^a[j];
					a[j] = a[j]^a[i];
					a[i] = a[i]^a[j];
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


/*
		42 52 12 62 60     0   1
		== --
		12 52 42 62 60     0   2
		==    --
		12 52 42 62 60     0   3
		==       --
		12 52 42 62 60     0   4
		==          --
		-------------------------------------1회전  (가장작은수 젤 왼편 fix)
		12 42 52 62 60     1   2
		   == --
		12 42 52 62 60     1   3
		   ==    --
		12 42 52 62 60     1   4
		   ==       --
		-------------------------------------2회전  (42 fix)
		12 42 52 62 60     2   3
		      == --
		12 42 52 62 60     2   4
		      ==    --
		-------------------------------------3회전  (52 fix)
		12 42 52 60 62     3   4
		         == --
		-------------------------------------4회전  (62 fix)
*/
