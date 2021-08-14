/*=======================================
  ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
  - Calendar Ŭ����
=======================================*/

// �� �ǽ� ����
//    ����ڷκ��� ��, ���� �Է¹޾�
//    �޷��� �׷��ִ�(����ϴ�) ���α׷��� �����Ѵ�.
//    ��, ����޷��� �ƴ϶� Calendar Ŭ������ Ȱ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.

// ���� ��)
// ���� �Է� : 0
// ���� �Է� : 2021
// �� �Է�   : -2
// �� �Է�   : 16
// �� �Է�   : 8
/*
	[ 2021�� 8�� ] 
  
  ��  ��  ȭ  ��  ��  ��  ��
============================
   1   2   3   4   5   6   7
   8   9  10  11  12  13  14
  15  16  17  18  19  20  21
  22  23  24  25  26  27  28
  29  30  31
============================
����Ϸ��� �ƹ� Ű�� ��������...
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Calendar;

public class hyodii139
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int y, m, w;

		// �޷� �ν��Ͻ� ����
		Calendar cal = Calendar.getInstance();

		do
		{
			System.out.print("���� �Է� : ");
			y = Integer.parseInt(br.readLine());
		}
		while (y<1);

		do
		{
			System.out.print("�� �Է�   : ");
			m = Integer.parseInt(br.readLine());
		}
		while (m<1 || m>12);

		// �޷� ����
		cal.set(y,m-1,1);

		//���� �޾ƿ���
		w = cal.get(Calendar.DAY_OF_WEEK);

		//�׽�Ʈ
		//System.out.println(w);
		//--==>> 1 -> 2021�� 8�� ���� -> �Ͽ��� -> 2021�� 8�� 1���� �Ͽ���~!!!

		System.out.println();
		System.out.println("\t[ " + y + "�� " + m + "�� ]"); 
		System.out.println("  ��  ��  ȭ  ��  ��  ��  ��");
		System.out.println(" ============================");
		
		for (int i=1; i<w; i++)  //--check~!!  ���⼱ 1!!! �ֳĸ� �Ͽ����� 1�̴ϱ�!!
			System.out.print("    ");

		//.getActualMaximum(Calendar.DATE)
		//System.out.println(cal.getActualMaximum(Calendar.DATE));

		for (int i=1; i<cal.getActualMaximum(Calendar.DATE); i++) //--check~!!  ���⼱ 1!!! �ֳĸ� �Ͽ����� 1�̴ϱ�!!
		{		
			System.out.printf("%4d",i);
			w++;

			if(w%7==1)  //--check~!!  ���⼱ 1!!! �ֳĸ� �Ͽ����� 1�̴ϱ�!!
				System.out.println();
		}

		if(w%7!=1)
			System.out.println();



		System.out.println(" ============================");

	}
}
/*
���� �Է� : 0
���� �Է� : 2021
�� �Է�   : 0
�� �Է�   : 13
�� �Է�   : -2
�� �Է�   : 8

        [ 2021�� 8�� ]
  ��  ��  ȭ  ��  ��  ��  ��
 ============================
   1   2   3   4   5   6   7
   8   9  10  11  12  13  14
  15  16  17  18  19  20  21
  22  23  24  25  26  27  28
  29  30
 ============================
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
