/* ====================================
���� ���������� �������� ����
- ���������� �ʱ�ȭ �׽�Ʈ �ǽ�
=======================================*/

//Test063.java �� ��~!!!

public class Test064
{
	// ���� ���� a ����
	int a;
	// �ڵ����� 0���� �ʱ�ȭ ����
	
	// ���� ���� b ����
	boolean b;
	// ���� ���� c ����
	char c;
	// ���� ���� d ����
	double d;
	
	public static void main(String[] args)
	{
		// Test064 �ν��Ͻ� ���� -> ���۵帮��ó�� a������ �ν��Ͻ� ������ �������
		Test064 ob = new Test064();
		
		System.out.println("ob.a : " +ob.a);
		//==> 0b.a : 0

		System.out.println("ob.b : " +ob.b);
		//==> ob.b : false  //�ڵ����� 0�� ��

		System.out.println("ob.c : "+ob.c);
		//==> ob.c :        //�ڵ����� ����

		System.out.println("ob.d : "+ob.d);
		//==> ob.d : 0.0    //�ڵ����� 0.0

	}
}