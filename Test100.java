/* ==================================================
���� �޼ҵ� �ߺ�����(Method Overloading) ����
- Method Overloading �� ������ ���¿� �Ұ����� ����
=====================================================*/
public class Test100
{
	
	public static void main(String[] args)
	{
		print('A');
		print(10, 20);
		print(10,'A');

		double result = print(3.14);
		print(4.75);                    //11���� 12���� �ٸ���ó���������� �ڹٴ� print(xxx)���� ���⶧���� ���� ��!
	}

	public static void print() {}
	public static void print(int i) {}
	//public static void print(int j) {}                    //--(X) �ڷ����� ���������� ���Ƽ� ������ �ȵ�
	public static void print(char c) {}                     //-- �ڵ� �� ��ȯ ��Ģ check~!!!
	public static void print(int i, int j) {}               //-- i�� �����ɺ��°� �ƴ϶� �Ű������� ����!
	public static void print(double d) {}
	//public static void print(double d) {return 10.0;}     //-- ���� �Ұ� void�ε� �����ڷ���
	//public static double print(double d) {return 10.0;}   //--(X) ���� 23���� double d �� ���� �Ұ�  check~!!!



	/*----------------------------------------------------------------------
	public static void main(String[] args)
	{
		

		print();

		print(10);

		print('A');

		print(10, 20);

		print(10,'A');		//-- �ڵ� �� ��ȯ�� �Ǿ� �����Ѵ�.

		double result = print(3.14);

		print(3.5);

	}



	public static void print(){}

	public static void print(int i){}

	//public static void print(int j){}		//--(x) �ֳ��ϸ� �ڹٴ� �ٷ� ���ٰ� ���кҰ�

	public static void print(char c){}		//-- �� �ڵ� �� ��ȯ ��Ģ check~!!!

	public static void print(int i, int j){}

	public static double print(double d){return 10.0; }

	//public static void print(double e){}	//-- (x) �ֳ��ϸ� �ڹٴ� �ٷ� ���ٰ� ���кҰ�
	-------------------------------------------------------------------*/

}