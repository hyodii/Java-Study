/* ====================================
���� Ŭ������ �ν��Ͻ� ����
- ������(Constructor)
=======================================*/

class NumberTest2
{
	int num;

	NumberTest2(int n)
	{
		num = n;
		System.out.println("������ ȣ�� �� �Ű����� ���� : " + n);
	}

	int getNum()
	{
		return num;
	}

}

public class hyodii070
{
	public static void main(String[] args)
	{
		//NumberTest2 ob1 = new NumberTest2(); ������

		NumberTest2 ob1 = new NumberTest2(10);
		NumberTest2 ob2 = new NumberTest2(5214);
		System.out.println("�޼ҵ� ��ȯ �� : " + ob2.getNum());
	}
}