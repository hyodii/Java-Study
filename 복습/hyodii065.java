/* ====================================
���� Ŭ������ �ν��Ͻ�(instance) ����
=======================================*/
// ���簢�� Ŭ���� ����
/*
���簢���� ���̿� �ѷ� ���, Ŭ������ ǥ��

���� �Է� : 10
���� �Է� : 20
���� : 10
���� : 20
���� : 200
���� : 60
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

import java.util.Scanner;

class Rect
{
	int w,h;

	void input()  //�Է¸� �ް� ��ȯ��(return)�� �����ϱ� void
		{
			Scanner sc = new Scanner(System.in);
			System.out.print("���� �Է� : ");
			w = sc.nextInt();
			System.out.print("���� �Է� : ");
			h = sc.nextInt();
		}

		int calArea()
		{
			int res=0;
			res = w * h;
			return res;
		}

		int calLength()
		{
			int res = 0;
			res = (w + h) * 2;
			return res;
		}

		void print(int a,int l)
		{
			System.out.println("���� : " + w);
			System.out.println("���� : " + h);
			System.out.println("���� : " + a);
			System.out.println("�ѷ� : " + l);
		}

}

public class hyodii065
{
	public static void main(String[] args)
	{
		Rect ob = new Rect();

		ob.input();

		int a = ob.calArea();
		int l = ob.calLength();

		ob.print(a,l);
	}
}
/*
���� �Է� : 50
���� �Է� : 2
���� : 50
���� : 2
���� : 100
�ѷ� : 104
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/