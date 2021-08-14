/* ====================================================
  ���� �÷��� �����ӿ�ũ(Collection Framework) ����
=======================================================*/

/*
// Map �� �ٸ� �ڷᱸ������ ���󵵰� ����!
Map  -> Hashtable, HashMap

- java.util.Map �������̽���
	Ű(key)�� ��(value)�� ����(mapping)�ϸ�,
	������ Ű�� ����� �� ����, �����ؾ� �ϸ�(�����ؾ� �ϸ�)
	�� Ű�� �� ���� ������ �����ؾ� �Ѵ�.
	��, �ϳ��� Ű ���� �����ϴ� �ϳ��� ���� ���� �ڷᱸ���̴�.


�� Hashtable<K, V> Ŭ����
	- �ؽ����̺� ������ ��ü �𵨸��� Ŭ������
	  �˻��� �����ϱ� ������ ��� �󵵰� ���� �� ���Ѵ�.

	- �ؽ����̺��̶� Ű(key)�� �׿� �����ϴ� ������(value)��
	  ���е� ������ �����̴�.

	- �����͸� �����ϰ�, �˻��ϱ� ���ؼ� Ű(key)�� �����ϸ�
	  �� ���������� Ű ���� �ο��ϸ� �ش� �����Ͱ� ��ȯ�ȴ�.

	- ����, Hashtable Ŭ������ key �Ǵ� value �� ������ null �� ������� �ʴ´�.  �ڡڡ�
*/

import java.util.Hashtable;

public class Test166
{
	private static final String[] names
		= {"��ȿ��","��ȿ��","��ȿ��","��ȿ��","��ȿ��2","��ȿ��" };

	private static final String[] tels
		={"010-0000-0000","010-1111-1111","010-2222-2222"
				, "010-3333-3333", "010-4444-4444", "010-5555-5555"};
	

	public static void main(String[] args)
	{
		// Hashtable �ڷᱸ�� �ν��Ͻ� ����
		Hashtable<String, String> ht = new Hashtable<String, String>();    // key �� value �� ���׸�����

		// ht ��� ����� Hashtable �ڷᱸ����
		// �迭(names, tels)�� ����ִ� �����͸� ��ҷ� ��Ƴ���
		// -> put(k, v)     //�ؽ����̺� �ڷḦ ��� ���� �⺻���� �޼ҵ�
		for (int i=0; i<names.length; i++)
		{
			ht.put(names[i],tels[i]);
		}

		// ht ��� Hashtable �� ����... key �� �̿��Ͽ� �˻�
		// -> get(k)
		String findName1 = "��ȿ��";
		String str = ht.get(findName1);
		if (str != null)
		{
			System.out.println(findName1 + "��ȭ��ȣ : " + str);
		}
		System.out.println();
		//--==>> ��ȿ����ȭ��ȣ : 010-3288-6988

		// ht ��� Hashtable �ڷᱸ����... key �� �����ϴ����� ���� Ȯ��
		// -> containsKey()
		String findName2 = "��ȿ��";
		if (ht.containsKey(findName2))
		{
			System.out.println(findName2 + "�����Ͱ� �����մϴ�.");
		}
		else
			System.out.println(findName2 + "�����Ͱ� �������� �ʽ��ϴ�.");
		System.out.println();
		//--==>> ��ȿ�������Ͱ� �������� �ʽ��ϴ�.


		String findName3 = "��ȿ��";
		if (ht.containsKey(findName2))
		{
			System.out.println(findName3 + "�����Ͱ� �����մϴ�.");
		}
		else
			System.out.println(findName3 + "�����Ͱ� �������� �ʽ��ϴ�.");
		System.out.println();
		//--==>> ��ȿ�������Ͱ� �������� �ʽ��ϴ�.

		// ht ��� Hashtable �ڷᱸ����... value �� �����ϴ����� ���� Ȯ��
		// -> contains()

		String findTel1 = "010-0000-0000";
		if (ht.contains(findTel1))
			System.out.println(findTel1 + "�����Ͱ� �����մϴ�.");
		else
			System.out.println(findTel1 + "�����Ͱ� �������� �ʽ��ϴ�.");
		System.out.println();
		//--==>> 010-0000-0000�����Ͱ� �����մϴ�.

		// ht ��� Hashtable �ڷᱸ������... ����ȿ���������� ����
		// -> remove()
		ht.remove("��ȿ��");
		//-- ��remove�� �޼ҵ� ���ڰ����� key �� �Ѱܹ�����
		//    �� ��, key �� �����Ǵ� ���� �ƴϴ�.
		//    �ش� key �� ����Ǿ�(���εǾ�) �ִ� value �� �Բ� remove() �ȴ�.

		//����(remove()) ���� key �� �����ϴ��� Ȯ��
		if(ht.containsKey("��ȿ��"))
			System.out.println("��ȿ���� �����մϴ�.");
		else
			System.out.println("��ȿ�� ��𰬾�!?!?");
		System.out.println();
		//--==>> ��ȿ�� ��𰬾�!?!?

		// ����(remove()) ���� value �� �����ϴ��� Ȯ��
		if(ht.contains("010-1111-1111"))
			System.out.println("010-1111-1111�����Ͱ� �����մϴ�.");
		else
			System.out.println("010-1111-1111 �����Ͱ� �������� �ʽ��ϴ�.");
		System.out.println();
		//--==>>  010-1111-1111 �����Ͱ� �������� �ʽ��ϴ�.
		// ��ġ ������ �÷��ǰ� ���� �����̴�!!


		// null ���� ó�� ����
		// null�� ���� ������ �ؽ����̺� ������ ������!
		//ht.put(null, null);             //-- key �� value ��� null        �� ��Ÿ�� ����(NullPointerException)
		//ht.put("��ȿ��",null);          //-- value �� null		   	     �� ��Ÿ�� ����(NullPointerException)
		//ht.put(null,"010-6666-666");    //-- key �� null		   	         �� ��Ÿ�� ����(NullPointerException)


		// �ߺ��� key �Է�
		ht.put("��ȿ��","010-1234-1234");
		
		System.out.println(ht.get("��ȿ��"));
		System.out.println();
		//--==>> 010-1234-1234
		//-- ���� "010-3333-3333" ���� "010-1234-1234"�� ����Ǿ����� Ȯ��
		//   (����� ����)


		// �ߺ��� value �Է�
		ht.put("��ȿ��","010-2222-2222");
		System.out.println(ht.get("��ȿ��"));
		System.out.println(ht.get("��ȿ��"));
		System.out.println();
		//--==>> 010-2222-2222
		//		 010-2222-2222

		// �� value �� �ߺ��� ���� �ԷµǾ �⺻ �����Ϳ� �ƹ��� ������ ��ġ�� ����.



	}
}



/*
private static final String[] names
		= {"���±�","������","������","�չ���","�ּ���","����ȣ" };

	
	private static final String[] tels
		={"010-3733-7202","010-7389-9032","010-8805-8143"
				, "010-4550-7043", "010-3288-6988", "010-3370-5057"};



	//ht.put("������",null);          //-- value �� null		   	     �� ��Ÿ�� ����(NullPointerException)
	//ht.put(null,"010-4434-2587")
*/