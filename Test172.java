// Reader Writer 실습

import java.io.InputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class Test172
{
	public void process(InputStream is)   //InputStream  바이트기반의 입력 스트림
	{ 
		int data;

		System.out.println("문자열 입력(종료 : Ctrl+z)");

		try
		{
			//매개변수 is 라는 바이트기반 객체(InputStream)fmf
			//문자 스트림으로 변환하여
			//(-> InputStreamReader 가 수행)
			//Reader 타입의 rd 에서 참조할 수 있도록 처리
			Reader rd = new InputStreamReader(is);   //is 는 System.in으로 넘겨준 InputStream 을 번역해서(인풋 스트림리더) 문자열로

			
			//바이트 기반 스트림인 자바 기본 출력 스트림(System.out)을
			//문자 스트림으로 변환하여
			//(-> OutputStreamWriter 가 수행)
			//Writer 타입의 wt 에서 참조할 수 있도록 처리
			Writer wt = new OutputStreamWriter(System.out);     //아웃풋스트림롸이터 바이트기반을 문자기반으로 바꿔주는 것

			while ( (data = rd.read()) != -1)
			{
				wt.write(data);   //-- 스트림 물줄기에 기록             //출력스트림을 쓰겠다  문자열기반
				wt.flush();       //-- 기록한 스트림을 밀어내어 내보냄  //출력스트림을 밀어내겠다 문자열기반
			}


		}
		catch (IOException e)
		{
			System.out.println(e.toString());
		}
	}


	public static void main(String[] args)
	{
		Test172 ob = new Test172();
		ob.process(System.in);   //System.in 바이트기반의 입력 스트림
	}
}

/*
문자열 입력(종료 : Ctrl+z)
abcd
abcd
1234
1234
가나다라
가나다라
^Z
계속하려면 아무 키나 누르십시오 . . .
*/
