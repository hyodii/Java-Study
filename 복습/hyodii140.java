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
�� �� ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�? : 200 (����ڰ� ���� �Է�)

========[Ȯ�ΰ��]=========
200�� �� : xxxx-xx-xx x����
===========================
����Ϸ���....

�� ���� ��¥�� �������� �� ���� ���ϴ� ���� �޼ҵ�
����ü.add(Calendar.DATE, ����);��

�ڻ�� �� �� ����!!��

*/

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Calendar;
import java.util.Scanner;


public class hyodii140
{
	public static void main(String[] args)
	{
		Calendar cal = Calendar.getInstance();
		Scanner sc = new Scanner(System.in);

		int y,m,d,w;
		int addDate;

		y = cal.get(Calendar.YEAR);
		m = cal.get(Calendar.MONTH)+1;   //check~!!
		d = cal.get(Calendar.DATE);
		w = cal.get(Calendar.DAY_OF_WEEK);

		String week = " ";   //check~!!

		switch(w)
		{
			case Calendar.SUNDAY: week = "�Ͽ���"; break;
			case Calendar.MONDAY: week = "������"; break;
			case Calendar.TUESDAY: week = "ȭ����"; break;
			case Calendar.WEDNESDAY: week = "Wennesday"; break;
			case Calendar.THURSDAY: week = "Thursday"; break;
			case Calendar.FRIDAY: week = "Friday"; break;
			case Calendar.SATURDAY: week = "Saturday"; break;
		}

		System.out.println(y + "-" + m + "-" + d + " " + week);

		do
		{
			System.out.print("�� �� ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�? : ");
			addDate = sc.nextInt();
		}
		while (addDate<1);

		cal.add(Calendar.DATE, addDate);     //check~!!

		y = cal.get(Calendar.YEAR);
		m = cal.get(Calendar.MONTH)+1;   //check~!!
		d = cal.get(Calendar.DATE);
		w = cal.get(Calendar.DAY_OF_WEEK);

		switch(w)
		{
			case Calendar.SUNDAY: week = "�Ͽ���"; break;
			case Calendar.MONDAY: week = "������"; break;
			case Calendar.TUESDAY: week = "ȭ����"; break;
			case Calendar.WEDNESDAY: week = "Wennesday"; break;
			case Calendar.THURSDAY: week = "Thursday"; break;
			case Calendar.FRIDAY: week = "Friday"; break;
			case Calendar.SATURDAY: week = "Saturday"; break;
		}

		System.out.println("========[Ȯ�ΰ��]=========");
		System.out.printf("%d�� ��",addDate);
		System.out.println(y + "-" + m + "-" + d + " " + week);
		System.out.println("===========================");

	}
}
/*
2021-8-12 Thursday
�� �� ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�? : 14
========[Ȯ�ΰ��]=========
14�� ��2021-8-26 Thursday
===========================
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/