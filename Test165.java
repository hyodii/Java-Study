/* ====================================================
  ■■■ 컬렉션 프레임워크(Collection Framework) ■■■
=======================================================*/
//트리부분 녹화함

/*
// Set -> HashSet, TreeSet
- 순서 없음.
- 중복을 허용하지 않는 구조(기본)

○ TreeSet<E>

	java.util.TreeSet<E> 클래스는
	Set 인터페이스를 상속한 SortedSet 인터페이스를 구현한 클래스로
	데이터를 추가하면 데이터들이 자동으로 오름차순 정렬이 수행된다.

	자동정렬이 포함되어있으니까 메모리소비가 심하고 좀 덜쓰게 됨.
	적은양의 데이터를 쓸대면 사용하지만 많은양의 데이터에선 안씀 성능떨어짐

*/

import java.util.TreeSet;
import java.util.Iterator;
import java.util.Comparator;


public class Test165
{
	public static void main(String[] args)
	{
		// TreeSet 자료구조 인스턴스 생성
		TreeSet<String> set = new TreeSet<String>();

		//TreeSet 자료구조 set 에 요소 추가 -> add();
		set.add("하울의움직이는성");
		set.add("이웃집토토로");
		set.add("아기공룡둘리");
		set.add("귀멸의칼날");
		set.add("겨울왕국");
		set.add("짱구는못말려");
		set.add("인사이드아웃");
		set.add("미래소년코난");
		set.add("원령공주");

		// Iterator 를 활용한 set 요소 전체 출력
		System.out.print("전체 요소 출력 : ");
		Iterator<String> it = set.iterator();
		while (it.hasNext())
		{
			System.out.print(it.next() + " ");
		}
		System.out.println();
		//--==>> 전체 요소 출력 : 겨울왕국 귀멸의칼날 미래소년코난 아기공룡둘리 원령공주 이웃집토토로 인사이드아웃 짱구는못말려 하울의움직이는성
		// 가나다라마바사... 순서(자동으로 오름차순 정렬)


		
		// TreeSet 자료구조 인스턴스 생성
		//TreeSet<String> set2 = new TreeSet<String>();
		//TreeSet<GradeVO> set2 = new TreeSet<GradeVO>();
		TreeSet<GradeVO> set2 = new TreeSet<GradeVO>(new MyComparator<GradeVO>());

		
		//GradeVO ob = new GradeVO();

		//set2.add(GradeVO);  //-- 인스턴스를 생성해줘야함!!
		//set2(ob);
		set2.add(new GradeVO("20211523","김효진",90,80,70));  // ob 대신에 new GradeVO()s넣어줄수있음
		set2.add(new GradeVO("20211524","최효진",91,81,71));
		set2.add(new GradeVO("20211525","이효진",98,78,88));
		set2.add(new GradeVO("20211526","박효진",72,49,99));
		set2.add(new GradeVO("20211527","정효진",56,31,90));
		
		// Iterator 를 활용한 set2 요소 전체 출력
		//Iterator<String> it = treeset.iterator;  이거아니다....
		/*
		Iterator<GradeVO> it2 = set2.iterator();
		while (it2.hasNext())
		{
			System.out.println(it2.next() + " ");  //넥스트로 접근하는게 전부 그래이드브이오타입이다
		}
		System.out.println();
		*/
		//--==>> 에러 발생

		//트리셋구조가 비교하려면 정렬이 되어있어야하는데 그렇지 못해서 에러 발생
		//==>class MyComparator<T> implements Comparator<T>클래서 만들어주고
		//TreeSet<GradeVO> set2 = new TreeSet<GradeVO>(new MyComparator<GradeVO>()); 추가해줌!

		// MyComparator 클래스 설계/ TreeSet 생성 구문 변경 후 다시 실행
		/*
		Iterator<GradeVO> it2 = set2.iterator();
		while (it2.hasNext())
		{
			System.out.println(it2.next() + " ");  //넥스트로 접근하는게 전부 그래이드브이오타입이다
		}
		System.out.println();
		//--==>> 해시코드로 나옴(이걸로 적재는 제대로 되었구나 확인은 가능)
		*/
		
		Iterator<GradeVO> it2 = set2.iterator();
		while (it2.hasNext())
		{
			GradeVO vo = it2.next();
			System.out.printf("%7s %7s %4d %4d %4d %6d\n"
							, vo.getHak(), vo.getName()
							, vo.getKor(), vo.getEng(), vo.getMat()
							, vo.getTot());
		}
		System.out.println();

		
	}
}

