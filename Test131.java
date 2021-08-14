/* ===========================================
  ■■■ 자바의 주요(중요) 클래스 ■■■
  - Wrapper(래퍼) 클래스 
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

		System.out.println("1 : " + 3.0/0);   //-- 무한대를 의미
		System.out.println("2 : " + -3.0/0); 
		//--==>> 1 : Infinity
		//		 2 : -Infinity

		System.out.println("3 : " + (3.0/0 == 3.0/0));
		System.out.println("4 : " + (3.0/0 == -3.0/0));
		//--==>> 3 : true
		//		 4 : false           //양수 인피티니랑 음수 인피니티 다르다!


		// 『Double.isInfinite()』   //둘다 양수 인피니티로 나타낸다.
		// is 로 시작하는 메소드는 true / false값으로 반환한다!!!      //check~!!!
		System.out.println("5 : " + Double.isInfinite(3.0/0));
		System.out.println("6 : " + Double.isInfinite(-3.0/0));
		//--==>> 5 : true
		//		 6 : true

		System.out.println("7 : " + (3.0/0 + -3.0/0));
		System.out.println("8 : " + (0.0/0));
		//--==>> 7 : NaN(→ Not a Number) 난
		//		 8 : NaN

		System.out.println("9 : " + (0.0/0 == 0.0/0));
		System.out.println("10 : " + (0.0/0 != 0.0/0));
		//--==>> 9 : false     왜?!? 앞도 NaN이고 뒤도 NaN인데 왜?!!?
		//						NaN은 숫자가 아니니까 비교를 할 수가 없다!
		//--==>> 10 : true

		// ※ NaN(Not a Number) 값과 임의의 수를
		//		『==』 연산자를 통해 비교 연산을 수행하게 되면
		//		결과는 언제나 『false』를 반환한다.

		// NaN인지 아닌기 확인하는 메소드
		// 『Double.isNaN()』                            -------> static 메소드  클래스명.메소드명()
		System.out.println("11 : " + Double.isNaN(0.0/0));
		System.out.println("12 : " +  Double.isNaN(1.1+2.2));
		//--==>> 11 : true
		//		 12 : false

		

	}
}