/* =======================================================
■■■ 실행 흐름의 컨트롤(제어문, 조건문과 반복문) ■■■
- if ~ else 문 실습
==========================================================*/

/*
사용자로부터 이름, 국어점수, 영어점수, 수학점수를 입력받아 
다음과 같은 형태로 출력하는 프로그램을 작성한다.
등급은 평균 점수를 기준으로 산출하여 처리한다.

90점 ~ 100점 : A
80점 ~ 89 : B
70점 ~ 79점 : C
60점 ~ 69점 : D
60점 미만 : F

단, BufferedReader를  활용하여 데이터를 입력받을 수 있도록 하며,
printf()메소드를 통해 출력할 수 있도록 구현한다.

실행예)
이름 입력 :  정효진
국어 점수 : 90
영어 점수 : 80
수학 점수 : 70

>> 당신의 이름은 정효진입니다.
>> 국어 점수는 90,
>> 영어 점수는 80,
>> 수학 점수는 70,
>> 총점은 240이고, 평균은 80입니다.
>>등급은 B입니다.
계속하려면 아무 키나 누르세요...

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test029
{
	public static void main(String[] args) throws IOException
	{
		/*[내가 쓴 코드]
		//주요 변수 선언
		String strName;
		char grade;
		int kor, eng, mat;
		int sum;
		double avg;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//연산 및 처리
		System.out.print("이름 입력 : "); //이름입력
		strName = br.readLine();

		System.out.print("국어 점수 : "); //국어 점수 입력
		kor = Integer.parseInt(br.readLine());

		System.out.print("영어 점수 : "); //영어 점수 입력
		eng = Integer.parseInt(br.readLine());
		
		System.out.print("수학 점수 : "); //수학 점수 입력
		mat = Integer.parseInt(br.readLine());
		

		sum = kor + eng + mat; //총점 구하기
		avg = (kor + eng + mat) / 3.0; //평균 구하기

		//등급 정하기
		if(avg>=90){
			grade = 'A';
		}else if(avg>=80){	
			grade = 'B';
		}else if(avg>=70){
			grade = 'C';
		}else if(avg>=60){
			grade = 'D';
		}else{
			grade = 'F';				
	
		}
		*/


		//[함께 쓴 코드]
		//주요 변수 선언
		String strName;
		char grade ='F'; //grade 값을 if안에 조건에 안들어가는 경우, 선언 안하고 출력하라니까 에러날 수 밖에 없음!
		int kor, eng, mat;
		int sum = 0;    //-----> sum 을 0으로 초기화 한 경우
		double avg;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//연산 및 처리
		System.out.print("이름 입력 : "); //이름입력
		strName = br.readLine();
		

		System.out.print("국어 점수 : "); //국어 점수 입력
		kor = Integer.parseInt(br.readLine());
		sum += kor;

		System.out.print("영어 점수 : "); //영어 점수 입력
		eng = Integer.parseInt(br.readLine());
		sum += eng;

		System.out.print("수학 점수 : "); //수학 점수 입력
		mat = Integer.parseInt(br.readLine());
		sum += mat;

		sum = kor + eng + mat; //총점 구하기
		avg = (kor + eng + mat) / 3.0; //평균 구하기  --check~!!

		// ※ 두 개 이상의 조건  등장 -> **논리 연산자**
		// 평균이 90정 이상 and 평균이 100점 이하
		
		//등급 정하기
		if(avg<=100)
		{
				if(avg>=90 && avg<=100)
				{
					grade = 'A'; //등급이 A
				}else if(avg>=80 && avg<90) //이거 인데 위에서 어차피 90미만인 애들만 내려오기로 했으니까 (avg>80)만 써도됨!!
				{	
					grade = 'B'; //등급이 B
				}else if(avg>=70)
				{
					grade = 'C'; //등급이 C
				}else if(avg>=60)
				{
					grade = 'D'; //등급이 D
				}else
				{
					grade = 'F'; //등급이 F			
	
				}

				//결과 출력
		
				//println() 사용
				System.out.println();
				System.out.println(">> 당신의 이름은 " + strName + "입니다.");
				System.out.println(">> 국어 점수는 " + kor + ",");
				System.out.println(">> 영어 점수는 " + eng + ",");
				System.out.println(">> 수학 점수는 " + mat + ",");
				System.out.println(">> 총점은 " + sum + "이고, " + "평균은 " + avg + "입니다.");
				System.out.println(">> 등급은 " + grade + "입니다.");
				//pringf() 사용
				System.out.printf("\n>> 당신의 이름은 %s입니다",strName);
				System.out.printf("\n>> 국어 점수는 %d",kor);
				System.out.printf("\n>> 영어 점수는 %d",eng);
				System.out.printf("\n>> 수학 점수는 %d",mat);
				System.out.printf("\n>> 총점은 %d이고 평균은 %.2f입니다.", sum, avg);
				System.out.printf("\n>> 등급은 %c입니다.",grade);
			

		}
		else 
		{
			System.out.println("평균 범위 초과!!");
			//결과 출력
			System.out.println("※※※100이하의 값을 입력해주세요※※※");
		}


			


		
	}


}

/*
이름 입력 : 정효진
국어 점수 : 90
영어 점수 : 80
수학 점수 : 70

>> 당신의 이름은 정효진입니다.
>> 국어 점수는 90,
>> 영어 점수는 80,
>> 수학 점수는 70,
>> 총점은 240이고, 평균은 80.0입니다.
>> 등급은 B입니다.

>> 당신의 이름은 정효진입니다
>> 국어 점수는 90
>> 영어 점수는 80
>> 수학 점수는 70
>> 총점은 240이고 평균은 80.00입니다.
>> 등급은 B입니다.계속하려면 아무 키나 누르십시오 . . .



이름 입력 : 정효진
국어 점수 : 1100
영어 점수 : 200
수학 점수 : 500
평균 범위 초과!!
※※※100이하의 값을 입력해주세요※※※
계속하려면 아무 키나 누르십시오 . . .
*/




