mport java.util.Scanner;
import java.util.Random;

public class Test090
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int size;
		System.out.print("발생시킬 난수의 갯수 입력 : ");
		size = sc.nextInt();

		int[] arr = new int[size];

		Random rd = new Random();

		for (int i=0; i<size; i++)
			arr[i] = rd.nextInt(100)+1;

		int max, min;

		max=min=arr[0];

		for (int i=1; i<arr.length; i++)
		{
			if(max<arr[i])
				max = arr[i];
			if(min>arr[i])
				min = arr[i];
		}
		

		System.out.println("가장 큰 값 : " + max + "가장 작은 값 " + min);

	}
}
/*
발생시킬 난수의 갯수 입력 : 10
가장 큰 값 : 94가장 작은 값 39
계속하려면 아무 키나 누르십시오 . . .
*/
