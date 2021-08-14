/* ======================================
■■■ 클래스 고급 ■■■
- 상속(Inheritance)
=========================================*/

/*
○ 메소드 오버라이딩(Method Overriding)의 특징

	- 메소드 이름, 리턴타입, 파라미터 수나 타입이 완전히 일치해야 한다.
	- 반드시 상속 관계가 있어야 한다.
	- 재정의된 하위 클래스의 메소드 접근제어지시자는
	  상위 클래스의 메소드 접근제어지시자보다 범위가 크거나 같아야 한다.
	  예를 들어, 상위 클래스 메소드의 접근제어지시자가 『protected』인 경우
	  하위 클래스가 이 메소드를 오버라이딩(Overriding)하는 경우
	  접근제어지시자는 『protected』 또는 『public』이어야 한다.
	- 『static』,『final』,『private』 메소드는 오버라이딩(Overriding)할 수 없다.
	- Exception의 추가가 불가능하다.
	  즉, 상위 클래스의 메소드가 가지고 있는 기존 예외 사항에
	  새로운 Exception 을 추가하는 것은 불가능하다는 것이다.

	  -> @Override
	  	 void 메소드(int n) throws IOException, A   불가능!!
		 								      ----
 */


// 부모 클래스(상위 클래스, super class)
class SuperTest110
{
	private int a = 5;
	protected int b = 10;
	public int c = 20;

	public void write()
	{
		System.out.println("Super...write() : " + a + " : " + b + " : " + c);
		//System.out.println("Sub...print() : " + b + " : " + c);
	}
}

// 자식 클래스(하위 클래스, sub class)
class SubTest110 extends SuperTest110
{
	protected int b = 100;

	public void print()
	{
		//System.out.println("Sub...print() : " + a + " : " + b + " : " + c);
		//--==>> 에러 발생(컴파일 에러)
		//-- 슈퍼 클래스에서 선언된 변수 a 에는 접근할 수 없다.
		// -> private 변수이기 때문에....

		System.out.println("1 Sub...print() : " + b + " : " + c);

		System.out.println("2 Sub...print() : " + b);
		System.out.println("3 Sub...print() : " + this.b);
		System.out.println("4 Sub...print() : " + super.b);
		//-- 변수 b는 접근 방법에 따라 다른 b로 접근 및 출력이 이루어진다.
		//		슈퍼 클래스에서 선언된 b, 서브 클래스에서 선언된 b

		System.out.println("5 Sub...print() : " + c);
		System.out.println("6 Sub...print() : " + this.c);
		System.out.println("7 Sub...print() : " + super.c);
		//-- 변수 c 는 접근하는데 아무런 제약과 제한이 없다.
		//   슈퍼 클래스에서 선언된 c
	}

	@Override
	public void write()
	{
		//System.out.println("Sub...write() : " + a + " : " + b + " : " + c);
		//-- 이러면 에러남
		//-- 오버라이드하면 더이상 부모메소드가 아니고 내가 덮어쓰는 것!!
		//--==>> 에러 발생(컴파일 에러)
		//-- 슈퍼 클래스에서 선언된 변수 a 에는 접근할 수 없다.
		// -> private 변수이기 때문에....
		System.out.println("Override Sub...write() : " + b + " : " + c);
		// a 를 빼줘야함!

	}
}

public class Test110
{
	public static void main(String[] args)
	{
		// 하위 클래스(SubTest110) 인스턴스 생성
		SubTest110 ob = new SubTest110();

		ob.print();
		//--==>> Sub...print() : 100 : 20

		ob.write();
		//--==>> Sub...print() : 5 : 10 : 20

		System.out.println("-------------------------------------------------구분선");

		System.out.println(ob.b);  
		//--==>> 100

		System.out.println(ob.b);  //부모로부터 물려받은 객체(10)를 외부클래스에서도 불러올수있을까?
		System.out.println(((SuperTest110)ob).b); 
		//--==>> 10
		// ※슈퍼 부름※  (괄호 check~!!!)

		((SuperTest110)ob).write();
		//--==>> Override Sub...write() : 100 : 20
		// ※ 메소드와 변수를 꼭~!!! 구분하여 정리할 것!!!!


	}
}