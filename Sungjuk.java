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
	// �ֿ� �Ӽ� ����(�ֿ� ���� ����)
	int inwon;                     //-- �ο� ��
	Record[] rec;                  //-- Record �迭(�л� �� �� �� Record �迭 �� �� �� Ȱ��)
		                           //   Record �� ������� ������ ��ü�� ��Ƴ� �� �ִ� �迭

	// �̰� ���⿡ ������ ���� ����... �Ф�
	//String[] title = {"���� ���� : ", "���� ���� : ", "���� ���� : "};
	
	
	// �ֿ� �޼ҵ� ����(��� ����)
	// 1. �ο� �� �Է�
	public void set()
	{
		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.print("�ο� �� �Է�(1~100) : ");
			inwon = sc.nextInt();
		}
		while (inwon<1 || inwon>100);

		// check~!!!
		// Record Ŭ������ ������� ������ ��ü(�ν��Ͻ�)�� ���� �� �ִ�
		// �迭���� inwon ��ŭ ����
		//record [] rec = new record[inwon];
		//�̰� ������ �����Ѱ� �̿��ϴ� �����̱� ������
		//�̷��� �ۼ��ϸ� �ȵǴ� ��Ȳ �Ф�
		rec = new Record[inwon];

		//-- Record �迭���� inwon ��ŭ ������ ������
		//   Record Ŭ������ �ν��Ͻ��� ������ ���� �ƴϴ�. (�л��� �������ִ� �¼�(Ʋ)�� ������̰� �л��� ����� �ƴ�)


		// ȿ����~~ �Ф�
		// set() �޼ҵ尡 ���� �ȳ����µ�...
		// �޼ҵ� �ȿ��� �ٽ� input() �޼ҵ带 �����ϰ� �ִ� �Ф�
	}


	// �ֿ� �޼ҵ� ����(��� ����)
	// 2. �� ������ �Է�(���� �� ��� ���� ��� ����)
	public void input()     //�Է¹��� ���� rec �迭�濡 ���� ��
	{
		Scanner sc = new Scanner(System.in);

		String[] title = {"���� ���� : ", "���� ���� : ", "���� ���� : "};
			
		// �ο� �� ��ŭ �ݺ� -> �ο� ���� ����Ͽ� ������� �迭�� ���̸�ŭ �ݺ�
		for (int i=0; i<inwon; i++)  // for(int i=0; i<rec.length; i++) �����ǹ�		// ��~~!!!!
		{
			//check~!!!
			// Record Ŭ���� ����� �ν��Ͻ� ����
			/* �ѹ� �� �������� Record�� �ν��Ͻ��� �����ؾ���
			Record ob = new Record();	//-- ��
			ob.name
			ob.tot

			rec[i] = ob;
			rec[i].name
			rec[i].tot
			*/
			//rec[i] = new record();	// �ν��Ͻ� ��������... ���� �� ó��... Ŭ���� �̸� �빮��
			rec[i] = new Record();

			System.out.printf("%d��° �л��� �̸� �Է� : ", (i+1));
			rec[i].name = sc.next();

				
			/*
			System.out.printf("%d��° �л��� �̸� �Է� : ",(i+1));
			//rec�迭��i��°���� �̸� = sc.next();
			rec[i].name = sc.next();

			System.out.print("���� ���� : ");
			//rec�迭��i��°���� ���� = sc.nextInt();
			rec[i].kor = sc.nextInt();

			System.out.print("���� ���� : ");
			//rec�迭��i��°���� ���� = sc.nextInt();
			rec[i].eng = sc.nextInt();

			System.out.print("���� ���� : ");
			//rec�迭��i��°���� ���� = sc.nextInt();
			rec[i].mat = sc.nextInt();
			*/

			for (int j=0; j<title.length; j++)   //������ 0 1 2			// ��~~!!!
			{
				// �ȳ� �޼��� ���
				System.out.print(title[j]);

				// �迭 �̸� ���ھ�(score)
				//����ڰ� �Է��� �����͸� ���ھ�(score) �迭�� ��Ƴ���
				//rec[i].sore[j] = sc.nextInt();         // i��° �л��� score[0] -> ��������
				rec[i].score[j] = sc.nextInt();			 // i��° �л��� score[1] -> ��������
												         // i��° �л��� score[2] -> ��������
				
				// ����, ����, ���� ���� �����͸� �ݺ������� �Է¹޴� ����
				//���� �����ϱ�
				rec[i].tot += rec[i].score[j];

			}

			// ��� �����ϱ�
			 rec[i].avg = rec[i].tot / 3.0;
		}

	}//end input()


	// �� print() �޼ҵ嵵
	// input() �޼ҵ� �ȿ� �ۼ��� ��Ȳ... �Ф�


	// �ֿ� �޼ҵ� ����(��� ����)
	// 3. ��� ���
	//��ȿ�� 90 80 70 240 xx.xx   2
	//������ 82 72 62 xxx xx.xx   3
	//�󸶹� 98 88 78 xxx xx.xx   1
	public void print()
	{
		System.out.println(); //����

		// �л� �� �� �� �ݺ� ��±��� ����
		for (int i=0; i<inwon; i++)							// ��~!!!
		{
			//check~!!!!
			// ���� ���� �޼ҵ� ȣ��~!!!(���� �߰�)
			ranking();
			
			
			//�̸� ���
			System.out.printf("%5s", rec[i].name);
		


			// ����(����, ����, ����) �ݺ� ���
			for (int j=0; j<3; j++)							// ��~0!!!
				System.out.printf("%4d", rec[i].score[j]);

			// ����, ��� ���
			System.out.printf("%5d", rec[i].tot);
			System.out.printf("%8.2f", rec[i].avg);

			//check~!!!!
			// ���� ��±��� �߰�~!!!
			System.out.printf("%5d", rec[i].rank);

			// ����
			System.out.println();
		
		}//end outter for��
		
	}//end print

	//4. ���� ���� �޼ҵ� �߰�~!!!
	//   - Record �迭�� rank �Ӽ� �ʱ�ȭ ��� -> ��ȯ �ڷ��� void
	//   - Ŭ���� ���ο��� Ȱ���� �޼ҵ�� ���� -> �������� ������ private
	private void ranking()
	{
		int i,j;          //--���� ����
		// ��� �л����� ���(����, rank)�� 1�� �ʱ�ȭ
		for (i=0; i<inwon; i++)
		{
			rec[i].rank = 1;       //ó������ ���� 1�� �����ϰ� ���ؼ� ������ 1���ϱ� ���� ����
		}

		// ��� ����....ex) 4��
		for (i=0; i<inwon-1; i++)      //-- �� ����   0   1   2(�ο� -1(������������� �񱳾��ص��Ǵϱ�!)) 
		{
			for (j=i+1; j<inwon; j++)  //-- �� ���  123  23  3
			{
				if (rec[i].avg > rec[j].avg)      //-- �� ������ ����� �񱳴���� ��պ��� ũ�ٸ�.....
				{
					//-- �񱳴���� rank�� 1��ŭ ����
					rec[j].rank++;
				}
				else if (rec[j].avg > rec[i].avg)  //-- �񱳴���� ����� �񱳱����� ��պ��� ũ�ٸ�...
				{
					//-- �񱳱����� rank�� 1��ŭ ����
					rec[i].rank++;
				}
			}
		}

	}//end ranking

	
}//end class Sungjuk