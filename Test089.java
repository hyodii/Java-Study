/* =================================
■■■ 배열 ■■■
- 배열의 기본적 활용(2차원 배열)
====================================*/
/* ○ 과제
배열의 배열(다차원 배열)을 활용하여
다음과 같은 데이터를 요소로 취하는 배열을 구성하고
그 결과를 출력하는 프로그램을 구현한다.

실행 예)

A                     00
C  B                  11  10               j가   1 0  --
D  E  F               20  21  22           j가   0 1 2  ++
J  I  H  G            33  32  31  30       j가   3 2 1 0 --
K  L  M  N  O         40  41  42  43  44   j가   0 1 2 3 4 ++
계속하려면 아무 키나 누르세요...


*/

public class Test089
{
	public static void main(String[] args)
	{
		int[][] arr = new int[5][5];
		char c = 'A';

		for (int i=0; i<5; i++)
		{
			if(i%2==0)
			{
				for (int j=0; j<=i; j++)  //i가 2일때 j가   0 1 2  ++
					arr[i][j] = c++;      //i가 4일때 j가   0 1 2 3 4 ++
			}
			else if(i%2!=0)
			{
				for (int j=i; j>=0; j--)  //i가 1일때 j가   1 0  --
					arr[i][j] = c++;      //i가 3일때 j가   3 2 1 0 --
			}
				
		}

		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length;j++ )
			{
				System.out.printf("%3c",(char)arr[i][j]);
			}System.out.println();
		}

	}
}
/*
  A
  C  B
  D  E  F
  J  I  H  G
  K  L  M  N  O
계속하려면 아무 키나 누르십시오 . . .
*/
