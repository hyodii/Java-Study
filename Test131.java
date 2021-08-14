/* ===========================================
  ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
  - Wrapper(����) Ŭ���� 
==============================================*/

public class Test131
{
	public static void main(String[] args)
	{
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		//--==>> 2147483647
		//		 -2147483648


		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		//--==>> 9223372036854775807
		//		 -9223372036854775808


		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		//--==>> 1.7976931348623157E308
		//		 4.9E-324

		System.out.println();

		System.out.println("1 : " + 3.0/0);   //-- ���Ѵ븦 �ǹ�
		System.out.println("2 : " + -3.0/0); 
		//--==>> 1 : Infinity
		//		 2 : -Infinity

		System.out.println("3 : " + (3.0/0 == 3.0/0));
		System.out.println("4 : " + (3.0/0 == -3.0/0));
		//--==>> 3 : true
		//		 4 : false           //��� ����Ƽ�϶� ���� ���Ǵ�Ƽ �ٸ���!


		// ��Double.isInfinite()��   //�Ѵ� ��� ���Ǵ�Ƽ�� ��Ÿ����.
		// is �� �����ϴ� �޼ҵ�� true / false������ ��ȯ�Ѵ�!!!      //check~!!!
		System.out.println("5 : " + Double.isInfinite(3.0/0));
		System.out.println("6 : " + Double.isInfinite(-3.0/0));
		//--==>> 5 : true
		//		 6 : true

		System.out.println("7 : " + (3.0/0 + -3.0/0));
		System.out.println("8 : " + (0.0/0));
		//--==>> 7 : NaN(�� Not a Number) ��
		//		 8 : NaN

		System.out.println("9 : " + (0.0/0 == 0.0/0));
		System.out.println("10 : " + (0.0/0 != 0.0/0));
		//--==>> 9 : false     ��?!? �յ� NaN�̰� �ڵ� NaN�ε� ��?!!?
		//						NaN�� ���ڰ� �ƴϴϱ� �񱳸� �� ���� ����!
		//--==>> 10 : true

		// �� NaN(Not a Number) ���� ������ ����
		//		��==�� �����ڸ� ���� �� ������ �����ϰ� �Ǹ�
		//		����� ������ ��false���� ��ȯ�Ѵ�.

		// NaN���� �ƴѱ� Ȯ���ϴ� �޼ҵ�
		// ��Double.isNaN()��                            -------> static �޼ҵ�  Ŭ������.�޼ҵ��()
		System.out.println("11 : " + Double.isNaN(0.0/0));
		System.out.println("12 : " +  Double.isNaN(1.1+2.2));
		//--==>> 11 : true
		//		 12 : false

		

	}
}