/*
임의의 정수들이 들어있는 배열의 숫자 데이터들 중
짝수인 요소만 골라서 출력하고, 3의 배수인 요소만 골라서 출력하는
프로그램을 구현하다.

배열을 구성하는 임의의 정수 = 4 7 9 1 3 2 5 6 8

실행 예)
배열 요소 전체 출력
4 7 9 1 3 2 5 6 8
짝수 선택적 출력
4 2 6 8
3의 배수 선택적 출력
9 3 6
계속하려면 아무 키나 누르세...
*/

public class hyodii075
{
	public static void main(String[] args)
	{
		int[]arr = {4,7,9,1,3,2,5,6,8};
				
		System.out.println("배열 요소 전체 출력");
		for (int i=0; i<arr.length; i++)
			System.out.print(arr[i]+" ");
		System.out.println();
		
		System.out.println();
		System.out.println("짝수 선택적 출력");
		for (int i=0; i<arr.length; i++)
			if(arr[i]%2==0)
				System.out.print(arr[i]+" ");
			System.out.println();
			
			
		System.out.println("3의 배수 선택적 출력");
		for (int i=0; i<arr.length; i++)
			if(arr[i]%3!=0)
				System.out.print(arr[i]+" ");
			System.out.println();
		
	}
}
/*
배열 요소 전체 출력
4 7 9 1 3 2 5 6 8

짝수 선택적 출력
4 2 6 8
3의 배수 선택적 출력
4 7 1 2 5 8
계속하려면 아무 키나 누르십시오 . . .
*/