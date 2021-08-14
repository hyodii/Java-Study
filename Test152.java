/* ====================================================
  ■■■ 컬렉션 프레임워크(Collection Framework) ■■■
=======================================================*/

/*
○ 큐(Queue)

	큐(Queue)는 FIFO(First Input First Output, 선입선출) 구조로
	먼저 입력된 자료를 먼저 출력하며,
	Queue 인터페이스를 구현한 클래스는 큐와 관련된 다양한 기능을 제공한다.

※ Queue 인터페이스 인스턴스를 생성하기 위해서는
   new 연산자를 이용하여 Queue 인터페이스를 구현한(implements)
   클래스의 생성자를 호출한다.

   ex) Queue ob = new LinkedList();

Queue는 인터페이스 Stack은 클래스!

○ 주요 메소드
	- E element()
	  큐의 head 요소를 반환하며 삭제하지 않는다.

	- boolean offer(E o)
	  지정된 요소를 큐에 삽입한다.

	- E peek()
	  큐의 head 요소를 반환하고 삭제하지 않으며
	  큐 자료구조가 empty 인 경우 null 을 반환한다.

	- E poll()
	  큐의 head 요소를 반환하고 삭제하며 큐 자료구조가 empty 인 경우 null 을 반환한다.

	- E remove()
	  큐의 head 요소를 반환하고 삭제한다.
*/

import java.util.Queue;
import java.util.LinkedList;

public class Test152
{
	public static void main(String[] args)
	{
		// Queue 자료 구조 생성
		//Queue myQue = new Queue();  //-- (X)큐는 인터페이스라서 이렇게 생성할 수 없다!
		Queue<Object> myQue = new LinkedList<Object>();   //제네릭 표현

		// 데이터 준비
		String str1 = "선풍기";
		String str2 = "에어컨";
		String str3 = "부채";
		String str4 = "그늘";

		//myQue 라는 Queue 자료구조에 데이터 추가
		myQue.offer(str1);
		myQue.offer(str2);
		myQue.offer(str3);
		boolean test = myQue.offer(str4);

		System.out.println(myQue);
		//--==>> [선풍기, 에어컨, 부채, 그늘] 
		//데이터의 컨트롤은 이런 더미로 하면 안된다!
		//더미는 딸기 바나나 포도라고 적혀있는 쪽지 이걸로 직접적인 데이터 컨트롤 할 수 없다.

		System.out.println(test);
		//--==>> true

		// Queue 자료구조에서 요소를 제거하지 않고 head 요소 반환
		System.out.println("값1 : " +(String) myQue.element());
		//							          -----
									         //	큐(데이터타입)
									        //--------------- 
									        //    오브젝트(데이터타입)
		System.out.println("값2 : " +(String) myQue.element());
		//--==>>값1 : 선풍기
		//		값2 : 선풍기

		System.out.println();

		String val;

		// 방법 ①
		// peek()
		//-- 큐의 head 요소 반환. 제거 안함.
		//   큐가 empty 일 경우 null 반환.
		/*
		while (myQue.peek() != null)           //-- 지영을 확인하고 제거하지 않음.
		{
			//poll()
			//-- 큐의 head 요소 반환. 제거함.
			// 큐가  empty 일 경우 null 반환
			val = (String)myQue.poll();        //-- 지영을 확인하고 출력하면서 제거함.
			System.out.println("요소 : " + val);     
		}
		System.out.println();

		//--==>> 요소 : 선풍기
		//		 요소 : 에어컨
		//		 요소 : 부채
		//		 요소 : 그늘
		// 픽폴하는건데 지금은 폴폴하면 두개당 하나씩나와서 에어컨나오고 그늘 나옴


		//String[] arr = {"홍길동", "이순신", "강감찬"};
		//				----------------------------
		//						문자열(데이터타입)
		*/


		//테스트
		/*
		while (myQue.poll() != null)
		{
			val = (String)myQue.poll();
			System.out.println("요소 : " + val);  
		}
		System.out.println();
		*/
		//--==>> 요소 : 에어컨
		//		 요소 : 그늘

		// 방법 ②
		/*
		while (true)  //무한루프
		{
			val = (String)myQue.poll();
			if (val==null)
				break;
			else
			 System.out.println("요소 : " + val);
		}
		System.out.println();
		*/
		//--==>>요소 : 선풍기
		//		요소 : 에어컨
		//		요소 : 부채
		//		요소 : 그늘

		// 방법 ③
		while (!myQue.isEmpty())
		{
			val = (String)myQue.poll();
			System.out.println("요소 : " +val);
		}
		System.out.println();
		//--==>>요소 : 선풍기
		//		요소 : 에어컨
		//		요소 : 부채
		//		요소 : 그늘

	}
}