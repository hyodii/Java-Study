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

버퍼드리더보다 나중에 나왔고, 더 개선해서 나와서 편함

컴퓨터는 기능이 많으면 성능이 더 떨어짐
*/

//입력 : "사과 딸기 바나나" -> 버퍼드리더는 하나하나 입력받음 스캐너는 단락별로 잘라서
//스캐너는 자료형변환해서 가져와

import java.util.Scanner; //이걸 써워야함!!

public class Test016
{
	public static void main(String[] args) //throws IOException 안해도 됨
	{
		// ○ Scanner 인스턴스 생성
		Scanner sc = new Scanner(System.in); //InputStreamReader 쓸 필요없음
		
		
		String name; //이름
		int kor, eng, mat; //국어, 영어, 수학 점수

		// ○ 연산 및 처리
		System.out.print("이름을 입력하세요 : ");
		//br.readLine();
		name = sc.next();

		System.out.print("국어 점수를 입력하세요 : ");
		//kor = Integer.parseInt(br.readLine());
		//kor = Integer.parseInt(sc.next());
		kor = sc.nextInt();

		System.out.print("수학 점수를 입력하세요 : ");
		eng = sc.nextInt();

		System.out.print("수학 점수를 입력하세요 : ");
		mat = sc.nextInt();



		// ○ 결과 출력
		System.out.println();
		System.out.println(">> 이름 : " + name);
		System.out.println(">> 총점 : " + (kor + eng + mat)); //(괄호)안하면 908070이런식으로 나옴



	}
}
/* 실행 결과
이름을 입력하세요 : 정효진
국어 점수를 입력하세요 : 90
수학 점수를 입력하세요 : 80
수학 점수를 입력하세요 : 70

>> 이름 : 정효진
>> 총점 : 240
계속하려면 아무 키나 누르십시오 . . .

*/