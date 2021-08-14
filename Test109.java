/* ======================================
���� Ŭ���� ��� ����
- ���(Inheritance)
=========================================*/
/*
������ ���� ���α׷��� �����Ѵ�.
��, ����� ������ �����Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.

���� ��)
������ �� ���� �Է�(���� ����) : 20 15
������ �Է�(+ - * /) : -
>> 20 - 15 = 5.00
����Ϸ��� �ƹ� Ű�� ��������...
*/
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

//super class
class Aclass
{
	protected int x, y;
	protected char op;

	Aclass()
	{
		
	}

	void write(double result)
	{
		System.out.printf(">> %d %c %d = %.2f%n", x,op,y,result);
	}
}


// sub class -> Aclass �� ��ӹ޴� Ŭ����
class Bclass extends Aclass
{
	/* �̷��� ��ӹ���

	protected int x, y;
	protected char op;


	// �����ڴ� ��Ӿȵ�! �׷��� �����ڰ� ��������� �ʾƵ� �̰� �������
	//Bclass()
	//{
	//	 super();
	//}
	//


	void write(double result)
	{
		System.out.printf(">> %d %c %d = %.2f%n", x,op,y,result);
	}
	*/

	
	// �Է� 
	boolean input()  throws IOException   //������ void �ص��� ���ο� ���
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //������ Scanner ����ϴµ� ���۵�� ���ڿ��ڸ��°� �غ���!

		System.out.print("������ �� ���� �Է�(���� ����) : ");  // : 20 15
		String temp = br.readLine();     // "20 15"
		String[] strArr = temp.split("\\s"); //������ -> ����
		// String[] strArr = {"20", "15"};


		// �� ���ڿ�.split("������")
		//		ex) "10 20 30 40".split("\\s");    //���� \s�� ����!
		//		-> {"10", "20", "30", "40"} ��ȯ

		if(strArr.length != 2)
			return false;
		//-- false�� ��ȯ�ϸ� input()�޼ҵ� ����
		//	�� ������ ������ ���....
		//	�� �ڵ��� �Ʒ��� �����ؾ� �� �ڵ尡 �����ִ���
		//	������� ��ȯ�ϸ� �޼ҵ�� ����ȴ�~!!

		x = Integer.parseInt(strArr[0]);
		y = Integer.parseInt(strArr[1]);

		System.out.print("������ �Է�(+ - * /) : ");
		op = (char)System.in.read();
		
		/*
		// �������� ����  &&
		if(op != '+' && op != '-' && op != '*' && op != '/')
		{
			return false;
		}

		return true;
		*/
			
		
		// �������� ||  => true false �κе� �ٲ�����!!��
		if(op=='+' || op=='-' || op=='*' || op=='/')
		{
			return true;  //-- check~!!
		}

		return false;    //-- check~!!
		

	}// end input()

	double calc()
	{
		double result = 0;
		
		switch(op)
		{
			case '+' : result = x + y; break;
			case '-' : result = x - y; break;
			case '*' : result = x * y; break;
			case '/' : result = (double)x / y; break;  //������� ����� �Ǽ��ϱ� ���ʿ� double �ٿ��ֱ�!

		}

		return result;

	}//end calc()
	
	
	/* ���� Ǭ��...
	private int x, y;
	private char op;
	private double result;

	
	public void calc(char op)
	{
		if (op=='+')
		{
			result = x + y;
		}
		if (op=='-')
		{
			result = x - y;
		}
		if (op=='*')
		{
			result = x * y;
		}
		if (op=='/')
		{
			result = x / y;
		}

	}

	@Override
	void write(double result)
	{
		System.out.printf(">> %d %c %d = %.2f%n", x,op,y,result);
	}
	*/


}// end Bclass

// main() �޼ҵ带 �����ϴ� �ܺ��� �ٸ� Ŭ����
public class Test109
{
	public static void main(String[] args) throws IOException
	{
		Bclass ob = new Bclass();

		if (!ob.input())
		{
			System.out.println("Error...");
			return; // ���α׷� ����
		}

		double result = ob.calc();

		ob.write(result);

	}//end main()
}//end class Test109

/*
������ �� ���� �Է�(���� ����) : 20 15
������ �Է�(+ - * /) : +
>> 20 + 15 = 35.00
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

������ �� ���� �Է�(���� ����) : 20 15
������ �Է�(+ - * /) : -
>> 20 - 15 = 5.00
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

������ �� ���� �Է�(���� ����) : 20 15
������ �Է�(+ - * /) : *
>> 20 * 15 = 300.00
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

������ �� ���� �Է�(���� ����) : 20 15
������ �Է�(+ - * /) : /
>> 20 / 15 = 1.33
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/