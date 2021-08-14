/* 
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
public class hyodii079
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n;
		int sum=0, avg=0, de=0;
		System.out.print("학생 수 입력 : ");
		n = sc.nextInt();

		int[] score = new int[n];

		for (int i=0; i<score.length; i++)
		{
			System.out.printf("%d번 학생의 점수 입력 : ",i+1);
			score[i] = sc.nextInt();
			sum += score[i];      //--check~!!

		}System.out.println();

		avg = sum / score.length;  //--check~!!
		System.out.println(">> 합 : "+sum);
		System.out.println(">> 평균 : "+avg);
		System.out.println(">> 편차");

		for (int i=0; i<score.length; i++)
		{
			de  = score[i]-avg;
			System.out.println(score[i] + " : " + de);
		}

	}
}
/*
학생 수 입력 : 5
1번 학생의 점수 입력 : 26
2번 학생의 점수 입력 : 98
3번 학생의 점수 입력 : 65
4번 학생의 점수 입력 : 33
5번 학생의 점수 입력 : 45

>> 합 : 267
>> 평균 : 53
>> 편차
26 : -27
98 : 45
65 : 12
33 : -20
45 : -8
계속하려면 아무 키나 누르십시오 . . .s
*/