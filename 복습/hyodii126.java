public class hyodii126
{
	public static void main(String[] args)
	{
		int a = 10, b;
		Integer c;
		Object d;

		b = a;
		c = new Integer(0);  //-- c�� ��ü Ÿ��
		
		b = c;             //-- ���� ��ڽ�
		b = c.intValue();  //-- ��ڽ�

		d = new Object();
		System.out.println("d.toString() : " + d.toString());
		//--==>> d.toString() : java.lang.Object@15db9742

		System.out.println("d            : " +d);
		//--==>> d            : java.lang.Object@15db9742

		d = new Integer(10);   //-- Object d = new Integer(10);  (�� ĳ����)
		System.out.println("d.toString() : " + d.toString());
		//--==>> d.toString() : 10

		d = new Double(12.345);  //--�� ĳ����
		System.out.println("d.toString() : " + d.toString());
		System.out.println("d            : " + d);
		//--==>> d.toString() : 12.345
		//		 d            : 12.345

		d = 10;   //-- ���� �ڽ�
		System.out.println("d.toString() : " + d.toString());
		System.out.println("d            : " + d);
		//--==>> d.toString() : 10
		//		 d            : 10

	}
}