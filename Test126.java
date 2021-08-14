/* ======================================
  ■■■ 자바의 주요(중요) 클래스 ■■■
  - Wrapper(래퍼) 클래스
=========================================*/
// p.490

/* 
○ Wrapper 클래스

	1.  자바에서는 언어 수준에서 제공하는 기본형 데이터를 제외한
		나머지는 클래스로 정의하여 객체 단위로 처리한다.
		따라서 자바에서는 이러한 기본형 데이터를
		객체 단위로 처리할 수 있도록 클래스를 제공할 수 밖에 없는데
		이러한 클래스들을 가리켜 Wrapper 클래스라 한다.

		"10" → Stirng → 객체 → Object
									↓
								   객체 → Integer → 메소드 parseInt() → 10
								   		   -------  
												  // Wrapper를 Integer로 봐도됨!
		Integer.parseInt(br.readLine());
		Integer.parseInt("10");

	2. 기본 자료형인
	byte, short, int,     long, float, double, char,      boolean 형에 대응하는   (← 기본 자료형)
	Byte, Short, Integer, Long, Float, Double, Character, Boolean 의              (← 클래스)
	Wrapper 클래스 및 큰 숫자들을 다루기 위한
	java.math.BigInteger 와 java.math.BigDecimal 클래스를 제공한다.

	Wrapper 클래스는 java.lang 패키지에 포함되어 있으므로
	별도의 import 과정없이 바로 사용하는 것이 가능하며
	기본형과 마찬가지로 Wrapper 클래스도 내부 메소드를 통해
	형 변환이 가능하고 동등 비교와 같은 연산도 가능하다.

	ex) java.lang.Integer 클래스
		int 기본 자료형의 Wrapper 클래스로
		정수를 다루는데 필요한 상수나 메소드, 진수 변환 등에 필요한
		메소드 등을 포함하고 있다.

		static int parseInt(String s)
		문자열 형식으로 저장된 숫자를 정수 형태로 변환한다.
		       ↓  ↓  ↓
		//Integer i = new Integer();
		
		//i.parseInt() 라고 안하고
		//Integer.parseInt() 라고 하는 이유는 parseInt가 static 메소드이기 때문이다!
		
		static Integer valueOf(int i)
		int 형을 Integer 형으로 변환한다.

		byte byteValue(), int intValue(),
		short shortValue(), long long Value(),
		float floatValue(), double doubleValue()
		해당 기본 자료형으로 형 변환한 값을 반환한다.
*/

/* check~!!!
○ 오토 박싱(Auto-Boxing)과 오토 언박싱(Auto-Unboxing)

	BufferedReader br = "abcd";  이렇게 쓰지않고
	BufferedREader br = new BufferedReader() 이런식으로 쓴다.

	일반적으로 래퍼런스 형과 기본 자료형은 호환되지 않으며
	이 경우 발생하는 문제 해결을 위해 자바에서는 Wrapper 클래스를 제공하게 되었다.
	하지만, JDK 1.5 부터 레퍼런스 형과 기본 자료형이
	다음과 같이 형 변환이 가능하게 되었다.

	int a = 10, b;
	Integer ob;                  // ob는 지금 주소값을 참조하는건데 int 값인 a 를 바로 넣어주는 것! 
				                 //Rect rec = 10; 이거 실제론 불가능! 하지만 오토박싱에서 가능하게 해줌!
	ob = a;
	//-- 기본 자료형(int)이 Integer 형으로 자동 변환(오토 박싱)
	//	 실제로는 ... 『ob = new Integer(a);』

	b = ob;
	//-- Integer(객체)가 기본 자료형인 int 형으로 자동 변환(오토 언박싱)
	//	 실제로는 ... 『b = ob.intValue();』

	// 이는 JDK 1.5 이후 추가된 오토 박싱 / 오토 언박싱 이라는
	// 기능으로 인해 가능해진 것이다.

	
*/


public class Test126
{
	public static void main(String[] args)
	{
		int a = 10, b;
		Integer c;
		Object d;

		b = a;				  //-- int 형 데이터(자료) -> int 형 변수
		c = new Integer(0);   //-- c는 객체타입

		// ※ 레퍼런스 형(참조타입)과 기본 자료형(기본 타입)은 호환되지 않는다.

		b = c;				//-- Integer 형 데이터(객체) c를 int형 변수에 담겠다는것 (오토 언박싱)
		b = c.intValue();   //원래는 이렇게 담아줘야함!! (언박싱)

		d = new Object();
		System.out.println("d.toString() : " + d.toString());
		//--==>> d.toString() : java.lang.Object@15db9742

		System.out.println("d            : " + d);
		//--==>> d            : java.lang.Object@15db9742

		d = new Integer(10);    //-- Object d = new Integer(10);  (업 캐스팅)
		System.out.println("d.toString() : " + d.toString());
		//--==>> d.toString() : 10

		// 인티저라는 클래스안에서 원래 가지고 있던 투스트링을 오버라이딩해서 
		// 이미 덮어쓰기 된거니까 오브젝트타입으로 업캐스팅되더라도 보여지게 됨

		d = new Double(12.345);    //--업 캐스팅
		System.out.println("d.toString() :  "+ d.toString());
		System.out.println("d            :  "  + d);
		//--==>> d.toString() :  12.345
		//		 d            :  12.345

		d = 10;                   //--오토 박싱
		System.out.println("d.toString() : " + d.toString());
		System.out.println("d            : " + d);
		//--==>> d.toString() : 10
		//		 d            : 10


	}
}