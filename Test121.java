//import java.lang.*;

class Test3 //extends Object  
{
	/*
	Object 클래스의 멤버들...
	...
	
	public String toString()   //-- toString : 객체가 가지고 있는 정보나 값들을 문자열로 만들어 리턴하는 메소드
	{
		...;
	}
	*/

	public Object getString()
	{
		return new Object()
		{
			public String toString()
			{
				return "익명의 클래스...";
			}
		};

	}//end getString()

}//end class Test3

public class Test121
{
	public static void main(String[] args)
	{
		Test3 ob1 = new Test3();
		Test3 ob2 = new Test3();

		System.out.println(ob1.toString());
		//--==>> Test3@15db9742

		Test121 ob3 = new Test121();

		System.out.println(ob3.toString());
		//--==>> hyodii121@6d06d69c

		System.out.println(ob2.getString());
		//--==>> 익명의 클래스...
	}
}
