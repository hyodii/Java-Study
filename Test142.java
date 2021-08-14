/* ======================================
  ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
  - Random Ŭ����
=========================================*/

/*
�� java.util.Random Ŭ������

	���� ������ ������ �߻����� �����ϴ� Ŭ�����̴�.
	Math Ŭ������ ���� �޼ҵ��� random() �޼ҵ嵵
	������ �߻����� �����ϴ� �޼ҵ�������
	0.0 ~ 1.0 ������ �Ǽ� ���¸� �߻��ϰ� �ǹǷ�
	�ʿ��� ���� ������ ������ ������ ���ؼ���
	�߰����� ������� �����ؾ� �Ѵ�.
	�׷��� �ڹٴ� ���� ������ ������ �߻������ִ�
	���� Ŭ������ Random Ŭ������ ������ �����ϰ� �ִ�.
*/

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


/*----------------------------------------------------------------------
//���� Ǯ��

import java.util.Random;

public class Test142
{
	public static void main(String[] args)
	{

		int[] lotto = new int[6];

		// �Ǽ� ����
		//for (int i=1; i<45;i++)
		//{
		//	System.out.println(Math.random());
		//}
		

		Random rd = new Random();

	

		for (int j=1; j<=5;j++ )
			for (int i=0; i<lotto.length;i++)
			{
				lotto[i] = rd.nextInt(45)+1;
				System.out.print(lotto[i] + " ");	
				
			}System.out.println();



		
		//�������� ����
		for (int i=0; i<lotto.length; i++)
		{
			for (int j=i+1;j<lotto.length;j++)
			{
				if (lotto[i]>lotto[j])
				{
					lotto[i] = lotto[i]^lotto[j];
					lotto[j] = lotto[j]^lotto[i];
					lotto[i] = lotto[i]^lotto[j];
				}
				
			}
		}

		//���
		for (int n : lotto)
		{
			System.out.print(n + " ");
		}
		
			

		

	}
}

-------------------------------------------------------------------*/
import java.util.Random;
import java.util.Arrays;   //Array"s"  s ��~!!

// LottoŬ���� ���� Ǯ��
class Lotto
{
	// �迭 ���� ���� �� �޸� �Ҵ� -> �ζ� ��ȣ�� ��Ƶ� �迭�� 6ĭ
	private int[] num = new int[6];  
	
	//getter  //�ܺο��� ���� ä���ִ����� ���� �����ٰ� ������ �����ϱ� setter �� ���� getter
	public int[] getNum()   //num�� getter �׷��� getNum �ܿ���!
	{
		return num;
	}

	// 6���� ������ �߻���Ű�� �޼ҵ� ����
	public void start()
	{
		Random rd = new Random();

		int n;
		int cnt = 0;
		
		// check~!!!  ����� ����� �ٶ������� �������� ������ �ݺ��Ǽ� �ڵ尡 ������� ���!
		jump:
		//** ����� ������  cnt�� �״��!!!

		while (cnt<6)   //�� 0 1 2 3 4 5
		{
			//rd.nextInt(45)  //�̰� 0~44������ ����  (+1) 1~45������ ����
			n = rd.nextInt(45) + 1;  
			//**���� 45 13 45

			for (int i=0; i<cnt; i++)  //������  cnt check~!!  0->�񱳾��� / 1->0 / 2->01 / 3->012 / 4->0123 / 5->01234
			{
				if (num[i] == n) //�ߺ��� ���� ������
				//** num[0] == 13
				//** num[0] == 45
				{
					// ������ �ٽ� �߻���ų �� �ֵ��� ó��
					continue jump;
					//** 45�ߺ��̶� �̰� �߻�!

				}
			}

			num[cnt++] = n;
			//** num[0] = 45
			//** num[1] = 13

		}

		sorting();   //check~!!!  ��������ϱ� �ҷ��;���~

		
	}// end start


	// ���� �޼ҵ� ����
	private void sorting()
	{
		Arrays.sort(num);  //APIã�ƺ���~!  num �Ѱ��ָ� �˾Ƽ� �� �⺻ �������� ���ĵ�
		//���������� ��� �ؾ��ϴ��� ã�ƺ���!
	}

	

}

public class Test142
{
	public static void main(String[] args)
	{
		// Lotto Ŭ���� ��� �ν��Ͻ� ����
		Lotto lotto = new Lotto();

		// �⺻ - 5����
		for (int i=1; i<=5; i++)
		{
			lotto.start();

			for (int n : lotto.getNum())
			{
				System.out.printf("%4d",n);
			}
			System.out.println();
		}

	}
}
/*
   1   7   9  15  16  22
   8  18  26  32  34  43
   4  11  14  27  39  45
   3   7  14  18  27  39
   5   6  15  16  25  33
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/