/* =====================
���� �迭 ����
- �迭 ����� �ʱ�ȭ
=========================*/

public class hyodii074
{
	public static void main(String[] args)
	{
		int[] arr;
		arr = new int[10];
		//int[] arr = new int[10];

		int[] arr2 = new int[10];

		int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
		int[] arr4 = {1,2,3,4,5,6,7,8,9,0};

		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;

		int num = 10;
		System.out.println("num : " + num);

		System.out.println("arr : " + arr);

		System.out.println("arr[0] : " + arr[0]);
		System.out.println("arr[1] : " + arr[1]);
		System.out.println("arr[2] : " + arr[2]);

		System.out.println(arr[0]+" "+arr[1]+" "+arr2[2]+" "+arr[3]+" "
							+arr[4]+" "+arr[5]+" "+arr[6]+" "+arr[7]+" "+arr[8]+" "+arr[9]);
		for (int i=0; i<10;i++)
		{
			System.out.println("arr �迭�� "+ i +"��° �� : " + arr[i]);

		}


	}
}
/*
num : 10
arr : [I@15db9742
arr[0] : 1
arr[1] : 2
arr[2] : 3
1 2 0 0 0 0 0 0 0 0
arr �迭�� 0��° �� : 1
arr �迭�� 1��° �� : 2
arr �迭�� 2��° �� : 3
arr �迭�� 3��° �� : 0
arr �迭�� 4��° �� : 0
arr �迭�� 5��° �� : 0
arr �迭�� 6��° �� : 0
arr �迭�� 7��° �� : 0
arr �迭�� 8��° �� : 0
arr �迭�� 9��° �� : 0
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/