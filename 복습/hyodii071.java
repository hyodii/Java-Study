

public class hyodii071
{
	int x;
	
	hyodii071()
	{
		this(1000);
		x=10;
		System.out.println("���ڰ� ���� ������");
		System.out.println("Test071�� �����ִ� x : "+x);
	}
	hyodii071(int x)
	{
		this.x = x;
		System.out.println("���ڰ� �ϳ��� ������");
		System.out.println("Test071�� �����ִ� x : "+x);
	}

	public static void main(String[] args)
	{
		hyodii071 ob1 = new hyodii071();
		hyodii071 ob2 = new hyodii071(100);

		System.out.println();
		System.out.println("main���� ob1.x : " + ob1.x);
		System.out.println("main���� ob2.x : " + ob2.x);

	}
}

