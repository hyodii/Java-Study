//hyodii092.java 파일과 비교~!! (주소값 복사)

public class hyodii091
{
	public static void main(String[] args)
	{
		int[] nums = {10, 20, 30, 40, 50};
		int[] copys;

		int temp;

		copys = nums;
		temp = nums[0];

		nums[0] = 1000;

		for (int i=0; i<copys.length; i++)
		{
			System.out.print(copys[i] + " ");
		}System.out.println();

		System.out.println("temp : " + temp);

	}
}
/*
1000 20 30 40 50
temp : 10
계속하려면 아무 키나 누르십시오 . . .
*/