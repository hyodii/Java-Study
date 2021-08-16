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
