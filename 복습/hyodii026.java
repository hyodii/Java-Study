//����ڷκ��� ������ ������ �Է¹޾�
//�Է¹��� ������ ¦������ Ȧ������ �Ǻ��ϴ� ���α׷��� �����Ѵ�.
//��, ���� ������(���׿�����)�� Ȱ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.

//���� ��)
//������ ���� �Է� : 10

//==[�Ǻ� ���]==
//10 -> ¦��
//===============
//����Ϸ��� �ƹ� Ű�� ��������...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class hyodii026
{
	public static void main(String[] args) throws IOException
	{
		int n; //�Է� ���� ����
		String res; //����� ���� ����
		InputStreamReader isr = new InputStreamReader(System.in); 
		BufferedReader br = new BufferedReader(isr);

		System.out.print("������ ���� �Է� : ");
		n = Integer.parseInt(br.readLine());

		res = (n%2==0 ? "¦��" : "����");

		System.out.printf("%d -> %s\n",n,res);
	}
}
/*
������ ���� �Է� : 23
23 -> ����
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

������ ���� �Է� : 28
28 -> ¦��
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/