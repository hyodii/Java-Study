/* ==================================================
■■■ 메소드 중복정의(Method Overloading) ■■■
- Method Overloading 이 가능한 형태와 불가능한 형태
=====================================================*/
public class hyodii100
{
	public static void main(String[] args)
	{
		print('A');

		print(4.75);	
	
	}

	public static void print() {}
	public static void print(int i) {}
	//public static void print(int j) {}
	public static void print(char c) {}
	public static void print(int i, int j) {}
	//public static void print(double d) {}
	//public static void print(double d) {return 10.0;}
	public static double print(double d) {return 10.0;}
}