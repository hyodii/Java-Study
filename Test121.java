/* =============================================
■■■ 클래스 고급 ■■■
- 중첩 클래스   (실무에서 쓰일일 거의 없음 ^__^ ~)
================================================*/

/*
○ Annonymous 클래스(익명의 클래스 :  무명 클래스)       //--잠시 사용하고 버리는 클래스
	
	- awt 나 안드로이드 이벤트 처리에서 일반적으로 사용
	- 상위 클래스 메소드를 하나 정도 재정의할 필요성이 있을 때 사용
	- 클래스의 객체가 필요하면 또 다시 클래스를 생성해야 하는 
	  번거로움 때문에 익명의 클래스를 생성하여 처리한다.

○ 형식 및 구조

	new 상위클래스의 생성자()
	{
		접근제어지시자 자료형 메소드()
		{
			...;
		}
	};         //← 세미콜론 check~!!!
*/


//import java.lang.*;
class Test3 //extends Object     //-- 모든 클래스는 오브젝트라는 클래스를 상속받음!!
								 // 근데 이러면 자바 다중 상속 부분에서 이건 예외인가?
								 // 아니다! 가장 상위클래스가 오브젝트라는 클래스이기 때문에 모든 클래스의 조상클래스다!
{
	/*
	Object 클래스의 멤버들...
	...
	  
	public String toString()  //-- toString : 객체가 가지고 있는 정보나 값들을 문자열로 만들어 리턴하는 메소드
	{
		...;
	}
	*/

	public Object getString()
	{
		/*
		Object result;

		result = new Object();

		return Object;   // == return result;
		*/

		/* 위에 구문이랑 같은 구문
		return new Object();
			   ------------ Object 형
		*/

		return new Object()
		{
			public String toString()
			{
				return "익명의 클래스...";
			}
		};   // 세미클론 꼭 check~!!!


	}//end getString()
}//end class Test3


public class Test121 //extends Object
{
	/*
	Object 가 갖고있는 멤버들...
	*/
	public static void main(String[] args)
	{
		Test3 ob1 = new Test3();
		Test3 ob2 = new Test3();

		System.out.println(ob1.toString());   //오브젝트로부터 상속받은 투스트링메소드를 상속받아서 사용하고 있는것!
		//--==>> Test3@15db9742

		Test121 ob3 = new Test121();
		System.out.println(ob3.toString());   //오브젝트로부터 상속받은 투스트링메소드를 상속받아서 사용하고 있는것!
		//--==>> Test121@6d06d69c

		System.out.println(ob2.getString());
		//--==>> 익명의 클래스...

	}
}