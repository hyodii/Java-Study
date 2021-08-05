// super class, 부모 클래스, 상위 클래스
class SuperTest112
{
	public int a=10, b=20;

	public void write()
	{
		System.out.println("슈퍼 클래스... write() 메소드...");
	}

	public int hap()
	{
		return a + b;
	}
}

//sub class, 자식 클래스, 하위 클래스
class SubTest112 extends SuperTest112
{
	public int b=100, c=200;

	@Override
	public int hap()
	{
		return a + b + c;
	}

	public void print()
	{
		System.out.println("서브 클래스... print() 메소드...");
	}


}

// main() 메소드를 포함하는 외부의 다른 클래스
public class Test112
{
	public static void main(String[] args)
	{
		//sub class 기반 인스턴스 생성
		SubTest112 ob1 = new SubTest112();
		System.out.println("ob1.b : " + ob1.b);
		//--==>> ob1.b : 100

		// ○ 업 캐스팅
		//superTest112 ob2;
		SuperTest112 ob2 = ob1; 	//『SuperTest112 ob2 = (SuperTest112)ob1;』
		
		/*
		학생 중호 = new 학생();     ->  이러면 학생인 중호가 만들어짐		
		인간 사람 = 중호;        // 『인간 사람 = (인간)중호;』 과 동일한 코드

		byte a = 10;
		short b = a;            // 『short b = (short)a;』과 동일한 코드 

		*/

		System.out.println("ob2.b : " + ob2.b);
		//--==>> ob2.b : 20
		//-- 변수는 객체별로 따로 할당되므로
		//   변수 b는 ob2의 변수이다.

		System.out.println("합 : " + ob2.hap());
		//--==>>  합 : 310       100 + 200 + 10
		//-- hap() 메소드는 오버라이딩(Overriding) 되어 있고
		//	ob2 는 ob1 을 업캐스팅한 상태의 객체이므로
		//  『SuperTest112』의 hap() 메소드를 호출하는 것이 아니라
		// 즉, 메소드는 업캐스팅 되더라도
		// 재정의(덮어쓰기)한 이상....원래의 기능으로 되돌릴 수 없다.

		ob2.write();
		//--==>> 슈퍼 클래스... write() 메소드...

		//ob2.print(); //업캐스팅 되었으니까 슈퍼테스트 입장에서는 print메소드가 없음! 그리고 자식이 print가지고 있는지도 모름! 자식은 다 알고있지만 부모는 모름
		// 에러남 (cannot find symbol)				

		// ○ 다운 캐스팅
		((SubTest112)ob2).print();
		//--==>>서브 클래스... print() 메소드...
		
		/*
		byte a = 10;

		short b = a;

		byte c = b;
		//byte c = (byte)b; 강제형변환됨
		// 이거랑 같은 개념임 위에 ((SubTest112)ob2).print(); 가
		//byte(1바이트) > short(2바이트) > int(4바이트) > long(8바이트)
		*/

		
		// ※ 추가 관찰 --------------------------------------------------
		//    다운 캐스팅 가능 여부

		SuperTest112 ob3 = new SuperTest112();  //부모를 생성
		SubTest112 ob4;

		//System.out.println(ob3.c);   //부모를 생성하고 c에 접근하겠다고 하는격 (부모는 어떤자식이 있는지도 모름!!!!)
		//--==>> 에러(cannot find symbol)
		//-- 상위 객체는 하위 객체의 멤버에 접근하는 것이 불가능하다.
		
		//ob4 = ob3; // ob4를 선언만 하고 할당안해서 에러발생

		/*  ↓↓↓ 위에 업캐스팅이랑 비교하면 이상황인것 

		SubTest112 ob1 = new SubTest112();  
		SuperTest112 ob2 = ob1;

		SuperTest112 ob3 = new SuperTest112();
		SubTest112 ob4 = ob3;

		자식 ob1 = new 자식();    //자식 인스턴스 생성할때 부모도 올라감!!!
		부모 ob2 = ob2;

		부모 ob3 = new 부모();    //부모 인스턴스 생성할때는 자식 안올라감!!!
		자식 ob4 = ob3;

		*/
		
		//ob4 = (SubTest112)ob3;
		//--==>> 에러 발생(컴파일 에러)

		// ※ 작성된 구문의 문법적인 구조만 봤을 때
		//    다운 캐스팅이 이루어지는 상황이다.
		//    하지만, 정상적인 캐스팅이 이루어지지 않는다
		///   현재 subTest112객체에 대해 메모리 할당이 이루어지지 않은 상태이기 때문에
		//    다운 캐스팅은 불가능한 것이다..



	}
}



/*
○ 업 캐스팅, 다운 캐스팅이 정상적으로 이루어지는 경우 --------------------------------------
	
	1. 하위 객체 생성;     //-- check~!!!
	2. 상위 = 하위;        // 업 캐스팅.  정상.
	3. 하위 = 상위;		   // 에러 발생.
	4. 하위 = (하위)상위;  // 다운 캐스팅. 정상.


○ 다운 캐스팅이 정상적으로 이루어지지 않는 경우       --------------------------------------
	
	1. 상위 객체 생성;      //-- check~!!!
	2. 하위 = 상위;         // 에러 발생.
	3. 하위 = (하위)상위;   // 다운 캐스팅. 런타임 에러 발생


※ 업캐스팅은 항상 가능. 다운 캐스팅은 경우에 따라 가능.
*/
