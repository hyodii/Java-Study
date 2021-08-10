//	사용자로부터 연, 월을 입력받아
//	달력을 그려주는(출력하는) 프로그램을 구현한다.
//	단, 만년 달력이 아니라 Calendar 클래스를 활용하여 작성할 수 있도록 한다.

// 실행 예)
// 연도 입력 : 0
// 연도 입력 : 2021
// 월 입력 : -2
// 월 입력 : 16
// 월 입력 : 8

/*
	[ 2021년 8월 ]

  일  월  화  수  목  금  토
 ===========================
   1   2   3   4   5   6   7
   8   9  10  11  12  13  14
  15  16  17  18  19  20  21
  22  23  24  25  26  27  28
  29  30  31
============================
계속하려면 아무....

*/
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test139
{
	public static void main(String[] args) throws IOException
	{



		//내가 푼거---------------------------------------------------------------------
		/*
		Calendar rightNow = new GregorianCalendar();

		Scanner sc = new Scanner(System.in);
		int y,m,w;

		do
		{
			System.out.print("연도 입력 : ");
			y = sc.nextInt();
		}
		while (y<=0);

		do
		{
			System.out.print("월 입력 : ");
			m = sc.nextInt();
		}
		while (m<=0 || m>12);

		rightNow.set(y,m-1,1);    //달력은 무조건 1일부터 시작~!!

		int[] months = {31,28,31,30,31,30,31,31,30,31,30,31};

		String[] week = {"일요일","월요일","화요일","수요일","목요일","금요일","토요일"};

		w = rightNow.get(Calendar.DAY_OF_WEEK);


		System.out.println();
		System.out.printf("\t[ %d년 %d월 ]\n",y,m);
		System.out.println("  일  월  화  수  목  금  토");
		System.out.println(" ===========================");


		for (int i=1; i<w; i++)  //--check~!!
		{
			System.out.println("    ");
		}


		for (int i=1; i<=months[m-1]; i++)   //--check~!!
		{
			System.out.printf("%4d",i);
			w++;

			if(w%7==1)
				System.out.println();
		}
		if (w%7!=1) //--check~!!
		{
			System.out.println();
		}
		
		System.out.println("=============================");
		*/
		
		 
		//-------------- Calendar 의 getActualMaximum() 메소드를 사용해서 푼 것---------
		//BufferedReader 인스턴스 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// Calendar 인스턴스 생성
		Calendar cal = Calendar.getInstance();

		//주요 변수 선언
		int y, m;  //--년, 월
		int w;     //-- 요일
		int i;     //-- 달력을 그리는 과정에서 사용하게될 변수

		do
		{
			System.out.print("연도 입력 : ");
			y = Integer.parseInt(br.readLine());
		}
		while (y<1);

		do
		{
			System.out.print("월 입력 : ");
			m = Integer.parseInt(br.readLine());
		}
		while (m<1 || m>12);

		// 사용자로부터 입력받은 연(y), 월(m) 이용하여
		// 달력의 날자 세팅
		cal.set(y,m-1,1); //-- check~!!!  월 -1 해주고 일에 1일의 요일 알아야하니까 1입력!!
		//--- 월 구성 시 입력값(m)을 그대로 사용하는 것이 아니라
		//	  입력값에서 1을 뺀 값으로 월을 설정해야 한다.
		//--- 일 구성 시 입력받은 연, 월에 해당하는 1일로 설정해야 한다.
		//    그 날의 요일 확인을 위해서...

		// 요일 가져오기
		w = cal.get(Calendar.DAY_OF_WEEK);

		//테스트
		//System.out.println(w);
		//--==>> 연도 입력 : 2021
		//		 월 입력   : 8
		//		 1 -> 2021년 8월 기준 -> 일요일 -> 2021년 8월 1일은 일요일~!!!

		System.out.println(); 
		System.out.println("\t[ " + y + "년 " +  m + "월 ]\n");
		System.out.println("  일  월  화  수  목  금  토");
		System.out.println(" ===========================");
		

		// 빈칸 공백 발생
		for (i=1; i<w; i++)
			System.out.print("     ");
		//테스트
		//System.out.printf("%4d",1);    //1이 찍히는 위치 테스트

		// ※ Calendar 의 getActualMaximum() 메소드
		//System.out.println(cal.getActualMaximum(Calendar.DATE));
		

		//for (i=1; i<=그월의 마지막 날짜;i++)
		for (i=1; i<=cal.getActualMaximum(Calendar.DATE); i++)
		{
			System.out.printf("%4d",i); 
			w++;   //--반복문을 수행하며 날짜가 증가할 때마다 요일도 함께 증가할 수 있도록 처리

			if(w%7==1)         //전에 했던건 0이었는데 여기선 1!!! 왜냐면 일요일이 1이니까!!
				System.out.println();   //--증가한 요일이 일요일이 될 때 마다 개행 후 출력
		}

		if(w%7!=1)
			System.out.println();

		System.out.println(" ===========================");
		

		


//1년 1월 1일이 월요일로 배웠는데 이거로 해보면 토요일이 나오는데 왜그런건가요?
// -> GregorianCalendar는 1년 1월 1일이 월요일 아님!! (그레고리력 검색)



	}
}
/*
연도 입력 : 0
연도 입력 : 2021
월 입력 : 0
월 입력 : 13
월 입력 : -2
월 입력 : 8

        [ 2021년 8월 ]
  일  월  화  수  목  금  토
 ===========================
   1   2   3   4   5   6   7
   8   9  10  11  12  13  14
  15  16  17  18  19  20  21
  22  23  24  25  26  27  28
  29  30  31
=============================
계속하려면 아무 키나 누르십시오 . . .

*/
