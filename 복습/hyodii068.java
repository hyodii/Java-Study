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

import java.util.Scanner;
import java.io.IOException; // System.in.read������ ���

class Calculate
{
	int a,b;
	char c;

	void input() throws IOException  // System.in.read������ ���
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �� ���� �Է�(���� ����) : ");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.print("������ ������ �Է�(+ - * /)    :");
		c = (char)System.in.read();
	}

	double cal()
	{
		double res=0;
		if(c=='+')
			res = a + b;
		else if(c=='-')
			res = a - b;
		else if(c=='*')
			res = a * b;
		else if(c=='/')
			res = a / b;
		return res;			
	}

	void print(double r)
	{
		System.out.printf(">> %d %c %d = %.2f\n",a,c,b,r);
	}

}

public class hyodii068
{
	public static void main(String[] args) throws IOExceptiond  // System.in.read������ ���
	{
		Calculate ob = new Calculate();
		ob.input();
		double c = ob.cal();
		ob.print(c);
	}
}
/*
������ �� ���� �Է�(���� ����) : 5 2
������ ������ �Է�(+ - * /)    :-
>> 5 - 2 = 3.00
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/