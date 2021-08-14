/*
���� ��)
���������� �Է��ϼ��� : 2021
�������� �Է��ϼ��� : 8

        [ 2020�� 8�� ]

  ��  ��  ȭ  ��  ��  ��  ��
 =============================
   1   2   3   4   5   6   7
   8   9  10  11  12  13  14
  15  16  17  18  19  20  21
  22  23  24  25  26  27  28
  29  30  31
 =============================
 ����Ϸ��� �ƹ�Ű�� ��������....

�� ���� �м� �� ����
	- ���� 1�� 1�� 1�� : ������
	- ������ 4�� ����̸鼭 100�� ����� �ƴϰų�,
	  400�� ����̸� 2���� 29��(����),
	  �������� 2�� 28��(���)
	- ���� 2021�� 8�� �޷��� �׸��ٰ� �����ϸ�
	  1.1.1 ~ 2021.7.31 ������ �� ���� ���Ѵ�.
	  �� �� ���� ��+1�� ������ �����ϸ�... (1.1.1 ~ 2021.8.1) �� �� Ȯ��
	  �� �� ���� ���� 2021�� 8�� 1���� ���� Ȯ��


*/

// 2021 8 3 --> ȭ����
// 2021 8 -> 2021 8 1 --> �Ͽ���
import java.util.Scanner;

public class hyodii101
{
	public static void main(String[] args)
	{
		int y, m, w, nalsu;
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.print("���������� �Է��ϼ��� : ");
			y = sc.nextInt();
		}
		while (y<1);
		
		do
		{
			System.out.print("�������� �Է��ϼ��� : ");
			m = sc.nextInt();
		}
		while (m<1 || m>12);


		int months[] = {31,28,31,30,31,30,31,31,30,31,30,31};

		String week[] = {"��","��","ȭ","��","��","��","��"};

		if ((y%4==0 && y%100!=0) || y%400==0)
			months[1] = 29;
		
		nalsu = (y-1)*365 + (y-1)/4 - (y-1)/100 + (y-1)/400;

		for (int i=0; i<m-1; i++)
		{
			nalsu += months[i];
		}

		nalsu += 1;

		w =nalsu % 7;


		System.out.println();
		System.out.printf("\t[ %4d�� %2d�� ]",y,m);
		System.out.println();
		System.out.println("  ��  ��  ȭ  ��  ��  ��  ��");
		System.out.println("=============================");

		for (int i=0; i<w; i++)
		{
			System.out.print("    ");
		}

		for (int i=1; i<=months[m-1]; i++)   //--check~!!
		{
			System.out.printf("%4d",i);
			w++;

			if(w%7==0)
				System.out.println();
		}
		if (w%7!=0)
		{
			System.out.println();
		}
		
		System.out.println("=============================");

	}
}