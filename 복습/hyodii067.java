/* ====================================
���� Ŭ������ �ν��Ͻ� ����
=======================================*/

/*
����ڷκ��� ������ ������ �Է¹޾�
1���� �Է¹��� �� ������ ���� �����Ͽ�
������� ����ϴ� ���α׷��� �����Ѵ�.

��, Ŭ������ �ν��Ͻ��� ������ Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�.
����, �Է� ó�� �������� BufferedReader�� Ȱ���ϸ�,
�Է� �����Ͱ� 1 ���� �۰ų� 1000 ���� ū ���
�ٽ� �Է¹��� �� �ִ� ó���� �����Ͽ� ���α׷��� ������ �� �ֵ��� �Ѵ�.

���� ��)
������ ���� �Է�(1~1000) : 1022
������ ���� �Է�(1~1000) : -20
������ ���� �Է�(1~1000) : 100
>> 1 ~ 100 ������ �� : 5050
����Ϸ��� �ƹ� Ű�� ��������...
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Hap
{
	int n;

	void input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		do
		{
			System.out.print("������ ���� �Է�(1~1000) : ");
			n = Integer.parseInt(br.readLine());
		}
		while (n<1 || n>1000);
	}
	
	int sum()
	{
		int res=0;
		for (int i=0;i<=n;i++)
		{
			res += n;
			
		}
		return res;   //��ġ check~!!
		
	}

	void print(int s)
	{
		System.out.printf(">> 1 ~ %d ������ �� : %d\n",n,s);
	}


}
public class hyodii067
{
	public static void main(String[] args) throws IOException
	{
		Hap t = new Hap();
		t.input();
		int a = t.sum();
		t.print(a);
	}
}
/*
������ ���� �Է�(1~1000) : 0
������ ���� �Է�(1~1000) : -20
������ ���� �Է�(1~1000) : 1005
������ ���� �Է�(1~1000) : 50
>> 1 ~ 50 ������ �� : 2550
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/