/* ==============================
■■■자바 개요 및 특징 ■■■
- 변수와 자료형
- 키워드 및 식별자
=================================*/


public class Test004
{
	public static void main(String[] args)
	{
		double heihgt = 172.8;
		int age = 25;
		//이거는 한 문자만 담을 수 있음
		char degree = 'A';

		//다른데이터 타입처럼 String을 쓰겠다
		String name = "정효진";
		//String name = "서강준";
		//※ 스코프 영역{} 안에서 변수명은 식별자~!!!
		//degree = 'B'; 위에 선언하고 이렇게 넣는거는 가능
		
		//String #name = "공명";
		/*$ 와 _ 를 제외한 다른 특수문자는 변수의 이름으로 활용할 수 없다.
		하지만, 그나마 사용 가능한 이들 특수문자도 함부로 사용하는 것은 고려해야 한다.
		*/

		//전화번호나 학번이나 이런것은 정수형태로 저장하면 안되고 문자열의 형태로 저장해야함
		//int tel = 01012342345;
		String tel = "01012342345";
		String _tel = "010-1111-2222";
		
		//실무에서는 절대 한글 단어를 변수명으로 쓰면 안됨!! 변수명 한글 문법적으로는 사용할 수 있지만
		String 주소 = "경기도 고양시";

		System.out.println("name : " + name);
		System.out.println("tel : " + tel);
		System.out.println("_tel : " + _tel);
		System.out.println("주소 : " + 주소);
	}

}
/* 실행결과
name : 정효진
tel : 01012342345
_tel : 010-1111-2222
주소 : 경기도 고양시
계속하려면 아무 키나 누르십시오 . . .
*/