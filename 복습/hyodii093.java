import java.util.Scanner;

class CircleTest2
{
	private int r;

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
public class hyodii093
{
	public static void main(String[] args)
	{
		CircleTest2 ob1 = new CircleTest2();

		ob1.input();

		double result = ob1.calArea();
		ob1.write(result);
	}
}
/*
반지름 입력 : 2
반지름 : 2
넓  이 : 12.566368
계속하려면 아무 키나 누르십시오 . . .
*/