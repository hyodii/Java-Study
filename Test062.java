/* =======================================================
���� ���� �帧�� ��Ʈ��(���, ���ǹ��� �ݺ���) ����
- return
==========================================================*/

/* return Ű���尡 ���ϴ� �ΰ��� �ǹ�
	1. ���� ��ȯ
	2. �޼ҵ� ���� -> main �޼ҵ� ���� -> ���α׷� ����
*/
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Test062
{
	public static void main(String[] args) throws IOException
	{
		int n,s;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("������ ���� �Է�(10 �̻�) : ");
		n = Integer.parseInt(br.readLine());

		if (n<10)
		{
			System.out.println("10 �̻��� ������ �Է��ؾ� �մϴ�.");
			return;
			//�޼ҵ� ���� -> main �޼ҵ� ���� -> ���α׷� ����
		}

		s=0;
		for (int i =1; i<=n;i++ )
		{
			s+=i;

		}
		System.out.println("�� : "+ s);
	}
}
/*
������ ���� �Է�(10 �̻�) : 5
10 �̻��� ������ �Է��ؾ� �մϴ�.
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

������ ���� �Է�(10 �̻�) : 18
�� : 171
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/