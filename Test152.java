/* ====================================================
  ���� �÷��� �����ӿ�ũ(Collection Framework) ����
=======================================================*/

/*
�� ť(Queue)

	ť(Queue)�� FIFO(First Input First Output, ���Լ���) ������
	���� �Էµ� �ڷḦ ���� ����ϸ�,
	Queue �������̽��� ������ Ŭ������ ť�� ���õ� �پ��� ����� �����Ѵ�.

�� Queue �������̽� �ν��Ͻ��� �����ϱ� ���ؼ���
   new �����ڸ� �̿��Ͽ� Queue �������̽��� ������(implements)
   Ŭ������ �����ڸ� ȣ���Ѵ�.

   ex) Queue ob = new LinkedList();

Queue�� �������̽� Stack�� Ŭ����!

�� �ֿ� �޼ҵ�
	- E element()
	  ť�� head ��Ҹ� ��ȯ�ϸ� �������� �ʴ´�.

	- boolean offer(E o)
	  ������ ��Ҹ� ť�� �����Ѵ�.

	- E peek()
	  ť�� head ��Ҹ� ��ȯ�ϰ� �������� ������
	  ť �ڷᱸ���� empty �� ��� null �� ��ȯ�Ѵ�.

	- E poll()
	  ť�� head ��Ҹ� ��ȯ�ϰ� �����ϸ� ť �ڷᱸ���� empty �� ��� null �� ��ȯ�Ѵ�.

	- E remove()
	  ť�� head ��Ҹ� ��ȯ�ϰ� �����Ѵ�.
*/

import java.util.Queue;
import java.util.LinkedList;

public class Test152
{
	public static void main(String[] args)
	{
		// Queue �ڷ� ���� ����
		//Queue myQue = new Queue();  //-- (X)ť�� �������̽��� �̷��� ������ �� ����!
		Queue<Object> myQue = new LinkedList<Object>();   //���׸� ǥ��

		// ������ �غ�
		String str1 = "��ǳ��";
		String str2 = "������";
		String str3 = "��ä";
		String str4 = "�״�";

		//myQue ��� Queue �ڷᱸ���� ������ �߰�
		myQue.offer(str1);
		myQue.offer(str2);
		myQue.offer(str3);
		boolean test = myQue.offer(str4);

		System.out.println(myQue);
		//--==>> [��ǳ��, ������, ��ä, �״�] 
		//�������� ��Ʈ���� �̷� ���̷� �ϸ� �ȵȴ�!
		//���̴� ���� �ٳ��� ������� �����ִ� ���� �̰ɷ� �������� ������ ��Ʈ�� �� �� ����.

		System.out.println(test);
		//--==>> true

		// Queue �ڷᱸ������ ��Ҹ� �������� �ʰ� head ��� ��ȯ
		System.out.println("��1 : " +(String) myQue.element());
		//							          -----
									         //	ť(������Ÿ��)
									        //--------------- 
									        //    ������Ʈ(������Ÿ��)
		System.out.println("��2 : " +(String) myQue.element());
		//--==>>��1 : ��ǳ��
		//		��2 : ��ǳ��

		System.out.println();

		String val;

		// ��� ��
		// peek()
		//-- ť�� head ��� ��ȯ. ���� ����.
		//   ť�� empty �� ��� null ��ȯ.
		/*
		while (myQue.peek() != null)           //-- ������ Ȯ���ϰ� �������� ����.
		{
			//poll()
			//-- ť�� head ��� ��ȯ. ������.
			// ť��  empty �� ��� null ��ȯ
			val = (String)myQue.poll();        //-- ������ Ȯ���ϰ� ����ϸ鼭 ������.
			System.out.println("��� : " + val);     
		}
		System.out.println();

		//--==>> ��� : ��ǳ��
		//		 ��� : ������
		//		 ��� : ��ä
		//		 ��� : �״�
		// �����ϴ°ǵ� ������ �����ϸ� �ΰ��� �ϳ������ͼ� ������������ �״� ����


		//String[] arr = {"ȫ�浿", "�̼���", "������"};
		//				----------------------------
		//						���ڿ�(������Ÿ��)
		*/


		//�׽�Ʈ
		/*
		while (myQue.poll() != null)
		{
			val = (String)myQue.poll();
			System.out.println("��� : " + val);  
		}
		System.out.println();
		*/
		//--==>> ��� : ������
		//		 ��� : �״�

		// ��� ��
		/*
		while (true)  //���ѷ���
		{
			val = (String)myQue.poll();
			if (val==null)
				break;
			else
			 System.out.println("��� : " + val);
		}
		System.out.println();
		*/
		//--==>>��� : ��ǳ��
		//		��� : ������
		//		��� : ��ä
		//		��� : �״�

		// ��� ��
		while (!myQue.isEmpty())
		{
			val = (String)myQue.poll();
			System.out.println("��� : " +val);
		}
		System.out.println();
		//--==>>��� : ��ǳ��
		//		��� : ������
		//		��� : ��ä
		//		��� : �״�

	}
}