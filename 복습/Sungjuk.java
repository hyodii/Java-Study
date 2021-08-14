/* ===============================
���� Ŭ������ �ν��Ͻ� ����
- Ŭ������ �ν��Ͻ� Ȱ��
==================================*/

/*
2. Sungjuk Ŭ����
	- �ο� ���� �Է¹޾�, �Է¹��� �ο� �� ��ŭ
	  �̸�, ��������, ��������, ���������� �Է¹ް�
	  ������ ����� �����ϴ� Ŭ������ ������ ��~!!!
		* �Ӽ� : �ο���, record ������ �迭
		* ��� : �ο� �� �Է�, �� ������ �Է�, ���� �� ��� ����, ��� ���

*/

import java.util.Scanner;

public class Sungjuk
{
	// 1. �ο� �� �Է�
	int inwon;
	Record[] rec;

	public void set()
	{
		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.print("�ο� �� �Է�(1~100) : ");
			inwon = sc.nextInt();
		}
		while (inwon<1 || inwon>100);

		rec = new Record[inwon];
	}

	// 2. �� ������ �Է�(���� �� ��� ���� ��� ����)
	public void input()
	{
		Scanner sc = new Scanner(System.in);

		String[] title = {"���� ���� : ", "���� ���� : ", "���� ���� : "};
		
		for (int i=0; i<inwon; i++)
		{
			rec[i] = new Record();

			System.out.printf("%d��° �л��� �̸� �Է� : ",(i+1));
			rec[i].name = sc.next();

			for (int j=0; j<title.length; j++)
			{
				System.out.print(title[j]);

				rec[i].score[j] = sc.nextInt();

				rec[i].tot += rec[i].score[j];
			}
			rec[i].avg = rec[i].tot / 3.0;
		}//end outter for ��

		
	}

	public void print()
	{
		System.out.println();

		for (int i=0; i<inwon; i++)
		{
			ranking();

			System.out.printf("%5s", rec[i].name);

			for (int j=0; j<3; j++)
				System.out.printf("%4d", rec[i].score[j]);
			System.out.printf("%5d", rec[i].tot);
			System.out.printf("%8.2f", rec[i].avg);

			System.out.printf("%5d", rec[i].rank);

			System.out.println();
		}
	}

	private void ranking()
	{
		int i,j;

		for (i=0; i<inwon; i++)
		{
			rec[i].rank = 1;     //--check~!!!
		}

		for (i=0; i<inwon-1; i++) //--check~!!!
		{
			for (j=i+1; j<inwon;j++ )
			{
				if (rec[i].avg > rec[j].avg)
				{
					rec[j].rank++;
				}
				else if(rec[j].avg > rec[i].avg)
					rec[i].rank++;

			}
		}
	}
}