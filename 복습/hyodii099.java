//�޼ҵ� �����ε�/ �������̵��� ���� �ܰ� �����̱� ������ ���� �����Ҽ� �־����!!

/*
��  �޼ҵ� �����ε�(Method Overloading) ����

 	�޼ҵ� �����ε��̶�
	�޼ҵ尡 ó���ϴ� ����� ����,
	�޼ҵ� ��ȣ �ӿ� ���� �μ�(����, �Ű�����, �Ķ����)�� ������ �ٸ��ų�
	�ڷ���(Date Type)�� �ٸ� ���
	�޼ҵ��� �̸��� ������ �̸����� �ο��Ͽ� �޼ҵ带 ������ �� �ֵ���
	���������� ����ϰ� �Ǵµ�
	�̸� �޼ҵ� �����ε�(Method Overloading)�̶�� �Ѵ�.

*/
public class hyodii099
{
	public static void main(String[] args)
	{
		drawLine();

		drawLine('+');

		drawLine('/',50);

		drawLine('+',50);
	}

	public static void drawLine()
	{
		System.out.println("==================");
	}

	public static void drawLine(char c)
	{
		for (int i=0; i<20; i++)
			System.out.print(c);
		System.out.println();
	}

	public static void drawLine(char c, int n)
	{
		{
			for (int i=0; i<n; i++)
				System.out.print(c);
			System.out.println();
		}
	}
}
/*
==================
++++++++++++++++++++
//////////////////////////////////////////////////
++++++++++++++++++++++++++++++++++++++++++++++++++
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/
