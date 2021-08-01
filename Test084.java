/*
배열의 배열(다차원 배열)을 활용하여
다음과 같은 데이터를 요소로 취하는 배열을 구성하고
그 결과를 출력하는 프로그램을 구현한다.

 n
  ↓
   1   8   9  16  17       00 01 02 03 04 
   2   7  10  15  18       10 11 12 13 14 
   3   6  11  14  19       20 21 22 23 24 
   4   5  12  13  20       30 31 32 33 34 
    

   -> 규칙 : 짤수 홀수 나눠서 생각

   계속하려면 아무키나 누르세요...
*/

public class Test084
{
	public static void main(String[] args)
	{
		int[][] arr = new int[4][5];
		int n = 1;

		for (int i=0; i<5; i++)
		{
			for (int j=0; j<4; j++)
			{
				if (i%2==0)
				{
					arr[j][i] = n;
				}
				else
					arr[3-j][i]=n;
				n++;
			}
		}
		
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
			{
				System.out.printf("%3d",arr[i][j]);
			}System.out.println();
		}

	}
}
/*
  1  8  9 16 17
  2  7 10 15 18
  3  6 11 14 19
  4  5 12 13 20
계속하려면 아무 키나 누르십시오 . . .
*/
