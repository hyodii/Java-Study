/* =======================================================
���� ���� �帧�� ��Ʈ��(���, ���ǹ��� �ݺ���) ����
- switch �� �ǽ�
==========================================================*/

/*
1���� 3������ ���� �� �ϳ��� ����ڷκ��� �Է¹޾�
�Է¹��� ������ŭ�� ������(��)�� ��µǴ� ���α׷��� �ۼ��Ѵ�.
��, �� ���� ������� ������ �� �ֵ��� �Ѵ�.

1. swich ���� �Ϲ� ���� ����Ͽ� �ذ��Ѵ�.
2. swich ���� �⺻ ���� ����ϵ�, break;�� �� �� ���� ����� �� �ֵ��� �����Ѵ�.

���� ��)
������ ���� �Է�(1~3) : 3
�ڡڡ�
����Ϸ���...

������ ���� �Է�(1~3) : 7
�Է� ����~!!
����Ϸ���...
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test037
{
	public static void main(String[] args) throws IOException
	{
		int n;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("������ ���� �Է�(1~3) : ");
		n = Integer.parseInt(br.readLine());

		// �Ϲݸ�
		System.out.print("\n<�Ϲݸ�>\n");
		switch (n)
		{
			//case�� ���� ���� �߿�!!!!! case ��� ��� :�̰Ŵ� �ٿ��� �������!!
			case 1 : System.out.println("��"); break;
			case 2 : System.out.println("�ڡ�"); break;
			case 3 : System.out.println("�ڡڡ�"); break;
			default : System.out.println("�Է� ����~!!!"); break;
		}

		//�⺻��  print()���
		System.out.print("\n<�⺻��>\n");
		switch (n)
		{
			case 3 : System.out.print("��");
			case 2 : System.out.print("��");
			case 1 : System.out.print("��\n"); 
			break;
			default : System.out.println("�Է� ����~!!!");			
		}

	}
}

/* ���� ���
������ ���� �Է�(1~3) : 2

<�Ϲݸ�>
�ڡ�

<�⺻��>
�ڡ�
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .


������ ���� �Է�(1~3) : 5

<�Ϲݸ�>
�Է� ����~!!!

<�⺻��>
�Է� ����~!!!
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/