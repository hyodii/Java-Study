/*
�迭�� �迭(������ �迭)�� Ȱ���Ͽ�
������ ���� �����͸� ��ҷ� ���ϴ� �迭�� �����ϰ�
�� ����� ����ϴ� ���α׷��� �����Ѵ�.

 n
  ��
   1  2  3  4  5        i=0  n=1  0���� ��� [0][0] ~ [0][4]
   5  1  2  3  4        i=1  n=1  1���� ��� [1][1] ~ [1][4]  [1][0]
   4  5  1  2  3        i=2  n=1  2���� ��� [2][2] ~ [2][4]  [2][0]
   3  4  5  1  2        i=3  n=1  3���� ��� [3][3] ~ [3][4]  [3][0]
   2  3  4  5  1        i=4  n=1  4���� ��� [4][4] ~ [4][4]  [4][0]

   -> ��Ģ : n �� 5�϶� 0���� �ʱ�ȭ!!

   ����Ϸ��� �ƹ�Ű�� ��������...
*/


public class hyodii083
{
	public static void main(String[] args)
	{
		int[][] arr = new int[5][5];

		for (int i=0; i<arr.length; i++)
		{
			for (int c=i, n=1; n<=5; n++)
			{
				arr[i][c] = n;
				c++;
				
				if (c==5)
				{
					c=0;
				}
			}
		}
		
		
		/* ��� 2
		int n = 1;
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
			{
				if(n==6)
				{
					n=1;
				}
				arr[i][j] = n;
				n++;
				System.out.print(n);
			}System.out.println();
			n--;

		}
		*/

		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length;j++ )
			{
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();
		}
	}
}
/*
  1  2  3  4  5
  5  1  2  3  4
  4  5  1  2  3
  3  4  5  1  2
  2  3  4  5  1
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/