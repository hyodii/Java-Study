/* ===============================
���� Ŭ������ �ν��Ͻ� ����
- Ŭ������ �ν��Ͻ� Ȱ��
==================================*/

/*
1 ~ 3 ������ ������ �߻����Ѽ�
����, ����, �� ���� ���α׷��� �����Ѵ�.
��, Ŭ������ ������ Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�.
����, �迭�� Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�.
���������� RpsGame Ŭ������ �ϼ��� �� �ֵ��� �Ѵ�.

�� ���� ������ -> 1:����, 2:����, 3:��
���� ���� ���� �迭�� ������ �� 

���� ��)
1:����  2:����  3:��  �� �Է�(1~3) : 4
1:����  2:����  3:��  �� �Է�(1~3) : -2
1:����  2:����  3:��  �� �Է�(1~3) : 2

-����   : ����
-��ǻ�� : ��

>> �º� ���� ��� : ��ǻ�Ͱ� �̰���ϴ�~!!!
����Ϸ���...
*/

import java.util.Random;
import java.util.Scanner;

class RpsGame
{
	private int user;
	private int com;

	private void runCome()  // ��ǻ���� ����������
	{
		Random rd = new Random();
		com = rd.nextInt(3)+1;  //-- 0 1 2  -> 1 2 3
	}
	
	public void input()    // ������� ���������� 
	{
		runCome();

		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.print("1:����  2:����  3:��  �� �Է�(1~3) : ");
			user = sc.nextInt();
		}
		while (user<1 || user>3);
		
	}//end input()

	//�߰���� ������ִ� �޼ҵ�
	public void middleCalc()
	{
		String[] str = {"����", "����", "��"};
		
		System.out.println();
		//System.out.println("- ����   : " + user);  //�̷��� ���ڰ� ��µ�
		System.out.println("- ����   : " + str[user-1]);  //str[1] str[2] str[3]     ----check~!!!
		System.out.println("- ��ǻ�� : " + str[com-1]);   //�ε������� 0�ε� ������������ 1 2 3���� �Ǿ������ϱ� -1 �������!!
		System.out.println();
	}

	//�ºο� ���� ��� ����
	public String resultCalc()
	{
		String result = "���º��Դϴ�.";

		if (user==1 && com==3 || user==2 && com==1 || user==3 && com==2)    // ����ڰ� �¸��� ��Ȳ
			result = "����� �̰���ϴ�~!!!";
		else if(user==1 && com==2 || user==2 && com==3 ||user==3 && com==1)      // ��ǻ�Ͱ� �¸��� ��Ȳ
			result = "��ǻ�Ͱ� �̰���ϴ�~�Ф�";

		return result;

	}//end resultCalc()

	//���� ��� ���
	public void print(String str)
	{
		System.out.println(">> �º� ���� ��� : " + str);
	}

		

	/*----------------------------------------------------------------------
	//[���� Ǭ �ڵ�]
	String[] rps = {"����","����","��"};

	public void set()
	{
		Scanner sc = new Scanner(System.in);
		
		
		Random rd = new Random();
		com = rd.nextInt(3)+1;

		do
		{
			System.out.print("1:����  2:����  3:��  �� �Է�(1~3) : ");
			user = sc.nextInt();
		}
		while (user<1 || user>3);

	}

	public void input()
	{
		System.out.println();
		System.out.println("-����   : " + rps[user-1]);  //�ε������� 0�ε� ������������ 1 2 3���� �Ǿ������ϱ�
		System.out.println("-��ǻ�� : " + rps[com-1]);
		System.out.println();
	}

	public void print()
	{
		String result;
		result = "���º�";
		
		if (user==1 && com==3 || user==2 && com==1 || user==3 && com==2)
			result = "������ �̰���ϴ�~!!!";
		if(user==1 && com==2 || user==2 && com==3 ||user==3 && com==1)
			result = "��ǻ�Ͱ� �̰���ϴ�~!!!";

		System.out.println(">> �º� ���� ��� : " + result);
	}
	-------------------------------------------------------------------*/


	

}

//main() �޼ҵ带 �����ϰ� �ִ� �ܺ��� �ٸ� Ŭ����
public class Test098
{
	public static void main(String[] args)
	{
		/*----------------------------------------------------------------------
		RpsGame ob = new RpsGame();
		ob.set();
		ob.input();
		ob.print();
		-------------------------------------------------------------------*/
		RpsGame ob = new RpsGame();

		ob.input();
		ob.middleCalc();
		String result = ob.resultCalc();
		ob.print(result); 

	}
}
/*
1:����  2:����  3:��  �� �Է�(1~3) : 1


- ����   : ����
- ��ǻ�� : ��

>> �º� ���� ��� : ����� �̰���ϴ�~!!!
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .




1:����  2:����  3:��  �� �Է�(1~3) : 2


- ����   : ����
- ��ǻ�� : ��

>> �º� ���� ��� : ��ǻ�Ͱ� �̰���ϴ�~�Ф�
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .




1:����  2:����  3:��  �� �Է�(1~3) : 3


- ����   : ��
- ��ǻ�� : ��

>> �º� ���� ��� : ���º��Դϴ�.
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/