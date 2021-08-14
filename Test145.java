/* ======================================
  ■■■ 예외(Exception) 처리 ■■■
=========================================*/

//Test144같은데 try-catch사용 -> 내부적으로 예외를 잡아버려서 throws IOException을 메인에 안해도 됨!!

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test145
{

	private String[] date = new String[3];


	public void proc() //throws IOException  //-- readLine() 때문에 throws 입력!
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str;
		int n = 0;

		try
		{
			System.out.print("이름 입력(종류:ctrl+z) : ");

		
			//   원래는 오른쪽부터인데 괄호로 묶은것 먼저
			while ((str = br.readLine()) != null)         //-- readLine() 때문에 throws 안해주면 에러 발생!
			{                         //-------- == ctrl+z 
				date[n++] = str;
				System.out.print("이름 입력(종류:ctrl+z) : ");
			}

			System.out.println("입력된 내용...");
			for(String s : date)
			{
				if(s != null)
				{
					System.out.println(s);
				}
			}
		}
		catch (IOException e)
		{
			System.out.println(e.toString());
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("예외 발생~!!!");
			System.out.println("getMessage : " + e.getMessage());
			System.out.println("toString   : " + e.toString());
			System.out.println("printStackTrace...........");
			System.out.println();

			//이름 입력(종류:ctrl+z) : 정효진
			//이름 입력(종류:ctrl+z) : 김효진
			//이름 입력(종류:ctrl+z) : 박효짐
			//이름 입력(종류:ctrl+z) : 마효진
			//예외 발생~!!!
			//getMessage : 3
			//toString   : java.lang.ArrayIndexOutOfBoundsException: 3
			//printStackTrace...........

			//계속하려면 아무 키나 누르십시오 . . .
		}

		
	}

	public static void main(String[] args) //throws IOException
	{
		Test145 ob = new Test145();
		ob.proc();
	}
}

