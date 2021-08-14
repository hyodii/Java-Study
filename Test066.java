/* ====================================
■■■ 클래스와 인스턴스 ■■■
=======================================*/

// ※ CircleTest.java 파일과 세트~!!!
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

import java.io.IOException;

public class Test066
{											//예외처리 CircleTest에서도 했지만 main에 나와도
										    // main안에 CircleTest가 있는 것이므로 여기서도 예외처리 해줘야!
	public static void main(String[] args)  throws IOException  // cheeck~!!!
	{
		//CircleTest 클래스 인스턴스 생성
		CircleTest ob = new CircleTest();

		//생성된 인스턴스 ob를 통해 반지름 입력 메소드 호출
		ob.input(); //리턴자료형이 void면 = 으로 받을꺼 없음

		//생성된 인스턴스 ob를 통해 넓이 연산 메소드 호출
		double b = ob.calArea();
		//생성된 인스턴스 ob를 통해 둘레 연산 메소드 호출
		double t = ob.calLength();

		
		//생성된 인스턴스 ob를 통해 출력 메소드 호출
		ob.print(b,t);
	}
}
/*
반지름 입력 : 5

반지름이 5인 원의
넓이 : 78.54
둘레 : 31.42
계속하려면 아무 키나 누르십시오 . . .
*/