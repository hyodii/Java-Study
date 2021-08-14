/* ====================================================
  ���� �÷��� �����ӿ�ũ(Collection Framework) ����
=======================================================*/

/*

// List �� Vector, ArrayList, ...

- ���� ����
- �迭�� ����
- �ߺ� ���(������ �ĺ� �����ϱ� ������)

�� ArrayList Ŭ����

	- ArrayList �� Vector Ŭ������
	  List �� ũ�� ������ ������ �迭�� ������ ������
	  �������� Vector Ŭ������ ��ü�� �⺻������ ����ȭ ������,
	  ArrayList �� �׷��� �ʴٴ� ���̴�.

	- �񵿱�ȭ �÷����� ����ȭ�� �÷��Ǻ��� �� ���� ������ �����ϸ�
	  ��������� �÷����� �������� �ʴ� ���α׷�������
	  �Ϲ������� ArrayList �� Vector ���� �� ��ȣ�ϸ�,
	  ArrayList �� ����ȭ�� ������� �ʴ� Vector ó�� ���������ν�
	  ������ ����ȭ�� ������ �δ��� ������ �ʱ� ������ 
	  Vector ���� �� ������ ����ȴ�.

	- null�� ������ ��� ��Ҹ� ����ϸ�
	  List �������̽��� �����ϴ� �� �ܿ� ����Ʈ�� �ݳ��ϱ� ����
	  ���������� ���Ǵ� �迭�� ����� �����ϴ� �޼ҵ带 �����Ѵ�.

*/

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Test161
{
	public static void main(String[] args)
	{
		// ArrayList �ڷᱸ�� �ν��Ͻ� ����
		//ArrayList<String> list = new ArrayList<String>();
		//Vector<String> list = new Vector<String>();
		//List<String> list = new Vector<String>();
		List<String> list1 = new ArrayList<String>();

		// list1 �� ��� �߰� -> add()
		list1.add("���̺꽺�ƿ�");
		list1.add("�μ���");
		list1.add("���ͽ��ڶ�");

		// ArrayList �ڷᱸ�� �ν��Ͻ� ����
		List<String> list2 = new ArrayList<String>(list1);

		// list2 �� ��� �߰�
		list2.add("�𰡵�");
		

		// ArrayList �ڷᱸ�� �ν��Ͻ� ����
		List<String> list3 = new ArrayList<String>();

		// list3 �� list2 �� ��ü ��� �߰�  -> addAll();
		list3.addAll(list2);

		// "�μ��� dkvdp "�г�������" �߰�
		// �� "�μ��� ã�� -> indexOf() -> ��ġ�� �ε��� ��ȯ
		int n = list3.indexOf("�μ���");

		//System.out.println("�μ��� ��ġ : " + n);
		//--==>> �μ��� ��ġ : 1

		// �� "�μ���" ã�� �ε��� ��ġ�� "�г�������" ����(����)
		list3.add(n,"�г�������"); //�׳� add�ϸ� �ڿ� �ٴµ� index�� add�� index���� ����
		//--==>> [���̺꽺�ƿ�, �г�������, �μ���, ���ͽ��ڶ�, �𰡵�]

		// ��� -> ���� ������ Ȯ��
		System.out.println("============================================================");
		System.out.println(list1);
		//--==>> [���̺꽺�ƿ�, �μ���, ���ͽ��ڶ�]
		System.out.println(list2);
		//--==>> [���̺꽺�ƿ�, �μ���, ���ͽ��ڶ�, �𰡵�]
		System.out.println(list3);
		//--==>> [���̺꽺�ƿ�, �μ���, ���ͽ��ڶ�, �𰡵�]

		System.out.println();

		// ��� �� listIterator() �޼ҵ带 Ȱ���Ͽ� ���
		System.out.println("============================================================");
		list3.listIterator();
		ListIterator<String> li = list3.listIterator();
		while (li.hasNext())
		{
			System.out.print(li.next() + " ");
		}
		System.out.println();
		//--==>> ���̺꽺�ƿ� �г������� �μ��� ���ͽ��ڶ� �𰡵�  // ��� ���̸� ���� �Ͱ��� �ٸ�!

		System.out.println();
		
		// ��� -> �������� ��� .hasPrevious()
		System.out.println("============================================================");
		while (li.hasPrevious())
		{
			System.out.print(li.previous() + " ");
		}
		System.out.println();
		//--==>> �𰡵� ���ͽ��ڶ� �μ��� �г������� ���̺꽺�ƿ�
	
	}
}