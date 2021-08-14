/* ======================================
  ■■■ 예외(Exception) 처리 ■■■
=========================================*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test144 
{

	private String[] date = new String[3];


	public void proc() throws IOException  //-- readLine() 때문에 throws 입력!
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str;
		int n = 0;

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

	public static void main(String[] args) throws IOException
	{
		Test144 ob = new Test144();
		ob.proc();
	}
}


// 배열이 3갠데 4개 넣으려고하니까 에러발생 -> 이건 unchecked excepion