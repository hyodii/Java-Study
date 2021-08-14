/*
1 ~ 3 사이의 난수를 발생시켜서
가위, 바위, 보 게임 프로그램을 구현한다.
단, 클래스의 개념을 활용하여 처리할 수 있도록 한다.
또한, 배열을 활용하여 처리할 수 있도록 한다.
최종적으로 RpsGame 클래스를 완성할 수 있도록 한다.

※ 기준 데이터 -> 1:가위, 2:바위, 3:보
가위 바위 보를 배열에 넣으면 됨 

실행 예)
1:가위  2:바위  3:보  중 입력(1~3) : 4
1:가위  2:바위  3:보  중 입력(1~3) : -2
1:가위  2:바위  3:보  중 입력(1~3) : 2

-유저   : 바위
-컴퓨터 : 보

>> 승부 최종 결과 : 컴퓨터가 이겼습니다~!!!
계속하려면...
*/
import java.util.Scanner;
import java.util.Random;
class RpsGame
{
	private int user;
	private int com;

	private void runCome()
	{
		Random rd = new Random();
		com = rd.nextInt(3)+1;
	}

	public void input()
	{
		runCome();

		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.print("1:가위  2:바위  3:보  중 입력(1~3) : ");
			user = sc.nextInt();
		}
		while (user<1 || user>3);
	}

	public void middleCalc()
	{
		String[] str = {"가위", "바위", "보"};  //--check~!!!

		System.out.println();
		System.out.println("- 유  저  : " + str[user-1]);
		System.out.println("- 컴퓨터  : " + str[com-1]);
		System.out.println();

	}

	public String resultCalc()
	{
		String result = "무승부입니다.";
		
		if (user==1 && com==3 || user==2 && com==1 || user==3 && com==2)
			result = "당신이 이겼습니다~!!!";
		else if(user==1 && com==2 || user==2 && com==3 ||user==3 && com==1)
			result = "컴퓨터가 이겼습니다~ㅠㅠ";

		return result;
	}

	public void print(String str)
	{
		System.out.println(">> 승부 최종 결과 : " + str);
	}
}
		


public class hyodii098
{
	public static void main(String[] args)
	{
		RpsGame ob = new RpsGame();

		ob.input();
		ob.middleCalc();
		String result = ob.resultCalc();
		ob.print(result);
	}


}
/*
1:가위  2:바위  3:보  중 입력(1~3) : 8
1:가위  2:바위  3:보  중 입력(1~3) : -2
1:가위  2:바위  3:보  중 입력(1~3) : 3

- 유  저  : 보
- 컴퓨터  : 보

>> 승부 최종 결과 : 무승부입니다.
계속하려면 아무 키나 누르십시오 . . .

1:가위  2:바위  3:보  중 입력(1~3) : 2

- 유  저  : 바위
- 컴퓨터  : 보

>> 승부 최종 결과 : 컴퓨터가 이겼습니다~ㅠㅠ
계속하려면 아무 키나 누르십시오 . . .

1:가위  2:바위  3:보  중 입력(1~3) : 1

- 유  저  : 가위
- 컴퓨터  : 보

>> 승부 최종 결과 : 당신이 이겼습니다~!!!
계속하려면 아무 키나 누르십시오 . . .
*/
