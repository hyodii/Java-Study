/* =======================================================
���� Ŭ������ �ν��Ͻ� ����
- ������(Constructor)�� �ʱ�ȭ ��(Initialized Block)
==========================================================*/

public class hyodii073
{
	int n;
	int m;

	hyodii073()
	{
		n = 1000;
		m = 2000;
		System.out.println("������ ����...");
	}

	{
		n = 100;
		m = 200;
		System.out.println("�ʱ�ȭ �� ����...");
	}

	hyodii073(int n, int m)
	{
		this.n = n;
		this.m = m;
		System.out.println("�Ű������� �ִ� ������ ����...");
	}
	
	void write()
	{
		System.out.println("n:" + n + ", m:" + m);
	}
	public static void main(String[] args)
	{
		hyodii073 ob1 = new hyodii073();
		ob1.write();

		hyodii073 ob2 = new hyodii073(1234,5678);
		ob2.write();
	}
}