/* ==================================================
■■■ 메소드 중복정의(Method Overloading) ■■■
- Method Overloading 이 가능한 형태와 불가능한 형태
=====================================================*/
public class Test100
{
	
	public static void main(String[] args)
	{
		print('A');
		print(10, 20);
		print(10,'A');

		double result = print(3.14);
		print(4.75);                    //11번과 12번은 다른거처럼보이지만 자바는 print(xxx)부터 보기때문에 같은 것!
	}

	public static void print() {}
	public static void print(int i) {}
	//public static void print(int j) {}                    //--(X) 자료형과 변수갯수가 같아서 구분이 안됨
	public static void print(char c) {}                     //-- 자동 형 변환 규칙 check~!!!
	public static void print(int i, int j) {}               //-- i가 같은걸보는게 아니라 매개변수의 갯수!
	public static void print(double d) {}
	//public static void print(double d) {return 10.0;}     //-- 정의 불가 void인데 리턴자료형
	//public static double print(double d) {return 10.0;}   //--(X) 위에 23번줄 double d 와 구분 불가  check~!!!



	/*----------------------------------------------------------------------
	public static void main(String[] args)
	{
		

		print();

		print(10);

		print('A');

		print(10, 20);

		print(10,'A');		//-- 자동 형 변환이 되어 성립한다.

		double result = print(3.14);

		print(3.5);

	}



	public static void print(){}

	public static void print(int i){}

	//public static void print(int j){}		//--(x) 왜냐하면 자바는 바로 윗줄과 구분불가

	public static void print(char c){}		//-- ※ 자동 형 변환 규칙 check~!!!

	public static void print(int i, int j){}

	public static double print(double d){return 10.0; }

	//public static void print(double e){}	//-- (x) 왜냐하면 자바는 바로 윗줄과 구분불가
	-------------------------------------------------------------------*/

}