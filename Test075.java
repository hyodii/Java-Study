/* =====================
■■■ 배열 ■■■
- 배열의 기본적 활용
=========================*/
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

public class Test075
{
	public static void main(String[] args)
	{
		/* 방법1
		int[] arr = new int[9];
		arr[0] = 4;
		arr[1] = 7;
		arr[2] = 9;
		arr[3] = 1;
		arr[4] = 3;
		arr[5] = 2;
		arr[6] = 5;
		arr[7] = 6;
		arr[8] = 8;
		*/

		// 방법2
		int[] arr = {4,7,9,1,3,2,5,6,8};

		//System.out.print(arr);
		//--==>> [I@15db9742

		// ※ 일반적인 변수에 담긴 내용을 출력하는 형식(방법)으로는
		//	  배열에 담긴 데이터들을 출력할 수 없다.

		/*
		System.out.println("배열 요소 전체 출력");
		for(int i=0;i<9;i++)  //범위 9까지!!!!-----check~!!
		{

			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		//테스트
		int[] arr2 = {4,7,5,3,6,9,8,4,2,1,5,3,2,1,6,5,4,8,7,9,5,4,3,2,1,6,5,4,5,3,2,1,6,5,7,9,5,4,3,2,1,3,5,1,3,5,7,5,7,9,5,4,5};
		System.out.println(arr2[52]+" "); //이거 52개인지 알려면 다 세봐야하는데 편하려고 이렇게 썻는데 더 불편해!
		

		System.out.println("arr.length : " + arr.length);  //그래서 길이를 구하는 법 알려줄께! .length
		//--==>>arr.length : 9
		System.out.println("arr.length : " + arr2.length);
		//--==>>arr.length : 53

		//--==>> ※ 배열 arr의 길이(방의 갯수) 확인 : arr.length
		*/
		
		System.out.println("배열 요소 전체 출력");
		for (int i=0; i<arr.length; i++)
		
			System.out.print(arr[i]+" ");
		System.out.println();
		/* //--==>>
		배열 요소 전체 출력
		4 7 9 1 3 2 5 6 8
		*/

		
		System.out.println("짝수 선택적 출력");
		for(int i=0; i<arr.length; i++) //for(int i=0;i<9;i++)
			if(arr[i]%2==0)  //i%2라면 이 아니라 arr[i]%2로 해줘야함!!! 
				System.out.print(arr[i]+" ");
		/* //--==>>
		짝수 선택적 출력
		4 2 6 8
		*/
		
		
		System.out.println();

		System.out.println("3의 배수 선택적 출력");
		for(int i=0;i<9;i++)
			if(arr[i]%3==0)
				System.out.print(arr[i]+" ");
		System.out.println();
		/* //--==>>
		홀수 선택적 출력
		9 3 6
		*/
	
	}
}
/*
배열 요소 전체 출력
4 7 9 1 3 2 5 6 8
짝수 선택적 출력
4 2 6 8
홀수 선택적 출력
9 3 6
계속하려면 아무 키나 누르십시오 . . .
*/