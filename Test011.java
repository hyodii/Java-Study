/* =================================================
���� �ڹ� �⺻ ���α׷��� ����
- ������ �ڷ���
- �ڹ��� �⺻ ����� : BufferedReader Ŭ����
===================================================*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test011
{
	public static void main(String[]args) throws IOException //����� ������ �߻��ϸ� ���븦 ���ϴ�(throws ����)��ɾ�
	{
		//�ڹٿ� Ű���带 �����ϴ� �κ�
		//Ű����� ������ ����Ʈ ��Ʈ������ �Էµ� 
		//Ű���带 ���� �������� Ư�� �Է°��� �������°� System.in
		//���ڸ� �о���� ��ġ(����Ʈ�� �Է��ؼ� ���ڷ� ��ȯ(Ű���尡 �Ѱ��ִ� Ű����)) �������� ������ 
		
		//BufferedReader �ν��Ͻ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int r;
		final double PI = 3.14;
		double a, b;

		//���� �ֵ�ó�� �ڷ����� �������� �ƴϱ� ������ ��������
		//�׷��� ������ import ��ξȿ� ���赵�־� �׷��ϱ� ���� ���� �޸𸮰��� Ȯ����
		//BufferedReader br = new BufferedReader;

		//���� �� ó��
		//�� ����ڿ��� �ȳ� �޼��� ���
		System.out.print("���� ������ �Է� : ");

		//�����ڰ� �Է��� ���� �޾ƿ� ������ ���� r �� ��Ƴ�
		//br �ȿ� readLine�̶�� �Լ�(�޼ҵ�)�� ������ ����ڰ� �Է��� ���� �� ����
		//r = br.readLine(); ->�̰Ŵ� throws������ ���� �ȴ�
		//r = "20"; -> �̷��� int�� ���ڿ� �ִ°ſ��� �ȵ�

		//Integer.parseInt() -> �Ű������� �Ѱܹ��� ���ڿ� �����͸� ���������� ��ȯ
		r = Integer.parseInt(br.readLine());
		//r = Inter.parseInt("20");
		//r = 20;
		// ����ڰ� �Է��� ���� BufferedReader(br)�� readLine() �޼ҵ带 Ȱ���Ͽ� ���ڿ� ���·� �о���� ��
		// �� ���� Integer.parseInt() �� ���� ������(������)���� ��ȯ�� �� ���� ������ ������ ���� r�� ��Ƴ���

		//�� ���� �� �ѷ� ����
		a = r * r * PI;
		b = r * 2 * PI;
		
		//��� ���
		System.out.println(">> ���� : " + a);
		System.out.println(">> �ѷ� : " + b);

		System.out.printf(">> ���� : %f\n", a);
		System.out.printf(">> �ѷ� : %f\n", b);

		System.out.printf(">> ���� : %.2f\n", a);
		System.out.printf(">> �ѷ� : %.2f\n", b);
		//%f�� ���� ��¿� �޼ҵ忡�� �Ǽ����� ��Ƴ��� �ɼ� ����
		//%.2f�� �Ҽ��� ���� ��°�ڸ����� ǥ���ϰڴٴ� �ǹ� 3��°���� �ݿø���


	}
}

/*
���� ������ �Է� : 25
>> ���� : 1962.5
>> �ѷ� : 157.0
>> ���� : 1962.500000
>> �ѷ� : 157.000000
>> ���� : 1962.50
>> �ѷ� : 157.00
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/