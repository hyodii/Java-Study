/* ============================================
���� ������ �ڷ��� ����
- ������ �ڷ��� �ǽ� �� �׽�Ʈ : double(8����Ʈ)
- ������ ���� �ǽ�
==============================================*/

public class Test009
{
	public static void main (String[] args)
	{
		//������ ������ ������
		double a = 1 / 2;
		System.out.println("double a : " + a);
		//double a : 0.0

		double b =1/2 + 1/2;
		System.out.println("double b :" + b);
		//double b : 0.0

		double c = 1/2.0;
		System.out.println("double c: " + c);
		//double c : 0.5
		/* ������ ����� �����Ͽ� �ǿ����� �� �Ǽ��� ���ԵǾ� �ִٸ�
		   ������ �Ǽ� ����� ������ ����Ǿ� ����� ���� �Ǽ� ���·� ��ȯ�ȴ�.*/
		
		double d = 3/2 +1/2;
		System.out.println("double d : " + d);
		//double d = 1 + 0;
		//double d = 1.0;

		double e = 3/2 +1/2.0;
		System.out.println("double e : " + e);
		//double e = 1 + 0.5;
		//double e = 1.5


	}
}
/*
double a : 0.0
double b :0.0
double c: 0.5
double d : 1.0
double e : 1.5
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/