/* =================================
���� �迭 ����
- �迭�� ���� ó��
====================================*/
/*
  �� Random Ŭ���� Ȱ��

  ����ڷκ��� ������ ������ �Է¹޾�
  �� ������ŭ�� ����(1~100)�� �߻����� �迭�� ���
  �迭�� ����ִ� �����͵� ��
  ���� ū ���� ���� ���� ���� �����Ͽ�
  ����� ����ϴ� ���α׷��� �����Ѵ�.

���� ��)
�߻���ų ������ ���� �Է� : 6
(53 17 69 45 10 55 -> �������� �߻��� ������...)
(int[] arr = {53, 17, 69, 45, 10, 55} -> �迭�� ��Ƴ���(�迭 ����))
���� ū �� : 69,  ���� ���� �� : 10
����Ϸ��� �ƹ� Ű�� ��������...
*/
import java.util.Scanner;
import java.util.Random;

public class hyodii090
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("�߻���ų ������ ���� �Է� : ");
		n = sc.nextInt();

		int[]arr = new int[n];

		Random rd = new Random();
		for (int i=0; i<n; i++)
			arr[i] = rd.nextInt(100)+1;
		
		int max, min;
 		max = min = arr[0];

		for (int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " " );
		System.out.println();


		for (int i=0; i<arr.length; i++)
		{
			if (max < arr[i])
			{
				max = arr[i];
			}
			if (min > arr[i])
			{
				min = arr[i];
			}
		}

		System.out.printf("���� ū ��  : %d, ���� ���� �� : %d\n",max,min);


	}
}
/*
�߻���ų ������ ���� �Է� : 6
90 98 54 5 7 51
���� ū ��  : 98, ���� ���� �� : 5
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/