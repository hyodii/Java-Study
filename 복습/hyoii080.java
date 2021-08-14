/* =================================
■■■ 배열 ■■■
- 배열의 기본적 활용(2차원 배열)
====================================*/

public class hyoii080
{
	public static void main(String[] args)
	{
		int[][] arr1 = new int[3][3];
		arr1[0][0] = 1;
		arr1[0][1] = 2;
		arr1[0][2] = 3;
		arr1[1][0] = 4;
		arr1[1][1] = 5;
		arr1[1][2] = 6;
		arr1[2][0] = 7;
		arr1[2][1] = 8;
		arr1[2][2] = 9;

		for (int i=0 ; i<arr1.length; i++)
			for (int j=0; j<arr1[i].length; j++)
			{
				System.out.print(arr1[i][j]+ " ");
			}System.out.println();
			//--==>> 1 2 3 4 5 6 7 8 9

		int[][] arr2 = {{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0;i<arr2.length;i++)
			for (int j=0; j<arr2[i].length; j++)
			{
				System.out.print(arr2[i][j]+" ");
			}System.out.println();
			//--==>> 1 2 3 4 5 6 7 8 9
		
		int[][] arr3 = new int[3][3];
		int n = 1;
		for (int i=0; i<arr3.length; i++)
			for (int j=0; j<arr3[i].length;j++ )
			{
				arr3[i][j] = n;
				n++;
			}

		for (int i=0; i<arr3.length;i++ )
		{
			for (int j=0; j<arr3[i].length; j++)
			{
				System.out.printf("%2d",arr3[i][j]);
			}
		}System.out.println();
		//--==>> 1 2 3 4 5 6 7 8 9
			
	}
}
/*
1 2 3 4 5 6 7 8 9
1 2 3 4 5 6 7 8 9
 1 2 3 4 5 6 7 8 9
계속하려면 아무 키나 누르십시오 . . .
*/