/* =======================================================
���� ���� �帧�� ��Ʈ��(���, ���ǹ��� �ݺ���) ����
- if ~ else �� �ǽ�
==========================================================*/
/*
����ڷκ��� ������ �� ������ �����ڸ� �Է¹޾�
�ش� �������� ���� ó�� ����� ����ϴ� ���α׷��� �����Ѵ�.
��, if ���ǹ��� Ȱ���Ͽ� ó���� �� �ֵ��� �ϸ�,
���� ����� ���ǻ� ���������� ó���� �� �ֵ��� �Ѵ�.

���� ��)
ù ��° ���� �Է� : 20
�� ��° ���� �Է� : 14
������ �Է�[+ - * /] : +

>> 20 + 14 = 34
����Ϸ��� �ƹ� Ű�� ��������...
*/

//�ּ�ó��
// /**/�ȿ� /**/ ����!!

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test032
{
	public static void main(String[] args) throws IOException //BufferedReader�� ������ζ����� ����
	{
		/* ��� �� �⺻Ǯ��
		//�ֿ� ���� ����
		int num1, num2;
		char O;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//���� �� ó��
		System.out.print("ù ��° ���� �Է� : ");
		num1 = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		num2 = Integer.parseInt(br.readLine());
		//"1234"-> Integer.parseInt() -> 1234
		//"abcd" -> Integer.parseInt() -> (��ȯ X, ���ڸ���� ������ �־�� �������·� �ٲ���)

		
		System.out.print("������ �Է�[+ - * /] : ");
		O = (char)System.in.read();
		//        ============== �� ��ŭ�� int�� 
		//read()�޼ҵ�� �⺻������ �� ���ڸ� �о���� ���̰�, readLine()���ڿ��� �о� ���� ��
		//System.in.skip(2); //���� �ٽ� �Է��ϴ� ���� �ƴϴϱ� �Ƚᵵ �ǰ� ���صǰ� ���� ���� �Ҹ��!

		
		//if �� ��� ���
		if(O == '+') //43==43
		{
			System.out.printf("\n>> %d + %d = %d\n",num1,num2,(num1 + num2));
		}else if(O == '-') //45==45
		{
			System.out.printf("\n>> %d - %d = %d\n",num1,num2,(num1 - num2));
		}else if(O == '*') //42==42
		{
			System.out.printf("\n>> %d * %d = %d\n",num1,num2,(num1 * num2));
		}else if(O == '/') //47==47
		{
			System.out.printf("\n>> %d / %d = %d\n",num1,num2,(num1 / num2));
		}else
		{
			System.out.printf("\n�ùٸ� �����ȣ�� �Է��Ͻʽÿ� \n");
		}
		*/

		/*
		// ��� �� �����ڸ� ���ڷ� ���
		//----check~!!
		int num1, num2, O;  //---- ù ��°, �� ��° ����, �׸��� ������
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//���� �� ó��
		System.out.print("ù ��° ���� �Է� : ");
		num1 = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		num2 = Integer.parseInt(br.readLine());
		//"1234"-> Integer.parseInt() -> 1234
		//"abcd" -> Integer.parseInt() -> (��ȯ X, ���ڸ���� ������ �־�� �������·� �ٲ���)

		
		System.out.print("������ �Է�[+ - * /] : ");
		O = (char)System.in.read(); //���ڿ��� �ƽ�Ű�ڵ尪���� �������� �� ���۵� ������ ���ڿ��� ���� �������� ��

		//if ������ �����϶��� ���̽� ���� ������~! ----check~!!
		if(O == 43) //43==43
		
			System.out.printf("\n>> %d + %d = %d\n",num1,num2,(num1 + num2));
		else if(O == 45) //45==45
		
			System.out.printf("\n>> %d - %d = %d\n",num1,num2,(num1 - num2));
		else if(O == 42) //42==42
		
			System.out.printf("\n>> %d * %d = %d\n",num1,num2,(num1 * num2));
		else if(O == 47) //47==47
		
			System.out.printf("\n>> %d / %d = %d\n",num1,num2,(num1 / num2));
		else
		
			System.out.printf("\n�ùٸ� �����ȣ�� �Է��Ͻʽÿ� \n");
		
		*/

		// ��� �� : ��±����� �ϳ��� ���� ��
		int num1, num2, result = 0;
		char op;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//���� �� ó��
		System.out.print("ù ��° ���� �Է� : ");
		num1 = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		num2 = Integer.parseInt(br.readLine());

		
		System.out.print("������ �Է�[+ - * /] : ");
		op = (char)System.in.read();

		//if ������ �����϶��� ���̽� ���� ������~! ----check~!!
		if(op == '+') //43==43
		
			result = num1 + num2;
		else if(op == '-') //45==45
		
			result = num1 - num2;
		else if(op == '*') //42==42
		
			result = num1 * num2;
		else if(op == '/') //47==47
		
			result = num1 / num2;
		//else ---check~!! else �������� result �ʱⰪ �����������!!!
		
		System.out.printf("\n>> %d %c %d = %d\n",num1, op,num2, result);
		

	}
}
/* ���� ���
ù ��° ���� �Է� : 5
�� ��° ���� �Է� : 2
������ �Է�[+ - * /] : +
>> 5 + 2 = 7
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

ù ��° ���� �Է� : 5
�� ��° ���� �Է� : 2
������ �Է�[+ - * /] : -
>> 5 - 2 = 3
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

ù ��° ���� �Է� : 5
�� ��° ���� �Է� : 2
������ �Է�[+ - * /] : *
>> 5 * 2 = 10
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

ù ��° ���� �Է� : 5
�� ��° ���� �Է� : 2
������ �Է�[+ - * /] : /
>> 5 / 2 = 2
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

ù ��° ���� �Է� : 5
�� ��° ���� �Է� : 2
������ �Է�[+ - * /] : d
�ùٸ� �����ȣ�� �Է��Ͻʽÿ�
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/