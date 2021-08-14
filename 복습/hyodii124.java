/* ======================================
  ■■■ 자바의 주요(중요) 클래스 ■■■
  - Object 클래스
=========================================*/

class Test
{
	private int a = 10;

	public void write()
	{
		System.out.println("a : " + a);
	}
}

public class hyodii124
{
	public static void main(String[] args)
	{
		Test ob1 = new Test();
		Test ob2 = new Test();

		System.out.println("10 == 9 : " + (10 == 9));
		//--==>> 10 == 9 : false

		int a = 10;
		int b = 10;
		System.out.println("a == b : " + (a == b));
		//--==>> a == b : true

		System.out.println("ob1 == ob2 : " + (ob1 == ob2));
		//--==>> ob1 == ob2 : false    //check~!!

		System.out.println("ob1.equals() : " + (ob1.equals(ob2)));
		System.out.println("ob2.equals() : " + (ob2.equals(ob1)));
		//--==>> ob1.equals() : false
		//		 ob2.equals() : false

		System.out.println();
		System.out.println("-----------------------------------------------");
		System.out.println();

		System.out.println("ob1            : " + ob1);
		System.out.println("ob1.toString() : " + ob1.toString());
		//--==>> ob1            : Test@15db9742
		//		 ob1.toString() : Test@15db9742
		System.out.println("ob2            :" + ob2);
		System.out.println("ob2.toString() :" + ob2.toString());
		//--==>> ob2            :Test@6d06d69c
		//		 ob2.toString() :Test@6d06d69c


	}
}