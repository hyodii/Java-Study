/* =========================
���� Ŭ���� ��� ����
- �������̽�(Interface)
============================*/

// �� �ǽ� ����
// ���� ó�� ���α׷��� �����Ѵ�.
// ��, �������̽��� Ȱ���� �� �ֵ��� �Ѵ�.

//���� ��)
// �ο� �� �Է�(1~10) : 2
// 1��° �л��� �й� �̸� �Է�(���� ����) : 2108006 �Ǽ���
// ���� ���� ���� ���� �Է�   (���� ����) : 90 100 85
// 2��° �л��� �й� �̸� �Է�(���� ����) : 2108024 ��ҿ�
// ���� ���� ���� ���� �Է�   (���� ����) : 85 70 65

// 2108006 �Ǽ���    90  100  85    275    91
//					 ��   ��  ��    
// 2108024 ��ҿ�    85  70   65    220    73
//					 ��	 ��   ��

// ����Ϸ��� �ƹ� Ű�� ��������...


import java.util.Scanner;

// �Ӽ��� �����ϴ� Ŭ���� -> �ڷ��� Ȱ��
class Record
{
	String hak, name;       //-- �й�, �̸�
	int kor, eng, mat;      //-- ����, ����, ���� ����
	int tot, avg;           //-- ����, ���(���ǻ� ���� ó��)
}

// �������̽�
interface Sungjuk
{
	public void set();    //-- �ο� �� ����
	public void input();  //-- �� ������ �Է�
	public void print();  //-- ��� ���
	public void print_grade();
}

// ���� �ذ� �������� �����ؾ��� Ŭ���� -> Sungjuk �������̽��� �����ϴ� Ŭ����
class SungjukImpl implements Sungjuk
{
	//int[][] gamok;
	//Record[] rc;

	int n;
	Record[] rc;
	char[][] jumsu;



	@Override
	public void set()
	{
		
		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.print("�ο� �� �Է�(1~10) : ");
			n = sc.nextInt();
		}
		while (n<1 || n>10);

		rc = new Record[n];
	
	}

	@Override
	public void input()
	{

		//jumsu = new char[n][3];

		Scanner sc = new Scanner(System.in);

		//���� �Է�
		for (int i=0; i<n; i++)
		{
			rc[i] = new Record();
			//int[][] gamok = new int[n][3];

			System.out.printf("%d��° �л��� �й� �̸� �Է�(���� ����) : ", (i+1));
			rc[i].hak = sc.next();
			rc[i].name = sc.next();

			System.out.print("���� ���� ���� ���� �Է�   (���� ����) : ");
			//gamok[i][0] = rc[i].kor = sc.nextInt();
			//gamok[i][1] = rc[i].eng = sc.nextInt();
			//gamok[i][2] = rc[i].mat = sc.nextInt();

			rc[i].kor = sc.nextInt();
			rc[i].eng = sc.nextInt();
			rc[i].mat = sc.nextInt();

			rc[i].tot = rc[i].kor + rc[i].eng + rc[i].mat;
			rc[i].avg = (rc[i].kor + rc[i].eng + rc[i].mat) / 3;

		}





/*
		for (int i=0; i<n; i++)
		{
			if(rc[i].eng >= 90)
				System.out.print("��");
			else if(rc[i].eng >= 80)
				System.out.print("��");
			else if(rc[i].eng >= 70)
				System.out.print("��");
			else if(rc[i].eng >= 60)
				System.out.print("��");
			else if(rc[i].eng >= 50)
				System.out.print("��");
		}

		for (int i=0; i<n; i++)
		{
			if(rc[i].mat >= 90)
				System.out.print("��");
			else if(rc[i].mat >= 80)
				System.out.print("��");
			else if(rc[i].mat >= 70)
				System.out.print("��");
			else if(rc[i].mat >= 60)
				System.out.print("��");
			else if(rc[i].mat >= 50)
				System.out.print("��");
		}
*/
/*
		
		//����̾簡 
		for (int i=0; i<n; i++ )
		{
			
			for (int j=0; j<3;j++ )
			{
				if (rc[i].[j]>=90)
				{
					jumsu[i][j] = '��';
				}
				else if (rc[i].avg>=80)
				{
					jumsu[i][j] = '��';
				}
				else if (rc[i].avg>=70)
				{
					jumsu[i][j] = '��';
				}
				else if (rc[i].avg>=60)
				{
					jumsu[i][j] = '��';
				}
				else
					jumsu[i][j] = '��';
			}


		}
	*/	
		/*
		for(int i=0; i<n; i++){
			System.out.printf("%s %s \t %d %d %d \t %d \t %d\n", rec[i].hak, rec[i].name, rec[i].kor, rec[i].eng, rec[i].mat, rec[i].tot, rec[i].avg);
			
			switch(rec[i].kor/10){
				case 9 : case 10 : System.out.print("\t\t �� "); break;
				case 8 : System.out.print("\t\t �� "); break;
				case 7 : System.out.print("\t\t �� "); break;
				case 6 : System.out.print("\t\t �� "); break;
				default : System.out.print("\t\t �� ");
			}
			switch(rec[i].eng/10){
				case 9 : case 10 : System.out.print("�� "); break;
				case 8 : System.out.print("�� "); break;
				case 7 : System.out.print("�� "); break;
				case 6 : System.out.print("�� "); break;
				default : System.out.print("�� ");
			}
			switch(rec[i].mat/10){
				case 9 : case 10 : System.out.println("��"); break;
				case 8 : System.out.println("��"); break;
				case 7 : System.out.println("��"); break;
				case 6 : System.out.println("��"); break;
				default : System.out.println("��");
			}
			
		}

		*/


		/*
		String grade(int s)
		{
			String result;
			
			switch (s/10)
			{
				case 10 : result = "��"; break; //100
				case  9 : result = "��"; break; //90~99
				case  8 : result = "��"; break; //80~89
				case  7 : result = "��"; break;
				case  6 : result = "��"; break; 
				default : result = "��"; break;		
			}

			return result;
		}
		*/
		

		
	}

	@Override
	public void print()
	{
		for (int i=0; i<n; i++)
		{
					       // 2108006 �Ǽ���    90  100  85    275    91
			System.out.printf("%5s  %5s  %5d  %5d  %5d  %5d  %5d\n",rc[i].hak,rc[i].name,rc[i].kor,rc[i].eng,rc[i].mat,rc[i].tot,rc[i].avg);
			//System.out.printf("\t\t%5c  %5c  %5c\n",jumsu[i][0],jumsu[i][1],jumsu[i][2]);
		
		}System.out.println();
				
	}

}


	@Override
	public void print_grade()
	{
		
			if(rc[0].kor >= 90)
				System.out.printf("��");
			else if(rc[0].kor >= 80 && rc[0].kor < 90)
				System.out.printf("��");
			else if(rc[0].kor >= 70 && rc[0].kor < 80)
				System.out.printf("��");
			else if(rc[0].kor >= 60 && rc[0].kor < 70)
				System.out.printf("��");
			else if(rc[0].kor >= 50 && rc[0].kor < 60)
				System.out.printf("��");

				
	

}



// main() �޼ҵ带 �����ϴ� �ܺ��� �ٸ� Ŭ����
public class Test117
{
	public static void main(String[] args)
	{
		Sungjuk ob= new SungjukImpl();

		// ���� �ذ� �������� �ۼ��ؾ��� ob ����
		//ob = new SungjukImpl();

		//SungjukImpl ob1 = new SungjukImpl();

		ob.set();
		ob.input();
		ob.print();
		ob.print_grade();
	}
}