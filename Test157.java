/* ====================================================
  ���� �÷��� �����ӿ�ũ(Collection Framework) ����
=======================================================*/

// �˻� �� ����


//�տ��� �ε����� ������ ���� Ȯ���ߴٸ� ������ ���� ������ �ε����� Ȯ��

import java.util.Vector;

public class Test157
{
	
	// ���� ���ڿ� �迭 ���� �� �ʱ�ȭ
	private static final String[] colors = {"����", "���", "�ʷ�", "�Ķ�", "����", "����"};

	public static void main(String[] args)
	{
		//  ���� �ڷᱸ�� v ����
		Vector<String> v = new Vector<String>();

		// ���� �ڷᱸ�� v �� colors �����͸� ��ҷ� �߰�
		for(String color : colors)
			v.add(color);

		// ���� �ڷᱸ�� v �� ��ü ��� ���
		System.out.print("��ü ��� ��� : ");
		for (String str :v )
		{
			System.out.print(str +  " ");
		}
		System.out.println();
		//--==>> ��ü ��� ��� : ���� ��� �ʷ� �Ķ� ���� ����

		// indexOf()
		String s1 = "��ȫ";

		int i = v.indexOf(s1);
		System.out.println(s1 + "-> index ��ġ : " + i);
		System.out.println();
		//--==>> ��ȫ-> index ��ġ : -1

		String s2 = "���";
		
		// ��v.conrains(s)�� 
		//  ���� �ڷᱸ�� v �� ã���� �ϴ� s�� ���ԵǾ� �ִٸ�....
		if (v.contains(s2))     
		{
			// ���� �ڷᱸ�� v ���� s2�� �ε��� ��ġ Ȯ���ϰ�!
			i = v.indexOf(s2);
			System.out.println(s2 + "-> index ��ġ : " + i);


			// �켱 ���� �ڵ带 ���� �����ϰ��� �ϴ� ����� ��ġ�� ã��
			// ã������ �����ض�~!!!
			v.remove(i);
		}

		// ã�Ƽ� ������ �� ��ü ��� ���
		System.out.print("������ �� ��ü ��� ��� : ");
		for (String str : v)
		{
			System.out.print(str + " ");
		}
		System.out.println();
		//--==>> ������ �� ��ü ��� ���

		//�߰� �׽�Ʈ
		System.out.println(colors);
		//--==>> [Ljava.lang.String;@15db9742    //colors�迭�� �ؽ��ڵ�

		System.out.println(v);
		//--==>> [����, �ʷ�, �Ķ�, ����, ����]  //����

		// �� Ȯ�ο� ���� �����ʹ�
		//    ���� ���(������)�� �ƴϱ� �빮��
		//    �̸� Ȱ���Ͽ� ������ �����ϰų� �ؼ��� �ȵȴ�.  check~!!!


	}
}