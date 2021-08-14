/* =================================
■■■ 배열 ■■■
- 배열의 기본적 활용(2차원 배열)
====================================*/
/* ○ 과제
배열의 배열(다차원 배열)을 활용하여
다음과 같은 데이터를 요소로 취하는 배열을 구성하고
그 결과를 출력하는 프로그램을 구현한다.

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