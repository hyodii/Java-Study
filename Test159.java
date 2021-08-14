/* ====================================================
  ���� �÷��� �����ӿ�ũ(Collection Framework) ����
=======================================================*/
/*

//Ǯ�� ��ȭ��

�� �ǽ� ����

Test159 Ŭ������ �ϼ��Ͽ� ���� ����� ���� ���α׷��� �����Ѵ�.

���� ��)

		[�޴� ����]
		1. ��� �߰�
		2. ��� ���
		3. ��� �˻�
		4. ��� ����
		5. ��� ����
		6. ����
		>> �޴� ����(1~6) : 1

		1��° ��� �Է� : �չ���
		1��° ��� �Է� ����~!!!
		��� �Է� ���(Y/N)? : Y
		
		2��° ��� �Է� : ���±�
		2��° ��� �Է� ����~!!!
		��� �Է� ���(Y/N)? n

		[�޴� ����]
		1. ��� �߰�
		2. ��� ���
		3. ��� �˻�
		4. ��� ����
		5. ��� ����
		6. ����
		>> �޴� ����(1~6) : 2

		[���� ��ü ���]
			�չ���
			���±�
		���� ��ü ��� �Ϸ�~!!!

		[�޴� ����]
		1. ��� �߰�
		2. ��� ���
		3. ��� �˻�
		4. ��� ����
		5. ��� ����
		6. ����
		>> �޴� ����(1~6) : 3

		�˻��� ��� �Է� : ����ȭ

		[�˻� ��� ���]
		�׸��� �������� �ʽ��ϴ�.

		[�޴� ����]
		1. ��� �߰�
		2. ��� ���
		3. ��� �˻�
		4. ��� ����
		5. ��� ����
		6. ����
		>> �޴� ����(1~6) : 3

		�˻��� ��� �Է� : �չ���

		[�˻� ��� ���]
		�׸��� �����մϴ�.

		[�޴� ����]
		1. ��� �߰�
		2. ��� ���
		3. ��� �˻�
		4. ��� ����
		5. ��� ����
		6. ����
		>> �޴� ����(1~6) : 4

		������ ��� �Է� : ���ش�

		[���� ��� ���]
		�׸��� �������� �ʾ� ������ �� �����ϴ�.

		[�޴� ����]
		1. ��� �߰�
		2. ��� ���
		3. ��� �˻�
		4. ��� ����
		5. ��� ����
		6. ����
		>> �޴� ����(1~6) : 4

		������ ��� �Է� : ���±�

		[���� ��� ���]
		���±� �׸��� �����Ǿ����ϴ�.

		[�޴� ����]
		1. ��� �߰�
		2. ��� ���
		3. ��� �˻�
		4. ��� ����
		5. ��� ����
		6. ����
		>> �޴� ����(1~6) : 5

		������ ��� �Է� : ������

		[���� ��� ���]
		������ ����� �������� �ʽ��ϴ�.

		[�޴� ����]
		1. ��� �߰�
		2. ��� ���
		3. ��� �˻�
		4. ��� ����
		5. ��� ����
		6. ����
		>> �޴� ����(1~6) : 5

		������ ��� �Է� : �չ���
		������ ���� �Է� : ������

		[���� ��� ���]
		������ �Ϸ�Ǿ����ϴ�.

		[�޴� ����]
		1. ��� �߰�
		2. ��� ���
		3. ��� �˻�
		4. ��� ����
		5. ��� ����
		6. ����
		>> �޴� ����(1~6) : 6

		���α׷� ����
	����Ϸ��� �ƹ� Ű�� ��������...


*/

import java.util.Vector;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Menus    //--�ϼ�
{
	public static final int E_ADD = 1;     //-- ��� �߰�
	public static final int E_DISP = 2;    //-- ��� ���
	public static final int E_FIND = 3;    //-- ��� �˻�
	public static final int E_DEL = 4;     //-- ��� ����
	public static final int E_CHA = 5;     //-- ��� ����
	public static final int E_EXIT = 6;    //-- ����

}



public class Test159
{

	// �ֿ� �Ӽ� ���� -- �ϼ�
	private static final Vector<Object> vt;
	private static BufferedReader br;
	private static Integer sel;         //-- ���� ��
	private static String con;	        //-- ��� ����

