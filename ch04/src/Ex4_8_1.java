class Ex4_8_1 {
	public static void main(String args[]) 
	{
		/*
		for (int i=10;i>=1;i--) // ������ ���� ���ǽ� i>=1 �ߺ�����!! �ȱ׷��� ��� ���ѹݺ�! 
		{ // ��ȣ{}���� ������ 3�� �ݺ�
			System.out.println(i);
		}
		*/
		
		
		for(int i=1,j=10; i<=10;i++,j--)
		{
			System.out.println("i="+i+", j="+j);
		}
		/*
		i=1, j=10
		i=2, j=9
		i=3, j=8
		i=4, j=7
		i=5, j=6
		i=6, j=5
		i=7, j=4
		i=8, j=3
		i=9, j=2
		i=10, j=1 
		*/
		
		int i=1;	// scope(����) - ������ġ���� ����� ���� ������ ��scope�� ������ ���� ���� ����!!��
		// ���ǽ��� �����ϸ�, for(;true;)�� ���ֵǾ ���ѹݺ��� ��
		for(;;)
			System.out.println("i="+i);
//		System.out.println(i);	// ���� �ڵ尡 ���ѹݺ��Ǵϱ� �� �ڵ尡 ����� �� ����!
		
		
	} // main ��!
} //class ��!