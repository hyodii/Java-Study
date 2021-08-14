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


public class hyodii029
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int kor, eng, mat;
		double avg; //평균 실수로 처리! check~!!
		String name;
		char grade = 'F'; //초기화 하는거 check~!!

		System.out.print("이름 입력 : ");
		name = br.readLine();
		System.out.print("국어 점수 : ");
		kor = Integer.parseInt(br.readLine());
		System.out.print("수학 점수 : ");
		eng = Integer.parseInt(br.readLine());
		System.out.print("수학 점수 : ");
		mat = Integer.parseInt(br.readLine());

		avg = (kor + eng + mat) / 3.0;  //평균 실수로 처리해 줘야해서 3.0 입력 check~!!
		if(avg<=100)
		{
			if (avg>=90)
				grade = 'A';
			else if(avg>=80)
				grade = 'B';
			else if(avg>=70)
				grade = 'C';
			else if(avg>=60)
				grade = 'D';
			else
				grade = 'F';

			System.out.println();
			System.out.printf(">> 당신의 이름은 %s입니다.\n",name);
			System.out.printf(">> 국어 점수는 %d,\n",kor);
			System.out.printf(">> 영어 점수는 %d,\n",eng);
			System.out.printf(">> 수학 점수는 %d,\n",mat);
			System.out.printf(">> 총점은 %d이고, 평균은 %.2f입니다.\n", kor+eng+mat,avg); // %.2f
			System.out.printf(">> 등급은 %c입니다.\n",grade);


		}
		else  //이외의 경우도 생각해서 check~!!
		{
			System.out.println();
			System.out.println("평균범위 초과!!100이하의 값을 입력해주세요.");
		}
			
		
	}
}
/*
이름 입력 : 정효진
국어 점수 : 50
수학 점수 : 60
수학 점수 : 70

>> 당신의 이름은 정효진입니다.
>> 국어 점수는 50,
>> 영어 점수는 60,
>> 수학 점수는 70,
>> 총점은 180이고, 평균은 60.00입니다.
>> 등급은 D입니다.
계속하려면 아무 키나 누르십시오 . . .

이름 입력 : 정효진
국어 점수 : 120
수학 점수 : 201
수학 점수 : 262

평균범위 초과!!100이하의 값을 입력해주세요.
계속하려면 아무 키나 누르십시오 . . .
*/