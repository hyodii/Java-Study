//����ڷκ��� ������ ������ �Է¹޾�
//�Է¹��� ������ �������, ��������, 0���� �����Ͽ�
//�� ����� ����ϴ� ���α׷��� �����Ѵ�.
//��, �Է� �����ʹ� BufferedReader�� readLine()�� ���� �Ѱܹ��� �� �ֵ��� �Ѵ�.
//����, ���� ������(���׿�����)�� Ȱ���Ͽ� ����� ������ �� �ֵ��� �Ѵ�.

// ���࿹)
// ������ ���� �Է� : -12
// -12 -> ����
//���...

// ������ ���� �Է� : 257
// 257 -> ���
//���...

// ������ ���� �Է� : 0 
// 0 -> ��
//���...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class hyodii027
{
	public static void main(String[] args) throws IOException
	{
		int n;
		String strResult;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("������ ���� �Է� : ");
		n = Integer.parseInt(br.readLine());

		strResult = (n==0 ? "��" : (n>0 ? "���" : "����"));
		
		System.out.printf("%d -> %s\n",n,strResult);
	}
}
/*
������ ���� �Է� : 0
0 -> ��
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

������ ���� �Է� : 257
257 -> ���
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

������ ���� �Է� : -85
-85 -> ����
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/