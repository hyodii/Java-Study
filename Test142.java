/* ======================================
  ■■■ 자바의 주요(중요) 클래스 ■■■
  - Random 클래스
=========================================*/

/*
○ java.util.Random 클래스는

	여러 형태의 난수를 발생시켜 제공하는 클래스이다.
	Math 클래스의 정적 메소드인 random() 메소드도
	난수를 발생시켜 제공하는 메소드이지만
	0.0 ~ 1.0 사이의 실수 형태만 발생하게 되므로
	필요한 여러 형태의 난수를 만들어내기 위해서는
	추가적인 연산들을 수행해야 한다.
	그래서 자바는 여러 형태의 난수를 발생시켜주는
	전용 클래스인 Random 클래스를 별도로 제공하고 있다.
*/

// 로또 번호 생성기 (난수 발생 프로그램)
// 코딩 테스트 단골 - 여러 행태로 많이 만들어 봐라!

// 프로그램이 실행되면 기본적으로 로또는
// 5게임 수행하는 프로그램을 구현한다.

// 실행 예)
// 3 5 12 24 31 40
// 1 2  9 22 35 38
// 4 9 11 13 22 31
// 5 10 13 15 28 40
// 22 31 32 33 40 45
//계속하려면 아무키나 누르세요....

// 한 게임안에서 중복 없어야함 31


/*----------------------------------------------------------------------
//나의 풀이

import java.util.Random;

public class Test142
{
	public static void main(String[] args)
	{

		int[] lotto = new int[6];

		// 실수 랜덤
		//for (int i=1; i<45;i++)
		//{
		//	System.out.println(Math.random());
		//}
		

		Random rd = new Random();

	

		for (int j=1; j<=5;j++ )
			for (int i=0; i<lotto.length;i++)
			{
				lotto[i] = rd.nextInt(45)+1;
				System.out.print(lotto[i] + " ");	
				
			}System.out.println();



		
		//오름차순 정렬
		for (int i=0; i<lotto.length; i++)
		{
			for (int j=i+1;j<lotto.length;j++)
			{
				if (lotto[i]>lotto[j])
				{
					lotto[i] = lotto[i]^lotto[j];
					lotto[j] = lotto[j]^lotto[i];
					lotto[i] = lotto[i]^lotto[j];
				}
				
			}
		}

		//출력
		for (int n : lotto)
		{
			System.out.print(n + " ");
		}
		
			

		

	}
}

-------------------------------------------------------------------*/
import java.util.Random;
import java.util.Arrays;   //Array"s"  s 꼭~!!

// Lotto클래스 만들어서 풀이
class Lotto
{
	// 배열 변수 선언 및 메모리 할당 -> 로또 번호를 담아둘 배열방 6칸
	private int[] num = new int[6];  
	
	//getter  //외부에서 직접 채워넣는일은 없고 가져다가 쓸일은 있으니까 setter 는 없고 getter
	public int[] getNum()   //num을 getter 그래서 getNum 외우자!
	{
		return num;
	}

	// 6개의 난수를 발생시키는 메소드 정의
	public void start()
	{
		Random rd = new Random();

		int n;
		int cnt = 0;
		
		// check~!!!  빈번한 사용이 바람직하지 못하지만 같은것 반복되서 코드가 길어지면 사용!
		jump:
		//** 여기로 나오고  cnt는 그대로!!!

		while (cnt<6)   //웅 0 1 2 3 4 5
		{
			//rd.nextInt(45)  //이건 0~44까지의 난수  (+1) 1~45까지의 난수
			n = rd.nextInt(45) + 1;  
			//**예시 45 13 45

			for (int i=0; i<cnt; i++)  //쑝쑝쑝  cnt check~!!  0->비교안함 / 1->0 / 2->01 / 3->012 / 4->0123 / 5->01234
			{
				if (num[i] == n) //중복된 값이 나오면
				//** num[0] == 13
				//** num[0] == 45
				{
					// 난수를 다시 발생시킬 수 있도록 처리
					continue jump;
					//** 45중복이라 이거 발생!

				}
			}

			num[cnt++] = n;
			//** num[0] = 45
			//** num[1] = 13

		}

		sorting();   //check~!!!  만들었으니까 불러와야지~

		
	}// end start


	// 정렬 메소드 정의
	private void sorting()
	{
		Arrays.sort(num);  //API찾아보자~!  num 넘겨주면 알아서 다 기본 오름차순 정렬됨
		//내림차순은 어떻게 해야하는지 찾아보자!
	}

	

}

public class Test142
{
	public static void main(String[] args)
	{
		// Lotto 클래스 기반 인스턴스 생성
		Lotto lotto = new Lotto();

		// 기본 - 5게임
		for (int i=1; i<=5; i++)
		{
			lotto.start();

			for (int n : lotto.getNum())
			{
				System.out.printf("%4d",n);
			}
			System.out.println();
		}

	}
}
/*
   1   7   9  15  16  22
   8  18  26  32  34  43
   4  11  14  27  39  45
   3   7  14  18  27  39
   5   6  15  16  25  33
계속하려면 아무 키나 누르십시오 . . .
*/