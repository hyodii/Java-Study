/* =================================================
■■■ 자바 기본 프로그래밍 ■■■
- 변수와 자료형
- 자바의 기본 입출력 : BufferedReader 클래스
===================================================*/
// 사용자로부터 이름, 국어점수, 영어점수, 수학점수 를 입력받아
// 이름과 총점을 출력하는 프로그램을 구현한다.

// 실행 예)
// 이름을 입력하세요 : 정효진
// 국어 점수 입력 : 90
// 영어 점수 입력 : 80
// 수학 점수 입력 : 70

// ====[결과]====
// 이름 : 정효진
// 총점 : 240
// 계속하려면 아무 키나 누르세요...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test013
{
	public static void main(String[] args) throws IOException
	{
		//[내가 풀이한 내용]
		/*-----------------------------------------------------------------------------------------------
		// ○ 주요 변수 선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int kor, eng, math, sum;
		String name;




		// ○ 연산 및 처리
		// 1. 사용자에게 안내 메세지 출력
		System.out.print("이름을 입력하세요 : ");
		// 2. 사용자가 입력한 데이터를 정수 형태로 변환한 후 담아내기
		name = br.readLine();  //String 일때는 이렇게!
		
		//3. 안내 메세지 출력
		System.out.print("국어 점수 입력 : ");
		//4. 사용자가 입력한 데이터를 정수 형태로 변환한 후 담아내기
		kor = Integer.parseInt(br.readLine());
		
		//5. 안내 메세지 출력
		System.out.print("영어 점수 입력 : ");
		eng = Integer.parseInt(br.readLine());
		
		//6. 사용자가 입력한 데이터를 정수 형태로 변환한 후 담아내기
		System.out.print("수학 점수 입력 : ");
		math = Integer.parseInt(br.readLine());
		
		//7.총점 공식
		sum = kor + eng + math;

		// ○ 결과 출력
		System.out.println();  //개행
		System.out.println("====[결과]====");
		System.out.printf("이름 : %s\n", name);
		System.out.printf("총점 : %d\n", sum);
		
		--------------------------------------------------------------------------------------------------*/

		//[함께 풀이한 내용] -> BufferedReader 인스턴스 나눠쓰기 & strTemp 쓰기
		// ○ 주요 변수 선언
		//BufferedReader 인스턴스 생성
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //아래처럼 표현할 수 있음 /둘다 생성할 수 있어야함!!
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		//int kor, eng, math, sum;
		//헝가리언 표기법 변수의 이름만 봐도 형을 알수있게!
		String strName; // 이름 변수
		int nKor, nEng, nMat; //국어, 영어, 수학 점수 변수
		int nTot; // 총점변수

		String strTemp; // 문자열 데이터 임시 저장 변수



		// ○ 연산 및 처리
		// - 사용자에게 안내 메세지 출력(이름 입력 안내)
		System.out.print("이름을 입력하세요 : ");
		// - 사용자가 입력한 데이터를 정수 형태로 변환한 후 담아내기
		strName = br.readLine(); //String 일때는 이렇게!
		
		//- 안내 메세지 출력(국어 점수 입력 안내)
		System.out.print("국어 점수 입력 : ");
		
		//- 사용자가 입력한 값(외부 데이터)을 변수에 담아내기
		strTemp = br.readLine();
		//- 임지 저장 변수 strTemp 에 담겨있는 값을 형 변환 후 국어 점수 변수에 담아내기
		nKor = Integer.parseInt(strTemp);

		//- 사용자가 입력한 데이터를 정수 형태로 변환한 후 담아내기
		nKor = Integer.parseInt(strTemp);
		
		//- 안내 메세지 출력
		System.out.print("영어 점수 입력 : ");
		strTemp = br.readLine();
		nEng = Integer.parseInt(strTemp);
		
		//- 사용자가 입력한 데이터를 정수 형태로 변환한 후 담아내기
		System.out.print("수학 점수 입력 : ");
		strTemp = br.readLine();
		nMat = Integer.parseInt(strTemp);
		
		//- 총점 공식
		nTot = nKor + nEng + nMat;

		// ○ 결과 출력
		System.out.println();  //개행
		System.out.println("====[결과]====");
		System.out.printf("이름 : %s\n", strName);
		System.out.printf("총점 : %d\n", nTot);
		//System.out.println("이름 : " + strName);
		//System.out.println("총점 : " + nTot);


	
	}
}

/* 
이름을 입력하세요 : 정효진
국어 점수 입력 : 90
영어 점수 입력 : 80
수학 점수 입력 : 70

====[결과]====
이름 : 정효진
총점 : 240
계속하려면 아무 키나 누르십시오 . . .

*/