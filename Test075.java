/* =====================
���� �迭 ����
- �迭�� �⺻�� Ȱ��
=========================*/
/*
������ �������� ����ִ� �迭�� ���� �����͵� ��
¦���� ��Ҹ� ��� ����ϰ�, 3�� ����� ��Ҹ� ��� ����ϴ�
���α׷��� �����ϴ�.

�迭�� �����ϴ� ������ ���� = 4 7 9 1 3 2 5 6 8

���� ��)
�迭 ��� ��ü ���
4 7 9 1 3 2 5 6 8
¦�� ������ ���
4 2 6 8
3�� ��� ������ ���
9 3 6
����Ϸ��� �ƹ� Ű�� ������...
*/

public class Test075
{
	public static void main(String[] args)
	{
		/* ���1
		int[] arr = new int[9];
		arr[0] = 4;
		arr[1] = 7;
		arr[2] = 9;
		arr[3] = 1;
		arr[4] = 3;
		arr[5] = 2;
		arr[6] = 5;
		arr[7] = 6;
		arr[8] = 8;
		*/

		// ���2
		int[] arr = {4,7,9,1,3,2,5,6,8};

		//System.out.print(arr);
		//--==>> [I@15db9742

		// �� �Ϲ����� ������ ��� ������ ����ϴ� ����(���)���δ�
		//	  �迭�� ��� �����͵��� ����� �� ����.

		/*
		System.out.println("�迭 ��� ��ü ���");
		for(int i=0;i<9;i++)  //���� 9����!!!!-----check~!!
		{

			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		//�׽�Ʈ
		int[] arr2 = {4,7,5,3,6,9,8,4,2,1,5,3,2,1,6,5,4,8,7,9,5,4,3,2,1,6,5,4,5,3,2,1,6,5,7,9,5,4,3,2,1,3,5,1,3,5,7,5,7,9,5,4,5};
		System.out.println(arr2[52]+" "); //�̰� 52������ �˷��� �� �������ϴµ� ���Ϸ��� �̷��� ���µ� �� ������!
		

		System.out.println("arr.length : " + arr.length);  //�׷��� ���̸� ���ϴ� �� �˷��ٲ�! .length
		//--==>>arr.length : 9
		System.out.println("arr.length : " + arr2.length);
		//--==>>arr.length : 53

		//--==>> �� �迭 arr�� ����(���� ����) Ȯ�� : arr.length
		*/
		
		System.out.println("�迭 ��� ��ü ���");
		for (int i=0; i<arr.length; i++)
		
			System.out.print(arr[i]+" ");
		System.out.println();
		/* //--==>>
		�迭 ��� ��ü ���
		4 7 9 1 3 2 5 6 8
		*/

		
		System.out.println("¦�� ������ ���");
		for(int i=0; i<arr.length; i++) //for(int i=0;i<9;i++)
			if(arr[i]%2==0)  //i%2��� �� �ƴ϶� arr[i]%2�� �������!!! 
				System.out.print(arr[i]+" ");
		/* //--==>>
		¦�� ������ ���
		4 2 6 8
		*/
		
		
		System.out.println();

		System.out.println("3�� ��� ������ ���");
		for(int i=0;i<9;i++)
			if(arr[i]%3==0)
				System.out.print(arr[i]+" ");
		System.out.println();
		/* //--==>>
		Ȧ�� ������ ���
		9 3 6
		*/
	
	}
}
/*
�迭 ��� ��ü ���
4 7 9 1 3 2 5 6 8
¦�� ������ ���
4 2 6 8
Ȧ�� ������ ���
9 3 6
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/