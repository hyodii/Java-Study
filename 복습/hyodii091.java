//hyodii092.java ���ϰ� ��~!! (�ּҰ� ����)

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
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/