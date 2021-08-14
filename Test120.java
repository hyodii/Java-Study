/* =============================================
■■■ 클래스 고급 ■■■
- 중첩 클래스   (실무에서 쓰일일 거의 없음 ^__^ ~)
================================================*/

//outer
class InnerOuterTest
{
	static int a = 10;
	int b = 20;

	//inner
	class InnerNested
	{
		int c = 30;

		void write()
		{
			System.out.println("inner의 write()...");
			System.out.println("a : " + a);
			System.out.println("b : " + b);
			System.out.println("b : " + c);
		}

		
	}// end class InnerNested

	void write()
		{
			System.out.println("outer의 write()...");
			InnerNested ob1 = new InnerNested();
			ob1.write();
		}

}// end class InnerOuterTest


// main() 메소드를 포함하고 있는 외부의 다른 클래스
public class Test120
{
	public static void main(String[] args)
	{
		//outer의 인스턴스 생성
		InnerOuterTest ob2 = new InnerOuterTest();          //-- 앞에서 본 로컬처럼 확인할 것 없음~!!
		ob2.write();   //-- outer의  write() 메소드 호출


		// Test118.java에서 생성한 방법으로 시도  // static이 붙어있는 문법이여야 가능
		//InnerOuterTest.InnerNested ob3 = new InnerOuterTest.InnerNested();
		//--==>> 에러 발생 (컴파일 에러)    


		// 일반적인 인스턴스 생성 방법으로 시도  // 일반적인 인스턴스 생성문법인데 안댐
		//InnerNested ob4 = new InnerNested();
		//--==>> 에러 발생 (컴파일 에러)     

		// ※ 중첩 내부 클래스(static 중첩 클래스) 와는 달리
		//	  외부 클래스의 인스턴스(객체)를 사용하지 않고
		//	  단독으로 내부 클래스의 인스턴스 생성하는 것은 불가능하다.

		// 그러면 외부클래스 인스턴스를 사용하면 내부 클래스 인스턴스 생성은 가능하다는 것~!!

		// ※  check~!!!
		// ※  test118.java 파일과 비교할 것~!!!

		// 『new InnerOuterTest().new InnerNested();』                  //--check~!!!! ★ 꼭 기억하기 ★
		
		InnerOuterTest.InnerNested ob5 = ob2.new InnerNested();
		ob5.write();
		//--==>>inner의 write()...
		//		a : 10
		//		b : 20
		//		b : 30

		InnerOuterTest.InnerNested ob6 = new InnerOuterTest().new InnerNested();
		ob6.write();
		//--==>>inner의 write()...
		//		a : 10
		//		b : 20
		//		b : 30

		/*
		outer클래스명.inner클래스명 참조변수명 = new outer생성자().new inner생성자();
		*/

		// cf) static -> 중첩 내부 클래스
		// Test.StaticNested ob = new Test.StaticNested();

		// outer클래스명.inner클래스명 참조변수명 = new outer클래스명.inner생성자();
	}
}

