/* =================================
���� �迭 ����
- �迭�� �⺻�� Ȱ��(2���� �迭)
====================================*/

public class Test080
{
	public static void main(String[] args)
	{
		// �迭�� �迭 ����� �ʱ�ȭ
		// ��� 1
		//int[] arr1 = new int[3];
		int[][] arr1 = new int[3][3]; //3���� �繫�� 3��

		//arr1[0] = 1;
		arr1[0][0]=1;
		arr1[0][1]=2;
		arr1[0][2]=3;
		arr1[1][0]=4;
		arr1[1][1]=5;
		arr1[1][2]=6;
		arr1[2][0]=7;
		arr1[2][1]=8;
		arr1[2][2]=9;

		// ��� 2
		//int[] arr2 = {1,2,3};
		int[][] arr2={{1,2,3},{4,5,6},{7,8,9}};

		//��� 3
		int[][] arr3 = new int[3][3];                 //arr[0].length  arr[1].length   arr[2].length
		int n=1;
		for (int i=0; i<arr3.length; i++)             // ��~~~ 0    1    2       -> ��
		{
			for (int j=0;j<arr3[i].length ; j++)    //������ 012   012   012     -> �繫��
			{
				//�׽�Ʈ
				System.out.println("i: "+i+",j:"+j);
				arr3[i][j] = n;
				n++;
			}
		}
		for (int i=0;i<arr3.length ;i++ )
		{
			for (int j=0; j<arr3[i].length;j++ )
			{
				System.out.printf("%2d",arr3[i][j]);

			}
			System.out.println();

		}

	}
}

/*
i: 0,j:0
i: 0,j:1
i: 0,j:2
i: 1,j:0
i: 1,j:1
i: 1,j:2
i: 2,j:0
i: 2,j:1
i: 2,j:2
 1 2 3
 4 5 6
 7 8 9
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/