/* ====================================================
  ���� �÷��� �����ӿ�ũ(Collection Framework) ����
=======================================================*/

import java.util.Queue;
import java.util.LinkedList;

public class Test153
{
	// ���� ���ڿ� �迭 ���� �� �ʱ�ȭ
	private static final String[] colors = {"����", "���", "�ʷ�", "�Ķ�", "����", "����"};
	
	
	public static void main(String[] args)
	{
		// Queue �ڷᱸ�� ����
		Queue<String> qu = new LinkedList<String>();
		//-- Queue �������̽� ����� �ν��Ͻ��� �����ϱ� ���ؼ���
		//   new �����ڸ� �̿��Ͽ� Queue �������̽��� implements ��
		//   ���� Ŭ������ �����ڸ� ȣ���ؾ� �Ѵ�.

		// qu ��� Queue �ڷᱸ����
		// color �迭�� ������ �Է� -> offer()
		for (String color : colors)
			qu.offer(color);      //--������ ��Ҹ� ť�� �����Ѵ�.

		// qu ��� Queue �ڷᱸ���� ��� ������ ��ü ���
		while (qu.peek() != null)
			System.out.print(qu.poll() + " ");
		System.out.println();
		//-- peek()
		//		: ť�� head ��Ҹ� ��ȯ�ϰ� �������� ������
		//		  ť �ڷᱸ���� ����ִ� ���°� �Ǹ� null ��ȯ
		//-- poll()
		//		: ť�� head��Ҹ� ��ȯ�ϰ� �����ϸ�
		//		  ť �ڷᱸ���� ����ִ� ���°� �Ǹ� null ��ȯ

		//--==>> ���� ��� �ʷ� �Ķ� ���� ����
	}
}