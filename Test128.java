/* ======================================
  ■■■ 자바의 주요(중요) 클래스 ■■■
  - Wrapper(래퍼) 클래스 - BigInteger
=========================================*/

import java.math.BigInteger;

public class Test128
{
	public static void main(String[] args)
	{
		//int a1 = 123456789123456789;				//담을 수 없다.
		//long b1 = 123456789123456789123456789L;   //담을 수 없다.
		//System.out.println(a1);
		//System.out.println(b1);

		// 이렇게 큰 값을 담으려면 BigInteger 쓴다~!
		BigInteger a = new BigInteger("123456789123456789");      //check~!!!  매개변수 문자열로 넘겨받게함 왜?
																				// -> 인트로 담으면 그만큼밖에 못담으니까! 문자열!
		BigInteger b = new BigInteger("123456789123456789");

		//BigInteger c = a + b;
		//System.out.println(c);       // 일반적인 산술 연산자(+)를 통해서 연산이 불가능하다!

		// 더하기
		BigInteger c = a.add(b);
		System.out.println("덧셈 결과 : " + c);
		//--==>> 덧셈 결과 : 246913578246913578

		// 빼기
		BigInteger d = a.subtract(b);
		System.out.println("뺄셈 결과 : " + d);
		//--==>> 뺄셈 결과 : 0

		// 곱하기
		BigInteger e = a.multiply(b);
		System.out.println("곱셈 결과 : " + e);
		//--==>> 곱셈 결과 : 15241578780673678515622620750190521

		// 나누기
		BigInteger f = a.divide(b);
		System.out.println("나눗셈 결과 : " + f);
		//--==>> 나눗셈 결과 : 1

		// 지수승
		BigInteger g = new BigInteger("2");
		System.out.println("2의 3승  : " + g.pow(3));         // .pow()  check~!!
		//--==>> 2의 3승  : 8

	}
}