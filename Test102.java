/* ======================================
���� �ֹε�Ϲ�ȣ ��ȿ�� �˻� ����
=========================================*/
/*
�� �ֹε�Ϲ�ȣ ���� ����

1. ������ �ڸ��� ������ ���ڸ� ���� ��Ģ�� �°� ���Ѵ�.

	123456-1234567 (�ֹι�ȣ)
	****** ****** --------------------�� �ڸ��� ���ϱ�
	234567 892345  (�� �ڸ��� ������ ��)

2. ��Ģ�� �°� ���� ������ ������ ����� ��� ���Ѵ�.
ex) 7 5 0 6 1 5 - 1 8 6 2 1 3 3
    * * * * * *   * * * * * *
	2 3 4 5 6 7   8 9 2 3 4 5
------------------------------------
 ->14 +15 + 0 + 30 + 6 + 35 + 8 + 72 + 12 + 6 + 4 + 15
   
   == 217 

3. ������ ������� 11�� ������ ������������ ���Ѵ�.
		 -----
     11 | 217     ==> ������ 8


4. 11���� ������(8)�� �� ������� ���Ѵ�.

	11 - 8 = 3

	�� 3. �� ó�� �������� �������� 0�� ��� -> 11 -> 1
								    1�� ��� -> 10 -> 0
		
		�̸� �ٽ� 10���� ������ �������� ���Ѵ�.

5. 4�� ���� ����� �ֹι�ȣ�� �����ϴ� ������ ���ڿ� ��ġ�ϴ����ǿ��θ� Ȯ���Ѵ�.

	��ġ    -> ��ȿ�� �ֹι�ȣ
	����ġ  -> �߸��� �ֹι�ȣ


���� ��) 750615
�ֹι�ȣ �Է�(xxxxxx-xxxxxxx) : 123456-12345678 -> �Է� ���� �ʰ�
>> �Է� ����~!!!
����Ϸ��� �ƹ� Ű�� ������...

�ֹι�ȣ �Է�(xxxxxx-xxxxxxx) : 123456-123456  -> �Է� ���� �̴�
>> �Է� ����~!!!
����Ϸ��� �ƹ� Ű�� ������...

�ֹι�ȣ �Է�(xxxxxx-xxxxxxx) : 941231-1234567   -> ��ȿ�� �ֹ� ��ȣ
>> ��ȿ�� �ֹι�ȣ~!!!
����Ϸ��� �ƹ� Ű�� ������...

�ֹι�ȣ �Է�(xxxxxx-xxxxxxx) : 941231-1234569   -> ��ȿ���� ���� �ֹ� ��ȣ
>> �߸��� �ֹι�ȣ~!!!
����Ϸ��� �ƹ� Ű�� ������...

�� �߰� ��~!!
�迭.length      ->  �迭�� ����(�迭���� ����) ��ȯ
���ڿ�.length()  ->  ���ڿ��� ���� ��ȯ
ex)
String str = "abcdefg";
str.length();           -> 7
"abcdefg".length();     -> 7
���ڿ�.substring()      -> ���ڿ� ����
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

public class Test102
{
	public static void main(String[] args) throws IOException
	{
		/*

		//String arr = new String[14];
		//�׽�Ʈ
		String strTemp = "��ȿ��";
		System.out.println(strTemp.length());
		//--==>> 3

		strTemp = "���ع��� ��λ���";
		System.out.println(strTemp.length());
		//--==>> 9

		strTemp = "study-hard";
		System.out.println(strTemp.length());
		//--==>> 10

		// substring �׽�Ʈ
		strTemp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println(strTemp.substring(3,5));
		//--==>> DE
		// ABC DE FGHIJKLMNOPQRSTUVWXYZ
		// 012 34 5678

		strTemp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println(strTemp.substring(13,17));
		//--==>> NOPQ
		// ABCDEFGHIJKLM NOPQ RSTUVWXYZ
		// 0123456789012 3456 7

		//strTemp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		//System.out.println(strTemp.substring(13,85));
		//--==>> �����߻�(������ ����) 
		//		 StringIndexOutOfBoundsException

		strTemp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println(strTemp.substring(5));
		//--==>> FGHIJKLMNOPQRSTUVWXYZ

		strTemp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println(strTemp.substring(5,strTemp.length()));
		//--==>> FGHIJKLMNOPQRSTUVWXYZ           --------------
		//										strTemp�� ��ü ����

		*/

		
		/*----------------------------------------------------------------------
		//[���� Ǭ ����]
		Scanner sc = new Scanner(System.in);
		String num;
		int result, div,sum=0;
								     // 123456-1234567
									 // 234567 892345
		System.out.print("�ֹι�ȣ �Է�(xxxxxx-xxxxxxx) : "); 
		num = sc.next();

		if (num.length() != 14)
		{			
			System.out.println(">> �Է� ����~!!!");
			return;
		}
		

		int[] arr = {2,3,4,5,6,7,0,8,9,2,3,4,5};

		for (int i=0; i<13;i++)
		{
			// 1. ������ �ڸ��� ������ ���ڸ� ���� ��Ģ�� �°� ���Ѵ�.
			// 2. ��Ģ�� �°� ���� ������ ������ ����� ��� ���Ѵ�.
			sum += arr[i] * Integer.parseInt(num.substring(i,(i+1)));  //���ڿ��� int�� �����ϴµ����� ��
				
			
		}

		// 3. ������ ������� 11�� ������ ������������ ���Ѵ�.
		div = sum % 11;

		// 4. 11���� ������(8)�� �� ������� ���Ѵ�.
		result = 11 - div;
		
		//�� 3. �� ó�� �������� �������� 0�� ��� -> 11 -> 1
		//						    1�� ��� -> 10 -> 0

		
		// �̸� �ٽ� 10���� ������ �������� ���Ѵ�.

		result %= result;

		//5. 4�� ���� ����� �ֹι�ȣ�� �����ϴ� ������ ���ڿ� ��ġ�ϴ����ǿ��θ� Ȯ���Ѵ�.
		if (result==Integer.parseInt(num.substring(13)))

			System.out.println(">> ��Ȯ�� �ֹι�ȣ~!!");

		else

			System.out.println(">> �߸��� �ֹι�ȣ~!!");
			-------------------------------------------------------------------*/
		
		//�Բ� Ǭ ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//�Է¹��� �ֹι�ȣ(���ڿ� ����)
		String str;

				  // 9 5 0 1 0 5 - 1 2 3 4 5 6 7
		int[] chk = {2,3,4,5,6,7,0,8,9,2,3,4,5};
		//                      --  check~!!!

		//���� ���� �� ������(��, �� ������ ����� ���� ���� �� �ֵ��� ó��...)
		int tot = 0;

		System.out.print("�ֹι�ȣ �Է�(xxxxxx-xxxxxxx) : ");
		// str = Integer.parseInt(br.readLine());
		str = br.readLine();

		if (str.length() != 14)
		{
			System.out.println(">> �Է� ����~!!!");
			return;     //-- �޼ҵ� ���� -> main() �޼ҵ� ���� -> ���α׷� ����
		} 

		//�׽�Ʈ
		//System.out.println(">> �ڸ��� ����~!!");

		/*
		"750615-1252085"
		str.substring(0,1);
		"7"

		Integer.parseInt("7");

		tot += chk[0] * 7;

		str,substring(1,2);
		"5"
		Integer.parseInt("5");

		tot += chk[1] * 5;
		*/

		for (int i=0; i<13; i++)
		{
			//System.out.print(i + " ");  // 0 ~ 12

			if(i==6)
			{
				continue;   // (�޺κ� �����ϰ�...) +  ����ض�
			}

			tot += chk[i] * Integer.parseInt(str.substring(i,(i+1)));     //-- �޺κ�
			//         0 -> 2                              0   1   -> "7"   => tot += 2 * 7 
			//         1 -> 3                              1   2       5              3   5

			//         12   5                             12   13      8              5   8	
		
		}

		//---------------------------------------------��������� 1. 2. �����Ѱ�!
		//						��Ģ�� �°� ���� ������ ������ ����� ��� ���� ���� ���� tot�� ����ִ� ��Ȳ�� �ȴ�.

		int su = 11 - tot % 11;

		// �׽�Ʈ
		System.out.println(su);
		// 10
		// 11
		
		// ���� ��� ��� ������....�߰� ���� �ʿ�~!!!
		// su�� ���� ���� ����� �� �ڸ��� ���� ���(10 �Ǵ� 11)
		// �ֹι�ȣ ������ �ڸ��� ���ڿ� ���� �� ���� ��Ȳ
		su = su % 10; //su%=10;

		//----------------------------------------------������� �����ϸ� 3. �� 4. �� ��� ���� ��Ȳ�̸�
		//                                              ���� ���� ����� ���� su�� ����ִ� ��Ȳ�� �ȴ�.

		//if (su==�ֹε�Ϲ�ȣ ���������ڸ�����)
		if (su==Integer.parseInt(str.substring(13)))   //ũ����Ϸ��� �������·� �ٲ㼭
			System.out.println(">> ��Ȯ�� �ֹι�ȣ~!!!");
		else
			System.out.println(">> �߸��� �ֹι�ȣ~!!!");
			

	}
}
/*
�ֹι�ȣ �Է�(xxxxxx-xxxxxxx) : 941231-2548461
1
>> ��Ȯ�� �ֹι�ȣ~!!!
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .



�ֹι�ȣ �Է�(xxxxxx-xxxxxxx) : 941231-22335566
>> �Է� ����~!!!
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .



�ֹι�ȣ �Է�(xxxxxx-xxxxxxx) : 941231-1234567
2
>> �߸��� �ֹι�ȣ~!!!
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/