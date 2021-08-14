/* ===============================
■■■ 클래스와 인스턴스 ■■■
==================================*/
import java.util.Scanner;

class CircleTest2
{
	
	// 정보 은닉(Information Hiding)
	// 멤버 변수, 인스턴스 변수, 전역 변수
	// 『private』이라는 접근제어지시자의 선언은
	// 클래스 내부에서만 접근 및 참조가 가능하게 하겠다는 의미
	// int형 변수 0으로 초기화 지원
	private int r;

	//int r;

	//(private에 값 입력하기 위해)
	// getter 값을 얻는 것
	// setter 값을 채워넣는 것
	//근데 private으로 막아놓고 왜 겟 셋으로 받아와또? 
	// -> 입력받은것을 조건문에 걸러서 컨트롤이 가능해!(100이상만 입력받아라 이런것)
	// -> 규칙을 정할 수 있음

	/*
	int getR()       //getR과 setR은 CircleTest2의 멤버변수이다
	{
		return r;
	}

	void setR(int r)
	{
		this.r = r;
	}
	*/

	void input()
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("반지름 입력 : ");
		r = sc.nextInt();
	}

	double calArea()
	{
		return r * r * 3.141592;
	}

	void write(double a)
	{
		System.out.println("반지름 : " + r);
		System.out.println("넓  이 : " + a);
	}

}

//외부의 다른 클래스
public class Test093
{
	// 그외부의 다른 클래스의 메소드
	public static void main(String[] args)
	{
		CircleTest2 ob1 = new CircleTest2();
		
		//ob1.r = 10;                                //입력받은값 넣으려고 input했는데 이러면 출력 10 됨 -> private지정하면 해결!
		//System.out.println("원의 반지름 : "+ob1.r);

		//ob1.setR(10);                                //private지정한거에 이렇게 넣으면 값 받아올 수 있음
		//System.out.println("원의 반지름 : " + ob1.getR());

		//ob1.r = 10000;
		
		ob1.input();
		//--5000

		double result = ob1.calArea();
		
		ob1.write(result);

	}
}
/*  실행 결과
반지름 입력 : 5000
반지름 : 5000
넓  이 : 7.85398E7
계속하려면 아무 키나 누르십시오 . . .
*/