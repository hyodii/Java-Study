public class InfRecul
{
	public static void main(String[] args)
	{
		showHi(5);
	}

	/*----------------------------------------------------------------------
	public static void showHi(int cnt) //5
	{
		System.out.println("Hi~"); //showHi(5)
		showHi(cnt--);
		if(cnt==1)
			return;
	}

}

-------------------------------------------------------------------*/

/* ������
Hi~
Hi~
 :
 :

 �ͱ�? -> ����Ʈ�Ƚ��� cnt-- �ϱ� ��� showHi(5)�� ȣ��
*/
	/*----------------------------------------------------------------------
	//showHi(--cnt);�� �ٲ�
	public static void showHi(int cnt) //5
		{
			System.out.println("Hi~"); //showHi(5)
			showHi(--cnt);
			if(cnt==1)
				return;
		}

}
-------------------------------------------------------------------*/
/*
�׷��� ����Ʈ�Ƚ��� �����Ƚ��� �ٲ�µ��� �������� if ���ǹ��� Ȯ���� ���� ����
*/

//showHi(--cnt);��ġ �ٲ�
	public static void showHi(int cnt) //5
		{
			System.out.println("Hi~"); //showHi(5)
			
			if(cnt==1)
				return;
			showHi(--cnt);
		}

}
/*
Hi~
Hi~
Hi~
Hi~
Hi~
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/

