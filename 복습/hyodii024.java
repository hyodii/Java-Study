// ��Ʈ ���� ����� xor(^) �����ڸ� Ȱ���Ͽ� �� ������ ����ִ� ����(��) �ٲٱ�
// ����) 1. �߰� ������ ���ص��ǰ� 2. ���� ������ �� �� �ִ�.


public class hyodii024
{
	public static void main(String[] args)
	{
		int a = 20;
		int b = 23;
		int temp;

		System.out.printf("a->%d, b->%d\n", a, b);
		//System.out.println("a = " +a);
		//System.out.println("b = " +b);
		
		a=a^b;
		b=b^a;
		a=a^b;

		System.out.printf("a->%d, b->%d\n", a, b);		
		//System.out.println("a = " + a + " (��Ʈ shift) ");
		//System.out.println("b = " + b + " (��Ʈ shift) ");

		temp = a;
		a = b;
		b = temp;
		
		System.out.printf("a->%d, b->%d\n", a, b);
		//System.out.println("a = " + a + " (temp ���) ");
		//System.out.println("b = " + b + " (temp ���)");
		
	}
}
/*
a->20, b->23
a->23, b->20
a->20, b->23
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/