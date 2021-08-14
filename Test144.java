/* ======================================
  ���� ����(Exception) ó�� ����
=========================================*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test144 
{

	private String[] date = new String[3];


	public void proc() throws IOException  //-- readLine() ������ throws �Է�!
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str;
		int n = 0;

		System.out.print("�̸� �Է�(����:ctrl+z) : ");

		
		//   ������ �����ʺ����ε� ��ȣ�� ������ ����
		while ((str = br.readLine()) != null)         //-- readLine() ������ throws �����ָ� ���� �߻�!
		{                         //-------- == ctrl+z 
			date[n++] = str;
			System.out.print("�̸� �Է�(����:ctrl+z) : ");
		}

		System.out.println("�Էµ� ����...");
		for(String s : date)
		{
			if(s != null)
			{
				System.out.println(s);
			}
		}
	}

	public static void main(String[] args) throws IOException
	{
		Test144 ob = new Test144();
		ob.proc();
	}
}


// �迭�� 3���� 4�� ���������ϴϱ� �����߻� -> �̰� unchecked excepion