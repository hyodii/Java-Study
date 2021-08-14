/* ===========================================
  ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
  - Wrapper(����) Ŭ���� - BigDecimal(�Ǽ���)
==============================================*/


import java.math.BigDecimal;

public class Test129
{
	public static void main(String[] args)
	{
		BigDecimal a  = new BigDecimal("123456789.123456789");

		// movePointLeft()  : �Ҽ����� �������� �̵�
		BigDecimal b = a.movePointLeft(3);
		System.out.println(b);
		//--==>> 123456.789123456789

		// ������ : divide() -> ��ü �Ӽ� Ȯ��, �ݿø� ���� �ʴ´�. -> ����
		BigDecimal c = a.divide(b, BigDecimal.ROUND_DOWN);   //ROUND_DOWN�� �̸��� ���� static final �̰ڱ���
		System.out.println(c);
		//--==>> 1000.000000000

		System.out.println(BigDecimal.ROUND_DOWN);
		//--==>> 1


		// toBigInteger() 
		// Decimal�� -> BigInteger ��ü�� ��ȯ
		System.out.println(a.toBigInteger());
		//--==>> 123456789


	}
}