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

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

public class hyodii032
{
	public static void main(String[] args) throws IOException
	{
		
		System.out.println("===========[Scanner �̿�]============");
		Scanner sc = new Scanner(System.in);
		int n1, n2, res=0;
		char c;

		System.out.print("ù ��° ���� �Է� : ");
		n1 = sc.nextInt();
		System.out.print("�� ��° ���� �Է� : ");
		n2 = sc.nextInt();
		System.out.print("������ �Է�[+ - * /] : ");
		c = sc.next().charAt(0);

		if (c == '+')
			res = n1 + n2;
		else if(c == '-')
			res = n1  -n2;
		else if(c =='*')
			res =  n1 * n2;
		else if (c =='/')
			res = n1 / n2;

		System.out.println();
		System.out.printf(">> %d %c %d = %d\n",n1,c,n2,res);

		System.out.println("===========[BufferedReader �̿�]============");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("ù ��° ���� �Է� : ");
		n1 = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է� : ");
		n2 = Integer.parseInt(br.readLine());
		System.out.print("������ �Է�[+ - * /] : ");
		c = (char)System.in.read();
		//        ============== �� ��ŭ�� int�� 
		//read()�޼ҵ�� �⺻������ �� ���ڸ� �о���� ���̰�, readLine()���ڿ��� �о� ���� ��
		//System.in.skip(2); //���� �ٽ� �Է��ϴ� ���� �ƴϴϱ� �Ƚᵵ �ǰ� ���صǰ� ���� ���� �Ҹ��!


		if (c == '+')
			res = n1 + n2;
		else if(c == '-')
			res = n1  - n2;
		else if(c =='*')
			res =  n1 * n2;
		else if (c =='/')
			res = n1 / n2;
		//else ---check~!! else �������� result �ʱⰪ �����������!!!

		System.out.println();
		System.out.printf(">> %d %c %d = %d\n",n1,c,n2,res);
	}
}
/*
===========[Scanner �̿�]============
ù ��° ���� �Է� : 5
�� ��° ���� �Է� : 2
������ �Է�[+ - * /] : +

>> 5 + 2 = 7
===========[BufferedReader �̿�]============
ù ��° ���� �Է� : 2
�� ��° ���� �Է� : 5
������ �Է�[+ - * /] : *

>> 2 * 5 = 10
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
