import java.util.Scanner;

class Rect
{
	int w,h;

	void input()  //입력만 받고 반환값(return)이 없으니까 void
		{
			Scanner sc = new Scanner(System.in);
			System.out.print("가로 입력 : ");
			w = sc.nextInt();
			System.out.print("세로 입력 : ");
			h = sc.nextInt();
		}

		int calArea()
		{
			int res=0;
			res = w * h;
			return res;
		}

		int calLength()
		{
			int res = 0;
			res = (w + h) * 2;
			return res;
		}

		void print(int a,int l)
		{
			System.out.println("가로 : " + w);
			System.out.println("세로 : " + h);
			System.out.println("넓이 : " + a);
			System.out.println("둘레 : " + l);
		}

}

public class Test065
{
	public static void main(String[] args)
	{
		Rect ob = new Rect();

		ob.input();

		int a = ob.calArea();
		int l = ob.calLength();

		ob.print(a,l);
	}
}
/*
가로 입력 : 50
세로 입력 : 2
가로 : 50
세로 : 2
넓이 : 100
둘레 : 104
계속하려면 아무 키나 누르십시오 . . .
*/

/*
----------------------------------------------설명-------------------------------------------------------
*/
/* ====================================
■■■ 클래스와 인스턴스 ■■■
=======================================*/
// 직사각형 클래스 설계
/*
직사각형의 넓이와 둘레 계산, 클래스로 표현

클래스의 정체성 -> 직사각형
클래스의 속성   -> 가로, 세로, (넓이, 둘레, 부피, 무게, 재질, 색깔, ....)
클래스의 기능   -> 넓이 계산, 둘레 계산, 가로세로 입력, 결과 출력

객체를 구성     -> 데이터(속성, 상태) + 기능(동작, 행위)
    ↓                    ↓                  ↓
클래스를 설계   ->       변수         +     메소드


class 직사각형
{
	// 데이터(속성, 상태) -> 변수
	int 가로, 세로;

	// 기능(동작, 행위)   -> 메소드
	가로세로 입력()
	{
	}

	둘레 계산()
	{
	}

	넓이 계산()
	{
	}

	결과 출력()
	{
	}

}
*/
/*--------------------------------------------------------------------------------------------------------------
import java.util.Scanner;

class Rect   //직사각형 클래스 설계
{
	// 데이터(속성, 상태) -> 변수
	int w, h;             // 가로, 세로; (전역 변수)

	// 기능(동작, 행위)   -> 메소드
	void input()   //가로세로 입력()  입력만 받고 반환할 값이 없으니까 void 
	               //메소드의 값을 반환할 수 있는 방법은 return 뿐 근데 여기선 없으니까 void
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("가로 입력 : ");
		w = sc.nextInt();

		System.out.print("세로 입력 : ");
		h = sc.nextInt();
	}

	int calLength()   //둘레 계산 가로 세로는 input에서 값 담아뒀을꺼고 그리고 굳이 여기서 또 안불러와도되니까 
	                  //매개변수 안 넘겨줘도 됨 () 끝
					  //반환값은 int
	{
		// 결과값으로 반환하게 될 변수 선언 및 초기화
		int result = 0;  //int로 반환하니까 int로 만들기

		// 선언한 변수에 값 채워넣기
		// result =  (가로 + 세로) * 2;
		result =  (w + h) * 2;

		// 최종 결과 값 반환
		return result;
	}

	int calArea()  // 넓이 계산() -> 가로 * 세로
	{
		int result = 0;

		result = w * h;

		return result;
	}

	void print(int a, int l)  //결과 출력()  -> 가로와 세로는 보이지만 넓이랑 둘레는 안보여서 매개변수로 받아줘야함
	                          //반환 값이 없고 그냥 출력하기때문에 void
	{
		//가로 : 10
		//세로 : 20
		//넓이 : xxx
		//둘레 : xxx

		System.out.println("가로 : " + w);
		System.out.println("세로 : " + h);
		System.out.println("넓이 : " + a);
		System.out.println("돌레 : " + l);
	}

}

//※ 하나의 자바 파일(.java)에 여러 개 이상의 클래스(class)를 만들 수 있다.
//하지만 이 과정에서 『public class』가 붙는 클래스는 하나여야함!!
//그리고 파일의 이름은 public이 붙어있는 클래스가 파일명의 된다.
// 일반적으로 하나의 파일에 하나의 클래스를 설계한다.
// 또한, 여러 개의 클래스ㅏ 설계된 파일을 컴파일하게 되면
// 내부에 설계된 클래스 수 만큼 클래스 파일(.class)이 파생된다.
// 실무에서는 하나의 자바파일에는 하나의 클래스 만드는 것이 일반적임

public class Test065
{
	public static void main(String[] arsg)
	{
		// Rect 클래스 인스턴스 생성
		Rect ob = new Rect(); //Rect 메모리를 생성해서 ob라는 참조변수를 만들었음
		
		// 생성된 인스턴스 ob를 활용하여 입력 메소드를 호출한다.
		ob.input(); //인풋메소드 호출

		//생성된 인스턴스 ob를 통해 넓이 연산 메소드 호출
		//그러나 인풋처럼 반환할값이 없는 것이 아니기 때문에
		//ob.calLength();  이것이 아니라 
		//-> 메소드 호출로 얻어낸 값을 담아낼 준비
		int area = ob.calArea();

		
		//생성된 인스턴스 ob를 통해  둘레 연산 메소드 호출
		//-> 메소드 호출로 얻어낸 값을 담아낼 준비
		int length = ob.calLength();

		//생성된 인스턴스 ob를 통해 출력 메소드 호출
		ob.print(area, length);

	}
}
------------------------------------------------------------------------------------------------------------------*/
/*
가로 입력 : 10
세로 입력 : 20
가로 : 10
세로 : 20
넓이 : 200
돌레 : 60
계속하려면 아무 키나 누르십시오 . . .
*/
