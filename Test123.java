/* ======================================
  ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
  - Object Ŭ����
=========================================*/

// �� Test122 �� ��~!!!

// import java.lang.*;

public class Test123 //extends Object
{
	/*
	...
	
	public String toString()
	{
		...;
	}

	...
	*/
	
	@Override
	public String toString()
	{
		return "�������� toString()...";
	}
	public static void main(String[] args)
	{
		Test123 ob = new Test123();
		System.out.println(ob.toString());
		//--==>> �������� toString()...

		System.out.println(ob);
		//--==>> �������� toString()...
	}
}