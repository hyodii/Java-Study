/* ===========================================
  ■■■ 자바의 주요(중요) 클래스 ■■■
  - Wrapper(래퍼) 클래스 
==============================================*/

public class Test130
{
	public static void main(String[] args)
	{
		byte b = 3;
		int i = 256;

		Byte b2 = new Byte(b);         //Boxing
		Integer i2 = new Integer(i);   //Boxing

		System.out.println(b2);
		System.out.println(i2);
		//--==>> 3
		//		 256


		print(b2);                  
		print(i2);                  
		
		// Byte 클래스의 byteValue() 메소드 호출
		byte b3 = b2.byteValue();

		// Integer 클래스의 intValue() 메소드 호출
		int i3 = i2.intValue();

		System.out.println(b3);
		System.out.println(i3);
		//--==>> 3           //Unboxing
		//		 256         //Unboxing

		//check~!!!
		int i4 = b2.byteValue();   //b2는 객체타입 b2.byteValue()는 기본 자료형의 바이트 타입을 반환!! -> 3
		//byte b4 = i2.intValue();   //i2 자체가 객체인데 intValue()로 반환하면 int 형으로 반환! -> 256  -> 에러 발생!!!
		byte b4 = i2.byteValue();    //--==>> 반드시 확인!!! 바이트 타입으로 바꿔도 담기지 않음

		//check~!!!
		System.out.println(i4);
		//--==>> 3
		//System.out.println(b4);   
		// 이거는 int가 더 커서 오류남!
		System.out.println(b4);
		//--==>> 0



	}

	//위에 프린트를 인스턴스 생성없이 호출이 가능하게 하려면?  
	/*
	static void print(Byte b)  // 이건 b2만 처리됨
	{
		...;
	}
	
	static void print(Integer i)  // i도 처리하려면 이거도 만들어
	{
		...;
	}

	static void print(int i)
	{
		...;
	}

	static void print(Object o)  // 이거는 뭘넣어도 다됨!!
	{
		...;
	}
	*/

	// java lang.Number 클래스(추상 클래스)는        Number ob = new Number(); 이렇게 인스턴스 생성할 수 없다!
	// 모든 Wrapper 클래스들의 부모 클래스
	// (슈퍼 클래스, 상위 클래스)이다.
	// b2, i2 자료형이 Number n 에 넘어오면서
	// Auto-Boxing 이 일어나게 된다.
	public static void print(Number n)
	{
		System.out.println("++" + n);
		System.out.println(n.intValue());
	}
}

/*
3
256
++3
3
++256
256
3
256
3
0
계속하려면 아무 키나 누르십시오 . . .

*/