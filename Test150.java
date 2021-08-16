// 제네릭, 제네릭표현식

// <E> (->엘리먼트) <K, V> (->웹자료형) 


import java.util.Stack;

public class Test150
{
	public static void main(String[] args)
	{
		//Stack 자료구조 생성
		//Stack<String> myStack = new Stack<String>();   //String이면 132번에 형변환 안해줘도댐
		Stack<Object> myStack = new Stack<Object>();

		String str1 = "바나나";
		String str2 = "딸기";
		String str3 = "복숭아";
		String str4 = "수박";

		// myStack 이라는 Stack 자료구조 안에 str1 ~ str4 까지 담아내기
		// add(), push()
		//myStack.add(str1);
		//myStack.add(str2);
		//myStack.add(str3);
		//myStack.add(str4);
		myStack.push(str1);
		myStack.push(str2);
		myStack.push(str3);
		myStack.push(str4);

		// peek() : 스택 맨 위의 객체 반환.(뭐 다 라고 알려주고) 제거하지 ㅇ낳는다.
		String val1 = (String)myStack.peek();      //-- 형 변환 check~!!!     
												   //myStack은 Object형식인데 String 에 담겠다 -> 업캐스팅이 일어남!
		System.out.println("val1 : " + val1);
		//--==>> val1 : 수박

		String val2 = (String)myStack.peek();
		System.out.println("val2 : " + val2);
		//--==>> val2 : 수박

		String val3 = (String)myStack.peek();
		System.out.println("val3 : " + val3);
		//--==>> val2 : 수박

		// peek() 는 제거하지 않으니까 계속 같은값만 반환!

		
		String value = "";
		// myStack 이라는 이름을 가진 Stack 자료구조에
		// 데이터가 비어있는 상황이 아니라면...(즉, 값이 들어있는 상태라면...)
		//  is Empty()
		// Stack 안에 있는 값 모두 반환!

		// 바나나
		// 딸기
		// 복숭아
		// 수박
		while (!myStack.isEmpty())     // !false → true
		{
			// pop() : 스택 맨 위의 객체 반환. 제거한다.
			value = (String)myStack.pop();      // 바나나(데려오고 제거) 딸기 복숭아 수박(여기까지오면 다 제거됨) ->isEmpty
			System.out.println("value: " + value);
		}
		//--==>> value: 수박
		//		 value: 복숭아
		//		 value: 딸기
		//		 value: 바나나

	}
}
