/* =======================================================
���� ���� �帧�� ��Ʈ��(���, ���ǹ��� �ݺ���) ����
- break
	����� (+ �׸��� ����������.)
==========================================================*/
/*
�Ʒ��� ���� ó���� �̷������ ���α׷��� �����Ѵ�.
��, �Է¹޴� ������ 1 ~ 100 ���� �ȿ����� �����ϵ��� �ۼ��Ѵ�.

���� ��)

������ ���� �Է� : -20

������ ���� �Է� : 0

������ ���� �Է� : 2021

������ ���� �Է� : 10
>> 1 ~ 10 ������ �� : 55
����Ͻðڽ��ϱ�?(Y/N)? : y

������ ���� �Է� : 100
>> 1 ~ 100 ������ �� : 5050
����Ͻðڽ��ϱ�?(Y/N)? : n
����Ϸ��� �ƹ� Ű�� ��������... -> ���α׷� ����

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class hyodii060
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n,sum,i;
		char ch;
		
		while(true)
		{
			do
			{
				System.out.print("������ ���� �Է� : ");
				n = Integer.parseInt(br.readLine());

			}
			while(n<1 || n>100);   //check~!!

			sum = 0;

			for (i=1;i<=n;i++)
			{
				sum += i;
			}

			System.out.printf(">> 1 ~ %d ������ �� : %d\n",n,sum);
			System.out.print("����Ͻðڽ��ϱ�?(Y/N)? : ");
			ch = (char)System.in.read();
			System.out.println();

			if (ch!='Y' && ch!='y') //�������� ���������̱� ������ or�� �ƴ϶� ��and��!!!! ---check~!! 
			{
				break;
			}
			System.in.skip(2);

		}//end while

		
	}

}
/*
������ ���� �Է� : 5
>> 1 ~ 5 ������ �� : 15
����Ͻðڽ��ϱ�?(Y/N)? : y

������ ���� �Է� : 4
>> 1 ~ 4 ������ �� : 10
����Ͻðڽ��ϱ�?(Y/N)? : Y

������ ���� �Է� : 2
>> 1 ~ 2 ������ �� : 3
����Ͻðڽ��ϱ�?(Y/N)? : N

����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/