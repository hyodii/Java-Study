/* =======================================================
���� ���� �帧�� ��Ʈ��(���, ���ǹ��� �ݺ���) ����
- if ~ else �� �ǽ�
==========================================================*/
/*
����ڷκ��� ������ ���� �� ���� �Է¹޾�
���� ������ ū �� ������ ����ϴ� ���α׷��� �����Ѵ�.

���� ��)
ù ��° ���� �Է� : 5
�� ��° ���� �Է� : 15
�� ���� ���� �Է� : 10

>> ���� ��� : 5 10 15
����Ϸ��� �ƹ� Ű�� ��������...

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test033
{
	public static void main(String[] args) throws IOException
	{
		int a,b,c;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());
		System.out.print("�� ���� ���� �Է� : ");
		c = Integer.parseInt(br.readLine());

		// 7 8 2    8 6 13    10 50 30    9 30 45
		// ---      ---       -----       ----        ù ��° �� ��° ��
		//          6 8 13
		// -   -    -   --	  --    --    -    --     ù ��° �� ��° ��
		// 2 8 7    
		//   - -      -  -        -  -       -   -    �� ��° �� ��° ��
		// 2 7 8    6 8 13     10 30 50    9 30 45

		// if �� ���ε��� ����� ������ ���δ� �����ؾ��ϴϱ�! else�ƴ�!!  ---check~!! 
		
		if(a>b)// ���� ù ��° ����(a)�� �� ��° ����(b)���� ũ�ٸ�...
		{
			// a �� b �� ������ �ڸ��� �ٲ۴�.
			a=a^b;
			b=b^a;
			a=a^b;
			//�׽�Ʈ
			System.out.println("�ڸ��ٲ� �߻�~!!!");
		}
		
		if(a>c)// ���� ù ��° ����(a)�� �� ��° ����(c)���� ũ�ٸ�...
		{
			// a �� c �� ������ �ڸ��� �ٲ۴�.
			a=a^c;
			c=c^a;
			a=a^c;
			//�׽�Ʈ
			System.out.println("�ڸ��ٲ� �߻�~!!!");
		}
		if(b>c)// ���� �� ��° ����(b)�� �� ��° ����(c)���� ũ�ٸ�...
		{
			// b �� c �� ������ �ڸ��� �ٲ۴�.
			b=b^c;
			c=c^b;
			b=b^c;
			//�׽�Ʈ
			System.out.println("�ڸ��ٲ� �߻�~!!!");
		}


		/* if(a>b)
		{
			a = a^b; 
			b = b^a; 
			a = a^b;
			
			//temp = a;
			//a = b;
			//b = temp;

		}
		if(b>c)
		{
			b = b^c; 
			c = c^b; 
			b = b^c;
		}

		if(a>b)
		{
			a = a^b; 
			b = b^a; 
			a = a^b;
		} */
		
		/*  �̰� �򰥷�....
		if(a<b)
		{
			if(b<c)
				System.out.printf("���� ��� : %d %d %d\n",a,b,c);
			else
				System.out.printf("���� ��� : %d %d %d\n",a,c,b);
		}
		else if(b<a)
		{
			if(a<c)
				System.out.printf("���� ��� : %d %d %d\n",b,a,c);
			else
				System.out.printf("���� ��� : %d %d %d\n",b,c,a);
		}
		else if(c<a)
		{
			if (a<b)
				System.out.printf("���� ��� : %d %d %d\n",c,a,b);
			else
				System.out.printf("���� ��� : %d %d %d\n",c,b,a);
		}

		*/


		System.out.printf("\n>> ���� ��� : %d %d %d\n",a,b,c);
		
	}
}
/* ���� ���
ù ��° ���� �Է� : 5
�� ��° ���� �Է� : 15
�� ���� ���� �Է� : 10

>> ���� ��� : 5 10 15����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/