/* =======================================================
���� ���� �帧�� ��Ʈ��(���, ���ǹ��� �ݺ���) ����
- switch �� �ǽ�
==========================================================*/
/*
����ڷκ��� ������ �� ������ �����ڸ� �Է¹޾�
�ش� �������� ���� ó�� ����� ����ϴ� ���α׷��� �����Ѵ�.
��, switch ���ǹ��� Ȱ���Ͽ� ó���� �� �ֵ��� �ϸ�,
���� ����� ���ǻ� ���������� ó���� �� �ֵ��� �Ѵ�.

���� ��)
ù ��° ���� �Է� : 20
�� ��° ���� �Է� : 14
������ �Է�[+ - * /] : +

>> 20 + 14 = 34
����Ϸ��� �ƹ� Ű�� ��������...
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test038
{
	public static void main(String[] args) throws IOException
	{
		
		/* ���� Ǭ �ڵ�
		int a, b, result=0;
		char op;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());
		System.out.print("������ �Է�[+ - * /] : ");
		op = (char)System.in.read();

		switch (op)
		{
		case '+': result = a + b; break;
		case '-': result = a - b; break;
		case '*': result = a * b; break;
		case '/': result = a / b; break;
		
		}
		
		System.out.printf("\n>> %d %c %d = %d\n",a,op,b,result);
		*/
		
		
		//�Բ� Ǭ �ڵ� 1  -> case ��� ���ڷ� �ޱ�
		/*
		int a, b, result;
		int op;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());
		System.out.print("������ �Է�[+ - * /] : ");
		op = (char)System.in.read();

		// + : 43 / - : 45 / * : 42 / / : 47 
		// op�� byte, short, int, long �̾���Ѵ�.
		switch (op)
		{
			case 43: result = a + b; break;
			case 45: result = a - b; break;
			case 42: result = a * b; break;
			case 47: result = a / b; break;
			default: return; //check~!!
			
		}
		// �� return Ű���尡 ���ϴ� �� ���� �ǹ�
		// 1. ���� ��ȯ
		// 2. �޼ҵ��� ���� -> main()�޼ҵ� ���� -> ���α׷� ��
        // (return�� �߰��ϸ� **��� �޼ҵ�**�� ����ִ��� �� Ȯ��!! ������ main)
		
		System.out.printf("\n>> %d %c %d = %d\n",a,op,b,result);
		System.out.printf("\n>> %d %d %d = %d\n",a,op,b,result); //�̷��� �ϸ� ������ �� �ƽ�Ű�ڵ� ���� ��µ�!!
		*/
		
		//�Բ� Ǭ �ڵ� 2  -> case�� '+' ���
		/*
		int a, b, result;
		int op;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());
		System.out.print("������ �Է�[+ - * /] : ");
		op = (char)System.in.read();

		// + : 43 / - : 45 / * : 42 / / : 47 
		// op�� byte, short, int, long �̾���Ѵ�.
		switch (op)
		{
			//JDK 1.5���� ������ ����
			case '+': result = a + b; break;
			case '-': result = a - b; break;
			case '*': result = a * b; break;
			case '/': result = a / b; break;
			default: return;
			
		}
		
		System.out.printf("\n>> %d %c %d = %d\n",a,op,b,result);
		System.out.printf("\n>> %d %d %d = %d\n",a,op,b,result); //�̷��� �ϸ� ������ �� �ƽ�Ű�ڵ� ���� ��µ�!!
		*/

		//�Բ� Ǭ �ڵ� 3 -> String   case"+" ���
		
		int a, b, result;
		String op;  //-------check~!!!

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());
		System.out.print("������ �Է�[+ - * /] : ");
		op = br.readLine(); //-------check~!!!

		// + : 43 / - : 45 / * : 42 / / : 47 
		// op�� byte, short, int, long �̾���Ѵ�.
		switch (op)
		{
			//JDK 1.7���� ������ ����
			case "+": result = a + b; break;
			case "-": result = a - b; break;
			case "*": result = a * b; break;
			case "/": result = a / b; break;
			default: return;
			
		}
		
		System.out.printf("\n>> %d %s %d = %d\n",a,op,b,result); //-------check~!!! %s
		

	}
}
/* 1.
ù ��° ���� �Է� : 2
�� ��° ���� �Է� : 5
������ �Է�[+ - * /] : +

>> 2 + 5 = 7

>> 2 43 5 = 7
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

ù ��° ���� �Է� : 2
�� ��° ���� �Է� : 2
������ �Է�[+ - * /] : 2
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

/* 2.
ù ��° ���� �Է� : 13
�� ��° ���� �Է� : 5
������ �Է�[+ - * /] : *

>> 13 * 5 = 65

>> 13 42 5 = 65
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

/* 3.
ù ��° ���� �Է� : 131
�� ��° ���� �Է� : 5
������ �Է�[+ - * /] : *

>> 131 * 5 = 655
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

