/* ====================================================
  ■■■ 컬렉션 프레임워크(Collection Framework) ■■■
=======================================================*/
import java.util.Vector;
import java.util.Collections;

public class Test156
{

	// 정적 문자열 배열 선언 및 초기화
	private static final String[] colors = {"검정", "노랑", "초록", "파랑", "빨강", "연두"};


	public static void main(String[] args)
	{
		// 벡터 자료구조 생성
		Vector<String> v = new Vector<String>();

		// 벡터 자료구조 v 에 colors 데이터를 요소로 추가
		for (String color : colors)
		{
			v.add(color);
		}

		System.out.println("첫 번째 요소 : " + v.firstElement());
		System.out.println("두 번째 요소 : " + v.get(1));
		System.out.println("마지막 요소  : " + v.lastElement());
		System.out.println("요소의 갯수  : " + v.size());
		//첫 번째 요소 : 검정
		//두 번째 요소 : 노랑
		//마지막 요소  : 연두
		//요소의 갯수  : 6

		// ○ 첫 번째 요소를 "하양"으로 변.경. -> set()
		v.set(0, "하양");
		System.out.println("첫 번째 요소 : " + v.firstElement());
		System.out.println("두 번째 요소 : " + v.get(1));
		System.out.println("요소의 갯수  : " + v.size());
		//첫 번째 요소 : 하양
		//두 번째 요소 : 노랑
		//요소의 갯수  : 6
		//--==>> 이걸 통해서 한 칸씩 밀린 것이 아니라 검정에 하양이 덮어쓴 것

		
		// ○ 첫 번째 요소를 "주황"으로 추.가. -> insertElementAt()   // 매개변수 순서가 다르니까 기억!!  // 위에꺼랑 차이 확인!!
		v.insertElementAt("주황",0);

		System.out.println("첫 번째 요소 : " + v.firstElement());
		System.out.println("두 번째 요소 : " + v.get(1));
		System.out.println("요소의 갯수  : " + v.size());
		//첫 번째 요소 : 주황
		//두 번째 요소 : 하양
		//요소의 갯수  : 7

		// ○ 전체 출력
		System.out.print("전체 출력 : ");
		for (String str : v)
			System.out.print(str + " ");
		System.out.println();

		
		/* 나의 시도
		Iterator<Object> it = v.iterator();

		while (it.hasNext())
		{
			str = (String)it.next();
			System.out.print("전체 출력 : " + 

		}

		Iterator<Object> it = v.iterator();

		while (it.hasNext())
		{
			str = (String)it.next();
			System.out.print(str +  " ");
		}
		System.out.println();
		*/




		// ○ 오름차순 정렬
		Collections.sort(v);

		// ○ 오름차순 정렬 후 전체 출력
		System.out.print("오름차순 정렬 후 전체 출력 : ");
		for (String str : v)
		{
			System.out.print(str + " ");
		}
		System.out.println();
		//--==>> 오름차순 정렬 후 전체 출력 : 노랑 빨강 연두 주황 초록 파랑 하양


		//○ 검색
		// 『Collections.binarySearch()』  -> 검색 기능 수행
		//  단, 오름 차순 정렬이 수행되어 있는 자료에 대해서만 사용이 가능하다. check~!!
		// 검색 결과가 존재하지 않을 경우 『음수』를 반환한다.

		int idxBlue = Collections.binarySearch(v, "파랑");  //인덱스 값을 반환하여 정수 형태
		System.out.printf("파랑 : %d 번째 인덱스에 위치하고 있다.", idxBlue);
		System.out.println();
		//--==>> 파랑 : 5 번째 인덱스에 위치하고 있다.

		int idxNavi = Collections.binarySearch(v,"남색");
		System.out.printf("남색 : %d 번째 인덱스에 위치하고 있다.", idxNavi);
		System.out.println();
		//--==>> 남색 : -1 번째 인덱스에 위치하고 있다.   //--음수 나오면 남색은 없는거다!  → 검색 결과 없음


		// ○ 내림차순 정렬 → 별도의 메소드가 존재하지 않는다! 매개변수를 하나더 추가
		Collections.sort(v,Collections.reverseOrder());
		

		// ○ 내림차순 정렬 후 전체 출력
		System.out.print("내림차순 정렬 후 전체 출력 : ");
		for (String str :v)
			System.out.print(str + " ");
		System.out.println();
		//--==>> 내림차순 정렬 후 전체 출력 : 하양 파랑 초록 주황 연두 빨강 노랑

		// ○ 내림차순 정렬 후 검색 테스트
		idxBlue = Collections.binarySearch(v, "파랑");
		System.out.printf("파랑 : %d 번째 인덱스에 위치하고 있다.", idxBlue);
		System.out.println();
		//--==>> 파랑 : -8 번째 인덱스에 위치하고 있다.  → 못찾았음... 
		
		
		idxBlue = Collections.binarySearch(v,"파랑", Collections.reverseOrder());
		System.out.printf("파랑 : %d 번째 인덱스에 위치하고 있다.", idxBlue);
		System.out.println();
		//--==>> 파랑 : 1 번째 인덱스에 위치하고 있다.


	}
}