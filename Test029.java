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


public class Test029
{
	public static void main(String[] args) throws IOException
	{
		/*[���� �� �ڵ�]
		//�ֿ� ���� ����
		String strName;
		char grade;
		int kor, eng, mat;
		int sum;
		double avg;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//���� �� ó��
		System.out.print("�̸� �Է� : "); //�̸��Է�
		strName = br.readLine();

		System.out.print("���� ���� : "); //���� ���� �Է�
		kor = Integer.parseInt(br.readLine());

		System.out.print("���� ���� : "); //���� ���� �Է�
		eng = Integer.parseInt(br.readLine());
		
		System.out.print("���� ���� : "); //���� ���� �Է�
		mat = Integer.parseInt(br.readLine());
		

		sum = kor + eng + mat; //���� ���ϱ�
		avg = (kor + eng + mat) / 3.0; //��� ���ϱ�

		//��� ���ϱ�
		if(avg>=90){
			grade = 'A';
		}else if(avg>=80){	
			grade = 'B';
		}else if(avg>=70){
			grade = 'C';
		}else if(avg>=60){
			grade = 'D';
		}else{
			grade = 'F';				
	
		}
		*/


		//[�Բ� �� �ڵ�]
		//�ֿ� ���� ����
		String strName;
		char grade ='F'; //grade ���� if�ȿ� ���ǿ� �ȵ��� ���, ���� ���ϰ� ����϶�ϱ� ������ �� �ۿ� ����!
		int kor, eng, mat;
		int sum = 0;    //-----> sum �� 0���� �ʱ�ȭ �� ���
		double avg;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//���� �� ó��
		System.out.print("�̸� �Է� : "); //�̸��Է�
		strName = br.readLine();
		

		System.out.print("���� ���� : "); //���� ���� �Է�
		kor = Integer.parseInt(br.readLine());
		sum += kor;

		System.out.print("���� ���� : "); //���� ���� �Է�
		eng = Integer.parseInt(br.readLine());
		sum += eng;

		System.out.print("���� ���� : "); //���� ���� �Է�
		mat = Integer.parseInt(br.readLine());
		sum += mat;

		sum = kor + eng + mat; //���� ���ϱ�
		avg = (kor + eng + mat) / 3.0; //��� ���ϱ�  --check~!!

		// �� �� �� �̻��� ����  ���� -> **�� ������**
		// ����� 90�� �̻� and ����� 100�� ����
		
		//��� ���ϱ�
		if(avg<=100)
		{
				if(avg>=90 && avg<=100)
				{
					grade = 'A'; //����� A
				}else if(avg>=80 && avg<90) //�̰� �ε� ������ ������ 90�̸��� �ֵ鸸 ��������� �����ϱ� (avg>80)�� �ᵵ��!!
				{	
					grade = 'B'; //����� B
				}else if(avg>=70)
				{
					grade = 'C'; //����� C
				}else if(avg>=60)
				{
					grade = 'D'; //����� D
				}else
				{
					grade = 'F'; //����� F			
	
				}

				//��� ���
		
				//println() ���
				System.out.println();
				System.out.println(">> ����� �̸��� " + strName + "�Դϴ�.");
				System.out.println(">> ���� ������ " + kor + ",");
				System.out.println(">> ���� ������ " + eng + ",");
				System.out.println(">> ���� ������ " + mat + ",");
				System.out.println(">> ������ " + sum + "�̰�, " + "����� " + avg + "�Դϴ�.");
				System.out.println(">> ����� " + grade + "�Դϴ�.");
				//pringf() ���
				System.out.printf("\n>> ����� �̸��� %s�Դϴ�",strName);
				System.out.printf("\n>> ���� ������ %d",kor);
				System.out.printf("\n>> ���� ������ %d",eng);
				System.out.printf("\n>> ���� ������ %d",mat);
				System.out.printf("\n>> ������ %d�̰� ����� %.2f�Դϴ�.", sum, avg);
				System.out.printf("\n>> ����� %c�Դϴ�.",grade);
			

		}
		else 
		{
			System.out.println("��� ���� �ʰ�!!");
			//��� ���
			System.out.println("�ءء�100������ ���� �Է����ּ���ءء�");
		}


			


		
	}


}

/*
�̸� �Է� : ��ȿ��
���� ���� : 90
���� ���� : 80
���� ���� : 70

>> ����� �̸��� ��ȿ���Դϴ�.
>> ���� ������ 90,
>> ���� ������ 80,
>> ���� ������ 70,
>> ������ 240�̰�, ����� 80.0�Դϴ�.
>> ����� B�Դϴ�.

>> ����� �̸��� ��ȿ���Դϴ�
>> ���� ������ 90
>> ���� ������ 80
>> ���� ������ 70
>> ������ 240�̰� ����� 80.00�Դϴ�.
>> ����� B�Դϴ�.����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .



�̸� �Է� : ��ȿ��
���� ���� : 1100
���� ���� : 200
���� ���� : 500
��� ���� �ʰ�!!
�ءء�100������ ���� �Է����ּ���ءء�
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/




