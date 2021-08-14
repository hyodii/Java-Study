/* ====================================
■■■ 클래스와 인스턴스 ■■■
=======================================*/

/*
사용자로부터 임의의 정수를 입력받아
1부터 입력받은 수 까지의 합을 연산하여
결과값을 출력하는 프로그램을 구현한다.

단, 클래스와 인스턴스의 개념을 활용하여 처리할 수 있도록 한다.
또한, 입력 처리 과정에서 BufferedReader를 활용하며,
입력 데이터가 1 보다 작거나 1000 보다 큰 경우
다시 입력받을 수 있는 처리를 포함하여 프로그램을 구현할 수 있도록 한다.

실행 예)
임의의 정수 입력(1~1000) : 1022
임의의 정수 입력(1~1000) : -20
임의의 정수 입력(1~1000) : 100
>> 1 ~ 100 까지의 합 : 5050
계속하려면 아무 키나 누르세요...
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Hap
{
	int n;

	void input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		do
		{
			System.out.print("임의의 정수 입력(1~1000) : ");
			n = Integer.parseInt(br.readLine());
		}
		while (n<1 || n>1000);
	}
	
	int sum()
	{
		int res=0;
		for (int i=0;i<=n;i++)
		{
			res += n;
			
		}
		return res;   //위치 check~!!
		
	}

	void print(int s)
	{
		System.out.printf(">> 1 ~ %d 까지의 합 : %d\n",n,s);
	}


}
public class hyodii067
{
	public static void main(String[] args) throws IOException
	{
		Hap t = new Hap();
		t.input();
		int a = t.sum();
		t.print(a);
	}
}
/*
임의의 정수 입력(1~1000) : 0
임의의 정수 입력(1~1000) : -20
임의의 정수 입력(1~1000) : 1005
임의의 정수 입력(1~1000) : 50
>> 1 ~ 50 까지의 합 : 2550
계속하려면 아무 키나 누르십시오 . . .
*/