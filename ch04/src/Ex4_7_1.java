class Ex4_7_1 {
	public static void main(String args[]) 
	{
		int num=0;
		
		// Quiz. 1~10������ ������ 20�� ����Ͻÿ�.
		for(int i=1; i<=20;i++)
		{
//			System.out.println(Math.random());			// 0.0<=x<1.0
//			System.out.println(Math.random()*10);		// 0.0<=x<10.0
//			System.out.println((int)(Math.random()*10)); // 0<=x<10 ��ȣ ��ġ�� �� 0 ����!! check~!!!
//			System.out.println((int)(Math.random()*10)+1); // 1<=x<11
			
			// Quiz2. -5 ~ 5������ ������ 20�� ����Ͻÿ�.
			// -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5 => 11��
//			System.out.println((int)(Math.random()*11)); // 0<=x<11 
			System.out.println((int)(Math.random()*11)-5); // -5<=x<6 
		}
		/*
		for(int i=1;i<=20;i++)
		{ 
			// Quiz3. �ζ� ������ ���� 1~45���� 6���� ����Ͻÿ�.
			System.out.println((int)(Math.random()*45)+1);
		}
		*/
		
	}
}