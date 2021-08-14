/* ===============================
■■■ 클래스와 인스턴스 ■■■
- 클래스와 인스턴스 활용
==================================*/

/*
2. Sungjuk 클래스
	- 인원 수를 입력받아, 입력받은 인원 수 만큼
	  이름, 국어점수, 영어점수, 수학점수를 입력받고
	  총점과 평균을 산출하는 클래스로 설계할 것~!!!
		* 속성 : 인원수, record 형태의 배열
		* 기능 : 인원 수 입력, 상세 데이터 입력, 총점 및 평균 연산, 결과 출력

*/

import java.util.Scanner;

public class Sungjuk
{
	// 주요 속성 구성(주요 변수 선언)
	int inwon;                     //-- 인원 수
	Record[] rec;                  //-- Record 배열(학생 한 명 당 Record 배열 방 한 개 활용)
		                           //   Record 를 기반으로 생성된 객체만 담아낼 수 있는 배열

	// 이건 여기에 선언한 적이 없음... ㅠㅠ
	//String[] title = {"국어 점수 : ", "영어 점수 : ", "수학 점수 : "};
	
	
	// 주요 메소드 정의(기능 구성)
	// 1. 인원 수 입력
	public void set()
	{
		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.print("인원 수 입력(1~100) : ");
			inwon = sc.nextInt();
		}
		while (inwon<1 || inwon>100);

		// check~!!!
		// Record 클래스를 기반으로 생성된 객체(인스턴스)를 담을 수 있는
		// 배열방을 inwon 만큼 생성
		//record [] rec = new record[inwon];
		//이건 위에서 선언한걸 이용하는 구문이기 때문에
		//이렇게 작성하면 안되는 상황 ㅠㅠ
		rec = new Record[inwon];

		//-- Record 배열방을 inwon 만큼 생성한 것이지
		//   Record 클래스의 인스턴스를 생성한 것은 아니다. (학생이 앉을수있는 좌석(틀)을 만든것이고 학생을 만든건 아님)


		// 효진아~~ ㅠㅠ
		// set() 메소드가 아직 안끝났는데...
		// 메소드 안에다 다시 input() 메소드를 정의하고 있다 ㅠㅠ
	}


	// 주요 메소드 정의(기능 구성)
	// 2. 상세 데이터 입력(총점 및 평균 산출 기능 포함)
	public void input()     //입력받은 값을 rec 배열방에 넣을 것
	{
		Scanner sc = new Scanner(System.in);

		String[] title = {"국어 점수 : ", "영어 점수 : ", "수학 점수 : "};
			
		// 인원 수 만큼 반복 -> 인원 수에 기반하여 만들어진 배열의 길이만큼 반복
		for (int i=0; i<inwon; i++)  // for(int i=0; i<rec.length; i++) 같은의미		// 웅~~!!!!
		{
			//check~!!!
			// Record 클래스 기반의 인스턴스 생성
			/* 한번 씩 돌때마다 Record의 인스턴스를 생성해야함
			Record ob = new Record();	//-- ⓐ
			ob.name
			ob.tot

			rec[i] = ob;
			rec[i].name
			rec[i].tot
			*/
			//rec[i] = new record();	// 인스턴스 생성구문... 위의 ⓐ 처럼... 클래스 이름 대문자
			rec[i] = new Record();

			System.out.printf("%d번째 학생의 이름 입력 : ", (i+1));
			rec[i].name = sc.next();

				
			/*
			System.out.printf("%d번째 학생의 이름 입력 : ",(i+1));
			//rec배열의i번째방의 이름 = sc.next();
			rec[i].name = sc.next();

			System.out.print("국어 점수 : ");
			//rec배열의i번째방의 국어 = sc.nextInt();
			rec[i].kor = sc.nextInt();

			System.out.print("영어 점수 : ");
			//rec배열의i번째방의 영어 = sc.nextInt();
			rec[i].eng = sc.nextInt();

			System.out.print("수학 점수 : ");
			//rec배열의i번째방의 수학 = sc.nextInt();
			rec[i].mat = sc.nextInt();
			*/

			for (int j=0; j<title.length; j++)   //숑숑숑 0 1 2			// 쑝~~!!!
			{
				// 안내 메세지 출력
				System.out.print(title[j]);

				// 배열 이름 스코어(score)
				//사용자가 입력한 데이터를 스코어(score) 배열에 담아내기
				//rec[i].sore[j] = sc.nextInt();         // i번째 학생의 score[0] -> 국어점수
				rec[i].score[j] = sc.nextInt();			 // i번째 학생의 score[1] -> 영어점수
												         // i번째 학생의 score[2] -> 수학점수
				
				// 국어, 영어, 수학 점수 데이터를 반복적으로 입력받는 동안
				//총점 누적하기
				rec[i].tot += rec[i].score[j];

			}

			// 평균 산출하기
			 rec[i].avg = rec[i].tot / 3.0;
		}

	}//end input()


	// 이 print() 메소드도
	// input() 메소드 안에 작성된 상황... ㅠㅠ


	// 주요 메소드 정의(기능 구성)
	// 3. 결과 출력
	//정효진 90 80 70 240 xx.xx   2
	//가나다 82 72 62 xxx xx.xx   3
	//라마바 98 88 78 xxx xx.xx   1
	public void print()
	{
		System.out.println(); //개행

		// 학생 한 명 당 반복 출력구문 구성
		for (int i=0; i<inwon; i++)							// 웅~!!!
		{
			//check~!!!!
			// 석차 산출 메소드 호출~!!!(구문 추가)
			ranking();
			
			
			//이름 출력
			System.out.printf("%5s", rec[i].name);
		


			// 성적(국어, 영어, 수학) 반복 출력
			for (int j=0; j<3; j++)							// 쑝~0!!!
				System.out.printf("%4d", rec[i].score[j]);

			// 총점, 평균 출력
			System.out.printf("%5d", rec[i].tot);
			System.out.printf("%8.2f", rec[i].avg);

			//check~!!!!
			// 석차 출력구문 추가~!!!
			System.out.printf("%5d", rec[i].rank);

			// 개행
			System.out.println();
		
		}//end outter for문
		
	}//end print

	//4. 석차 산출 메소드 추가~!!!
	//   - Record 배열의 rank 속성 초기화 기능 -> 반환 자료형 void
	//   - 클래스 내부에서 활용할 메소드로 정의 -> 접근제어 지시자 private
	private void ranking()
	{
		int i,j;          //--루프 변수
		// 모든 학생들의 등수(석차, rank)를 1로 초기화
		for (i=0; i<inwon; i++)
		{
			rec[i].rank = 1;       //처음에는 전부 1로 세팅하고 비교해서 작으면 1더하기 해줄 것임
		}

		// 등수 산출....ex) 4명
		for (i=0; i<inwon-1; i++)      //-- 비교 기준   0   1   2(인원 -1(마지막사람까지 비교안해도되니까!)) 
		{
			for (j=i+1; j<inwon; j++)  //-- 비교 대상  123  23  3
			{
				if (rec[i].avg > rec[j].avg)      //-- 비교 기준의 평균이 비교대상의 평균보다 크다면.....
				{
					//-- 비교대상의 rank를 1만큼 증가
					rec[j].rank++;
				}
				else if (rec[j].avg > rec[i].avg)  //-- 비교대상의 평균이 비교기준의 평균보다 크다면...
				{
					//-- 비교기준의 rank를 1만큼 증가
					rec[i].rank++;
				}
			}
		}

	}//end ranking

	
}//end class Sungjuk