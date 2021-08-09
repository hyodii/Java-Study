class Test //extends Object
{
	/*
	public boolean equals(object obj)
	{
		...;
	}
	*/
	private int a = 10;
	
	public void write()
	{
		System.out.println("a : " + a);
	}
}


public class Test124
{
	public static void main(String[] args)
	{
		Test ob1 = new Test();
		Test ob2 = new Test();

		System.out.println("10 == 9 : " + (10 == 9));
		//--==>> 10 == 9 : false
		//-- 『==』 비교연산자는 피연산자의 크기를 비교함을 확인(관찰)

		int a = 10;
		int b = 10;
		System.out.println("a == b : " + (a == b));
		//--==>> a == b : true
		//-- 『==』 비교연산자는 피연산자의 크기를 비교함을 확인(관찰)

		System.out.println("ob1 == ob2 : " + (ob1 == ob2));
		//--==>> ob1 == ob2 : false     --> 같은 Test타입이지만 크기가 다르게 나옴!
		//-- 객체(Test 즉, Object)들을 비교하는 과정에서 사용하는 『==』 연산자는
		//	 크기를 비교하는 것이 아니라 객체의 주소값을 비교(할당되는 주소값을 다름!!)
		//		check~!!!

		System.out.println("ob1.equals() : " + (ob1.equals(ob2)));
		System.out.println("ob2.equals() : " + (ob2.equals(ob1)));
		//--==>> ob1.equals() : false
		//		 ob2.equals() : false
		//-- 『==』 연산자와 Object 클래스가 갖고있는 『equals()』  메소드는
		//	  동일한 개념으로 객체의 주소값을 비교

		System.out.println();
		System.out.println("-----------------------------------------------");
		System.out.println();

		System.out.println("ob1            :" + ob1);
		System.out.println("ob1.toString() :" + ob1.toString());
		//--==>> ob1            :Test@15db9742
		//		 ob1.toString() :Test@15db9742

		System.out.println("ob2           :" + ob2);
		System.out.println("ob2.toString() :" + ob2.toString());
		//--==>> ob2           :Test@6d06d69c
		//		 ob2.toString() :Test@6d06d69c

		// 『클래스명@해시코드』
		
		// ※ 해시코드(hashcode)
		//		: 자바 내부적으로 객체를 구분하기 위해 사용하는 것.
		//		  메모리의 주소값으로 생각하면 절대로 안된다.
		//		  hashcode(해시코드)가 같다고 같은 객체는 아니다.



	}
}
