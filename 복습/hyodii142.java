/* ======================================
  ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
  - Random Ŭ����
=========================================*/

// �ζ� ��ȣ ������ (���� �߻� ���α׷�)
// �ڵ� �׽�Ʈ �ܰ� - ���� ���·� ���� ����� ����!

// ���α׷��� ����Ǹ� �⺻������ �ζǴ�
// 5���� �����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// 3 5 12 24 31 40
// 1 2  9 22 35 38
// 4 9 11 13 22 31
// 5 10 13 15 28 40
// 22 31 32 33 40 45
//����Ϸ��� �ƹ�Ű�� ��������....

// �� ���Ӿȿ��� �ߺ� ������� 31

import java.util.Random;
import java.util.Arrays;

class Lotto
{
	private int[] num = new int[6];

	public int[] getNum()
	{
		return num;
	}

	public void start()
	{
		Random rd = new Random();

		int n;
		int cnt = 0;

		jump:

		while (cnt<6)
		{
			n = rd.nextInt(45) + 1;

			for (int i=0; i<cnt; i++)
			{
				if (num[i]==n)
				{
					continue jump;
				}
			}
			num[cnt++] = n;
		}

		sorting();

	}//end start

	private void sorting()
	{
		Arrays.sort(num);
	}
}

public class hyodii142
{
	public static void main(String[] args)
	{
		Lotto lotto = new Lotto();

		for (int i=1; i<=5; i++)
		{
			lotto.start();

			for(int n : lotto.getNum())
			{
				System.out.printf("%4d", n);
			}
			System.out.println();
		}
	}
}
/*
  10  11  26  34  39  43
   1  19  25  28  34  38
   6  22  23  25  35  42
  13  20  23  24  37  45
  10  11  14  32  36  38
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/