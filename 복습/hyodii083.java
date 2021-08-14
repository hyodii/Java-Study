/*
배열의 배열(다차원 배열)을 활용하여
다음과 같은 데이터를 요소로 취하는 배열을 구성하고
그 결과를 출력하는 프로그램을 구현한다.

 n
  ↓
   1  2  3  4  5        i=0  n=1  0부터 출발 [0][0] ~ [0][4]
   5  1  2  3  4        i=1  n=1  1부터 출발 [1][1] ~ [1][4]  [1][0]
   4  5  1  2  3        i=2  n=1  2부터 출발 [2][2] ~ [2][4]  [2][0]
   3  4  5  1  2        i=3  n=1  3부터 출발 [3][3] ~ [3][4]  [3][0]
   2  3  4  5  1        i=4  n=1  4부터 출발 [4][4] ~ [4][4]  [4][0]

   -> 규칙 : n 이 5일때 0으로 초기화!!

   계속하려면 아무키나 누르세요...
*/


public class hyodii083
{
	public static void main(String[] args)
	{
		int[][] arr = new int[5][5];

		for (int i=0; i<arr.length; i++)
		{
			for (int c=i, n=1; n<=5; n++)
			{
				arr[i][c] = n;
				c++;
				
				if (c==5)
				{
					c=0;
				}
			}
		}
		
		
		/* 방법 2
		int n = 1;
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
			{
				if(n==6)
				{
					n=1;
				}
				arr[i][j] = n;
				n++;
				System.out.print(n);
			}System.out.println();
			n--;

		}
		*/

		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length;j++ )
			{
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();
		}
	}
}
/*
  1  2  3  4  5
  5  1  2  3  4
  4  5  1  2  3
  3  4  5  1  2
  2  3  4  5  1
계속하려면 아무 키나 누르십시오 . . .
*/