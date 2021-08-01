/*
배열의 배열(다차원 배열)을 활용하여
다음과 같은 데이터를 요소로 취하는 배열을 구성하고
그 결과를 출력하는 프로그램을 구현한다.

실행 예)

   1   2   3   4  10
   5   6   7   8  26
   9  10  11  12  42
  13  14  15  16  58
  28  32  36  40 136
계속하려면 아무 키나 누르세요...

   1   2   3   4  1
   5   6   7   8  0
   9  10  11  12  0
  13  14  15  16  0
   1   0   0   0  1

 ->  이 구조니까 1들어간 세곳에 식을 누적해야함

*/

public class Test086
{
	public static void main(String[] args)
	{
		int[][] arr = new int[5][5];

		int n = 0;
		for (int i=0; i<4; i++)
		{
			for (int j=0; j<4; j++)
			{
				n++;
					arr[i][j] = n;
				arr[i][4] += arr[i][j];
				arr[4][j] += arr[i][j];
				arr[4][4] += arr[i][j];
			}
		}

		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
			{
				System.out.printf("%4d",arr[i][j]);
			}System.out.println();
		}
	}
}
/*
   1   2   3   4  10
   5   6   7   8  26
   9  10  11  12  42
  13  14  15  16  58
  28  32  36  40 136
계속하려면 아무 키나 누르십시오 . . .
*/
