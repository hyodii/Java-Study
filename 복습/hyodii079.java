/* 
����ڷκ��� �л� ���� �Է¹ް�
�׸�ŭ�� ����(���� ����)�� �Է¹޾�
��ü �л� ������ ��, ���, ������ ���Ͽ�
����� ����ϴ� ���α׷��� �����Ѵ�.
��, �迭�� Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�.

���� ��)
�л� �� �Է� : 5
1�� �л��� ���� �Է� : 90
2�� �л��� ���� �Է� : 82
3�� �л��� ���� �Է� : 64
4�� �л��� ���� �Է� : 36
5�� �л��� ���� �Է� : 98

>> �� : 370
>> ��� : 74.0
>> ����
90 : 16.0
82 : 8.0
64 : -10.0
36 : -38.0
98 : 24.0
����Ϸ��� �ƹ� Ű�� ��������...
*/
import java.util.Scanner;
public class hyodii079
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n;
		int sum=0, avg=0, de=0;
		System.out.print("�л� �� �Է� : ");
		n = sc.nextInt();

		int[] score = new int[n];

		for (int i=0; i<score.length; i++)
		{
			System.out.printf("%d�� �л��� ���� �Է� : ",i+1);
			score[i] = sc.nextInt();
			sum += score[i];      //--check~!!

		}System.out.println();

		avg = sum / score.length;  //--check~!!
		System.out.println(">> �� : "+sum);
		System.out.println(">> ��� : "+avg);
		System.out.println(">> ����");

		for (int i=0; i<score.length; i++)
		{
			de  = score[i]-avg;
			System.out.println(score[i] + " : " + de);
		}

	}
}
/*
�л� �� �Է� : 5
1�� �л��� ���� �Է� : 26
2�� �л��� ���� �Է� : 98
3�� �л��� ���� �Է� : 65
4�� �л��� ���� �Է� : 33
5�� �л��� ���� �Է� : 45

>> �� : 267
>> ��� : 53
>> ����
26 : -27
98 : 45
65 : 12
33 : -20
45 : -8
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .s
*/