/* =======================================================
���� ���� �帧�� ��Ʈ��(���, ���ǹ��� �ݺ���) ����
- �ݺ���(while) �ǽ�
==========================================================*/

/*
�� ����
����ڷκ��� ������ ������ �Է¹޾�
1���� �Է¹��� �� �� ������
��ü �հ�, ¦���� �հ�, Ȧ���� ���� 
���� ��������� ����ϴ� ���α׷��� �����Ѵ�.

���� ��)
������ ���� �Է� : 270
>> 1 ~ 270 ���� ������ �� : xxxx
>> 1 ~ 270 ���� ¦���� �� : xxxx
>> 1 ~ 270 ���� Ȧ���� �� : xxxx
����Ϸ��� �ƹ� Ű�� ��������...
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test048
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int n;              //�Է¹��� ����
		int i = 1;          //��������
		int sum, even, odd; //����, ¦��, Ȧ���� ��
		sum = even = odd = 0;
	
		System.out.print("������ ���� �Է� : ");
		n = Integer.parseInt(br.readLine());

		

		while (i <= n)        //1 ~ n���� ������
		{
			sum += i;         //n������ ������ ��
			if (i%2 == 0)
			
				even += i;    //n������ ¦���� ��
			
			else 
				odd += i;     //n������ Ȧ���� ��
			
			i++;
			
		}
		System.out.println(">> 1 ~ " + n +  "���� ������ �� : " + sum);
		System.out.printf(">> 1 ~ %d ���� ¦���� �� : %d\n",n,even);
		System.out.printf(">> 1 ~ %d ���� Ȧ���� �� : %d\n",n,odd);
	}
}
/*
������ ���� �Է� : 270
>> 1 ~ 270���� ������ �� : 36585
>> 1 ~ 270 ���� ¦���� �� : 18360
>> 1 ~ 270 ���� Ȧ���� �� : 18225
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
