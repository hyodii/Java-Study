/* ===============================
■■■ 클래스와 인스턴스 ■■■
- 클래스와 인스턴스 활용
==================================*/

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

import java.util.Random;
import java.util.Scanner;

class RpsGame
{
	private int user;
	private int com;

	private void runCome()  // 컴퓨터의 가위바위보
	{
		Random rd = new Random();
		com = rd.nextInt(3)+1;  //-- 0 1 2  -> 1 2 3
	}
	
	public void input()    // 사용자의 가위바위보 
	{
		runCome();

		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.print("1:가위  2:바위  3:보  중 입력(1~3) : ");
			user = sc.nextInt();
		}
		while (user<1 || user>3);
		
	}//end input()

	//중간결과 출력해주는 메소드
	public void middleCalc()
	{
		String[] str = {"가위", "바위", "보"};
		
		System.out.println();
		//System.out.println("- 유저   : " + user);  //이러면 숫자가 출력됨
		System.out.println("- 유저   : " + str[user-1]);  //str[1] str[2] str[3]     ----check~!!!
		System.out.println("- 컴퓨터 : " + str[com-1]);   //인덱스값이 0인데 가위바위보는 1 2 3으로 되어있으니까 -1 해줘야함!!
		System.out.println();
	}

	//승부에 대한 결과 연산
	public String resultCalc()
	{
		String result = "무승부입니다.";

		if (user==1 && com==3 || user==2 && com==1 || user==3 && com==2)    // 사용자가 승리한 상황
			result = "당신이 이겼습니다~!!!";
		else if(user==1 && com==2 || user==2 && com==3 ||user==3 && com==1)      // 컴퓨터가 승리한 상황
			result = "컴퓨터가 이겼습니다~ㅠㅠ";

		return result;

	}//end resultCalc()

	//최종 결과 출력
	public void print(String str)
	{
		System.out.println(">> 승부 최종 결과 : " + str);
	}

		

	/*----------------------------------------------------------------------
	//[내가 푼 코드]
	String[] rps = {"가위","바위","보"};

	public void set()
	{
		Scanner sc = new Scanner(System.in);
		
		
		Random rd = new Random();
		com = rd.nextInt(3)+1;

		do
		{
			System.out.print("1:가위  2:바위  3:보  중 입력(1~3) : ");
			user = sc.nextInt();
		}
		while (user<1 || user>3);

	}

	public void input()
	{
		System.out.println();
		System.out.println("-유저   : " + rps[user-1]);  //인덱스값이 0인데 가위바위보는 1 2 3으로 되어있으니까
		System.out.println("-컴퓨터 : " + rps[com-1]);
		System.out.println();
	}

	public void print()
	{
		String result;
		result = "무승부";
		
		if (user==1 && com==3 || user==2 && com==1 || user==3 && com==2)
			result = "유저가 이겼습니다~!!!";
		if(user==1 && com==2 || user==2 && com==3 ||user==3 && com==1)
			result = "컴퓨터가 이겼습니다~!!!";

		System.out.println(">> 승부 최종 결과 : " + result);
	}
	-------------------------------------------------------------------*/


	

}

//main() 메소드를 포함하고 있는 외부의 다른 클래스
public class Test098
{
	public static void main(String[] args)
	{
		/*----------------------------------------------------------------------
		RpsGame ob = new RpsGame();
		ob.set();
		ob.input();
		ob.print();
		-------------------------------------------------------------------*/
		RpsGame ob = new RpsGame();

		ob.input();
		ob.middleCalc();
		String result = ob.resultCalc();
		ob.print(result); 

	}
}
/*
1:가위  2:바위  3:보  중 입력(1~3) : 1


- 유저   : 가위
- 컴퓨터 : 보

>> 승부 최종 결과 : 당신이 이겼습니다~!!!
계속하려면 아무 키나 누르십시오 . . .




1:가위  2:바위  3:보  중 입력(1~3) : 2


- 유저   : 바위
- 컴퓨터 : 보

>> 승부 최종 결과 : 컴퓨터가 이겼습니다~ㅠㅠ
계속하려면 아무 키나 누르십시오 . . .




1:가위  2:바위  3:보  중 입력(1~3) : 3


- 유저   : 보
- 컴퓨터 : 보

>> 승부 최종 결과 : 무승부입니다.
계속하려면 아무 키나 누르십시오 . . .
*/