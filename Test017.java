/* =================================================
■■■ 자바 기본 프로그래밍 ■■■
- 자바의 기본 입출력 : java.util.Scanner
===================================================*/
// ※ java.util.Scanner
/*
단락 문자 패턴을 사용하여 입력을 토큰에 따라 분할하며
디폴트(default)로 사용되는 단락문자는 공백이다.
작성된 다음 토큰은 next() 메소드를 사용
다른 형태(자료형)의 값으로 변환할 수 있다.
*/

//정효진 90 80 70
import java.util.Scanner;

public class Test017
{
	public static void main(String[] args)
	{
		// ○ 주요 변수 선언
		Scanner sc = new Scanner(System.in);
		String name;
		int kor, eng, mat, tot;
		
		// ○ 연산 및 처리
		System.out.print("이름 국어점수 영어점수 수학점수 입력(공백 구분) ");

		// 사용자가 입력한 데이터를 각각의 변수에 담아내기
		name = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();

		// 총점 산출
		//tot = name + kor + eng + mat; 이러면 결합 문자열
		tot = kor + eng + mat; //이러면 산술연산

		// ○ 결과 출력
		System.out.println();
		System.out.println(">> 이름 : " + name);
		System.out.println(">> 총점 : " + tot);
	}
}
/* 실행 결과
이름 국어점수 영어점수 수학점수 입력(공백 구분) 정효진 90 80 70

>> 이름 : 정효진
>> 총점 : 240
계속하려면 아무 키나 누르십시오 . . .

*/