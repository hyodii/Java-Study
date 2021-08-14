/* ======================================
  ���� ����(Exception) ó�� ����
=========================================*/

//Test144������ try-catch��� -> ���������� ���ܸ� ��ƹ����� throws IOException�� ���ο� ���ص� ��!!

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test145
{

	private String[] date = new String[3];


	public void proc() //throws IOException  //-- readLine() ������ throws �Է�!
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str;
		int n = 0;

		try
		{
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
		catch (IOException e)
		{
			System.out.println(e.toString());
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("���� �߻�~!!!");
			System.out.println("getMessage : " + e.getMessage());
			System.out.println("toString   : " + e.toString());
			System.out.println("printStackTrace...........");
			System.out.println();

			//�̸� �Է�(����:ctrl+z) : ��ȿ��
			//�̸� �Է�(����:ctrl+z) : ��ȿ��
			//�̸� �Է�(����:ctrl+z) : ��ȿ��
			//�̸� �Է�(����:ctrl+z) : ��ȿ��
			//���� �߻�~!!!
			//getMessage : 3
			//toString   : java.lang.ArrayIndexOutOfBoundsException: 3
			//printStackTrace...........

			//����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
		}

		
	}

	public static void main(String[] args) //throws IOException
	{
		Test145 ob = new Test145();
		ob.proc();
	}
}

