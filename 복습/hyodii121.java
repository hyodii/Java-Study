/* =============================================
���� Ŭ���� ��� ����
- ��ø Ŭ����   (�ǹ����� ������ ���� ���� ^__^ ~)
================================================*/

//import java.lang.*;

class Test3 //extends Object  
{
	/*
	Object Ŭ������ �����...
	...
	
	public String toString()   //-- toString : ��ü�� ������ �ִ� ������ ������ ���ڿ��� ����� �����ϴ� �޼ҵ�
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
				return "�͸��� Ŭ����...";
			}
		};

	}//end getString()

}//end class Test3

public class hyodii121
{
	public static void main(String[] args)
	{
		Test3 ob1 = new Test3();
		Test3 ob2 = new Test3();

		System.out.println(ob1.toString());
		//--==>> Test3@15db9742

		hyodii121 ob3 = new hyodii121();

		System.out.println(ob3.toString());
		//--==>> hyodii121@6d06d69c

		System.out.println(ob2.getString());
		//--==>> �͸��� Ŭ����...
	}
}