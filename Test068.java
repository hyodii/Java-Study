/* ====================================
���� Ŭ������ �ν��Ͻ� ����
=======================================*/

/*
����ڷκ��� ������ �� ������ �����ڸ� �Է¹޾�
��ģ������ �����ϴ� ���α׷��� �����Ѵ�.
��, Ŭ������ �ν��Ͻ��� ������ Ȱ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.

���� ��)
������ �� ���� �Է�(���� ����) : 10 5
������ ������ �Է�(+ - * /)    : +
>> 10 + 5 = 15
����Ϸ��� �ƹ� Ű�� ��������...

*/

import java.io.IOException;
import java.util.Scanner;

class Calculate
{
	//�ֿ� ���� ����
	int n1, n2;   //����ڷκ��� �Է¹��� �� ������ ��Ƶ� ����
	char op;      //����ڷκ��� �Է¹��� �����ڸ� ��Ƶ� ����
	
	Calculate() //�������ϴ� �������� ��������� �����ڰ� ���ٸ� �ڵ����� ������ ��

	{
		
	}

	void input() throws IOException   // System.in.read������ ���
	{
		//int n1, n2; ���� �����߱� ������ ������ �ʿ����!!! -> �̰Ŷ��� ��� >> 0 + 0 = 0.00������ -_��
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �� ���� �Է�(���� ����) : "); //Scanner���� ��ū�� �����ؼ� �޾ƿ� �� ����
		//sc = new Scanner(sc.next()).useDelimiter("\\s*,\\s*");
		n1 = sc.nextInt();
		n2 = sc.nextInt();

		System.out.print("������ ������ �Է�(+ - * /)    : ");
		op = (char)System.in.read();
	}

	double cal()
	{
		int res=0;

		switch(op)
		{
			case '+' : res = n1 + n2; break;
			case '-' : res = n1 - n2; break;
			case '*' : res = n1 * n2; break;
			case '/' : res = n1 / n2; break;
		}
					
		return res;
	}

	void print(double res)
	{
		System.out.printf(">> %d %c %d = %.2f\n",n1,op,n2,res);		
	}

}

public class Test068
{
	public static void main(String[] args) throws IOException
	{
		//Calculate Ŭ���� �ν��Ͻ� ����
		Calculate ob = new Calculate();
						   //Calculate()�̰� �������� ���µ� �����ü� �־�? -> 27�� ���� Ȯ��!!
		ob.input();

		double res = ob.cal();

		ob.print(res);
	}
}
/*
������ �� ���� �Է�(���� ����) : 10 5
������ ������ �Է�(+ - * /)    : /
>> 10 / 5 = 2.00
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
