/* ====================================
■■■ 클래스와 인스턴스 ■■■
=======================================*/

// ※ hyodii066.java 파일과 세트~!!!
/*
원의 넓이와 둘레 구하기
원의 넓이와 둘레를 구할 수 있는 클래스를 설계한다.
(클래스명 : CircleTest) -> CircleTest.java
Test065.java 파일을 참조하되
위와 같은 두 개의 파일로 나누어 작업을 수행한다.
또한, BufferedReader를 활용한다.

원의 넓이 = 반지름 * 반지름 * 3.141592
원의 둘레 = 반지름 * 2 * 3.141592

실행 예)
반지름 입력 : 13

반지름이 13인 원의
넓이 : xxx.xx
둘레 : xxx.xx
계속하려면 아무 키나 누르세요...
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class CircleTest
{
	int r;
	final double PI = 3.141592;

	void input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("반지름 입력 : ");
		r = Integer.parseInt(br.readLine());
		
	}

	double calArea()
	{
		double res = 0;
		res = r * r * PI;
		return res;
	}

	double calLength()
	{
		double res = 0;
		res = r * 2 * PI;
		return res;
	}

	void print(double a, double b)
	{
		System.out.printf("\n반지름이 %d인 원의\n",r);
		System.out.printf("넓이 : %.2f\n",a);
		System.out.printf("둘레 : %.2f\n",b);
	}
	
}