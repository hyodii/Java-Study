/* ====================================================
  ���� �÷��� �����ӿ�ũ(Collection Framework) ����
=======================================================*/

/*
�� List �������̽�
	- ������ ����, �迭�� ����, �ߺ��� ���(������ �ĺ� �����ϱ� ������)
	- �ֿ� ���� Ŭ����
		��Vector(����ȭ ����)
		��ArrayList(����ȭ �������� ����)
		��LinkedList(ü��, ��ũ, ����)


*/

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.ListIterator;


public class Test162
{
	public static void main(String[] args)
	{
		List<String> list = new ArrayList<String>();

		list.add("����");
		list.add("�λ�");
		list.add("��õ");
		list.add("�뱸");
		list.add("����");
		list.add("����");
		list.add("���");
		list.add("����");

		// ���� üũ
		System.out.println(list);
		//--==>> [����, �λ�, ��õ, �뱸, ����, ����, ���, ����]

		System.out.println("��ü ���� : " + list.size());
		//--==>> ��ü ���� : 8

		//ù ��° ��Ҹ� ���
		System.out.println("ù ��° ��� : " + list.get(0));
		//--==>> ù ��° ��� : ����

		// ������ ��Ҹ� ���
		System.out.println("������ ��� : " + list.get(list.size()-1));   //--check~!!
		//--==>> ������ ��� : ����

		// ó�� ��ġ�� "����" �߰�
		list.add(0, "����");

		//���� üũ
		System.out.println(list);
		//--==>> [����, ����, �λ�, ��õ, �뱸, ����, ����, ���, ����]

		// ó�� ��ġ�� ������(���)�� "���ѹα�"���� ����    -> �����
		list.set(0,"���ѹα�");

		//���� üũ
		System.out.println(list);
		//--==>> [���ѹα�, ����, �λ�, ��õ, �뱸, ����, ����, ���, ����]

		// "����" ���翩�� Ȯ��
		if (list.contains("����"))
			System.out.println("������ �����մϴ�.");
		//--==>> ������ �����մϴ�.

		// "���ѹα�" �����
		//list.remove("���ѹα�");  //--(O)
		list.remove(0);				//--(O)     //--check~!!

		//���� üũ
		System.out.println(list);
		//--==>> [����, �λ�, ��õ, �뱸, ����, ����, ���, ����]

		//ArrayList �ڷᱸ�� list �� ��ü ��� ���
		System.out.println("��ü ���...��");
		for (int idx=0; idx<list.size();idx++)
		{
			System.out.print(list.get(idx) + " ");
		}
		System.out.println();
		//--==>> ��ü ���...��
		//		 ���� �λ� ��õ �뱸 ���� ���� ��� ����

		System.out.println("���� ���...��");
		for (int idx=list.size()-1; idx>=0; idx--)         //--check~!!
		{
			System.out.print(list.get(idx) + " ");
		}
		System.out.println();
		//--==>> ���� ���...��
		//		 ���� ��� ���� ���� �뱸 ��õ �λ� ����

		System.out.println("��ü ���...��");      //for-each �������
		for (String s : list )
		{
			System.out.print(s + " ");
		}
		System.out.println();
		//--==>> ��ü ���...��
		//		 ���� �λ� ��õ �뱸 ���� ���� ��� ����

		System.out.println("��ü ���...��");
		Iterator<String> it = list.iterator();
		while (it.hasNext())
		{
			String s = it.next();
			System.out.print(s + " ");
		}
		System.out.println();
		//--==>> ��ü ���...��
		//		 ���� �λ� ��õ �뱸 ���� ���� ��� ����

		
		System.out.println("��ü ���...��");
		ListIterator<String> li = list.listIterator();
		while (li.hasNext())
		{
			System.out.print(li.next() +  " ");
		}
		System.out.println();
		//--==>> ��ü ���...��
		//		 ���� �λ� ��õ �뱸 ���� ���� ��� ����

		System.out.println("���� ���...��");
		while (li.hasPrevious())
		{
			String s = li.previous();
			System.out.print(s+ " ");
		}
		System.out.println();
		//--==>> ���� ���...��
		//		 ���� ��� ���� ���� �뱸 ��õ �λ� ����



	
	
	}
}