/* =========================
■■■ 클래스 고급 ■■■
- 인터페이스(Interface)
============================*/

// ○ 실습 문제
// 성적 처리 프로그램을 구현한다.
// 단, 인터페이스를 활용할 수 있도록 한다.

//실행 예)
// 인원 수 입력(1~10) : 2
// 1번째 학생의 학번 이름 입력(공백 구분) : 2108006 권순모
// 국어 영어 수학 점수 입력   (공백 구분) : 90 100 85
// 2번째 학생의 학번 이름 입력(공백 구분) : 2108024 김소연
// 국어 영어 수학 점수 입력   (공백 구분) : 85 70 65

// 2108006 권순모    90  100  85    275    91
//					 수   수  우    
// 2108024 김소연    85  70   65    220    73
//					 우	 미   양

// 계속하려면 아무 키나 누르세요...


import java.util.Scanner;

// 속성만 존재하는 클래스 -> 자료형 활용
class Record
{
	String hak, name;       //-- 학번, 이름
	int kor, eng, mat;      //-- 국어, 영어, 수학 점수
	int tot, avg;           //-- 총점, 평균(편의상 정수 처리)
}

// 인터페이스
interface Sungjuk
{
	public void set();    //-- 인원 수 구성
	public void input();  //-- 상세 데이터 입력
	public void print();  //-- 결과 출력
	public void print_grade();
}

// 문제 해결 과정에서 설계해야할 클래스 -> Sungjuk 인터페이스를 구현하는 클래스
class SungjukImpl implements Sungjuk
{
	//int[][] gamok;
	//Record[] rc;

	int n;
	Record[] rc;
	char[][] jumsu;



	@Override
	public void set()
	{
		
		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.print("인원 수 입력(1~10) : ");
			n = sc.nextInt();
		}
		while (n<1 || n>10);

		rc = new Record[n];
	
	}

	@Override
	public void input()
	{

		//jumsu = new char[n][3];

		Scanner sc = new Scanner(System.in);

		//점수 입력
		for (int i=0; i<n; i++)
		{
			rc[i] = new Record();
			//int[][] gamok = new int[n][3];

			System.out.printf("%d번째 학생의 학번 이름 입력(공백 구분) : ", (i+1));
			rc[i].hak = sc.next();
			rc[i].name = sc.next();

			System.out.print("국어 영어 수학 점수 입력   (공백 구분) : ");
			//gamok[i][0] = rc[i].kor = sc.nextInt();
			//gamok[i][1] = rc[i].eng = sc.nextInt();
			//gamok[i][2] = rc[i].mat = sc.nextInt();

			rc[i].kor = sc.nextInt();
			rc[i].eng = sc.nextInt();
			rc[i].mat = sc.nextInt();

			rc[i].tot = rc[i].kor + rc[i].eng + rc[i].mat;
			rc[i].avg = (rc[i].kor + rc[i].eng + rc[i].mat) / 3;

		}





/*
		for (int i=0; i<n; i++)
		{
			if(rc[i].eng >= 90)
				System.out.print("수");
			else if(rc[i].eng >= 80)
				System.out.print("우");
			else if(rc[i].eng >= 70)
				System.out.print("미");
			else if(rc[i].eng >= 60)
				System.out.print("양");
			else if(rc[i].eng >= 50)
				System.out.print("가");
		}

		for (int i=0; i<n; i++)
		{
			if(rc[i].mat >= 90)
				System.out.print("수");
			else if(rc[i].mat >= 80)
				System.out.print("우");
			else if(rc[i].mat >= 70)
				System.out.print("미");
			else if(rc[i].mat >= 60)
				System.out.print("양");
			else if(rc[i].mat >= 50)
				System.out.print("가");
		}
*/
/*
		
		//수우미양가 
		for (int i=0; i<n; i++ )
		{
			
			for (int j=0; j<3;j++ )
			{
				if (rc[i].[j]>=90)
				{
					jumsu[i][j] = '수';
				}
				else if (rc[i].avg>=80)
				{
					jumsu[i][j] = '우';
				}
				else if (rc[i].avg>=70)
				{
					jumsu[i][j] = '미';
				}
				else if (rc[i].avg>=60)
				{
					jumsu[i][j] = '양';
				}
				else
					jumsu[i][j] = '가';
			}


		}
	*/	
		/*
		for(int i=0; i<n; i++){
			System.out.printf("%s %s \t %d %d %d \t %d \t %d\n", rec[i].hak, rec[i].name, rec[i].kor, rec[i].eng, rec[i].mat, rec[i].tot, rec[i].avg);
			
			switch(rec[i].kor/10){
				case 9 : case 10 : System.out.print("\t\t 수 "); break;
				case 8 : System.out.print("\t\t 우 "); break;
				case 7 : System.out.print("\t\t 미 "); break;
				case 6 : System.out.print("\t\t 양 "); break;
				default : System.out.print("\t\t 가 ");
			}
			switch(rec[i].eng/10){
				case 9 : case 10 : System.out.print("수 "); break;
				case 8 : System.out.print("우 "); break;
				case 7 : System.out.print("미 "); break;
				case 6 : System.out.print("양 "); break;
				default : System.out.print("가 ");
			}
			switch(rec[i].mat/10){
				case 9 : case 10 : System.out.println("수"); break;
				case 8 : System.out.println("우"); break;
				case 7 : System.out.println("미"); break;
				case 6 : System.out.println("양"); break;
				default : System.out.println("가");
			}
			
		}

		*/


		/*
		String grade(int s)
		{
			String result;
			
			switch (s/10)
			{
				case 10 : result = "수"; break; //100
				case  9 : result = "수"; break; //90~99
				case  8 : result = "우"; break; //80~89
				case  7 : result = "미"; break;
				case  6 : result = "양"; break; 
				default : result = "가"; break;		
			}

			return result;
		}
		*/
		

		
	}

	@Override
	public void print()
	{
		for (int i=0; i<n; i++)
		{
					       // 2108006 권순모    90  100  85    275    91
			System.out.printf("%5s  %5s  %5d  %5d  %5d  %5d  %5d\n",rc[i].hak,rc[i].name,rc[i].kor,rc[i].eng,rc[i].mat,rc[i].tot,rc[i].avg);
			//System.out.printf("\t\t%5c  %5c  %5c\n",jumsu[i][0],jumsu[i][1],jumsu[i][2]);
		
		}System.out.println();
				
	}

}


	@Override
	public void print_grade()
	{
		
			if(rc[0].kor >= 90)
				System.out.printf("수");
			else if(rc[0].kor >= 80 && rc[0].kor < 90)
				System.out.printf("우");
			else if(rc[0].kor >= 70 && rc[0].kor < 80)
				System.out.printf("미");
			else if(rc[0].kor >= 60 && rc[0].kor < 70)
				System.out.printf("양");
			else if(rc[0].kor >= 50 && rc[0].kor < 60)
				System.out.printf("가");

				
	

}



// main() 메소드를 포한하는 외부의 다른 클래스
public class Test117
{
	public static void main(String[] args)
	{
		Sungjuk ob= new SungjukImpl();

		// 문제 해결 과정에서 작성해야할 ob 구성
		//ob = new SungjukImpl();

		//SungjukImpl ob1 = new SungjukImpl();

		ob.set();
		ob.input();
		ob.print();
		ob.print_grade();
	}
}