/* =======================================================
���� ���� �帧�� ��Ʈ��(���, ���ǹ��� �ݺ���) ����
- if ~ else �� �ǽ�
==========================================================*/
/*
����ڷκ��� ������ ������ �Է¹޾�
�Է¹��� ������... ¦������, Ȧ������, ������
����� �Ǻ��Ͽ� ����ϴ� ���α׷��� �����Ѵ�.

���� ��)
������ ���� �Է� : 14
14 -> ¦��
����Ϸ���.....

������ ���� �Է� : 3
3 -> Ȧ��
����Ϸ���....
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class hyodii030
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n;
		String res = "�Ǻ��Ұ�";
		
		System.out.print("������ ���� �Է� : ");
		n = Integer.parseInt(br.readLine());
		

		if (n==0)
		
			res = "��";
		
		else if (n%2==0)
		
			res = "¦��";
		
		else if(n%2!=0)		
			res = "Ȧ��";

		System.out.printf("%d -> %s\n",n,res);
	}
}
/*
������ ���� �Է� : 0
0 -> ��
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

������ ���� �Է� : 12
12 -> ¦��
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

������ ���� �Է� : 15
15 -> Ȧ��
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/