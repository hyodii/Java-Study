/* =====================
���� �迭 ����
- �迭�� �⺻�� Ȱ��
=========================*/

/* �� ����
����ڷκ��� ������ ������ ������ ������ŭ �Է¹޾Ƽ�
�Է¹��� �� �߿��� ���� ū ���� ����ϴ� ���α׷��� �ۼ��Ѵ�.
��, �迭�� Ȱ���Ͽ� ������ �� �ֵ��� �Ѵ�.

���� ��)
�Է��� �������� ����   : 10
������ �Է�(���� ����) : 74 65 13 91 5 67 41 2 50 11
>> ���� ū �� -> 91
����Ϸ��� �ƹ� Ű�� ��������...
*/

import java.util.Scanner;

public class Test078
{
	public static void main(String[] args)
	{
		//���� ���� �� �Է��� ������ ����
		int n,temp=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("�Է��� �������� ����   : ");
		n = sc.nextInt();
		
		//������ �Է¹迭 �����
		int[] arr = new int[n];
		System.out.print("������ �Է�(���� ����) : ");

		for (int i=0; i<n;i++ )
		{
			arr[i] = sc.nextInt();
		}

		//ū ���� temp�� ���
		//��� 1
		for (int i=0; i<n-1;i++ )
		{
			if(arr[i]>temp)
			{
				temp = arr[i];

				
			}
		}
		System.out.printf(">> ���� ū �� -> %d\n",temp);

		//ū ���� temp�� ���
		//��� 2
		for (int i=0; i<n-1;i++ )
		{
			if(arr[i]>arr[i+1])
			{
			
				arr[i] = arr[i]^arr[i+1];
				arr[i+1] = arr[i+1]^arr[i];
				arr[i] = arr[i]^arr[i+1];
			}
		}
		System.out.printf(">> ���� ū �� -> %d\n",arr[n-1]);

	}
}
/* ���� ���
�Է��� �������� ����   : 8
������ �Է�(���� ����) : 454 121 642 85 2 5 1 62
>> ���� ū �� -> 642
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/