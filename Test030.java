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

public class Test030
{
	public static void main(String[] args) throws IOException
	{
		
		//�ʱ� ���� ����
		int n;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//���� �� ó��
		System.out.print("������ ���� �Է� : ");
		n = Integer.parseInt(br.readLine());
		
		//�ٽ��� 0�� ���� ó���� �ɷ����� ���� ���� �߿�!!! ----check~!!
		String strResult = "�Ǻ��Ұ�";

		if(n==0)
		{
			strResult = "��";
		}else if(n%2!=0)
		{
			strResult = "Ȧ��";
		}
		else if(n%2==0)
		{
			strResult = "¦��";
		}

		//��� ���
		System.out.printf("%d -> %s\n",n,strResult);
	}
}
/*
������ ���� �Է� : 12
12 -> ¦��
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

������ ���� �Է� : 11
11 -> Ȧ��
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

������ ���� �Է� : 0
0 -> ��
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/