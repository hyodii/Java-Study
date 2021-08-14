// 비트 단위 연산사 xor(^) 연산자를 활용하여 두 변수에 담겨있는 내용(값) 바꾸기
// 장점) 1. 추가 연산을 안해도되고 2. 빠른 연산을 할 수 있다.


public class hyodii024
{
	public static void main(String[] args)
	{
		int a = 20;
		int b = 23;
		int temp;

		System.out.printf("a->%d, b->%d\n", a, b);
		//System.out.println("a = " +a);
		//System.out.println("b = " +b);
		
		a=a^b;
		b=b^a;
		a=a^b;

		System.out.printf("a->%d, b->%d\n", a, b);		
		//System.out.println("a = " + a + " (비트 shift) ");
		//System.out.println("b = " + b + " (비트 shift) ");

		temp = a;
		a = b;
		b = temp;
		
		System.out.printf("a->%d, b->%d\n", a, b);
		//System.out.println("a = " + a + " (temp 사용) ");
		//System.out.println("b = " + b + " (temp 사용)");
		
	}
}
/*
a->20, b->23
a->23, b->20
a->20, b->23
계속하려면 아무 키나 누르십시오 . . .
*/