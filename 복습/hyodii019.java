/* =================================================
���� �ڹ� �⺻ ���α׷��� ����
- ��� ������
- BufferedReader
- printf()
===================================================*/

// ����ڷκ��� ������ ������ �� �� �Է¹޾�
// ��Ģ���� �� ������ ������ �����Ͽ�
// �� ����� ����ϴ� ���α׷��� �����Ѵ�.
// ��, �Է¹��� ������ BuferedReader �� Ȱ���� �� �յ��� �ϰ�
// ����ϴ� ������ print() �޼ҵ带 Ȱ���� �� �ֵ��� �Ѵ�.
// ����, ������ ������ ���ǻ� ���� ������� ó���Ѵ�.

// ���� ��)
// ù ��° ���� �Է� : 10
// �� ��° ���� �Է� : 2

// ====[���]====
// 10 + 2 = 12
// 10 - 2 = 10
// 10 * 2 = 20
// 10 / 2 = 5
// 10 % 2 = 0
// =============

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class hyodii019
{
	
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n1,n2;

		System.out.print("ù ��° ���� �Է� : ");
		n1 = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է� : ");
		n2 = Integer.parseInt(br.readLine());

		System.out.printf("\n====[���]====\n");
		System.out.printf("%d + %d = %d\n",n1,n2,n1+n2);
		System.out.printf("%d - %d = %d\n",n1,n2,n1-n2);
		System.out.printf("%d * %d = %d\n",n1,n2,n1*n2);
		System.out.printf("%d / %d = %d\n",n1,n2,n1/n2);
		System.out.printf("==============\n");


	}
}
/*
ù ��° ���� �Է� : 10
�� ��° ���� �Է� : 2

====[���]====
10 + 2 = 12
10 - 2 = 8
10 * 2 = 20
10 / 2 = 5
==============
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/