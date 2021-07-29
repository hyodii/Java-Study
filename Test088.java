실행 예)

 A                    1
 B  C                 2
 D  E  F              3
 G  H  I  J           4
 K  L  M  N  O        5
계속하려면 아무 키나 누르세요...
*/


public class Test088
{
	public static void main(String[] args)
	{
		int[][] arr = new int[5][5];
		char c = 'A';

		for (int i=0; i<arr.length;i++ )
		{
			for (int j=0; j<=i;j++)   //0     1          2             3               4 
  			{                             //10 11    20 21 22     30 31 32 33     40 41 42 43
				arr[i][j]=c;              //   i랑 j의 값이 같아질때 까지 증가
				c++;
			}
		}
		
		for (int i=0; i<arr.length;i++)
		{
			for (int j=0; j<arr[i].length; j++)
			{
				System.out.printf("%3c",arr[i][j]);
			}System.out.println();
		}
	}
}
/*
  A
  B  C
  D  E  F
  G  H  I  J
  K  L  M  N  O
계속하려면 아무 키나 누르십시오 . . .
*/
