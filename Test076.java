/* =====================
���� �迭 ����
- �迭�� ����� �ʱ�ȭ
- �迭�� �⺻�� Ȱ��
=========================*/

/*
��char���ڷ����� �迭�� �����
�� �迭�� �� �濡 ���ĺ� �빮�ڸ� ä���
ä���� �� �迭�� ��ü ��Ҹ� ����ϴ� ���α׷��� �����Ѵ�.
��, ä��� ������ ����ϴ� ������ ���� �и��Ͽ� ó���Ѵ�.

���� ��)
A B C D E F G ... W X Y Z
����Ϸ��� �ƹ� Ű�� ��������...
*/


public class Test076
{
	public static void main(String[] argss)
	{
		/*
		//���� ���ĺ� �빮�� �迭 ����
		// ��� 1
		char[] arr1;
		arr1 = new int[26];
		arr1[0] = 'A';
		arr1[1] = 'B';
		arr1[2] = 'C';
		arr1[3] = 'D';
		arr1[4] = 'E';
		arr1[5] = 'F';
		arr1[6] = 'G';
		arr1[7] = 'H';
		arr1[8] = 'I';
		arr1[9] = 'J';
		arr1[10] = 'K';
		arr1[11] = 'L';
		arr1[12] = 'M';
		arr1[13] = 'N';
		arr1[14] = 'O';
		arr1[15] = 'P';
		arr1[16] = 'Q';
		arr1[17] = 'R';
		arr1[18] = 'S';
		arr1[19] = 'T';
		arr1[20] = 'U';
		arr1[21] = 'V';
		arr1[22] = 'W';
		arr1[23] = 'X';
		arr1[24] = 'Y';
		arr1[25] = 'Z';
		*/
	
		// ��� 2
		//char[] arr2 = {A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z};
		//char[] arr2 = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		
		
		
		// ��� 3  �빮�� �Ѱ��� 26
		char[] arr = new char[26];

		
		
		for (int i=0, ch=65; i<arr.length ; i++, ch++) //for���� ������ ���� ���ǽ��� 2���̻��� ������ ----check~!! 
		{
			arr[i] = (char) ch;
				   //(char)(i+65); //arr �迭�� char���̴ϱ� ----check~!!
				   //(char)i+65; �� ������
		}

		for (int i=0; i<arr.length;i++ )
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		
	}
}
/*
A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
