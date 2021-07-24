// <삼항연산자>
// 실행예)
// 임의의 정수 입력 : -12
// -12 -> 음수
//계속...

// 임의의 정수 입력 : 257
// 257 -> 양수
//계속...

// 임의의 정수 입력 : 0 
// 0 -> 영
//계속...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test027
{
	public static void main(String[] args) throws IOException
	{
		int n;
		String strResult;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("임의의 정수 입력 : ");
		n = Integer.parseInt(br.readLine());

		strResult = (n==0 ? "영" : (n>0 ? "양수" : "음수"));
		
		System.out.printf("%d -> %s\n",n,strResult);
	}
}
/*
임의의 정수 입력 : 0
0 -> 영
계속하려면 아무 키나 누르십시오 . . .

임의의 정수 입력 : 257
257 -> 양수
계속하려면 아무 키나 누르십시오 . . .

임의의 정수 입력 : -85
-85 -> 음수
계속하려면 아무 키나 누르십시오 . . .
*/
