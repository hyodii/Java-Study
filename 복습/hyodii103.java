// ���� ��)
// Source Data : 52 42 12 62 60
// Sorted Data : 12 42 82 60 62
// ����Ϸ��� �ƹ� Ű�� ��������....

public class hyodii103
{
	public static void main(String[] args)
	{
		int[] a = {52,42,12,62,60};

		System.out.print("Source Data : ");
		// ���� for ��(forEach ����)  
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
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
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
		-------------------------------------1ȸ��  (���������� �� ���� fix)
		12 42 52 62 60     1   2
		   == --
		12 42 52 62 60     1   3
		   ==    --
		12 42 52 62 60     1   4
		   ==       --
		-------------------------------------2ȸ��  (42 fix)
		12 42 52 62 60     2   3
		      == --
		12 42 52 62 60     2   4
		      ==    --
		-------------------------------------3ȸ��  (52 fix)
		12 42 52 60 62     3   4
		         == --
		-------------------------------------4ȸ��  (62 fix)
*/