/* ====================================
���� Ŭ������ �ν��Ͻ� ����
=======================================*/

// �� hyodii066.java ���ϰ� ��Ʈ~!!!
/*
���� ���̿� �ѷ� ���ϱ�
���� ���̿� �ѷ��� ���� �� �ִ� Ŭ������ �����Ѵ�.
(Ŭ������ : CircleTest) -> CircleTest.java
Test065.java ������ �����ϵ�
���� ���� �� ���� ���Ϸ� ������ �۾��� �����Ѵ�.
����, BufferedReader�� Ȱ���Ѵ�.

���� ���� = ������ * ������ * 3.141592
���� �ѷ� = ������ * 2 * 3.141592

���� ��)
������ �Է� : 13

�������� 13�� ����
���� : xxx.xx
�ѷ� : xxx.xx
����Ϸ��� �ƹ� Ű�� ��������...
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class CircleTest
{
	int r;
	final double PI = 3.141592;

	void input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("������ �Է� : ");
		r = Integer.parseInt(br.readLine());
		
	}

	double calArea()
	{
		double res = 0;
		res = r * r * PI;
		return res;
	}

	double calLength()
	{
		double res = 0;
		res = r * 2 * PI;
		return res;
	}

	void print(double a, double b)
	{
		System.out.printf("\n�������� %d�� ����\n",r);
		System.out.printf("���� : %.2f\n",a);
		System.out.printf("�ѷ� : %.2f\n",b);
	}
	
}