/* =================================
���� �迭 ����
- �迭�� �⺻�� Ȱ��(2���� �迭)
====================================*/
/* �� ����
�迭�� �迭(������ �迭)�� Ȱ���Ͽ�
������ ���� �����͸� ��ҷ� ���ϴ� �迭�� �����ϰ�
�� ����� ����ϴ� ���α׷��� �����Ѵ�.

���� ��)

A                     00
C  B                  11  10               j��   1 0  --
D  E  F               20  21  22           j��   0 1 2  ++
J  I  H  G            33  32  31  30       j��   3 2 1 0 --
K  L  M  N  O         40  41  42  43  44   j��   0 1 2 3 4 ++
����Ϸ��� �ƹ� Ű�� ��������...


*/

public class Test089
{
	public static void main(String[] args)
	{
		int[][] arr = new int[5][5];
		char c = 'A';

		for (int i=0; i<5; i++)
		{
			if(i%2==0)
			{
				for (int j=0; j<=i; j++)  //i�� 2�϶� j��   0 1 2  ++
					arr[i][j] = c++;      //i�� 4�϶� j��   0 1 2 3 4 ++
			}
			else if(i%2!=0)
			{
				for (int j=i; j>=0; j--)  //i�� 1�϶� j��   1 0  --
					arr[i][j] = c++;      //i�� 3�϶� j��   3 2 1 0 --
			}
				
		}

		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length;j++ )
			{
				System.out.printf("%3c",(char)arr[i][j]);
			}System.out.println();
		}

	}
}
/*
  A
  C  B
  D  E  F
  J  I  H  G
  K  L  M  N  O
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
