/* ====================================================
  ���� �÷��� �����ӿ�ũ(Collection Framework) ����
=======================================================*/
//�߰����� ��ȭ

// Vector v = new Vector();
//-- ����ִ� Vector �ڷᱸ�� ����

// Vector v = new Vector(8);
//-- 8���� �ʱ� element �� ���� Vector �ڷᱸ�� ����
//   8���� ��� ä������ �Ǹ�(���ڶ�� �Ǹ�) �ڵ����� Ȯ��ȴ�.

// Vector v = new Vector(3, 5);
//-- 3���� �ʱ� element �� ���� Vector �ڷᱸ�� ����
//   3���� ��� ä������ �Ǹ�(���ڶ�� �Ǹ�) �ڵ����� 5�� ����(Ȯ��) �ȴ�.

//  �� ���ʹ� ������ ��ҷμ� ������, �Ǽ���, ���ڿ�... ����
//     ��Ƴ��� ���� �����ϴ�.  (�̰� ������ �Ⱦ��� ��)
//     �� ������ ������ Ȯ���ϴ� ���� �߿��ϴ�. check~!!!

import java.util.Vector;
import java.util.Iterator;

class MyVector extends Vector<Object>	// <Object>���·� ��ӹ����� <Object>�� ���δ�.

{
	// ������
	MyVector()
	{
		//--Vector(1,1) : �θ� �����ڿ� �� ���� �Ű������� ���� (���� Ŭ����)
		super(1,1);
		//-- ù ��° ���� : �־��� �뷮
		//   �� ��° ���� : ������
	}

	void addInt(int i)
	{
		addElement(new Integer(i));
	}

	void addFloat(float f)
	{
		addElement(new Float(f));
	}

	void addString(String s)
	{
		addElement(s);
	}

	void addCharArray(char[] a)
	{
		addElement(a);
	}


	void write()
	{

		Object o;
		int length = size();
		System.out.println("������ ��� ���� : " + length);



		for (int i=0; i<length; i++)
		{

			o = elementAt(i);   //elementAt(0) : 0��°�� ������ ���ڴ�!

			// ��instanceof�� ������    check~!!!
			//-- ó���ؾ� �ϴ� ����� ��ü Ÿ�� Ȯ��  // ������Ʈ�� ������Ʈ�ε� ���� Ÿ���̴�?


			if (o instanceof String)	//-- o�� StringŸ������ Ȯ���ϴ� ������
			{
				System.out.println("���ڿ� : " + o.toString());
			}

			else if (o instanceof Integer)
				  // ------------ o �� ��Ƽ��Ÿ������ ������� ��ü(������Ʈ)   ���ʹ� �⺻�ڷ����� ���� �� ����!
			{

			System.out.println("������ : " + o);
										  //--- ��ü�� ����ϸ� Ŭ������@�ؽ��ڵ尡 ���� �ٵ� �� �߳���? (����ڽ�)
										  //  �𸣰����� ����Ŭ���� ���� �ٽ� ��������!
			}

			else if (o instanceof Float)
			{
				System.out.println("�Ǽ��� : " + o);
			}
			else if (o instanceof char[])     //ĳ����Ÿ���� ����Ŭ�������ƴϱ⶧���� ����ڽ� �ȴ��.
			{
				/* �̷��� �ʹ��ʹ� ���� �׷��� �ؿ�ó��
				for (int i; i<(char[])o.length; i++)
				{
					System.out.println(((char[])o)[i]);
				}
				*/
				
				// System.out.println("���ڹ迭 : " + o);
				// System.out.println("���ڹ迭 : " + o.toString());
				//System.out.println("���ڹ迭 : " + String.copyValueOf(���ڹ迭);
				//System.out.println("���ڹ迭 : " + String.copyValueOf({'s','t','u','d','y'});
				System.out.println("���ڹ迭 : " + String.copyValueOf((char[])o));	//check~!!!
												//       ------------ char �迭���� ������ ���ڿ��� ��ȯ

												//��ü�� ����ϸ� Ŭ������@�ؽ��ڵ尡 ����
			}
			else
			{
				System.out.println("Ÿ�� Ȯ�� �Ұ�~!!!");
			}

		}
		//--==>> ������ ũ�� : 4
		//       ������ : 5
		//       �Ǽ��� : 3.14
		//       ���ڹ迭 : �ȳ��ϼ���
		//       ���ڹ迭 : study



		//-------------------------------------------------------------------------

		System.out.println();

		Iterator<Object> it = this.iterator();	//<Object> Ȯ��
		while (it.hasNext())
		{
			System.out.println(it.next());
		}

		//--==>> 5
		//       3.14
		//       �ȳ��ϼ���
		//       [C@6d06d69c           //--> �̰� ���� �׷��� ���� ����

	}

}



public class Test155
{
	public static void main(String[] args)
	{
		//Myvector Ŭ���� ��� �ν��Ͻ� ����
		MyVector v = new MyVector();

		// �ֿ� ���� ���� �� �ʱ�ȭ
		int digit = 5;
		float real = 3.14f;
		String s = new String("�ȳ��ϼ���");
		char[] letters = {'s','t','u','d','y'};

		v.addInt(digit);             //-- ���� �ڷᱸ���� ���� ����
		v.addFloat(real);            //-- ���� �ڷᱸ���� �Ǽ� ����
		v.addString(s);				 //-- ���� �ڷᱸ���� ���ڿ� ����
		v.addCharArray(letters);     //-- ���� �ڷᱸ���� ���� �迭 ����
		
		v.write();
		//--==>> ���� ��� ���� : 0
	}

	
}