//Test091.java ���ϰ� ��~!! 
//(������ ����)
//-- int �� �迭�� ���� ���� �ǹ��� ���縦 ó���ϴ�
//   �޼ҵ带 �����ϴ� ���·� �ǽ��� �����Ѵ�.

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
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/