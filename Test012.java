/* =================================================
���� �ڹ� �⺻ ���α׷��� ����
-����
 �ﰢ���� �غ��� ���̿� ���̸� ����ڷκ��� �Է¹޾�
 �� �ﰢ���� ���̸� ���ϴ� ���α׷��� �����Ѵ�.
===================================================*/

// ���� ��)
// �� �ﰢ���� ���� ���ϱ� ��
// - �ﰢ���� �غ� �Է� : 3
// - �ﰢ���� ���� �Է� : 5

// >> �غ��� 3, ���̰� 5�� �ﰢ���� ���� : xxxx
// ����Ϸ��� �ƹ� Ű�� ��������...

//�ﰢ���� ���� = �غ� * ���� / 2
// ����ڷκ��� �����͸� �Է¹޾� ó�� -> BufferedReader Ȱ��

//[���� Ǯ���� ����]
/*--------------------------------------------------------------------------------------
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
//import java.lang.*;

public class Test012
{
	public static void main(String[] args) throws IOException
	{
		
		// BufferedReader �ν��Ͻ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// �ֿ� ���� ����
		int w, h; //�غ� w ���� h
		double area; //���� area

		System.out.println("�� �ﰢ���� ���� ���ϱ� ��");
		
		// ���� �� ó��
		// 1. �غ�: ����ڿ��� ��� �� �Է°� �ޱ�
		System.out.print("- �ﰢ���� �غ� �Է� : ");
		w = Integer.parseInt(br.readLine());
		
		//2. ����: ����ڿ��� ��� �� �Է°� �ޱ�
		System.out.print("- �ﰢ���� ���� �Է� : ");
		h = Integer.parseInt(br.readLine());

		//3. ���� ����
		area = w * h / 2.0;

		// ��� ���
		System.out.printf(">> �غ��� %d ���̰� %d�� �ﰢ���� ���� : %.2f\n", w, h, area);
		}
}

		
		�� �ﰢ���� ���� ���ϱ� ��
		- �ﰢ���� �غ� �Է� : 3
		- �ﰢ���� ���� �Է� : 5
		>> �غ��� 3 ���̰� 5�� �ﰢ���� ���� : 7.50
		����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

		
		----------------------------------------------------------------------------------------------- */

		//[�Բ� Ǯ���� ����]
		//�������� �κ��� ���� import �� ����� �Ǵµ� String �� System���� ��쿣 import java.lang.*;
		//��� lang �� �ڵ����� import�س�
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
//import java.lang.*;

public class Test012
{
		public static void main(String[] args) throws IOException
		{

			// �� �ֿ� ���� ����
			// BufferedReader �ν��Ͻ� ����
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			int bottomLength, height; //�غ��� ����
			double area; //����   check~!!���̴� �Ǽ��� �� �����ϱ� double!

			// �� ���� �� ó��
			// 1. ����ڿ��� �ȳ� �޼��� ���
			System.out.println("�� �ﰢ���� ���� ���ϱ� ��");
			System.out.print("- ������ �غ� �Է� : "); //println ���ϴ� ������ Ŀ���� ����Ǽ� ���������ϸ� �ȵǴϱ�

			// 2. ����ڰ� �Է��� �����͸� ���� ���·� ��ȯ�� ��
			//���� bottomLength �� ��Ƴ���
			bottomLength = Integer.parseInt(br.readLine());

			// 3. �ٽ� ����ڿ��� �ȳ� �޼��� ���
			System.out.print("- �ﰢ���� ���� �Է� : ");

			// 4. ����ڰ� �Է��� �����͸� ���� ���·� ��ȯ�� �� ���� height�� ��Ƴ���
			height = Integer.parseInt(br.readLine());

			// 5. ���� ä����(�����) �������� Ȱ���Ͽ� �ﰢ���� ���̸� ���ϴ� ���� ����
			//area = bottomLength * height / 2;
			//         ������     ������ / ������ -> ���� ��� ���� �׷��� 2.0���� �ؾ���!!!
			area = bottomLength * height / 2.0; //check~!!!
			//      ������        ������ / �Ǽ��� => �Ǽ� ��� ����

			// �� �Ǽ� �ڷ����� ��������� ����Ǵ� �������� �Ǽ� ����� ������ �ʿ��� ��Ȳ�̴�.
			// ������ ��2���� �ƴ� �Ǽ��� ��2.0������ ������ ������ �����ϰ� �Ǹ� �� ������ �Ǽ� ������� ó���ȴ�.
			

			// �� ��� ���
			System.out.println(); // �Ű����� ���� -> ����
			//System.out.print(); // �Ű����� ���� -> ����

			System.out.printf(">> �غ��� %d, ���̰� %d�� �ﰢ���� ���� : %.2f\n", bottomLength, height, area);



		}
}

/*
�� �ﰢ���� ���� ���ϱ� ��
- ������ �غ� �Է� : 5
- �ﰢ���� ���� �Է� : 3

>> �غ��� 5, ���̰� 3�� �ﰢ���� ���� : 7.50
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/