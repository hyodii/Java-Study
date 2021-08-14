/* =====================
■■■ 배열 ■■■
- 배열의 선언과 초기화
- 배열의 기본적 활용
=========================*/

/*
사용자로부터 처음 입력받은 인원 수 만큼의
학생 이름과 전화번호를 입력받고
입력받은 내용을 전체 출력하는 프로그램을 구현한다.
단, 배열을 활용하여 처리할 수 있도록 한다.
이름과 전화번호 배열 따로 처리

실행 예)
입력 처리할 학생 수 입력(명, 1~10) : 24
입력 처리할 학생 수 입력(명, 1~10) : 3
이름 전화번호 입력[1](공백 구분) : 정효진 010-1111-1111
이름 전화번호 입력[2](공백 구분) : 황선우 010-2222-2222
이름 전화번호 입력[3](공백 구분) : 김연경 010-3333-3333

----------------------
전체 학생 수 : 3명
----------------------
   이름     전화번호
  손범석 010-1111-1111
  채지윤 010-2222-2222
  최현정 010-3333-3333
----------------------
계속하려면 아무 키나 누르세요...
*/
import java.util.Scanner;

public class Test077
{
	public static void main(String[] args)
	{
		int n;
		//Scanner 인스턴스 생성
		Scanner sc = new Scanner(System.in);
		

		//String[] name = new String[10];
		//String[] number = new String[10];

		//사용자가 입력하는 학생 수를 담아둘 변수
		do
		{
			System.out.print("입력 처리할 학생 수 입력(명, 1~10) : ");
			n = sc.nextInt();
		}
		while (n<1 || n>10);


		//배열 생성(이름 배열, 전화번호 배열)
		// - 사용자로부터 입력받은 인원수 만큼의 배열방 구성

		// 이름 저장 배열
		String[] name = new String[n];
		// 전화번호 저장 배열 - 주민번호, 번호, 학번 등 int가 아니라 String 으로 만들어야함 ---check~!!
		String[] number = new String[n];
		//String[] number = new String[name.length]; 와 동일한 구문!!---check~!!

		for (int i=0; i<n; i++) //i<n 은 i<name.length  또는 i<number.length  가능
		{
			
			System.out.printf("이름 전화번호 입력[%d](공백 구분) : ",(i+1));  // (i+1) ---check~!!
			name[i] = sc.next();
			number[i] = sc.next();
		}
		System.out.println();

		//최종 결과 출력
		System.out.println("----------------------");
		System.out.printf("전체 학생 수 : %d명\n",n);
		System.out.println("----------------------");

		System.out.println("   이름     전화번호");

		for (int i=0; i<n; i++)
		
			System.out.printf("  %4s %14s\n", name[i], number[i]);
		
		System.out.println("----------------------");

	}
}
/* 실행 결과
입력 처리할 학생 수 입력(명, 1~10) : 0
입력 처리할 학생 수 입력(명, 1~10) : 17
입력 처리할 학생 수 입력(명, 1~10) : -20
입력 처리할 학생 수 입력(명, 1~10) : 2
이름 전화번호 입력[1](공백 구분) : 정효진 010-7777-8888
이름 전화번호 입력[2](공백 구분) : 아라라 0101234567

----------------------
전체 학생 수 : 2명
----------------------
   이름     전화번호
   정효진 010-7777-8888
   아라라    0101234567
----------------------
계속하려면 아무 키나 누르십시오 . . .

*/