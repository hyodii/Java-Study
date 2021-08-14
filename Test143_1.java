/* ======================================
  ���� ����(Exception) ó�� ����
=========================================*/
//p.414
//������� ��Ȳ������! �����׷�


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test143_1
{										//---------[���� ó���ϴ� ��� ��]: throws IOException�� ������
	public static void main(String[] args) throws IOException
	{
		//BufferdReader �ν��Ͻ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// �ֿ� ���� ����
		int a, b, c;


		//-----------------[���� ó���ϴ� ��� ��] : try-catch ������ ������ �κ� �ֱ�
		/*
		try
		{
			System.out.print("ù ��° ���� �Է� : ");
			a = Integer.parseInt(br.readLine());
			System.out.print("�� ��° ���� �Է� : ");
			b = Integer.parseInt(br.readLine());
			//error: unreported exception IOException; must be caught or declared to be thrown 
			//                  ---------------------

			c = a + b;

			System.out.println("��� : " + c);


		}
		catch (IOException e)  //IOException�� �̸��ٿ���(e)
		{
			// IOExcepiton �� checked exception
			//-- �޼ҵ带 �����ϴ� �������� throws �� ����
			// ��Ƴ��ų� ������ ���� ��� ������ ���� �߻�.
			System.out.println(e.toString());   //������ ó���ϰڴ�! ���⼱ toString ��
		}
		*/

		
		//----------------- [���� ó���ϴ� ��� ��] : �������� �̿ܿ� �� �Է�
		/*
		try
		{
			System.out.print("ù ��° ���� �Է� : ");
			a = Integer.parseInt(br.readLine());
			System.out.print("�� ��° ���� �Է� : ");
			b = Integer.parseInt(br.readLine());
			
			c = a + b;

			System.out.println("��� : " + c);


		}
		catch (IOException e1)  //IOException�� �̸��ٿ���(e)
		{
			// IOExcepiton �� checked exception
			//-- �޼ҵ带 �����ϴ� �������� throws �� ����
			// ��Ƴ��ų� ������ ���� ��� ������ ���� �߻�.
			System.out.println(e1.toString());   //������ ó���ϰڴ�! ���⼱ toString ��
		}
		catch(NumberFormatException e2)
		{
			System.out.println(e2.toString());
			System.out.println("���� ������ �����͸� �Է��ؾ� �մϴ�~!!!");
		}
		
		// catch �Ǽ� ó���ǰ� ����!
		//ù ��° ���� �Է� : abc
		//java.lang.NumberFormatException: For input string: "abc"
		//���� ������ �����͸� �Է��ؾ� �մϴ�~!!!
		//����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
		*/

		//----------------- [���� ó���ϴ� ��� ��] : catch �ȿ� �ѹ��� ó�� e.printStackTrace()���
		/*
		try
		{
			System.out.print("ù ��° ���� �Է� : ");
			a = Integer.parseInt(br.readLine());
			System.out.print("�� ��° ���� �Է� : ");
			b = Integer.parseInt(br.readLine());
			//error: unreported exception IOException; must be caught or declared to be thrown 
			//                  ---------------------

			c = a + b;

			System.out.println("��� : " + c);


		}
		catch (IOException e)  //IOException�� �̸��ٿ���(e)
		{
			System.out.println(e.toString());   //������ ó���ϰڴ�! ���⼱ toString ��
			System.out.println(e.getMessage());

			System.out.println("pringStackTrace...");
			e.printStackTrace();
		}
		*/

		//----------------- [���� ó���ϴ� ��� etc...]s : finally���
		try
		{
			System.out.print("ù ��° ���� �Է� : ");
			a = Integer.parseInt(br.readLine());
			System.out.print("�� ��° ���� �Է� : ");
			b = Integer.parseInt(br.readLine());
			//error: unreported exception IOException; must be caught or declared to be thrown 
			//                  ---------------------

			c = a + b;

			System.out.println("��� : " + c);


		}
		catch (IOException e)  //IOException�� �̸��ٿ���(e)
		{
			// IOExcepiton �� checked exception
			//-- �޼ҵ带 �����ϴ� �������� throws �� ����
			// ��Ƴ��ų� ������ ���� ��� ������ ���� �߻�.
			System.out.println(e.toString());   //������ ó���ϰڴ�! ���⼱ toString ��
		}

		finally  //check~!!!
		{
			// ���ܰ� �߻��ϰų� �߻����� �ʰų�...
			// ������ ����Ǵ� ����~!!!

			System.out.println("��� �����̽��ϴ�. ���� ���ְ� �����ô�.");
		}



	}
}
