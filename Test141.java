/* ======================================
  ■■■ 자바의 주요(중요) 클래스 ■■■
  - Math 클래스
=========================================*/

// 이런 기능을 가진 함수가 있구나 정도 보고 넘어가자~!

/*
○ java.lang.Math 클래스는

	수학(Mathematics)과 관련된 유용한 속성과 함수들을 제공하는 클래스로
	생성자가 있긴 하지만... 『private』으로 선언되어 있기 때문에
	외부에서 객체(인스턴스)를 생성할 수 없다.
	단, 모든 메소드 『static』으로 정의되어 있으므로
	객체를 생성하지 않고 바로 접근하여 사용하는 것이 가능하다.

○ java.lang.Math 클래스의 주요 상수 및 메소드

	- public static final double E = 2.71....;

	- public static final double PI = 3.141592...;
	  : 원주율(π)
	
	- public static double sin(double a)
	- public static double cos(double a)
	- public static double tan(double a)
	  : sin(a), cos(a), tan(a) 값을 반환한다. (삼각함수)

	- public static double asin(double a)
	- public static double acos(double a)
	- public static double atan(double a)
	  : asin(a), acos(a), atan(a) 값을 반환한다. (삼각함수의 역함수)

	- public static double toRadians(double angdeg)
	  : 각도(angdeg)를 라디안(radian)으로 바꾸어 반환한다.

	- public static double exp(double a)
	  : e의 a승을 구하여 반환한다.

	- public static double log(double a)
	  : 로그(log) 값을 구하여 반환한다.

	- public static double sqrt(double a)
	  : a의 제곱근을 구하여 반환한다.

	- public static double ceil(double a)
	  : a보다 크거나 같은 정수를 반환한다.(올림의 개념)

	- public static double floor(double a)
	  : a보다 작거나 같은 정수를 반환한다. (절삭의 개념)

	- public static double pow(double a, double b)
	  : a의 b승을 구하여 반환한다.

	- public static int round(float a)
	- public static long round(double a)
	  : a 를 반올림하여 결과값을 반환한다.

	- public static double random()
	  : 0.0 ~ 1.0 사이의 난수(임의의 실수)를 발생시켜 반환한다.

많이 사용하는 것만 적은것!
API 도큐먼트에서 더 찾아보기!!

*/

public class Test141
{
	public static void main(String[] args)
	{
		System.out.println("원주율 : " + Math.PI);    //Math 는 프라이베잇이어서 생성자 못만든다! 바로 접근!
		//--==>> 원주율 : 3.141592653589793
		System.out.println("2의 제곱근 : " + Math.sqrt(2));
		//--==>> 2의 제곱근 : 1.4142135623730951

		System.out.println("파이에 대한 Degree : " + Math.toDegrees(Math.PI));
		//--==>> 파이에 대한 Degree : 180.0

		System.out.println("2파이에 대한 Degree : " + Math.toDegrees(2.0 * Math.PI));
		//--==>> 2파이에 대한 Degree : 360.0

		double radian45 = Math.toRadians(45);    //(a/180)*PI 라디안 공식인데 값은 값을 다르게 표현하기 위해 쓴것!
		// 각도를 라디안으로 변환~!!!

		System.out.println("싸인    45 : " + Math.sin(radian45));
		System.out.println("코싸인  45 : " + Math.cos(radian45));
		System.out.println("탄젠트  45 : " + Math.tan(radian45));
		//싸인    45 : 0.7071067811865475
		//코싸인  45 : 0.7071067811865476
		//탄젠트  45 : 0.9999999999999999

		System.out.println("로그 25 : " + Math.log(25));
		//로그 25 : 3.2188758248682006

		System.out.println("2의 4승 : " + Math.pow(2,4));
		//2의 4승 : 16.0

		for (int i=0; i<=10; i++)
		{
			System.out.println("0.0 ~ 1.0 사이의 난수 : " + Math.random());   // 실수범위의 난수를 만들때는 Math안에있는 랜덤도 종종 이용된다!
		}

		//0.0 ~ 1.0 사이의 난수 : 0.036786212835794974
		//0.0 ~ 1.0 사이의 난수 : 0.3391529768841638
		//0.0 ~ 1.0 사이의 난수 : 0.6242184233854104
		//0.0 ~ 1.0 사이의 난수 : 0.20623667618742925
		//0.0 ~ 1.0 사이의 난수 : 0.9156102603525713
		//0.0 ~ 1.0 사이의 난수 : 0.8736008888556458
		//0.0 ~ 1.0 사이의 난수 : 0.1169794475659125
		//0.0 ~ 1.0 사이의 난수 : 0.47934112608769575
		//0.0 ~ 1.0 사이의 난수 : 0.026034243099647747
		//0.0 ~ 1.0 사이의 난수 : 0.37462860103247086
		//0.0 ~ 1.0 사이의 난수 : 0.7924595074349896
		
	}

}