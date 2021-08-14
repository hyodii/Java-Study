//Test091.java 파일과 비교~!! 
//(데이터 복사)
//-- int 형 배열에 대한 깊은 의미의 복사를 처리하는
//   메소드를 정의하는 형태로 실습을 진행한다.

public class hyodii092
{
	public static void main(String[] args)
	{
		int[] nums = {10, 20, 30, 40 , 50};
		int[] copys1 = nums;
		int[] copys2 = copyArray(nums);
		int[] copys3 = (int[])nums.clone();


		nums[1] = 2;

		for (int i=0; i<nums.length;i++ )
		{
			System.out.print(nums[i] + " ");
		}System.out.println();

		for (int i=0; i<copys1.length;i++ )
		{
			System.out.print(copys1[i] + " ");
		}System.out.println();

		for (int i=0; i<copys2.length;i++ )
		{
			System.out.print(copys2[i] + " ");
		}System.out.println();

		for (int i=0; i<copys3.length; i++ )
		{
			System.out.print(copys3[i] + " ");
		}System.out.println();
	}

	public static int[] copyArray(int[] os)
	{
		int[] temp = new int[os.length];

		for (int i=0; i<os.length; i++)
		{
			temp[i] = os[i];
		}
		return temp;
	}
}
/*
10 2 30 40 50
10 2 30 40 50
10 20 30 40 50
10 20 30 40 50
계속하려면 아무 키나 누르십시오 . . .
*/