/* =============================================
���� Ŭ���� ��� ����
- ��ø Ŭ����   (�ǹ����� ������ ���� ���� ^__^ ~)
================================================*/

/*
�� Annonymous Ŭ����(�͸��� Ŭ���� :  ���� Ŭ����)       //--��� ����ϰ� ������ Ŭ����
	
	- awt �� �ȵ���̵� �̺�Ʈ ó������ �Ϲ������� ���
	- ���� Ŭ���� �޼ҵ带 �ϳ� ���� �������� �ʿ伺�� ���� �� ���
	- Ŭ������ ��ü�� �ʿ��ϸ� �� �ٽ� Ŭ������ �����ؾ� �ϴ� 
	  ���ŷο� ������ �͸��� Ŭ������ �����Ͽ� ó���Ѵ�.

�� ���� �� ����

	new ����Ŭ������ ������()
	{
		�������������� �ڷ��� �޼ҵ�()
		{
			...;
		}
	};         //�� �����ݷ� check~!!!
*/


//import java.lang.*;
class Test3 //extends Object     //-- ��� Ŭ������ ������Ʈ��� Ŭ������ ��ӹ���!!
								 // �ٵ� �̷��� �ڹ� ���� ��� �κп��� �̰� �����ΰ�?
								 // �ƴϴ�! ���� ����Ŭ������ ������Ʈ��� Ŭ�����̱� ������ ��� Ŭ������ ����Ŭ������!
{
	/*
	Object Ŭ������ �����...
	...
	  
	public String toString()  //-- toString : ��ü�� ������ �ִ� ������ ������ ���ڿ��� ����� �����ϴ� �޼ҵ�
	{
		...;
	}
	*/

	public Object getString()
	{
		/*
		Object result;

		result = new Object();

		return Object;   // == return result;
		*/

		/* ���� �����̶� ���� ����
		return new Object();
			   ------------ Object ��
		*/

		return new Object()
		{
			public String toString()
			{
				return "�͸��� Ŭ����...";
			}
		};   // ����Ŭ�� �� check~!!!


	}//end getString()
}//end class Test3


public class Test121 //extends Object
{
	/*
	Object �� �����ִ� �����...
	*/
	public static void main(String[] args)
	{
		Test3 ob1 = new Test3();
		Test3 ob2 = new Test3();

		System.out.println(ob1.toString());   //������Ʈ�κ��� ��ӹ��� ����Ʈ���޼ҵ带 ��ӹ޾Ƽ� ����ϰ� �ִ°�!
		//--==>> Test3@15db9742

		Test121 ob3 = new Test121();
		System.out.println(ob3.toString());   //������Ʈ�κ��� ��ӹ��� ����Ʈ���޼ҵ带 ��ӹ޾Ƽ� ����ϰ� �ִ°�!
		//--==>> Test121@6d06d69c

		System.out.println(ob2.getString());
		//--==>> �͸��� Ŭ����...

	}
}