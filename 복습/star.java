import java.util.Scanner;

public class star
{
	public static void main(String[] args)
	{
		System.out.println("1. ������ 2���� �迭 �����");
		for (int i=0; i<3;i++ )
		{
			for (int j=0; j<4;j++ )
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
/* 
1. ������ 2���� �迭 �����
****
****
****

*/
		System.out.println("2. �����ﰢ��(��) ��� �����");
		for (int i=1; i<5;i++)
		{
			for (int j=0; j<i;j++ )
			{
				System.out.print("*");
			}
			System.out.println();
		}
/* 
2. �����ﰢ��(��) ��� �����
*
**
***
****

*/
		System.out.println("3. �����ﰢ��(��) ��� �����");
		for (int i=0; i<5;i++)
		{
			for (int j=4;j>0;j--)
			{
				if(i<j)
					System.out.print("-");
			
				else
					System.out.print("*");
			}
			System.out.println();
		}
		
/*
3. �����ﰢ��(��) ��� �����
----
---*
--**
-***
****

*/
		System.out.println("4. �Ƕ�̵� ��� �����");
		for (int i=0; i<4; i++)
		{
			for (int j=0; j<3-i;j++)
			{
				System.out.print("-");
			}
			for (int j=0; j<2*i+1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
/*
4. �Ƕ�̵� ��� �����
---*
--***
-*****
*******

*/	
		System.out.println("5. Ȧ���� �Է��ϸ� �׿� �´� ������ ��� �����");
		System.out.print("Ȧ���� �Է����ּ��� : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		for (int i=0; i<num;i++)
		{
			for (int j=0; j<num;j++ )
			{
				if(i<=num/2) //���� ����
				{
					if (i+j<=num/2-1) //���� �� �������
						System.out.print("-");
					else if(j-i>=num/2+1) //������ �� �������
						System.out.print("-");
					else
						System.out.print("*");//*���
				}
				else if(i>num/2)//�Ʒ��� ����
				{
					if(i-j>=num/2+1)//���� �� ����
						System.out.print("-");
					else if(i+j>=num/2*3+1)//������ �� ����
						System.out.print("-");
					else
						System.out.print("*");//*���
				}
			}
			System.out.println();
		}

/*
5. Ȧ���� �Է��ϸ� �׿� �´� ������ ��� �����
Ȧ���� �Է����ּ��� : 17
--------*--------
-------***-------
------*****------
-----*******-----
----*********----
---***********---
--*************--
-***************-
*****************
-***************-
--*************--
---***********---
----*********----
-----*******-----
------*****------
-------***-------
--------*--------

*/
	}
}