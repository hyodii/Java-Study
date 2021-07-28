/* 
사용자로부터 임의의 정수를 임의의 갯수만큼 입력받아서
입력받은 수 중에서 가장 큰 수를 출력하는 프로그램을 작성한다.
단, 배열을 활용하여 구현할 수 있도록 한다.

실행 예)
입력할 데이터의 갯수   : 10
데이터 입력(공백 구분) : 74 65 13 91 5 67 41 2 50 11
>> 가장 큰 수 -> 91
계속하려면 아무 키나 누르세요...
*/

import java.util.Scanner;

public class Test078
{
	public static void main(String[] args)
	{
		//변수 선언 및 입력할 데이터 적기
		int n,temp=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("입력할 데이터의 갯수   : ");
		n = sc.nextInt();
		
		//데이터 입력배열 만들기
		int[] arr = new int[n];
		System.out.print("데이터 입력(공백 구분) : ");

		for (int i=0; i<n;i++ )
		{
			arr[i] = sc.nextInt();
		}

		//큰 수를 temp에 담기
		//방법 1
		for (int i=0; i<n-1;i++ )
		{
			if(arr[i]>temp)
			{
				temp = arr[i];

				
			}
		}
		System.out.printf(">> 가장 큰 수 -> %d\n",temp);

		//큰 수를 temp에 담기
		//방법 2
		for (int i=0; i<n-1;i++ )
		{
			if(arr[i]>arr[i+1])
			{
			
				arr[i] = arr[i]^arr[i+1];
				arr[i+1] = arr[i+1]^arr[i];
				arr[i] = arr[i]^arr[i+1];
			}
		}
		System.out.printf(">> 가장 큰 수 -> %d\n",arr[n-1]);

	}
}
/* 실행 결과
입력할 데이터의 갯수   : 8
데이터 입력(공백 구분) : 454 121 642 85 2 5 1 62
>> 가장 큰 수 -> 642
계속하려면 아무 키나 누르십시오 . . .
*/
