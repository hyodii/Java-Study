/* ======================================
■■■ 주민등록번호 유효성 검사 ■■■
=========================================*/
/*
○ 주민등록번호 검증 공식

1. 마지막 자리를 제외한 앞자리 수를 규칙에 맞게 곱한다.

	123456-1234567 (주민번호)
	****** ****** --------------------각 자릿수 곱하기
	234567 892345  (각 자리에 곱해질 수)

2. 규칙에 맞게 곱셈 연산을 수행한 결과를 모두 더한다.
ex) 7 5 0 6 1 5 - 1 8 6 2 1 3 3
    * * * * * *   * * * * * *
	2 3 4 5 6 7   8 9 2 3 4 5
------------------------------------
 ->14 +15 + 0 + 30 + 6 + 35 + 8 + 72 + 12 + 6 + 4 + 15
   
   == 217 

3. 더해진 결과값을 11로 나누어 『나머지』를 취한다.
		 -----
     11 | 217     ==> 나머지 8


4. 11에서 나머지(8)를 뺀 결과값을 구한다.

	11 - 8 = 3

	※ 3. 의 처리 과정에서 나머지가 0인 경우 -> 11 -> 1
								    1인 경우 -> 10 -> 0
		
		이를 다시 10으로 나누어 나머지를 취한다.

5. 4의 연산 결과가 주민번호를 구성하는 마지막 숫자와 일치하는지의여부를 확인한다.

	일치    -> 유효한 주민번호
	분일치  -> 잘못된 주민번호


실행 예) 750615
주민번호 입력(xxxxxx-xxxxxxx) : 123456-12345678 -> 입력 갯수 초과
>> 입력 오류~!!!
계속하려면 아무 키나 누르셍...

주민번호 입력(xxxxxx-xxxxxxx) : 123456-123456  -> 입력 갯수 미달
>> 입력 오류~!!!
계속하려면 아무 키나 누르셍...

주민번호 입력(xxxxxx-xxxxxxx) : 941231-1234567   -> 유효한 주민 번호
>> 유효한 주민번호~!!!
계속하려면 아무 키나 누르셍...

주민번호 입력(xxxxxx-xxxxxxx) : 941231-1234569   -> 유효하지 않은 주민 번호
>> 잘못된 주민번호~!!!
계속하려면 아무 키나 누르셍...

※ 추가 팁~!!
배열.length      ->  배열의 길이(배열방의 갯수) 반환
문자열.length()  ->  문자열의 길이 반환
ex)
String str = "abcdefg";
str.length();           -> 7
"abcdefg".length();     -> 7
문자열.substring()      -> 문자열 추출
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

public class Test102
{
	public static void main(String[] args) throws IOException
	{
		/*

		//String arr = new String[14];
		//테스트
		String strTemp = "정효진";
		System.out.println(strTemp.length());
		//--==>> 3

		strTemp = "동해물과 백두산이";
		System.out.println(strTemp.length());
		//--==>> 9

		strTemp = "study-hard";
		System.out.println(strTemp.length());
		//--==>> 10

		// substring 테스트
		strTemp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println(strTemp.substring(3,5));
		//--==>> DE
		// ABC DE FGHIJKLMNOPQRSTUVWXYZ
		// 012 34 5678

		strTemp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println(strTemp.substring(13,17));
		//--==>> NOPQ
		// ABCDEFGHIJKLM NOPQ RSTUVWXYZ
		// 0123456789012 3456 7

		//strTemp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		//System.out.println(strTemp.substring(13,85));
		//--==>> 에러발생(컴파일 에러) 
		//		 StringIndexOutOfBoundsException

		strTemp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println(strTemp.substring(5));
		//--==>> FGHIJKLMNOPQRSTUVWXYZ

		strTemp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println(strTemp.substring(5,strTemp.length()));
		//--==>> FGHIJKLMNOPQRSTUVWXYZ           --------------
		//										strTemp의 전체 길이

		*/

		
		/*----------------------------------------------------------------------
		//[내가 푼 문제]
		Scanner sc = new Scanner(System.in);
		String num;
		int result, div,sum=0;
								     // 123456-1234567
									 // 234567 892345
		System.out.print("주민번호 입력(xxxxxx-xxxxxxx) : "); 
		num = sc.next();

		if (num.length() != 14)
		{			
			System.out.println(">> 입력 오류~!!!");
			return;
		}
		

		int[] arr = {2,3,4,5,6,7,0,8,9,2,3,4,5};

		for (int i=0; i<13;i++)
		{
			// 1. 마지막 자리를 제외한 앞자리 수를 규칙에 맞게 곱한다.
			// 2. 규칙에 맞게 곱셈 연산을 수행한 결과를 모두 더한다.
			sum += arr[i] * Integer.parseInt(num.substring(i,(i+1)));  //문자열을 int로 변경하는데쓰는 거
				
			
		}

		// 3. 더해진 결과값을 11로 나누어 『나머지』를 취한다.
		div = sum % 11;

		// 4. 11에서 나머지(8)를 뺀 결과값을 구한다.
		result = 11 - div;
		
		//※ 3. 의 처리 과정에서 나머지가 0인 경우 -> 11 -> 1
		//						    1인 경우 -> 10 -> 0

		
		// 이를 다시 10으로 나누어 나머지를 취한다.

		result %= result;

		//5. 4의 연산 결과가 주민번호를 구성하는 마지막 숫자와 일치하는지의여부를 확인한다.
		if (result==Integer.parseInt(num.substring(13)))

			System.out.println(">> 정확한 주민번호~!!");

		else

			System.out.println(">> 잘못된 주민번호~!!");
			-------------------------------------------------------------------*/
		
		//함께 푼 문제
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//입력받은 주민번호(문자열 생성)
		String str;

				  // 9 5 0 1 0 5 - 1 2 3 4 5 6 7
		int[] chk = {2,3,4,5,6,7,0,8,9,2,3,4,5};
		//                      --  check~!!!

		//곱셈 연산 후 누적합(즉, 각 곱셈의 결과를 더해 나갈 수 있도록 처리...)
		int tot = 0;

		System.out.print("주민번호 입력(xxxxxx-xxxxxxx) : ");
		// str = Integer.parseInt(br.readLine());
		str = br.readLine();

		if (str.length() != 14)
		{
			System.out.println(">> 입력 오류~!!!");
			return;     //-- 메소드 종료 -> main() 메소드 종료 -> 프로그램 종료
		} 

		//테스트
		//System.out.println(">> 자리수 적합~!!");

		/*
		"750615-1252085"
		str.substring(0,1);
		"7"

		Integer.parseInt("7");

		tot += chk[0] * 7;

		str,substring(1,2);
		"5"
		Integer.parseInt("5");

		tot += chk[1] * 5;
		*/

		for (int i=0; i<13; i++)
		{
			//System.out.print(i + " ");  // 0 ~ 12

			if(i==6)
			{
				continue;   // (뒷부분 무시하고...) +  계속해라
			}

			tot += chk[i] * Integer.parseInt(str.substring(i,(i+1)));     //-- 뒷부분
			//         0 -> 2                              0   1   -> "7"   => tot += 2 * 7 
			//         1 -> 3                              1   2       5              3   5

			//         12   5                             12   13      8              5   8	
		
		}

		//---------------------------------------------여기까지는 1. 2. 수행한것!
		//						규칙에 맞게 곱셈 연산을 수행한 결과를 모두 더한 값은 변수 tot에 담겨있는 상황이 된다.

		int su = 11 - tot % 11;

		// 테스트
		System.out.println(su);
		// 10
		// 11
		
		// 최종 결과 출력 이전에....추가 연산 필요~!!!
		// su에 대한 연산 결과가 두 자리로 나올 경우(10 또는 11)
		// 주민번호 마지막 자리의 숫자와 비교할 수 없는 상황
		su = su % 10; //su%=10;

		//----------------------------------------------여기까지 수행하면 3. 과 4. 를 모두 끝낸 상황이며
		//                                              최종 연산 결과는 변수 su에 담겨있는 상황이 된다.

		//if (su==주민등록번호 마지막한자리숫자)
		if (su==Integer.parseInt(str.substring(13)))   //크기비교하려면 정수형태로 바꿔서
			System.out.println(">> 정확한 주민번호~!!!");
		else
			System.out.println(">> 잘못된 주민번호~!!!");
			

	}
}
/*
주민번호 입력(xxxxxx-xxxxxxx) : 941231-2548461
1
>> 정확한 주민번호~!!!
계속하려면 아무 키나 누르십시오 . . .



주민번호 입력(xxxxxx-xxxxxxx) : 941231-22335566
>> 입력 오류~!!!
계속하려면 아무 키나 누르십시오 . . .



주민번호 입력(xxxxxx-xxxxxxx) : 941231-1234567
2
>> 잘못된 주민번호~!!!
계속하려면 아무 키나 누르십시오 . . .
*/