	// static �ʱ�ȭ �� -- �ϼ�
	static
	{
		//Vector �ڷᱸ�� ����
		vt = new Vector<Object>();

		// BufferedReader �ν��Ͻ� ����
		br = new BufferedReader(new InputStreamReader(System.in));

		// ����� �Է°� �ʱ�ȭ
		sel = 1;
		con = "Y";
	}

	//�޴� ��� �޼ҵ�
	public static void menuDisp()
	{
		System.out.println("\n\t[�޴� ����]");
		System.out.println("\t1. ��� �߰�");
		System.out.println("\t2. ��� ���");
		System.out.println("\t3. ��� �˻�");
		System.out.println("\t4. ��� ����");
		System.out.println("\t5. ��� ����");
		System.out.println("\t6. ��     ��");
		System.out.println();
		System.out.print("\t>> �޴� ����(1~6) : ");
	}

	// �޴� ���� �޼ҵ�
	public static void menuSelect() throws IOException
	{
		
		do
		{
			//System.out.print("\t>> �޴� ����(1~6) : ");   //-- ���⿡ �ص� �������
			sel = Integer.parseInt(br.readLine());	
		}
		while (sel<1 || sel>6);
			
	}

	// ���õ� �޴� ���࿡ ���� ��� ȣ�� �޼ҵ�
	public static void menuRun() throws IOException, NumberFormatException
	{
			/*
			if (sel ==1)	
			{
				addElement();
			}

			else if (sel ==2)
			{
				dispElement();
			}

			else if (sel ==3)
			{
				findElement();
			}
			else if (sel ==4)    
			{
				delElement();
			}
			else if (sel ==5)    
			{
				chaElement();
			}
			else if (sel ==6)    
			{
				exit();
			}
			*/
			switch (sel)
			{
				case Menus.E_ADD  : addElement(); break;
				case Menus.E_DISP : dispElement(); break;
				case Menus.E_FIND : findElement(); break;
				case Menus.E_DEL  : delElement(); break;
				case Menus.E_CHA  : chaElement(); break;
				case Menus.E_EXIT : exit(); break;     //���� 456�� �������� exit�� ����ȴ�!
				default : System.out.println("\t >> �޴� ���� ����~!!!"); break;
			}

	}

	// ��� �߰�(�Է�) �޼ҵ�
	public static void addElement() throws IOException
	{		
		do
		{
			System.out.printf("\t%d��° ��� �Է� : " ,vt.size()+1);     //check~!!    ó������ ��Ұ� ����
			String temp = br.readLine();
			vt.add(temp);    //--boolean ����ص� ��! Ȯ��!
			System.out.println();
			System.out.printf("\t%d��° ��� �Է� ����~!!!",vt.size());    //check~!!  ���⼱ �߰���Ұ� �����ϱ�!!!
			System.out.println();
			System.out.print("\t��� �Է� ���(Y/N)? : ");
			con = br.readLine().toUpperCase();  //check~!!
			//con = br.readLine()
		}
		//while (con != "n" || con != "N" || con != "y" || con != "Y");
		//while(con.equals("y") || con.equals("Y"));
		while(con.equals("Y"));  //.toUpperCase() �� .toLowerCase()���� �ϳ��� �����~!

		System.out.println();

		//if(con.equals("y") || con.equals("Y"))
			//addElement();   //-- ��� �Լ�
	}

	// ��� ��� �޼ҵ�
	public static void dispElement() 
	{
		System.out.println();
		// ���� �ڷᱸ�� v �� ��ü ��� ���
		System.out.println("\t[���� ��ü ���]");
		for (int i=0; i<vt.size();i++)
			System.out.printf("%s\n", vt.get(i));	
		System.out.println("\t���� ��ü ��� �Ϸ�~!!!");

	}

	// ��� �˻� �޼ҵ�
	public static void findElement() throws IOException
	{
		System.out.println();
		String temp = "";

		System.out.print("\t�˻��� ��� �Է� : ");
		temp = br.readLine();

		int i = vt.indexOf(temp);

		System.out.println("\t[�˻� ��� ���]");
		if (i<0)
			System.out.println("\t�׸��� �������� �ʽ��ϴ�.");		
		else
			System.out.println("\t�׸��� �����մϴ�.");		
	}

