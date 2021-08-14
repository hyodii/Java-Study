/*
배열의 배열(다차원 배열)을 활용하여
다음과 같은 데이터를 요소로 취하는 배열을 구성하고
그 결과를 출력하는 프로그램을 구현한다.

실행 예)

  E  J  O  T  Y    00  01  02  03  04              
  D  I  N  S  X    10  11  12  13  14        
  C  H  M  R  W    20  21  22  23  24        
  B  G  L  Q  V    30  31  32  33  34        
  A  F  K  P  U    40  41  42  43  44       
 계속하려면 아무 키나 누르세요...

*/

public class hyodii085
{
	public static void main(String[] args)
	{
		char[][] arr = new char[5][5];

		char n = 'A';

		/*----------------------------------------------------------------------

		for (int i=0; i<5; i++)
		{
			for (int j=0; j<5; j++)
			{
				arr[4-j][i] = n;
				n++;
			}
		}
		-------------------------------------------------------------------*/


		for (int i=0; i<5; i++)
		{
			for (int j=4; j>=0;j-- )
			{
				arr[j][i] = n;
				n++;
			}
		}


		for (int i=0; i<arr.length;i++ )
		{
			for (int j=0; j<arr[i].length; j++)
			{
				System.out.printf("%3c",arr[i][j]);
			}System.out.println();
		}
	}
}
/*
  E  J  O  T  Y
  D  I  N  S  X
  C  H  M  R  W
  B  G  L  Q  V
  A  F  K  P  U
계속하려면 아무 키나 누르십시오 . . .
*/