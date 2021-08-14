/* ======================================
  ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
  - Wrapper(����) Ŭ����
=========================================*/
// p.490

/* 
�� Wrapper Ŭ����

	1.  �ڹٿ����� ��� ���ؿ��� �����ϴ� �⺻�� �����͸� ������
		�������� Ŭ������ �����Ͽ� ��ü ������ ó���Ѵ�.
		���� �ڹٿ����� �̷��� �⺻�� �����͸�
		��ü ������ ó���� �� �ֵ��� Ŭ������ ������ �� �ۿ� ���µ�
		�̷��� Ŭ�������� ������ Wrapper Ŭ������ �Ѵ�.

		"10" �� Stirng �� ��ü �� Object
									��
								   ��ü �� Integer �� �޼ҵ� parseInt() �� 10
								   		   -------  
												  // Wrapper�� Integer�� ������!
		Integer.parseInt(br.readLine());
		Integer.parseInt("10");

	2. �⺻ �ڷ�����
	byte, short, int,     long, float, double, char,      boolean ���� �����ϴ�   (�� �⺻ �ڷ���)
	Byte, Short, Integer, Long, Float, Double, Character, Boolean ��              (�� Ŭ����)
	Wrapper Ŭ���� �� ū ���ڵ��� �ٷ�� ����
	java.math.BigInteger �� java.math.BigDecimal Ŭ������ �����Ѵ�.

	Wrapper Ŭ������ java.lang ��Ű���� ���ԵǾ� �����Ƿ�
	������ import �������� �ٷ� ����ϴ� ���� �����ϸ�
	�⺻���� ���������� Wrapper Ŭ������ ���� �޼ҵ带 ����
	�� ��ȯ�� �����ϰ� ���� �񱳿� ���� ���굵 �����ϴ�.

	ex) java.lang.Integer Ŭ����
		int �⺻ �ڷ����� Wrapper Ŭ������
		������ �ٷ�µ� �ʿ��� ����� �޼ҵ�, ���� ��ȯ � �ʿ���
		�޼ҵ� ���� �����ϰ� �ִ�.

		static int parseInt(String s)
		���ڿ� �������� ����� ���ڸ� ���� ���·� ��ȯ�Ѵ�.
		       ��  ��  ��
		//Integer i = new Integer();
		
		//i.parseInt() ��� ���ϰ�
		//Integer.parseInt() ��� �ϴ� ������ parseInt�� static �޼ҵ��̱� �����̴�!
		
		static Integer valueOf(int i)
		int ���� Integer ������ ��ȯ�Ѵ�.

		byte byteValue(), int intValue(),
		short shortValue(), long long Value(),
		float floatValue(), double doubleValue()
		�ش� �⺻ �ڷ������� �� ��ȯ�� ���� ��ȯ�Ѵ�.
*/

/* check~!!!
�� ���� �ڽ�(Auto-Boxing)�� ���� ��ڽ�(Auto-Unboxing)

	BufferedReader br = "abcd";  �̷��� �����ʰ�
	BufferedREader br = new BufferedReader() �̷������� ����.

	�Ϲ������� ���۷��� ���� �⺻ �ڷ����� ȣȯ���� ������
	�� ��� �߻��ϴ� ���� �ذ��� ���� �ڹٿ����� Wrapper Ŭ������ �����ϰ� �Ǿ���.
	������, JDK 1.5 ���� ���۷��� ���� �⺻ �ڷ�����
	������ ���� �� ��ȯ�� �����ϰ� �Ǿ���.

	int a = 10, b;
	Integer ob;                  // ob�� ���� �ּҰ��� �����ϴ°ǵ� int ���� a �� �ٷ� �־��ִ� ��! 
				                 //Rect rec = 10; �̰� ������ �Ұ���! ������ ����ڽ̿��� �����ϰ� ����!
	ob = a;
	//-- �⺻ �ڷ���(int)�� Integer ������ �ڵ� ��ȯ(���� �ڽ�)
	//	 �����δ� ... ��ob = new Integer(a);��

	b = ob;
	//-- Integer(��ü)�� �⺻ �ڷ����� int ������ �ڵ� ��ȯ(���� ��ڽ�)
	//	 �����δ� ... ��b = ob.intValue();��

	// �̴� JDK 1.5 ���� �߰��� ���� �ڽ� / ���� ��ڽ� �̶��
	// ������� ���� �������� ���̴�.

	
*/


public class Test126
{
	public static void main(String[] args)
	{
		int a = 10, b;
		Integer c;
		Object d;

		b = a;				  //-- int �� ������(�ڷ�) -> int �� ����
		c = new Integer(0);   //-- c�� ��üŸ��

		// �� ���۷��� ��(����Ÿ��)�� �⺻ �ڷ���(�⺻ Ÿ��)�� ȣȯ���� �ʴ´�.

		b = c;				//-- Integer �� ������(��ü) c�� int�� ������ ��ڴٴ°� (���� ��ڽ�)
		b = c.intValue();   //������ �̷��� ��������!! (��ڽ�)

		d = new Object();
		System.out.println("d.toString() : " + d.toString());
		//--==>> d.toString() : java.lang.Object@15db9742

		System.out.println("d            : " + d);
		//--==>> d            : java.lang.Object@15db9742

		d = new Integer(10);    //-- Object d = new Integer(10);  (�� ĳ����)
		System.out.println("d.toString() : " + d.toString());
		//--==>> d.toString() : 10

		// ��Ƽ����� Ŭ�����ȿ��� ���� ������ �ִ� ����Ʈ���� �������̵��ؼ� 
		// �̹� ����� �ȰŴϱ� ������ƮŸ������ ��ĳ���õǴ��� �������� ��

		d = new Double(12.345);    //--�� ĳ����
		System.out.println("d.toString() :  "+ d.toString());
		System.out.println("d            :  "  + d);
		//--==>> d.toString() :  12.345
		//		 d            :  12.345

		d = 10;                   //--���� �ڽ�
		System.out.println("d.toString() : " + d.toString());
		System.out.println("d            : " + d);
		//--==>> d.toString() : 10
		//		 d            : 10


	}
}