	// ��� ���� �޼ҵ�
	public static void delElement() throws IOException
	{
		System.out.println();
		System.out.print("\t������ ��� �Է� : ");
		String temp = br.readLine();
		System.out.println();
		
		System.out.println("\t[�˻� ��� ���]");
		if (vt.contains(temp))     
		{
			int i = vt.indexOf(temp);
			vt.remove(i);            //--boolean ����ص� ��! Ȯ��!
			System.out.printf("\t%s �׸��� �����Ǿ����ϴ�.\n",temp);
		}
		else
			System.out.println("\t�׸��� �������� �ʾ� ������ �� �����ϴ�.");

	}

	// ��� ����(����) �޼ҵ�
	public static void chaElement() throws IOException
	{
		System.out.println();
		System.out.print("\t������ ��� �Է� : ");
		String temp = br.readLine();
		if (vt.contains(temp))     
		{
			System.out.print("\t������ ���� �Է� :");
			String change = br.readLine();	
			int i = vt.indexOf(temp);
			vt.set(i, change);

			System.out.println();
			System.out.println("\t[���� ��� ���]");
			System.out.println("\t������ �Ϸ�Ǿ����ϴ�.");
		}
		else
		{
			System.out.println("\n\t[���� ��� ���]");
			System.out.println("\t������ ��� �������� �ʽ��ϴ�.");
		}
	}

	//���α׷� ���� �޼ҵ� -- �ϼ�
	public static void exit()
	{
		System.out.println("\t���α׷� ����~!!!");
		System.exit(-1);
	}


	
	// main() �޼ҵ� -- �ϼ�
	public static void main(String[] args) throws IOException
	{
		do
		{
			menuDisp();
			menuSelect();
			menuRun();

		}
		while (true);
	}

}

/*
[�޴� ����]
1. ��� �߰�
2. ��� ���
3. ��� �˻�
4. ��� ����
5. ��� ����
6. ����

>> �޴� ����(1~6) : 1
1��° ��� �Է� : ��ȿ��

1��° ��� �Է� ����~!!!
��� �Է� ���(Y/N)? : y
2��° ��� �Է� : ��ȿ��

2��° ��� �Է� ����~!!!
��� �Է� ���(Y/N)? : n

[�޴� ����]
1. ��� �߰�
2. ��� ���
3. ��� �˻�
4. ��� ����
5. ��� ����
6. ����

>> �޴� ����(1~6) : 2

[���� ��ü ���]
��ȿ��
��ȿ��
���� ��ü ��� �Ϸ�~!!!
[�޴� ����]
1. ��� �߰�
2. ��� ���
3. ��� �˻�
4. ��� ����
5. ��� ����
6. ����

>> �޴� ����(1~6) : 3

�˻��� ��� �Է� : ��ȿ��
[�˻� ��� ���]
�׸��� �����մϴ�.
[�޴� ����]
1. ��� �߰�
2. ��� ���
3. ��� �˻�
4. ��� ����
5. ��� ����
6. ����

>> �޴� ����(1~6) : 4

������ ��� �Է� : ��ȿ��

[�˻� ��� ���]
��ȿ�� �׸��� �����Ǿ����ϴ�.
[�޴� ����]
1. ��� �߰�
2. ��� ���
3. ��� �˻�
4. ��� ����
5. ��� ����
6. ����

>> �޴� ����(1~6) : 5

������ ��� �Է� : ��ȿ��
������ ���� �Է� :�迬��

[���� ��� ���]
������ �Ϸ�Ǿ����ϴ�.
[�޴� ����]
1. ��� �߰�
2. ��� ���
3. ��� �˻�
4. ��� ����
5. ��� ����
6. ����

>> �޴� ����(1~6) : 2

[���� ��ü ���]
�迬��
���� ��ü ��� �Ϸ�~!!!
[�޴� ����]
1. ��� �߰�
2. ��� ���
3. ��� �˻�
4. ��� ����
5. ��� ����
6. ����

>> �޴� ����(1~6) : 6
        ���α׷� ����~!!!
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/