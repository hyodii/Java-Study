/* ====================================================
  ■■■ 컬렉션 프레임워크(Collection Framework) ■■■
=======================================================*/
//중간부터 녹화

// Vector v = new Vector();
//-- 비어있는 Vector 자료구조 생성

// Vector v = new Vector(8);
//-- 8개의 초기 element 를 가진 Vector 자료구조 생성
//   8개가 모두 채워지게 되면(모자라게 되면) 자동으로 확장된다.

// Vector v = new Vector(3, 5);
//-- 3개의 초기 element 를 가진 Vector 자료구조 생성
//   3개가 모두 채워지게 되면(모자라게 되면) 자동으로 5개 증가(확장) 된다.

//  ※ 벡터는 데이터 요소로서 정수형, 실수형, 문자열... 등을
//     담아내는 것이 가능하다.  (이것 때문에 안쓰게 됨)
//     → 데이터 안정성 확보하는 것이 중요하다. check~!!!

import java.util.Vector;
import java.util.Iterator;

class MyVector extends Vector<Object>	// <Object>형태로 상속받을때 <Object>를 붙인다.

{
	// 생성자
	MyVector()
	{
		//--Vector(1,1) : 부모 생성자에 두 개의 매개변수를 넣음 (슈퍼 클래스)
		super(1,1);
		//-- 첫 번째 인자 : 주어진 용량
		//   두 번째 인자 : 증가량
	}

	void addInt(int i)
	{
		addElement(new Integer(i));
	}

	void addFloat(float f)
	{
		addElement(new Float(f));
	}

	void addString(String s)
	{
		addElement(s);
	}

	void addCharArray(char[] a)
	{
		addElement(a);
	}


	void write()
	{

		Object o;
		int length = size();
		System.out.println("벡터의 요소 갯수 : " + length);



		for (int i=0; i<length; i++)
		{

			o = elementAt(i);   //elementAt(0) : 0번째꺼 가지고 오겠다!

			// 『instanceof』 연산자    check~!!!
			//-- 처리해야 하는 대상의 객체 타입 확인  // 오브젝트는 오브젝트인데 무슨 타입이니?


			if (o instanceof String)	//-- o가 String타입인지 확인하는 연산자
			{
				System.out.println("문자열 : " + o.toString());
			}

			else if (o instanceof Integer)
				  // ------------ o 가 인티저타입으로 만들어진 객체(오브젝트)   백터는 기본자료형은 취할 수 없음!
			{

			System.out.println("정수형 : " + o);
										  //--- 객체를 출력하면 클래스명@해시코드가 나옴 근데 왜 잘나와? (오토박싱)
										  //  모르겠으면 래퍼클래스 가서 다시 복습하자!
			}

			else if (o instanceof Float)
			{
				System.out.println("실수형 : " + o);
			}
			else if (o instanceof char[])     //캐릭터타입은 래퍼클래스가아니기때문에 오토박싱 안댄다.
			{
				/* 이러면 너무너무 복잡 그래서 밑에처럼
				for (int i; i<(char[])o.length; i++)
				{
					System.out.println(((char[])o)[i]);
				}
				*/
				
				// System.out.println("문자배열 : " + o);
				// System.out.println("문자배열 : " + o.toString());
				//System.out.println("문자배열 : " + String.copyValueOf(문자배열);
				//System.out.println("문자배열 : " + String.copyValueOf({'s','t','u','d','y'});
				System.out.println("문자배열 : " + String.copyValueOf((char[])o));	//check~!!!
												//       ------------ char 배열값을 연결해 문자열로 반환

												//객체를 출력하면 클래스명@해시코드가 나옴
			}
			else
			{
				System.out.println("타입 확인 불가~!!!");
			}

		}
		//--==>> 벡터의 크기 : 4
		//       정수형 : 5
		//       실수형 : 3.14
		//       문자배열 : 안녕하세요
		//       문자배열 : study



		//-------------------------------------------------------------------------

		System.out.println();

		Iterator<Object> it = this.iterator();	//<Object> 확인
		while (it.hasNext())
		{
			System.out.println(it.next());
		}

		//--==>> 5
		//       3.14
		//       안녕하세요
		//       [C@6d06d69c           //--> 이게 문제 그래서 위에 만듬

	}

}



public class Test155
{
	public static void main(String[] args)
	{
		//Myvector 클래스 기반 인스턴스 생성
		MyVector v = new MyVector();

		// 주요 변수 선언 및 초기화
		int digit = 5;
		float real = 3.14f;
		String s = new String("안녕하세요");
		char[] letters = {'s','t','u','d','y'};

		v.addInt(digit);             //-- 벡터 자료구조에 정수 저장
		v.addFloat(real);            //-- 벡터 자료구조에 실수 저장
		v.addString(s);				 //-- 벡터 자료구조에 문자열 저장
		v.addCharArray(letters);     //-- 벡터 자료구조에 문자 배열 저장
		
		v.write();
		//--==>> 벡터 요소 개수 : 0
	}

	
}