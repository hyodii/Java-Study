/* ===============================
���� Ŭ������ �ν��Ͻ� ����
==================================*/
import java.util.Scanner;

class CircleTest2
{
	
	// ���� ����(Information Hiding)
	// ��� ����, �ν��Ͻ� ����, ���� ����
	// ��private���̶�� ���������������� ������
	// Ŭ���� ���ο����� ���� �� ������ �����ϰ� �ϰڴٴ� �ǹ�
	// int�� ���� 0���� �ʱ�ȭ ����
	private int r;

	//int r;

	//(private�� �� �Է��ϱ� ����)
	// getter ���� ��� ��
	// setter ���� ä���ִ� ��
	//�ٵ� private���� ���Ƴ��� �� �� ������ �޾ƿͶ�? 
	// -> �Է¹������� ���ǹ��� �ɷ��� ��Ʈ���� ������!(100�̻� �Է¹޾ƶ� �̷���)
	// -> ��Ģ�� ���� �� ����

	/*
	int getR()       //getR�� setR�� CircleTest2�� ��������̴�
	{
		return r;
	}

	void setR(int r)
	{
		this.r = r;
	}
	*/

	void input()
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("������ �Է� : ");
		r = sc.nextInt();
	}

	double calArea()
	{
		return r * r * 3.141592;
	}

	void write(double a)
	{
		System.out.println("������ : " + r);
		System.out.println("��  �� : " + a);
	}

}

//�ܺ��� �ٸ� Ŭ����
public class Test093
{
	// �׿ܺ��� �ٸ� Ŭ������ �޼ҵ�
	public static void main(String[] args)
	{
		CircleTest2 ob1 = new CircleTest2();
		
		//ob1.r = 10;                                //�Է¹����� �������� input�ߴµ� �̷��� ��� 10 �� -> private�����ϸ� �ذ�!
		//System.out.println("���� ������ : "+ob1.r);

		//ob1.setR(10);                                //private�����Ѱſ� �̷��� ������ �� �޾ƿ� �� ����
		//System.out.println("���� ������ : " + ob1.getR());

		//ob1.r = 10000;
		
		ob1.input();
		//--5000

		double result = ob1.calArea();
		
		ob1.write(result);

	}
}
/*  ���� ���
������ �Է� : 5000
������ : 5000
��  �� : 7.85398E7
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/