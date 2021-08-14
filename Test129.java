/* ===========================================
  ■■■ 자바의 주요(중요) 클래스 ■■■
  - Wrapper(래퍼) 클래스 - BigDecimal(실수형)
==============================================*/


import java.math.BigDecimal;

public class Test129
{
	public static void main(String[] args)
	{
		BigDecimal a  = new BigDecimal("123456789.123456789");

		// movePointLeft()  : 소수점을 왼쪽으로 이동
		BigDecimal b = a.movePointLeft(3);
		System.out.println(b);
		//--==>> 123456.789123456789

		// 나눗셈 : divide() -> 대체 속성 확인, 반올림 하지 않는다. -> 절삭
		BigDecimal c = a.divide(b, BigDecimal.ROUND_DOWN);   //ROUND_DOWN은 이름만 봐도 static final 이겠구나
		System.out.println(c);
		//--==>> 1000.000000000

		System.out.println(BigDecimal.ROUND_DOWN);
		//--==>> 1


		// toBigInteger() 
		// Decimal을 -> BigInteger 객체로 변환
		System.out.println(a.toBigInteger());
		//--==>> 123456789


	}
}