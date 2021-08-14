/* =================================
■■■ 배열 ■■■
- 배열과 난수 처리
====================================*/
/*
  ※ Random 클래스 활용

  사용자로부터 임의의 정수를 입력받아
  그 정수만큼의 난수(1~100)를 발생시켜 배열에 담고
  배열에 담겨있는 데이터들 중
  가장 큰 값과 가장 작은 값을 선택하여
  결과를 출력하는 프로그램을 구현한다.

실행 예)
발생시킬 난수의 갯수 입력 : 6
(53 17 69 45 10 55 -> 무작위로 발생한 정수들...)
(int[] arr = {53, 17, 69, 45, 10, 55} -> 배열에 담아내기(배열 구성))
가장 큰 값 : 69,  가장 작은 값 : 10
계속하려면 아무 키나 누르세요...
*/
import java.util.Scanner;
import java.util.Random;

public class hyodii090
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("발생시킬 난수의 갯수 입력 : ");
		n = sc.nextInt();

		int[]arr = new int[n];

		Random rd = new Random();
		for (int i=0; i<n; i++)
			arr[i] = rd.nextInt(100)+1;
		
		int max, min;
 		max = min = arr[0];

		for (int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " " );
		System.out.println();


		for (int i=0; i<arr.length; i++)
		{
			if (max < arr[i])
			{
				max = arr[i];
			}
			if (min > arr[i])
			{
				min = arr[i];
			}
		}

		System.out.printf("가장 큰 값  : %d, 가장 작은 값 : %d\n",max,min);


	}
}
/*
발생시킬 난수의 갯수 입력 : 6
90 98 54 5 7 51
가장 큰 값  : 98, 가장 작은 값 : 5
계속하려면 아무 키나 누르십시오 . . .
*/