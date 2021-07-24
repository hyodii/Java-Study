public class Test024
{
	public static void main(String[] args)
	{
		int a = 20;
		int b = 23;
		int temp;

		System.out.printf("a->%d, b->%d\n", a, b);
			
		a=a^b;
		b=b^a;
		a=a^b;

		System.out.printf("a->%d, b->%d\n", a, b);		
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.printf("a->%d, b->%d\n", a, b);		
	}
}
/*
a->20, b->23
a->23, b->20
a->20, b->23
계속하려면 아무 키나 누르십시오 . . .
*/
