import java.util.Scanner;

class CircleTest2
{
	private int r;

	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է� : ");
		r = sc.nextInt();
	}

	double calArea()
	{
		return r * r * 3.141592;
	}

	void write(double a)
	{
		System.out.println("������ : " + r);
		System.out.println("��  �� : " + a);
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
������ �Է� : 2
������ : 2
��  �� : 12.566368
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/