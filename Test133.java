/* ===========================================
  ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
  - String Ŭ���� 
==============================================*/

public class Test133
{
	public static void main(String[] args)
	{
		String s = "seoul korea";
		System.out.println(s);
		//--==>> seoul korea

		// �� ���ڿ� ����
		System.out.println(s.substring(6,9));
		//--==>> kor
		//-- ��String.substring(s,e)��
		//	 String ���ڿ��� �������
		//	 s ��°����... e-1 ��°����...
		//   (��, �ε����� 0���� ����)

		System.out.println(s.substring(7));
		//--==>> orea
		//-- ��String.substring(s)��
		//	 String ���ڿ��� �������
		//	 s ��°���� ������...(��, ���ڿ��� ���� ���̸�ŭ...)

		// �� ���ڿ��� ������(��) ��
		System.out.println(s.equals("seoul korea"));
		System.out.println(s.equals("Seoul korea"));
		//--==>> true
		//		 false
		//-- ��ҹ��� ����

		System.out.println(s.equalsIgnoreCase("Seoul KOrea"));
		//--==>> true
		//-- ��ҹ��� ���� ����!!!

		// �� ã���� �ϴ� ��� ���ڿ�(s)��
		//  ��kor�� ���ڿ��� �����ұ�?
		//	 �����Ѵٸ�... �� ��ġ�� ��� �ɱ�?

		//"seoul korea"
		System.out.println(s.indexOf("kor"));
		//--==>> 6
		// �װ��� �ִ� �ε��� �� ��ȯ



		System.out.println(s.indexOf("ea"));
		//--==>> 9

		System.out.println(s.indexOf("e"));
		//--==>> 1
		//kor�� 2�� �����ϸ� �տ����� �Ǵ��ؼ� ����

		System.out.println(s.indexOf("tt"));
		//--==>> -1
		// ã���� �ϴ� ���ڿ��� ��� ���ڿ��� ������ ���
		// �� ���ڿ��� �ε����� ��ȯ������
		// �������� ���� ��� '����'(-1�ƴ�!)�� ��ȯ�ȴ�!


		// �� ��� ���ڿ�(s)�� ��rea���� ���������� ���� Ȯ��
		//	(true / false)
		System.out.println(s.endsWith("rea"));
		//--==>> true

		System.out.println(s.endsWith("oul"));
		//--==>> false

		// �� ã���� �ϴ� ��� ���翭(s)��
		//		��e�����ڿ��� �����ұ�?
		// �����Ѵٸ� �� ��ġ�� ��� �ɱ�?
		//  (��, �ڿ������� �˻�)
		// seoul korea
		System.out.println(s.indexOf("e"));
		//--==>> 1

		System.out.println(s.indexOf("o"));
		//--==>> 2

		System.out.println(s.lastIndexOf("e"));
		//--==>> 9
		//ã�°Ÿ� �ڿ��� �ϴ°��� ī������ �տ�����!

		System.out.println(s.lastIndexOf("o"));
		//--==>> 7

		// �� ��� ���ڿ�(s) wnd
		//		��6����° �ε��� ��ġ�� ���ڴ�?
		// ĳ���Ϳ�(�����ƴ�!)
		System.out.println(s.charAt(6));
		//--==>> k

		System.out.println(s.charAt(10));
		//--==>> a
		
		//System.out.println(s.charAt(22));
		//--==> ��Ÿ�� ���� �߻� (StringIndexOutOfBoundsException)

		// �� ��� ���ڿ��� �� ���ڿ� ��seoul corea����
		//	� ���ڿ��� �� ū��?
		//	�� ���ڿ��� �ٸ��ٸ� ���̸� Ȯ��(�� ������ �迭)

		System.out.println(s.compareTo("seoul korea"));
		//--==>> 0  (���̰� ���� ������ 0 ��ȯ)
		System.out.println(s.compareTo("seoul corea"));
		//--==>> 8  (c ~ k �� defghijk 8��)

		// �� ��� ���ڿ�(s) ��
		//	  �ش� ���ڿ��� ã�Ƽ� ���ϴ� ���·� ����
		s = "�츮���� ���ѹα� ���ѵ��� ����";
		s = s.replaceAll("����","����");
		System.out.println(s);
		//--==>> �츮���� ���ֹα� ���ֵ��� ����

		// �� ���� ����
		s = "     ��        ��     ";
		System.out.println(":" + s + ":");
		
		//System.out.println(s);

		System.out.println(":" + s.trim() + ":");
		//--==>> :��        ��:
		//�ڹٿ��� trim�� ���� �����ڸ� ������ ����!

		System.out.println(":" + s.replaceAll(" ","") + ":");
		//--==>> :���:
		//tab������ ���� " " �� �Ǿ����

		//int n = Integer.parseInt("30");
		// ���ڸ������ �ִ� ���ڿ��� �������·� ��ȯ�ϴ� ��

		s = Integer.toString(30);
		System.out.println(s);
		//--==>> 30
		//������ ���ڿ���

		int n = 2345678;
		System.out.printf("%d",n);
		System.out.format("%d",n);
		//--==>> 23456782345678

		s = String.format("%d",n);
		System.out.println(s);
		//����� ��ȯ�ϴ� ���� �ƴ϶� �� ������ ���ڿ��� ��ȯ
		//--==>> 2345678

		s = String.format("%,d",n);
		System.out.println(s);
		//--==>> 2,345,678  (������ ��°� ���ڸ�����)

		System.out.printf("%.2f",3.141592);
		System.out.println();
		//--==>> 3.14

		s = String.format("%.2f",3.141592);  //"3.14"�� s�� ��Ƴ� ��!!
		System.out.println("s ��� : " + s);
		//--==>> s ��� : 3.14

		String[] sArray = "�⺻,����,���".split(",");
		//------------- �̸�ŭ�� String��ü�̱� ������ �ڿ� ����� ��� ����
		// split�� �ڸ��� �迭�� ��ȯ!

		for (String str : sArray)
		{
			System.out.print(str + "  ");
		}
		System.out.println();
		//--==>> �⺻  ����  ���



	}
}