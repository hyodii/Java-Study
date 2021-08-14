/*
배열의 배열(다차원 배열)을 활용하여
다음과 같은 데이터를 요소로 취하는 배열을 구성하고
그 결과를 출력하는 프로그램을 구현한다.
 
   n
  ↓
   1  2  3  4  5        i=0  -> n이 1부터 시작 -> n+i
   2  3  4  5  6        i=1  -> n이 2부터 시작 -> n+i
   3  4  5  6  7        i=2  -> n이 3부터 시작 -> n+i
   4  5  6  7  8        i=3  -> n이 4부터 시작 -> n+i
   5  6  7  8  9        i=4  -> n이 5부터 시작 -> n+i

   계속하려면 아무키나 누르세요...

   -> 규칙을 찾으면 n은 i+1부터 시작!!
*/

public class hyodii082
{
	public static void main(String[] args)
	{
		int[][] a = new int[5][5];

		for (int i=0; i<a.length; i++)
		{
			int n = i+1;                   //----check~!!!
			for (int j=0; j<a[i].length;j++ )
			{
				a[i][j] = n;
				n++;
			}
		}

		for (int i=0; i<a.length; i++)
		{
			for (int j=0; j<a.length;j++ )
			{
				System.out.printf("%3d",a[i][j]);
			}System.out.println();
		}

	}
}
/*
  1  2  3  4  5
  2  3  4  5  6
  3  4  5  6  7
  4  5  6  7  8
  5  6  7  8  9
계속하려면 아무 키나 누르십시오 . . .
*/