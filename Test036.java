/* =======================================================
���� ���� �帧�� ��Ʈ��(���, ���ǹ��� �ݺ���) ����
- switch �� �ǽ�
==========================================================*/

/*
�� ���� ���ù��̶� �ϸ�, switch �� ������ ���� ���� ����
���� ������ ���� �������� �б��� �� ����ϴ� �����̴�.

�� ���� �� ����
switch(����)
{
	case ���1 : ����1; [break;]
	case ���2 : ����2; [break;]
	           :
	[default : ����n+1; [break;]]		   
}

switch ���� �����ġ��� case�� ���������
byte, short, int, long �̾�� �Ѵ�.

case �� �ڿ� ��break;���� ���� ������ ���
���� case ���� ������ ����ؼ�(�̾) �����ϰ� �ȴ�. (->�⺻ ��)
*/
//����� �̸��� ��ȿ���Դϴ�.
//������ xx, ����� xx�Դϴ�.
//����� A�Դϴ�.0

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test036
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("�̸� �Է� : ");
		String name = br.readLine();

		System.out.print("�������� �Է� : ");
		int kor = Integer.parseInt(br.readLine());
		System.out.print("�������� �Է� : ");
		int eng = Integer.parseInt(br.readLine());
		System.out.print("�������� �Է� : ");
		int mat = Integer.parseInt(br.readLine());

		//��� - ���ǻ� ������ ó��
		int avg = (kor + eng + mat) / 3;
		char grade; //char grade = 'F';�� �ߴٸ� default�Ƚᵵ��!!

		/* if��
		char grade = 'F';


		if(avg>=90)
			grade = 'A';
		else if(avg>=80)
			grade = 'B';
		else if(avg >=70)
			grade = 'C';
		else if(avg>=60)
			grade = 'D';
		*/

		/*
		switch (avg)
		{
			case 100: case 99: (..���..)
			grade = 'A';break;
			case 8: grade = 'B';
			break;
			case 7: grade = 'C';
			break;
			case 6: grade = 'D';
			break;
			default :grade = 'F';

		}
		*/
		
		/*
		switch (avg/10)
		{
			case 10: grade = 'A';break;
			case 9: grade = 'A';break;
			case 8: grade = 'B';break;
			case 7: grade = 'C';break;
			case 6: grade = 'D';break;
			default :grade = 'F';

		}
		*/
		switch (avg/10)
		{
			case 10: case 9: grade = 'A';break;
			case 8: grade = 'B';break;
			case 7: grade = 'C';break;
			case 6: grade = 'D';break;
			default :grade = 'F';

		}



		//��� ���
		System.out.printf("\n����� �̸��� %s�Դϴ�.\n", name);
		System.out.printf("������ %d, ����� %d �Դϴ�.\n", kor + eng + mat, avg);
		System.out.printf("����� %c �Դϴ�.\n", grade);
	}
}
/*
�̸� �Է� : ��ȿ��
�������� �Է� : 80
�������� �Է� : 90
�������� �Է� : 70

����� �̸��� ��ȿ���Դϴ�.
������ 240, ����� 80 �Դϴ�.
����� B �Դϴ�.
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/