public class hyodii096
{
	static int a = 10;

	int b = 20;

	void write()
	{
		System.out.println("Ŭ���� ���� a : " + a);
		System.out.println("�ν��Ͻ� ���� b : " + b);
	}

	static void print()
	{
		System.out.println("Ŭ���� ���� a : " + a);  
		//System.out.println("�ν��Ͻ� ���� b : " +b); //���� �Ұ���
	}


	public static void main(String[] args)
	{
		System.out.println("main() -> Ŭ���� ���� a : " + hyodii096.a);

		System.out.println("main() -> Ŭ���� ���� a : " + a);
		
		hyodii096.print();
		print();

		//System.out.println("main() -> �ν��Ͻ� ���� b : " + b);  //���� �Ұ���
		//hyodii096.write();  //���� �Ұ���
		
		hyodii096 ob = new hyodii096();
		System.out.println("main() -> �ν��Ͻ� ���� b : " + ob.b);

		ob.write();

		System.out.println("main() -> Ŭ���� ���� a : " +ob.a);

		ob.print();

		//3���� ��� --- 2��°�� �Ϲ�����
		System.out.println("main() -> Ŭ���� ���� a : " + a);
		System.out.println("main() -> Ŭ���� ���� a : " + hyodii096.a);
		System.out.println("main() -> Ŭ���� ���� a : " + ob.a);


		hyodii096 ob2 = new hyodii096();

		ob2.a = 10000;
		ob2.b = 20000;

		System.out.println("ob2Ȯ�� ---------------------------");
		ob2.write();
		ob2.print();

		System.out.println();
		System.out.println("obȮ�� ---------------------------");
		ob.write();
		ob.print();
	}
}