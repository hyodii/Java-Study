/* 
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

public class hyodii078
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n, temp=0;
		System.out.print("�Է��� �������� ���� : ");
		n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.print("������ �Է�(���� ����) : ");
		for (int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
			System.out.print(arr[i] + " ");
		}

		/* ���1
		for (int i=0; i<n-1; i++)
		{
			if(arr[i]>temp)
				temp = arr[i];
		}
		System.out.printf("\n>> ���� ū �� -> %d\n",temp);
		*/

		//���2
		for (int i=0; i<n-1; i++)
		{
			if (arr[i]>arr[i+1])
			{
				arr[i] = arr[i]^arr[i+1];
				arr[i+1] = arr[i+1]^arr[i];
				arr[i] = arr[i+1];
			}
		}
		System.out.printf("\n>> ���� ū �� -> %d\n",arr[n-1]);

	}
}
/*
�Է��� �������� ���� : 5
������ �Է�(���� ����) : 21 65 84 62 5
21 65 84 62 5
>> ���� ū �� -> 84
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/