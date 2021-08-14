/* =======================================================
■■■ 실행 흐름의 컨트롤(제어문, 조건문과 반복문) ■■■
- if ~ else 문 실습
==========================================================*/
// ○ 과제
/*
사용자로부터 알파벳 한 문자를 입력받아 이를 판변하여
소문자를 입력받았을 경우... 대문자로 변환하고,
대문자를 입력받았을 경우... 소문자로 변환하는 
프로그램을 작성한다.
단, 입력은 System.in.read() 메소드를 활용하여 구현한다.

실행 예)
알파벳 한 문자 입력 : A
>> a
계속하려면 아무 키나....

알파벳 한 문자 입력 : c
>> C
계속하려면...

알파벳 한 문자 입력 : 7
>> 입력오류~!!!
계속...

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test035
{	
	public static void main(String[] args) throws IOException
	{
		//A는 65 a는 97 대문자에서 소문자로(+=32) 소문자에서 대문자로(-=32)
		int a;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		System.out.print("알파벳 한 문자 입력 :");
		a = (char)System.in.read();  //아스키 코드를 읽어온걸 문자로 담아
		
		if (a>=65 && a<=90) //대문자는
		{
			a +=32; //소문자로
			System.out.printf(">> %c\n", a);
		}		
		else if(a>=97 && a<=122)  //소문자는				
		{	
			a -=32; //대문자로
			System.out.printf(">> %c\n", a);
		}	
		else
			System.out.println(">> 입력오류~!!!");			

		
	}
}
/*
알파벳 한 문자 입력 :A
>> a
계속하려면 아무 키나 누르십시오 . . .

알파벳 한 문자 입력 :c
>> C
계속하려면 아무 키나 누르십시오 . . .

알파벳 한 문자 입력 :7
>> 입력오류~!!!
계속하려면 아무 키나 누르십시오 . . .
*/