/* ====================================
���� Ŭ������ �ν��Ͻ� ����
- ������(Constructor)
=======================================*/

public class Test072
{
	//int val1;
	//double val2;
	int x;
	double y;

	Test072()
	{
		//val1=0;
		//val2=0;
		x=0;
		y=0;
		System.out.println("�Ű����� ���� ������...");
	}

	Test072(int x)
	{
		//val1=x;
		//val2=0;
		this.x=x;
		y=0;
		System.out.println("int�� �����͸� �Ű������� �޴� ������...");
	}

	Test072(double y)
	{
		//val1=0;
		//val2=y;
		x=0;
		this.y=y;
		System.out.println("double�� �����͸� �Ű������� �޴� ������...");

	}
	
	Test072(int x, double y)
	{
		//val1=x;
		//val2=y;
		this.x=x;
		this.y=y;
		System.out.println("int�� ������ double�� ������ �Ű������� �޴� ������...");
	}
	
	public static void main(String[] args)
	{
		Test072 ob1 = new Test072();
		//--==>>�Ű����� ���� ������...

		Test072 ob2 = new Test072(4);
		//--==>>int�� �����͸� �Ű������� �޴� ������...

		Test072 ob3 = new Test072(4.0);
		//--==>>double�� �����͸� �Ű������� �޴� ������...

		Test072 ob4 = new Test072(4,4.0);
		//--==>>int�� ������ double�� ������ �Ű������� �޴� ������...

		System.out.println(ob1.x + ", " + ob1.y);
		//--==>>0, 0.0

		System.out.println(ob2.x + ", " + ob2.y);
		//--==>>4, 0.0

		System.out.println(ob3.x + ", " + ob3.y);
		//--==>>0, 4.0

		System.out.println(ob4.x + ", " + ob4.y);
		//--==>>4, 4.0
		
	}

}
// ���� ���
/*
�Ű����� ���� ������...
int�� �����͸� �Ű������� �޴� ������...
double�� �����͸� �Ű������� �޴� ������...
int�� ������ double�� ������ �Ű������� �޴� ������...
0, 0.0
4, 0.0
0, 4.0
4, 4.0
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/