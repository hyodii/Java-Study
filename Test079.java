/* =====================
■■■ 배열 ■■■
- 배열의 기본적 활용
=========================*/

/* ○ 과제
사용자로부터 학생 수를 입력받고
그만큼의 점수(정수 형태)를 입력받아
전체 학생 점수의 합, 평균, 편차를 구하여
결과를 출력하는 프로그램을 구현한다.
단, 배열을 활용하여 처리할 수 있도록 한다.

실행 예)
학생 수 입력 : 5
1번 학생의 점수 입력 : 90
2번 학생의 점수 입력 : 82
3번 학생의 점수 입력 : 64
4번 학생의 점수 입력 : 36
5번 학생의 점수 입력 : 98

>> 합 : 370
>> 평균 : 74.0
>> 편차
90 : 16.0
82 : 8.0
64 : -10.0
36 : -38.0
98 : 24.0
계속하려면 아무 키나 누르세요...
*/

import java.util.Scanner;

public class Test079
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n;      //학생수
		int sum=0;  //합
		double avg; //평균
		

		//학생수 입력받기
		System.out.print("학생 수 입력 :");
		n = sc.nextInt();
		int[] score = new int[n];

		//학생수만큼 점수 입력하기
		for (int i=0; i<score.length;i++ )
		{
			System.out.printf("%d번 학생의 점수 입력: ", i+1);
			score[i] = sc.nextInt();
			sum += score[i];
		}
		System.out.println();
		
		//입력된 수만큼 평균구하기
		avg = sum/score.length;
		
		//출력하기
		System.out.printf(">> 합 : %d\n",sum);
		System.out.printf(">> 평균 : %.2f\n",avg);
		System.out.println(">> 편차");

		//점수별로 편차 나오게 하기
		for (int i=0; i<score.length; i++)
		{
			System.out.printf("%d : %.2f\n",score[i],score[i]-avg);
		}
		
	}
}
/*
학생 수 입력 :7
1번 학생의 점수 입력: 99
2번 학생의 점수 입력: 88
3번 학생의 점수 입력: 77
4번 학생의 점수 입력: 66
5번 학생의 점수 입력: 55
6번 학생의 점수 입력: 44
7번 학생의 점수 입력: 33

>> 합 : 462
>> 평균 : 66.00
>> 편차
99 : 33.00
88 : 22.00
77 : 11.00
66 : 0.00
55 : -11.00
44 : -22.00
33 : -33.00
계속하려면 아무 키나 누르십시오 . . .
*/