/*
����ڷκ��� ��, ��, ���� �Է¹޾�
�ش� ��¥�� ������ ����ϴ� ���α׷��� �����Ѵ�.
��, �޷� Ŭ����(Calendar)�� ������� �ʴ´�.
����, Ŭ������ ������ Ȱ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.(-> WeekDay Ŭ���� ����)
�׸��� �迭�� ���䵵 ������� �ۼ��� �� �ֵ��� �Ѵ�.
���������������� ���䵵 Ȯ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.
����������
WeekDayŬ���� ���踦 ����
Test095 Ŭ������ main() �޼ҵ尡 ���������� ���α׷� ����� �� �ֵ��� �Ѵ�.

���� ��)
 �� �� �� �Է�(���� ����) : 1996 8 16

 1996�� 8�� 16�� �� x����
 ����Ϸ��� �ƹ� Ű�� ��������...

�� 1�� 1�� 1�� -> ������
�� 1���� 365���� �ƴ� ���� �ִ�.

[��Ʈ]
1�� 1�� 1�� ~ 1996�� 8�� 16�� ====> ��ü �� ��

1. nalsu = 1.1.1 ~ 1995.12.31  �۳������ �������ϰ�

2. nalsu += 1966.1.1 ~ 1996.7.31  �Է��Ѵ� ���ޱ����� ���� ���ϰ�

3. nalsu += 1996.8.1 ~ 1996.8.16   ������ 7�ϸ� ���� ���س� �� ����!
*/

import java.util.Scanner;

class WeekDay
{
	private int y, m, d;

	public void input()
	{	
		Scanner sc = new Scanner(System.in);

		System.out.print("�� �� �� �Է�(���� ����) : ");		// 2021 7 30
		y = sc.nextInt();
		m = sc.nextInt();
		d = sc.nextInt();
	}

	public String week()
	{
		int[] months = {31, 0, 31, 30, 31, 30,31,31, 30,31, 30,31};
		
		String[] weekNames = {"��","��","ȭ","��","��","��","��"};

		int nalsu;

		if ((y%4==0 && y%100!=0) || y%400==0)
			months[1] = 29;
		else
			months[1] = 28;

		nalsu = (y-1)*365 + (y-1)/4 - (y-1)/100 + (y-1)/400;

		for (int i=0; i<(m-1); i++)
		{
			nalsu += months[i];
		}

		nalsu += d;

		int w = nalsu % 7;

		return weekNames[w];
	}

	public void print(String day)
	{
		System.out.printf(" %d�� %d�� %d�� -> %s\n", y, m, d, day);
	}

}
public class hyodii095
{
	public static void main(String[] args)
	{
		WeekDay ob = new WeekDay();

		ob.input();

		String result = ob.week();

		ob.print(result);
	}
}