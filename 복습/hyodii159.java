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

		1��° ��� �Է� : ������
		1��° ��� �Է� ����~!!!
		��� �Է� ���(Y/N)? : Y
		
		2��° ��� �Է� : ������
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
			������
			������
		���� ��ü ��� �Ϸ�~!!!

		[�޴� ����]
		1. ��� �߰�
		2. ��� ���
		3. ��� �˻�
		4. ��� ����
		5. ��� ����
		6. ����
		>> �޴� ����(1~6) : 3

		�˻��� ��� �Է� : �ø�

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

		�˻��� ��� �Է� : ������

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

		������ ��� �Է� : �׸����Ʈ

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

		������ ��� �Է� : ������

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

		������ ��� �Է� : ��

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

		������ ��� �Է� : ������
		������ ���� �Է� : ġŲ

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



public class hyodii159
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
		System.out.println("\t6. ����");
		System.out.print("\n\t>> �޴� ����(1~6) : ");
	}

	// �޴� ���� �޼ҵ�
	public static void menuSelect() throws IOException
	{	
		do
		{
			sel = Integer.parseInt(br.readLine());
		}
		while (sel<1 || sel>6);

	}

	// ���õ� �޴� ���࿡ ���� ��� ȣ�� �޼ҵ�
	public static void menuRun() throws IOException, NumberFormatException
	{
		switch(sel)
		{
			case Menus.E_ADD   : addElement(); break;
			case Menus.E_DISP  : dispElement(); break;
			case Menus.E_FIND  : findElement(); break;
			case Menus.E_DEL   : delElement(); break;
			case Menus.E_CHA   : chaElement(); break;
			case Menus.E_EXIT  : exit(); break;
		}
	}

	// ��� �߰�(�Է�) �޼ҵ�
	public static void addElement() throws IOException
	{
		do
		{
			System.out.printf("\t%d��° ��� �Է� : ", vt.size() +1);
			String temp = br.readLine();
			vt.add(temp);
			System.out.printf("\n\t%d��° ��� �Է� ����~!!!",vt.size());
			System.out.print("\n\t��� �Է� ���(Y/N)? : ");
			con = br.readLine().toUpperCase();
		}
		while (con.equals("Y"));
		System.out.println();
		
	}

	// ��� ��� �޼ҵ�
	public static void dispElement() 
	{
		System.out.println();
		System.out.println("\t[���� ��ü ���]");
		for (int i=0; i<vt.size(); i++)
			System.out.printf("\t%s\n", vt.get(i));
		System.out.println("\t���� ��ü ��� �Ϸ�~!!!");
	}

	// ��� �˻� �޼ҵ�
	public static void findElement() throws IOException
	{
		System.out.println();
		System.out.print("\t�˻��� ��� �Է� : ");
		String temp = br.readLine();

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
		System.out.print("\n\t������ ��� �Է� : ");
		String temp = br.readLine();
		System.out.println("\n\t[�˻� ��� ���]");
		if(vt.contains(temp))
		{
			int i = vt.indexOf(temp);
			vt.remove(i);
			System.out.printf("\t%s �׸��� �����Ǿ����ϴ�.",temp);
		}
		else
			System.out.println("\t�׸��� �������� �ʽ��ϴ�.");

	}

	// ��� ����(����) �޼ҵ�
	public static void chaElement() throws IOException
	{
		System.out.print("\n\t������ ��� �Է� : ");
		String temp = br.readLine();

		if(vt.contains(temp))
		{
			
			System.out.print("\t������ ���� �Է� : ");
			String change = br.readLine();
			int i = vt.indexOf(temp);
			vt.set(i, change);
			System.out.println("\n\t[���� ��� ���]");
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
