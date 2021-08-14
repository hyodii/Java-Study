/* ======================================
���� ����(sort) �˰��� ����
=========================================*/

// ����ڷκ��� ���� �л��� ���� �����͸� �Է¹޾�
// ������ ���� ������ ���� ������ ����� �ο��ϴ�
// ����� ����ϴ� ���α׷��� �����Ѵ�.
// ��, �迭�� ���� �˰����� Ȱ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.

// ���� ��)
// �ο� �� �Է� : 5
// �̸� ���� �Է�(1) : ��ȿ�� 90
// �̸� ���� �Է�(2) : �迬�� 80
// �̸� ���� �Է�(3) : ������ 85
// �̸� ���� �Է�(4) : ������ 75
// �̸� ���� �Է�(5) : ��ȿ�� 95

/*
-------------------
1�� ��ȿ�� 95
2�� ��ȿ�� 90
3�� ������ 85
4�� �迬�� 80
5�� ������ 75
------------------
����Ϸ��� �ƹ� Ű�� ��������...
*/


import java.util.Scanner;

public class Test106
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int n;
		int i=0, j;
		//boolean flag;

		
		System.out.print("�ο� �� �Է� : ");
		n = sc.nextInt();

		
		String name[] = new String[n];	
		int score[] = new int[n];		
		

		for (i=0; i<n; i++)
		{
			System.out.printf("�̸� ���� �Է�(%d) : ",i+1);
			name[i] = sc.next();
			score[i] = sc.nextInt();
		}

		String temp=" ";

		
		// ��������
		for (i=0; i<n-1; i++)
		{
			for (j=i+1; j<n; j++)
			{
				if (score[i]<score[j])
				{
					score[i] = score[i]^score[j];
					score[j] = score[j]^score[i];
					score[i] = score[i]^score[j];

					temp = name[i];
					name[i] = name[j];
					name[j] = temp;
				}

			}

		}
		

		/*
		// ��������
		int k;
		
		for (i=1; i<n; i++)
		{
			for (j=0,k=0;j<n-1;j++)
			{
				if (score[j]>score[j+1])
				{
					score[j] = score[j]^score[j+1];
					score[j+1] = score[j+1]^score[j];
					score[j] = score[j]^score[j+1];

					temp = name[j];
					name[j] = name[j+1];
					name[j+1] = temp;

					k++;
				}
			}
		}
		*/


		int rank[] = new int[n];

		for (i=0; i<n; i++)
		{
			rank[i] = 1;
			for (j=0; j<n;j++ )
			{
				if (score[i]<score[j])
				{
					rank[i]++;
				}
			}

		}
		
		// ��� ���
		System.out.println("--------------");

		for (i=1; i<=n; i++)
		{
			System.out.printf("%d�� %s %d\n",rank[i-1],name[i-1],score[i-1]);
		}
	

		System.out.println("--------------");


		
	}
}
/*
�ο� �� �Է� : 3
�̸� ���� �Է�(1) : ��ȿ�� 98
�̸� ���� �Է�(2) : �迬�� 55
�̸� ���� �Է�(3) : ������ 87
--------------
1�� ��ȿ�� 98
2�� ������ 87
3�� �迬�� 55
--------------
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/