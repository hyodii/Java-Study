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
import java.util.Scanner;
import java.util.Random;
class RpsGame
{
	private int user;
	private int com;

	private void runCome()
	{
		Random rd = new Random();
		com = rd.nextInt(3)+1;
	}

	public void input()
	{
		runCome();

		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.print("1:����  2:����  3:��  �� �Է�(1~3) : ");
			user = sc.nextInt();
		}
		while (user<1 || user>3);
	}

	public void middleCalc()
	{
		String[] str = {"����", "����", "��"};  //--check~!!!

		System.out.println();
		System.out.println("- ��  ��  : " + str[user-1]);
		System.out.println("- ��ǻ��  : " + str[com-1]);
		System.out.println();

	}

	public String resultCalc()
	{
		String result = "���º��Դϴ�.";
		
		if (user==1 && com==3 || user==2 && com==1 || user==3 && com==2)
			result = "����� �̰���ϴ�~!!!";
		else if(user==1 && com==2 || user==2 && com==3 ||user==3 && com==1)
			result = "��ǻ�Ͱ� �̰���ϴ�~�Ф�";

		return result;
	}

	public void print(String str)
	{
		System.out.println(">> �º� ���� ��� : " + str);
	}
}
		


public class hyodii098
{
	public static void main(String[] args)
	{
		RpsGame ob = new RpsGame();

		ob.input();
		ob.middleCalc();
		String result = ob.resultCalc();
		ob.print(result);
	}


}
/*
1:����  2:����  3:��  �� �Է�(1~3) : 8
1:����  2:����  3:��  �� �Է�(1~3) : -2
1:����  2:����  3:��  �� �Է�(1~3) : 3

- ��  ��  : ��
- ��ǻ��  : ��

>> �º� ���� ��� : ���º��Դϴ�.
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

1:����  2:����  3:��  �� �Է�(1~3) : 2

- ��  ��  : ����
- ��ǻ��  : ��

>> �º� ���� ��� : ��ǻ�Ͱ� �̰���ϴ�~�Ф�
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

1:����  2:����  3:��  �� �Է�(1~3) : 1

- ��  ��  : ����
- ��ǻ��  : ��

>> �º� ���� ��� : ����� �̰���ϴ�~!!!
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