// VO   → Value Object의 줄임말
// DTO  → Data Transfer Object    VO와 DTO는 거의 같은 개념으로 씀(실무에서는)
// DAO  → Data Access Object


class GradeVO
{
	//  주요 속성 구성
	private String hak;          //-- 학번
	private String name;         //-- 이름
	private int kor, eng, mat;   //-- 국거점수, 영어점수, 수학점수

	// 생성자(사용자 정의 생성자 -> 5개의 매개변수를 가진 생성자)
	GradeVO(String hak, String name, int kor, int eng, int mat)
	{
		this.hak = hak;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

	// 생성자(사용자 정의 생성자 -> 매개변수 없는 생성자)
	//-- 매개변수가 존재하는 생성자 사용자 정의생성자로 구성하였기 때문에
	//   default 생성자가 자동으로 삽입되지 않을 것을 우려하여
	//   추가로 정의한 생성자
	GradeVO()
	{
	}

	//각 getter/ setter만들기
	// hak getter
	String getHak()   //public 생략 가
	{
		return hak;
	}
	// hak setter
	void setHak(String hak)
	{
		this.hak = hak;
	}

	// name getter
	String getName()
	{
		return name;
	}
	// name setter
	void setName(String name)
	{
		this.name = name;
	}
	//	kor getter
	int getKor()
	{
		return kor;
	}

	void setKor(int kor)
	{
		this.kor = kor;
	}

	int getEng()
	{
		return eng;
	}

	void setEng(int eng)
	{
		this.eng = eng;
	}

	int getMat()
	{
		return mat;
	}

	void setMat(int mat)
	{
		this.mat = mat;
	}

	// 추가 메소드 정의(총점 산출)
	int getTot()
	{
		return kor + eng + mat;
	}

		

	
}


class MyComparator<T> implements Comparator<T>
{
	@Override
	public int compare(T o1,T o2)  //앞뒤 비교해서 뒤가 더 큰지(-1) 작은지(1) 같은지(0) 알려주는 메소드
	{
		GradeVO s1 = (GradeVO)o1;
		GradeVO s2 = (GradeVO)o2;

		/*
		//학번 기준(오름차순)
		return Integer.parseInt(s1.getHak()) - Integer.parseInt(s2.getHak());   //String 타입이니까 Integer.parseInt
		//						 "20211523"                    "20211524"
		//return Integer.parseInt( "20211523") - Integer.parseInt("20211524");
		//return 20211523 - 20211524
		//return -1
		*/

		//학번 기준(내림차순)
		//return Integer.parseInt(s2.getHak()) - Integer.parseInt(s1.getHak());

		//총점 기준(오름차순)
		//return s1.getTot() - s2.getTot();

		//총점 기준(오름차순)
		//return s2.getTot() - s1.getTot();

		// 이름 기분 (오름차순)  // API도큐먼트 참조해서 찾아보기!   String 에 compareTo
		//return s2.getName() - s2.getName();                       //--check~!!  이름은 이렇게 비교할 수 없음!
		// return 정수형;
		//System.out.println(s1.getName().compareTo(s2.getName()));

		//return s1.getName().compareTo(s2.getName());

		// 이름 기분 (내림차순)
		return s2.getName().compareTo(s1.getName());


		// 문자열 compareTo 메소드
		// 문자열 compareTo 메소드는 int형과 다르게 리턴값이 다르다.
		//  1. 문자열이 같은 경우 0 리턴
		//  2. 비교대상이 문자열에 포함되어 있는 경우 s1.length -  s2.lenth리턴
		//  3. 다른 문자열인 경우 해당 문자의 아스키코드의 차이를 리턴한다.


   
	}
}