/*
�迭�� �迭(������ �迭)�� Ȱ���Ͽ�
������ ���� �����͸� ��ҷ� ���ϴ� �迭�� �����ϰ�
�� ����� ����ϴ� ���α׷��� �����Ѵ�.
 
   n
  ��
   1  2  3  4  5        i=0  -> n�� 1���� ���� -> n+i
   2  3  4  5  6        i=1  -> n�� 2���� ���� -> n+i
   3  4  5  6  7        i=2  -> n�� 3���� ���� -> n+i
   4  5  6  7  8        i=3  -> n�� 4���� ���� -> n+i
   5  6  7  8  9        i=4  -> n�� 5���� ���� -> n+i

   ����Ϸ��� �ƹ�Ű�� ��������...

   -> ��Ģ�� ã���� n�� i+1���� ����!!
*/

public class hyodii082
{
	public static void main(String[] args)
	{
		int[][] a = new int[5][5];

		for (int i=0; i<a.length; i++)
		{
			int n = i+1;                   //----check~!!!
			for (int j=0; j<a[i].length;j++ )
			{
				a[i][j] = n;
				n++;
			}
		}

		for (int i=0; i<a.length; i++)
		{
			for (int j=0; j<a.length;j++ )
			{
				System.out.printf("%3d",a[i][j]);
			}System.out.println();
		}

	}
}
/*
  1  2  3  4  5
  2  3  4  5  6
  3  4  5  6  7
  4  5  6  7  8
  5  6  7  8  9
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/