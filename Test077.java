import java.util.Scanner;

public class Test077
{
	public static void main(String[] args)
	{
		int n;
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.print("입력 처리할 학생 수 입력(명, 1~10) : ");
			n = sc.nextInt();
		}
		while (n<1 || n>11);
		
		String[] name = new String[n];
		String[] number = new String[n];

		for (int i=0; i<n; i++)
		{
			System.out.printf("이름 전화번호 입력[%d](공백 구분) : ",(i+1));
			name[i] = sc.next();
			number[i] = sc.next();
		}
		System.out.println();
		System.out.println("----------------------");
		System.out.printf("전체 학생 수 : %d명\n",n);
		System.out.println("----------------------");
		System.out.println("   이름    전화번호");

		for (int i=0; i<n; i++)
		{
			System.out.printf("%4s %13s\n",name[i],number[i]);
		}
		System.out.println("----------------------");

	}
}
/*
입력 처리할 학생 수 입력(명, 1~10) : -1
입력 처리할 학생 수 입력(명, 1~10) : 456
입력 처리할 학생 수 입력(명, 1~10) : 23
입력 처리할 학생 수 입력(명, 1~10) : 3
이름 전화번호 입력[1](공백 구분) : 정효진 010-8989-8989
이름 전화번호 입력[2](공백 구분) : 황선우 010-8958-8565
이름 전화번호 입력[3](공백 구분) : 김연경 010-7545-8565

----------------------
전체 학생 수 : 3명
----------------------
   이름    전화번호
 정효진 010-8989-8989
 황선우 010-8958-8565
 김연경 010-7545-8565
----------------------
계속하려면 아무 키나 누르십시오 . . .

*/
