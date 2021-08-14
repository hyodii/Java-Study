/* ======================================
  ���� ����(Exception) ó�� ����
=========================================*/

// Test146.java ���ϰ� ��~!!!  ���ܸ� �߻����Ѽ� �ذ�!

class Demo2
{
	private int value;

	public void setValue(int value) throws Exception   //check~!!!   Exception �� lang��Ű���� �־ import���� ������~!
	{
		if(value<=0)
		{
			// ���� ����(�߻�) - ���߹� ������ ���⼭ �� ��!
			throw new Exception("value �� 0���� �۰ų� ���� �� �����ϴ�.");
			// throw ���ܸ� �߻���ų�� ����ϴ� Ű����!!   ==> �̷��� �����ϸ� ����! throws Exception �ۼ��������!!
		}

		this.value = value;
	}

	public int getValue()
	{
		return value;
	}
}

public class Test147
{
	public static void main(String[] args) //throws Exception   //check~!!!  �̷��� ���ִ��� �ƴϸ� try-catch�� ��Ƴ�!
	{
		Demo2 ob = new Demo2();

		try
		{
			ob.setValue(-3);
			int result = ob.getValue();
			System.out.println(result);
		}
		catch (Exception e)  // checked Exception
		{
			System.out.println(e.toString());
		}
		
	}
}
/*
java.lang.Exception: value �� 0���� �۰ų� ���� �� �����ϴ�.
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/