/* ======================================
  ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
  - Calendar Ŭ����
=========================================*/

/*
�� �ǽ�����
������ �������� �Է¹��� ��¥��ŭ ���� ��, ��, ��, ������ Ȯ���Ͽ�
����� ����ϴ� ���α׷��� �����Ѵ�.

���� ��)
���� ��¥ : 2021-8-11 ������
�� �� ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�? : 200

========[Ȯ�ΰ��]=========
200�� �� : xxxx-xx-xx x����
===========================
����Ϸ���....

�� ���� ��¥�� �������� �� ���� ���ϴ� ���� �޼ҵ�
����ü.add(Calendar.DATE, ����);��

�ڻ�� �� �� ����!!��

*/

import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;



public class Test140
{
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		Calendar cal = Calendar.getInstance();


		
		int y = cal.get(Calendar.YEAR);
		int m = cal.get(Calendar.MONTH)+1;
		int d = cal.get(Calendar.DATE);
		int w = cal.get(Calendar.DAY_OF_WEEK);
		int addDate;     //--������ ���� 

		
		String week = " ";

		
		switch (w)
		{
			case Calendar.SUNDAY: week = "�Ͽ���"; break;

			case Calendar.MONDAY: week = "������"; break;

			case Calendar.TUESDAY: week = "ȭ����"; break;

			case Calendar.WEDNESDAY: week = "������"; break;

			case Calendar.THURSDAY: week = "�����"; break;

			case Calendar.FRIDAY: week = "�ݿ���"; break;

			case Calendar.SATURDAY: week = "�����"; break;

		}
		

		//���� ��¥
		System.out.println(y + "-" + m + "-" + d + " " + week);

		do
		{
			System.out.print("�� �� ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�? : ");
			addDate = sc.nextInt();

		}
		while (addDate<1);
		
		
		//�� ���� ��¥�� �������� �� ���� ���ϴ� ���� �޼ҵ�
		//����ü.add(Calendar.DATE, ����);��
		cal.add(Calendar.DATE, addDate);
		
		
		
		//--check~!!! �ڻ�� �� �� ���š�
		y = cal.get(Calendar.YEAR);
		m = cal.get(Calendar.MONTH)+1;
		d = cal.get(Calendar.DATE);
		w = cal.get(Calendar.DAY_OF_WEEK);

		
		
		switch (w)
		{
			case Calendar.SUNDAY: week = "�Ͽ���"; break;

			case Calendar.MONDAY: week = "������"; break;

			case Calendar.TUESDAY: week = "ȭ����"; break;

			case Calendar.WEDNESDAY: week = "������"; break;

			case Calendar.THURSDAY: week = "�����"; break;

			case Calendar.FRIDAY: week = "�ݿ���"; break;

			case Calendar.SATURDAY: week = "�����"; break;

		}
		


		System.out.println("\n===========[Ȯ�ΰ��]===========");

		System.out.printf("%d�� �� : %d-%d-%d %s\n", addDate, y, m, d, week);

		System.out.println("================================");

	}
}

/*
2021-8-11 ������
�� �� ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�? : 0
�� �� ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�? : -1
�� �� ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�? : 200

===========[Ȯ�ΰ��]===========
200�� �� : 2022-2-27 �Ͽ���
================================
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/