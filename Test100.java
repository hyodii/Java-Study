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
	//public static void print(double d) {}
	//public static void print(double d) {return 10.0;}     //-- 정의 불가 void인데 리턴자료형
	public static double print(double d) {return 10.0;}   //--(X) 위에 double d 와 구분 불가  check~!!!

}
