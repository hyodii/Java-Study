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
