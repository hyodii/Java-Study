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
	// 1. 인원 수 입력
	int inwon;
	Record[] rec;

	public void set()
	{
		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.print("인원 수 입력(1~100) : ");
			inwon = sc.nextInt();
		}
		while (inwon<1 || inwon>100);

		rec = new Record[inwon];
	}

	// 2. 상세 데이터 입력(총점 및 평균 산출 기능 포함)
	public void input()
	{
		Scanner sc = new Scanner(System.in);

		String[] title = {"국어 점수 : ", "영어 점수 : ", "수학 점수 : "};
		
		for (int i=0; i<inwon; i++)
		{
			rec[i] = new Record();

			System.out.printf("%d번째 학생의 이름 입력 : ",(i+1));
			rec[i].name = sc.next();

			for (int j=0; j<title.length; j++)
			{
				System.out.print(title[j]);

				rec[i].score[j] = sc.nextInt();

				rec[i].tot += rec[i].score[j];
			}
			rec[i].avg = rec[i].tot / 3.0;
		}//end outter for 문

		
	}

	public void print()
	{
		System.out.println();

		for (int i=0; i<inwon; i++)
		{
			ranking();

			System.out.printf("%5s", rec[i].name);

			for (int j=0; j<3; j++)
				System.out.printf("%4d", rec[i].score[j]);
			System.out.printf("%5d", rec[i].tot);
			System.out.printf("%8.2f", rec[i].avg);

			System.out.printf("%5d", rec[i].rank);

			System.out.println();
		}
	}

	private void ranking()
	{
		int i,j;

		for (i=0; i<inwon; i++)
		{
			rec[i].rank = 1;     //--check~!!!
		}

		for (i=0; i<inwon-1; i++) //--check~!!!
		{
			for (j=i+1; j<inwon;j++ )
			{
				if (rec[i].avg > rec[j].avg)
				{
					rec[j].rank++;
				}
				else if(rec[j].avg > rec[i].avg)
					rec[i].rank++;

			}
		}
	}
}