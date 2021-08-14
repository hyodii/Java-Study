/* =====================
■■■ 배열 ■■■
- 배열 선언과 초기화
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
			System.out.println("arr 배열의 "+ i +"번째 방 : " + arr[i]);

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
arr 배열의 0번째 방 : 1
arr 배열의 1번째 방 : 2
arr 배열의 2번째 방 : 3
arr 배열의 3번째 방 : 0
arr 배열의 4번째 방 : 0
arr 배열의 5번째 방 : 0
arr 배열의 6번째 방 : 0
arr 배열의 7번째 방 : 0
arr 배열의 8번째 방 : 0
arr 배열의 9번째 방 : 0
계속하려면 아무 키나 누르십시오 . . .
*/