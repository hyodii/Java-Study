/* ====================================================
  ■■■ 컬렉션 프레임워크(Collection Framework) ■■■
=======================================================*/

/*
// 순서는 Set도 그렇고 Map 도 그렇고 순서 상관 X

// Map 은 다른 자료구조보다 사용빈도가 높다!
Map  -> Hashtable, HashMap

- java.util.Map 인터페이스는
	키(key)를 값(value)에 매핑(mapping)하며,
	동일한 키를 등록할 수 없고, 유일해야 하며(고유해야 하며)
	각 키는 한 개의 값만을 매핑해야 한다.
	즉, 하나의 키 값에 대응하는 하나의 값을 갖는 자료구조이다.


○ HashMap<K, V> 클래스                                                // 두개는 기능은 비슷. 해시테이블은 동기화기능이 있고 해시맵은 동기화 기능이 없다.
	- Hashtable 클래스와 마찬가지로 Map 인터페이스에서 상속받은
	  HashMap 클래스의 기능은 Hashtable 과 동일하지만
	  Synchronozation 이 없기 때문에 동시성 문제가 없다면
	  (즉, 멀티 스레드 프로그램이 아닌 경우라면)
	  HashMap 을 사용하는 것이 성능을 향상시킬 수 있다.
	  (Hashtable보다 성능이 좋다!)

	- 또한, HashMap 은 Hashtable 클래스와 달리 null을 허용한다. ★★★

	비어있는 값도 별도로 체크해서 처리하려면 HashMap을 써야함!
*/

import java.util.HashMap;
import java.util.Map;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test167
{
	public static void main(String[] args) throws IOException
	{
		// HashMap 자료구조 인스턴스 생성
		//HashMap<String, String> map = new HashMap<String, String>();    //리스트 이외에는 인터페이스 자료구조로 생성해주는거 없읍!(비교)
		Map<String,String> map = new HashMap<String,String>();


		// map 이라는 해시맵 자료구조에 요소 추가
		// -> put()
		map.put("드라마","빈센조");
		map.put("영화","그래비티");
		map.put("만화","도라에몽");

		// 더미 확인
		System.out.println(map);
		//--==>> {드라마=빈센조, 영화=그래비티, 만화=도라에몽}

		// null 입력 시도
		map.put(null, null); 
		map.put("소설", null);
		map.put(null,"생각하는사람");
		//--==>> 에러 안남!
		//-- 위의 데이터 입력 유형에 따라 모든 종류의 데이터 입력이 가능하지만
		//   최초 null 을 key로 매핑하는 null 을 덮어쓰는 상황이 발생하게 된다.
		//   즉, HashMap 은 null을 하나의 고유한 key 값으로 간주한다.(인식한다.)

		// 더미 확인
		//System.out.println(map);
		//--==>> {null=생각하는사람, 소설=null, 드라마=빈센조, 영화=그래비티, 만화=도라에몽}  // nulln, null 덮어쓰기 발생
		//map.put(null,"생각하는사람"); 이거 주석처리하면!
		//--==>> {null=null, 소설=null, 드라마=빈센조, 영화=그래비티, 만화=도라에몽}

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("카테고리, 타이틀 입력(컴마 구분) : ");   //"그림,모나리자"
		String[] temp;

		for (String str; ((str=br.readLine()) != null); )
		{
			temp = str.split(",");  // {"그림", "모나리자""}
			if(temp.length<2)
			{
				System.out.print("카테고리, 타이틀 입력(컴마 구분) : ");
				continue;
			}
			map.put(temp[0].trim(), temp[1].trim());
			System.out.println(map);
		}

	}
}

// 일괄 작업을 끝내시겠습니까 (Y/N)?    -> ctrl + c
// 다집지 못하고 넘어온 컬렉션에 주요 클래스 주요 메소크가 많음!! 따로 공부하자!