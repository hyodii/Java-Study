/*
�迭�� �迭(������ �迭)�� Ȱ���Ͽ�
������ ���� �����͸� ��ҷ� ���ϴ� �迭(5x5)�� �����ϰ�
�� ����� ����ϴ� ���α׷��� �����Ѵ�.

���� ��)
  1  2  3  4  5
  6  7  8  9 10
 11 12 13 14 15
 16 17 18 19 20
 21 22 23 24 25
 ����Ϸ��� �ƹ� Ű�� ��������...
*/

public class hyodii081  
{
	public static void main(String[] args) 
	{
		int[][] arr = new int[5][5];

		int n = 1;
		
		/*----------------------------------------------------------------------
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
			{
				arr[i][j] = n;
				System.out.printf("%3d",arr[i][j]);
				n++;
			}System.out.println();
		}
		-------------------------------------------------------------------*/

		for (int i=0; i<arr.length;i++ )
		{
			for (int j=0; j<arr[i].length;j++ )
			{
				arr[i][j] =n;
				n++;
			}
		}

		for (int i=0; i<arr.length;i++ )
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
  6  7  8  9 10
 11 12 13 14 15
 16 17 18 19 20
 21 22 23 24 25
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
