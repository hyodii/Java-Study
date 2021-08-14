/* =======================================================
���� ���� �帧�� ��Ʈ��(���, ���ǹ��� �ݺ���) ����
- if ~ else �� �ǽ�
==========================================================*/
/*
����ڷκ��� �̸�, ��������, ��������, ���������� �Է¹޾� 
������ ���� ���·� ����ϴ� ���α׷��� �ۼ��Ѵ�.
����� ��� ������ �������� �����Ͽ� ó���Ѵ�.

90�� ~ 100�� : A
80�� ~ 89 : B
70�� ~ 79�� : C
60�� ~ 69�� : D
60�� �̸� : F

��, BufferedReader��  Ȱ���Ͽ� �����͸� �Է¹��� �� �ֵ��� �ϸ�,
printf()�޼ҵ带 ���� ����� �� �ֵ��� �����Ѵ�.

���࿹)
�̸� �Է� :  ��ȿ��
���� ���� : 90
���� ���� : 80
���� ���� : 70

>> ����� �̸��� ��ȿ���Դϴ�.
>> ���� ������ 90,
>> ���� ������ 80,
>> ���� ������ 70,
>> ������ 240�̰�, ����� 80�Դϴ�.
>>����� B�Դϴ�.
����Ϸ��� �ƹ� Ű�� ��������...

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class hyodii029
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int kor, eng, mat;
		double avg; //��� �Ǽ��� ó��! check~!!
		String name;
		char grade = 'F'; //�ʱ�ȭ �ϴ°� check~!!

		System.out.print("�̸� �Է� : ");
		name = br.readLine();
		System.out.print("���� ���� : ");
		kor = Integer.parseInt(br.readLine());
		System.out.print("���� ���� : ");
		eng = Integer.parseInt(br.readLine());
		System.out.print("���� ���� : ");
		mat = Integer.parseInt(br.readLine());

		avg = (kor + eng + mat) / 3.0;  //��� �Ǽ��� ó���� ����ؼ� 3.0 �Է� check~!!
		if(avg<=100)
		{
			if (avg>=90)
				grade = 'A';
			else if(avg>=80)
				grade = 'B';
			else if(avg>=70)
				grade = 'C';
			else if(avg>=60)
				grade = 'D';
			else
				grade = 'F';

			System.out.println();
			System.out.printf(">> ����� �̸��� %s�Դϴ�.\n",name);
			System.out.printf(">> ���� ������ %d,\n",kor);
			System.out.printf(">> ���� ������ %d,\n",eng);
			System.out.printf(">> ���� ������ %d,\n",mat);
			System.out.printf(">> ������ %d�̰�, ����� %.2f�Դϴ�.\n", kor+eng+mat,avg); // %.2f
			System.out.printf(">> ����� %c�Դϴ�.\n",grade);


		}
		else  //�̿��� ��쵵 �����ؼ� check~!!
		{
			System.out.println();
			System.out.println("��չ��� �ʰ�!!100������ ���� �Է����ּ���.");
		}
			
		
	}
}
/*
�̸� �Է� : ��ȿ��
���� ���� : 50
���� ���� : 60
���� ���� : 70

>> ����� �̸��� ��ȿ���Դϴ�.
>> ���� ������ 50,
>> ���� ������ 60,
>> ���� ������ 70,
>> ������ 180�̰�, ����� 60.00�Դϴ�.
>> ����� D�Դϴ�.
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

�̸� �Է� : ��ȿ��
���� ���� : 120
���� ���� : 201
���� ���� : 262

��չ��� �ʰ�!!100������ ���� �Է����ּ���.
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/