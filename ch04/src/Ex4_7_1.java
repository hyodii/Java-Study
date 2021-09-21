class Ex4_7_1 {
	public static void main(String args[]) 
	{
		int num=0;
		
		// Quiz. 1~10사이의 난수를 20개 출력하시요.
		for(int i=1; i<=20;i++)
		{
//			System.out.println(Math.random());			// 0.0<=x<1.0
//			System.out.println(Math.random()*10);		// 0.0<=x<10.0
//			System.out.println((int)(Math.random()*10)); // 0<=x<10 괄호 안치면 다 0 나옴!! check~!!!
//			System.out.println((int)(Math.random()*10)+1); // 1<=x<11
			
			// Quiz2. -5 ~ 5사이의 난수를 20개 출력하시오.
			// -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5 => 11개
//			System.out.println((int)(Math.random()*11)); // 0<=x<11 
			System.out.println((int)(Math.random()*11)-5); // -5<=x<6 
		}
		/*
		for(int i=1;i<=20;i++)
		{ 
			// Quiz3. 로또 임의의 난수 1~45사이 6개를 출력하시오.
			System.out.println((int)(Math.random()*45)+1);
		}
		*/
		
	}
}