/* ===========================================
  ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
  - Wrapper(����) Ŭ���� 
==============================================*/

public class Test130
{
	public static void main(String[] args)
	{
		byte b = 3;
		int i = 256;

		Byte b2 = new Byte(b);         //Boxing
		Integer i2 = new Integer(i);   //Boxing

		System.out.println(b2);
		System.out.println(i2);
		//--==>> 3
		//		 256


		print(b2);                  
		print(i2);                  
		
		// Byte Ŭ������ byteValue() �޼ҵ� ȣ��
		byte b3 = b2.byteValue();

		// Integer Ŭ������ intValue() �޼ҵ� ȣ��
		int i3 = i2.intValue();

		System.out.println(b3);
		System.out.println(i3);
		//--==>> 3           //Unboxing
		//		 256         //Unboxing

		//check~!!!
		int i4 = b2.byteValue();   //b2�� ��üŸ�� b2.byteValue()�� �⺻ �ڷ����� ����Ʈ Ÿ���� ��ȯ!! -> 3
		//byte b4 = i2.intValue();   //i2 ��ü�� ��ü�ε� intValue()�� ��ȯ�ϸ� int ������ ��ȯ! -> 256  -> ���� �߻�!!!
		byte b4 = i2.byteValue();    //--==>> �ݵ�� Ȯ��!!! ����Ʈ Ÿ������ �ٲ㵵 ����� ����

		//check~!!!
		System.out.println(i4);
		//--==>> 3
		//System.out.println(b4);   
		// �̰Ŵ� int�� �� Ŀ�� ������!
		System.out.println(b4);
		//--==>> 0



	}

	//���� ����Ʈ�� �ν��Ͻ� �������� ȣ���� �����ϰ� �Ϸ���?  
	/*
	static void print(Byte b)  // �̰� b2�� ó����
	{
		...;
	}
	
	static void print(Integer i)  // i�� ó���Ϸ��� �̰ŵ� �����
	{
		...;
	}

	static void print(int i)
	{
		...;
	}

	static void print(Object o)  // �̰Ŵ� ���־ �ٵ�!!
	{
		...;
	}
	*/

	// java lang.Number Ŭ����(�߻� Ŭ����)��        Number ob = new Number(); �̷��� �ν��Ͻ� ������ �� ����!
	// ��� Wrapper Ŭ�������� �θ� Ŭ����
	// (���� Ŭ����, ���� Ŭ����)�̴�.
	// b2, i2 �ڷ����� Number n �� �Ѿ���鼭
	// Auto-Boxing �� �Ͼ�� �ȴ�.
	public static void print(Number n)
	{
		System.out.println("++" + n);
		System.out.println(n.intValue());
	}
}

/*
3
256
++3
3
++256
256
3
256
3
0
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/