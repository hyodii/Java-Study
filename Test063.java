//Test064.java 와 비교~!!!

// ※ 지역 변수는 초기화 과정을 거치지 않으면 사용할 수 없다.
//  -> (즉, 자바가 자동으로 초기화를 수행해 주거나 하지 않는다.)

public class Test063                          //클래스
{
		
	public static void main(String[] args)    //메소드
	{
		// 지역 변수 n
		int n;
		// -- 선언 후 초기화 과정을 거치지 않은 상태.

		System.out.println("n : " + n);
		// 에러발생(컴파일 에러)
		//variable n might not have been initialized
		// 지역 변수 n 에 접근하여 그 값을 출력하고자 하는 구문

	}
}

/*-------------------------------------------------------------*/
//Test063.java 와 비교~!!!
//전역변수 초기화되는 값 보기

public class Test064
{
	// 전역 변수 a 선언
	int a;
	// 자동으로 0으로 초기화 지원
	
	// 전역 변수 b 선언
	boolean b;
	// 전역 변수 c 선언
	char c;
	// 전역 변수 d 선언
	double d;
	
	public static void main(String[] args)
	{
		// Test064 인스턴스 생성 -> 버퍼드리더처럼 a쓰려면 인스턴스 생성을 해줘야함
		Test064 ob = new Test064();
		
		System.out.println("ob.a : " +ob.a);
		//==> 0b.a : 0

		System.out.println("ob.b : " +ob.b);
		//==> ob.b : false  //자동으로 0이 들어감

		System.out.println("ob.c : "+ob.c);
		//==> ob.c :        //자동으로 공백

		System.out.println("ob.d : "+ob.d);
		//==> ob.d : 0.0    //자동으로 0.0

	}
}
