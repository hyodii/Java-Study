class Ex4_8_1 {
	public static void main(String args[]) 
	{
		/*
		for (int i=10;i>=1;i--) // 값줄일 때는 조건식 i>=1 잘봐야함!! 안그러면 계속 무한반복! 
		{ // 괄호{}안의 문장을 3번 반복
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
		
		int i=1;	// scope(범위) - 선언위치부터 선언된 블럭의 끝까지 ★scope의 범위는 좁을 수록 좋다!!★
		// 조건식을 생략하면, for(;true;)로 간주되어서 무한반복이 됨
		for(;;)
			System.out.println("i="+i);
//		System.out.println(i);	// 위에 코드가 무한반복되니까 이 코드가 실행될 수 없다!
		
		
	} // main 끝!
} //class 끝!