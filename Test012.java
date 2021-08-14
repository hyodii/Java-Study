/* =================================================
■■■ 자바 기본 프로그래밍 ■■■
-퀴즈
 삼각형의 밑변의 길이와 높이를 사용자로부터 입력받아
 이 삼각형의 넓이를 구하는 프로그램을 구현한다.
===================================================*/

// 실행 예)
// ■ 삼각형의 넓이 구하기 ■
// - 삼각형의 밑변 입력 : 3
// - 삼각형의 높이 입력 : 5

// >> 밑변이 3, 높이가 5인 삼각형의 넓이 : xxxx
// 계속하려면 아무 키나 누르세요...

//삼각형의 넓이 = 밑변 * 높이 / 2
// 사용자로부터 데이터를 입력받아 처리 -> BufferedReader 활용

//[내가 풀이한 내용]
/*--------------------------------------------------------------------------------------
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
//import java.lang.*;

public class Test012
{
	public static void main(String[] args) throws IOException
	{
		
		// BufferedReader 인스턴스 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 주요 변수 선언
		int w, h; //밑변 w 높이 h
		double area; //넓이 area

		System.out.println("■ 삼각형의 넓이 구하기 ■");
		
		// 연산 및 처리
		// 1. 밑변: 사용자에게 출력 및 입력값 받기
		System.out.print("- 삼각형의 밑변 입력 : ");
		w = Integer.parseInt(br.readLine());
		
		//2. 높이: 사용자에게 출력 및 입력값 받기
		System.out.print("- 삼각형의 높이 입력 : ");
		h = Integer.parseInt(br.readLine());

		//3. 넓이 연산
		area = w * h / 2.0;

		// 결과 출력
		System.out.printf(">> 밑변이 %d 높이가 %d인 삼각형의 넓이 : %.2f\n", w, h, area);
		}
}

		
		■ 삼각형의 넓이 구하기 ■
		- 삼각형의 밑변 입력 : 3
		- 삼각형의 높이 입력 : 5
		>> 밑변이 3 높이가 5인 삼각형의 넓이 : 7.50
		계속하려면 아무 키나 누르십시오 . . .

		
		----------------------------------------------------------------------------------------------- */

		//[함께 풀이한 내용]
		//빨간색인 부분은 위에 import 다 써줘야 되는데 String 과 System같은 경우엔 import java.lang.*;
		//모든 lang 은 자동으로 import해놈
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
//import java.lang.*;

public class Test012
{
		public static void main(String[] args) throws IOException
		{

			// ○ 주요 변수 선언
			// BufferedReader 인스턴스 생성
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			int bottomLength, height; //밑변과 높이
			double area; //넓이   check~!!넓이는 실수일 수 있으니까 double!

			// ○ 연산 및 처리
			// 1. 사용자에게 안내 메세지 출력
			System.out.println("■ 삼각형의 넓이 구하기 ■");
			System.out.print("- 상각혐의 밑변 입력 : "); //println 안하는 이유는 커서가 개행되서 깜빡깜박하면 안되니까

			// 2. 사용자가 입력한 데이터를 정수 형태로 변환한 후
			//변수 bottomLength 에 담아내기
			bottomLength = Integer.parseInt(br.readLine());

			// 3. 다시 사용자에게 안내 메세지 출력
			System.out.print("- 삼각형의 높이 입력 : ");

			// 4. 사용자가 입력한 데이터를 정수 형태로 변환한 후 변수 height에 담아내기
			height = Integer.parseInt(br.readLine());

			// 5. 값이 채워진(담겨진) 변수들을 활용하여 삼각형의 넓이를 구하는 연산 수행
			//area = bottomLength * height / 2;
			//         정수형     정수형 / 정수형 -> 정수 기반 연산 그래서 2.0으로 해야함!!!
			area = bottomLength * height / 2.0; //check~!!!
			//      정수형        정수형 / 실수형 => 실수 기반 연산

			// ※ 실수 자료형이 결과값으로 산출되는 과정에서 실수 기반의 연산이 필요한 상황이다.
			// 정수형 『2』가 아닌 실수형 『2.0』으로 나눗셈 연산을 수행하게 되면 이 연산은 실수 기반으로 처리된다.
			

			// ○ 결과 출력
			System.out.println(); // 매개변수 없음 -> 개행
			//System.out.print(); // 매개변서 없음 -> 에러

			System.out.printf(">> 밑변이 %d, 높이가 %d인 삼각형의 넓이 : %.2f\n", bottomLength, height, area);



		}
}

/*
■ 삼각형의 넓이 구하기 ■
- 상각혐의 밑변 입력 : 5
- 삼각형의 높이 입력 : 3

>> 밑변이 5, 높이가 3인 삼각형의 넓이 : 7.50
계속하려면 아무 키나 누르십시오 . . .

*/