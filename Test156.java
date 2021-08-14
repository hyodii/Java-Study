/* ====================================================
  ���� �÷��� �����ӿ�ũ(Collection Framework) ����
=======================================================*/
import java.util.Vector;
import java.util.Collections;

public class Test156
{

	// ���� ���ڿ� �迭 ���� �� �ʱ�ȭ
	private static final String[] colors = {"����", "���", "�ʷ�", "�Ķ�", "����", "����"};


	public static void main(String[] args)
	{
		// ���� �ڷᱸ�� ����
		Vector<String> v = new Vector<String>();

		// ���� �ڷᱸ�� v �� colors �����͸� ��ҷ� �߰�
		for (String color : colors)
		{
			v.add(color);
		}

		System.out.println("ù ��° ��� : " + v.firstElement());
		System.out.println("�� ��° ��� : " + v.get(1));
		System.out.println("������ ���  : " + v.lastElement());
		System.out.println("����� ����  : " + v.size());
		//ù ��° ��� : ����
		//�� ��° ��� : ���
		//������ ���  : ����
		//����� ����  : 6

		// �� ù ��° ��Ҹ� "�Ͼ�"���� ��.��. -> set()
		v.set(0, "�Ͼ�");
		System.out.println("ù ��° ��� : " + v.firstElement());
		System.out.println("�� ��° ��� : " + v.get(1));
		System.out.println("����� ����  : " + v.size());
		//ù ��° ��� : �Ͼ�
		//�� ��° ��� : ���
		//����� ����  : 6
		//--==>> �̰� ���ؼ� �� ĭ�� �и� ���� �ƴ϶� ������ �Ͼ��� ��� ��

		
		// �� ù ��° ��Ҹ� "��Ȳ"���� ��.��. -> insertElementAt()   // �Ű����� ������ �ٸ��ϱ� ���!!  // �������� ���� Ȯ��!!
		v.insertElementAt("��Ȳ",0);

		System.out.println("ù ��° ��� : " + v.firstElement());
		System.out.println("�� ��° ��� : " + v.get(1));
		System.out.println("����� ����  : " + v.size());
		//ù ��° ��� : ��Ȳ
		//�� ��° ��� : �Ͼ�
		//����� ����  : 7

		// �� ��ü ���
		System.out.print("��ü ��� : ");
		for (String str : v)
			System.out.print(str + " ");
		System.out.println();

		
		/* ���� �õ�
		Iterator<Object> it = v.iterator();

		while (it.hasNext())
		{
			str = (String)it.next();
			System.out.print("��ü ��� : " + 

		}

		Iterator<Object> it = v.iterator();

		while (it.hasNext())
		{
			str = (String)it.next();
			System.out.print(str +  " ");
		}
		System.out.println();
		*/




		// �� �������� ����
		Collections.sort(v);

		// �� �������� ���� �� ��ü ���
		System.out.print("�������� ���� �� ��ü ��� : ");
		for (String str : v)
		{
			System.out.print(str + " ");
		}
		System.out.println();
		//--==>> �������� ���� �� ��ü ��� : ��� ���� ���� ��Ȳ �ʷ� �Ķ� �Ͼ�


		//�� �˻�
		// ��Collections.binarySearch()��  -> �˻� ��� ����
		//  ��, ���� ���� ������ ����Ǿ� �ִ� �ڷῡ ���ؼ��� ����� �����ϴ�. check~!!
		// �˻� ����� �������� ���� ��� ���������� ��ȯ�Ѵ�.

		int idxBlue = Collections.binarySearch(v, "�Ķ�");  //�ε��� ���� ��ȯ�Ͽ� ���� ����
		System.out.printf("�Ķ� : %d ��° �ε����� ��ġ�ϰ� �ִ�.", idxBlue);
		System.out.println();
		//--==>> �Ķ� : 5 ��° �ε����� ��ġ�ϰ� �ִ�.

		int idxNavi = Collections.binarySearch(v,"����");
		System.out.printf("���� : %d ��° �ε����� ��ġ�ϰ� �ִ�.", idxNavi);
		System.out.println();
		//--==>> ���� : -1 ��° �ε����� ��ġ�ϰ� �ִ�.   //--���� ������ ������ ���°Ŵ�!  �� �˻� ��� ����


		// �� �������� ���� �� ������ �޼ҵ尡 �������� �ʴ´�! �Ű������� �ϳ��� �߰�
		Collections.sort(v,Collections.reverseOrder());
		

		// �� �������� ���� �� ��ü ���
		System.out.print("�������� ���� �� ��ü ��� : ");
		for (String str :v)
			System.out.print(str + " ");
		System.out.println();
		//--==>> �������� ���� �� ��ü ��� : �Ͼ� �Ķ� �ʷ� ��Ȳ ���� ���� ���

		// �� �������� ���� �� �˻� �׽�Ʈ
		idxBlue = Collections.binarySearch(v, "�Ķ�");
		System.out.printf("�Ķ� : %d ��° �ε����� ��ġ�ϰ� �ִ�.", idxBlue);
		System.out.println();
		//--==>> �Ķ� : -8 ��° �ε����� ��ġ�ϰ� �ִ�.  �� ��ã����... 
		
		
		idxBlue = Collections.binarySearch(v,"�Ķ�", Collections.reverseOrder());
		System.out.printf("�Ķ� : %d ��° �ε����� ��ġ�ϰ� �ִ�.", idxBlue);
		System.out.println();
		//--==>> �Ķ� : 1 ��° �ε����� ��ġ�ϰ� �ִ�.


	}
}