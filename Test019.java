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

public class Test019
{
	public static void main(String[] args) throws IOException
	{
		// �� �ֿ� ���� ����
		int fir, sec;	// ����� �Է°��� ���� ����
		int res1, res2, res3, res4, res5; // �� ���꿡 ���� ����� ���� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// �� ���� �� ó��
		System.out.print("ù ��° ���� �Է� : ");
		fir = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		sec = Integer.parseInt(br.readLine());

		res1 = fir + sec;
		res2 = fir - sec;
		res3 = fir * sec;
		res4 = fir / sec;
		res5 = fir % sec;



		// �� ��� ���
		System.out.printf("\n====[���]====\n");
		System.out.printf("%d + %d = %d\n",fir, sec, res1);
		System.out.printf("%d - %d = %d\n",fir, sec, res2);
		System.out.printf("%d * %d = %d\n",fir, sec, res3);
		System.out.printf("%d / %d = %d\n",fir, sec, res4);
		System.out.printf("%d %% %d = %d\n",fir, sec, res5); // %% check~!! %���� ��������
		// �ڹٿ����� %���ڿ��� �����ϸ� �׵ڿ� s,c,f�̷��� �ڿ� ���� �˾Ҵµ� �ȿ��ϱ� ����籸�� ��� ������
		//�׷��� ������� %%�̷��� �ϸ� ��!

		System.out.printf("==============\n");
	}

}
/* ���� ���
ù ��° ���� �Է� : 10
�� ��° ���� �Է� : 2

====[���]====
10 + 2 = 12
10 - 2 = 8
10 * 2 = 20
10 / 2 = 5
10 % 2 = 0
==============
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/