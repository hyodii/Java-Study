/* ====================================
���� Ŭ������ �ν��Ͻ� ����
=======================================*/

// �� Test066.java ���ϰ� ��Ʈ~!!!

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class CircleTest //�� Ŭ���� ����
{
	// �ֿ� �Ӽ�
	int r;                       //���� ������
	final double PI = 3.141592;  //������ (���̳��� ���ؼ� ������ ���ȭ)  //double�� üũ(�ؿ� ���������� �� ��ȯ�� �� üũ!!)

	// ���(����, ����)
	// ������ �Է� ���
	void input() throws IOException
	{
							//���� �ν��Ͻ��� �����ϴ� ���� new
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("������ �Է� : ");
		r = Integer.parseInt(br.readLine());
	}
	// ���� ���� ���
	double calArea()  //���� ����
	{
		double result = 0; //���� ���� �� �ʱ�ȭ�س����� ������ �߻����ؼ� �ʱ�ȭ��!
		result = r * r * PI;
		return result;
		
	}
	// �ѷ� ���� ���
	double calLength() //���� �ѷ�
	{
		double result = 0;
		result = r * 2 * PI;
		return result;		
	}
	// ��� ���
	void print(double a, double l)
	{
		System.out.printf("\n�������� %d�� ����\n",r);
		System.out.printf("���� : %.2f\n", a);
		System.out.printf("�ѷ� : %.2f\n" ,l);
	}
}