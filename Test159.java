/*
Test159 클래스를 완성하여 다음 기능을 가진 프로그램을 구현한다.

실행 예)

		[메뉴 선택]
		1. 요소 추가
		2. 요소 출력
		3. 요소 검색
		4. 요소 삭제
		5. 요소 변경
		6. 종료
		>> 메뉴 선택(1~6) : 1

		1번째 요소 입력 : 떡볶이
		1번째 요소 입력 성공~!!!
		요소 입력 계속(Y/N)? : Y
		
		2번째 요소 입력 : 탕수육
		2번째 요소 입력 성공~!!!
		요소 입력 계속(Y/N)? n

		[메뉴 선택]
		1. 요소 추가
		2. 요소 출력
		3. 요소 검색
		4. 요소 삭제
		5. 요소 변경
		6. 종료
		>> 메뉴 선택(1~6) : 2

		[벡터 전체 출력]
			떡볶이
			탕수육
		벡터 전체 출력 완료~!!!

		[메뉴 선택]
		1. 요소 추가
		2. 요소 출력
		3. 요소 검색
		4. 요소 삭제
		5. 요소 변경
		6. 종료
		>> 메뉴 선택(1~6) : 3

		검색할 요소 입력 : 냉면

		[검색 결과 출력]
		항목이 존재하지 않습니다.

		[메뉴 선택]
		1. 요소 추가
		2. 요소 출력
		3. 요소 검색
		4. 요소 삭제
		5. 요소 변경
		6. 종료
		>> 메뉴 선택(1~6) : 3

		검색할 요소 입력 : 떡볶이

		[검색 결과 출력]
		항목이 존재합니다.

		[메뉴 선택]
		1. 요소 추가
		2. 요소 출력
		3. 요소 검색
		4. 요소 삭제
		5. 요소 변경
		6. 종료
		>> 메뉴 선택(1~6) : 4

		삭제할 요소 입력 : 그릭요거트

		[삭제 결과 출력]
		항목이 존재하지 않아 삭제할 수 없습니다.

		[메뉴 선택]
		1. 요소 추가
		2. 요소 출력
		3. 요소 검색
		4. 요소 삭제
		5. 요소 변경
		6. 종료
		>> 메뉴 선택(1~6) : 4

		삭제할 요소 입력 : 탕수육

		[삭제 결과 출력]
		서승균 항목이 삭제되었습니다.

		[메뉴 선택]
		1. 요소 추가
		2. 요소 출력
		3. 요소 검색
		4. 요소 삭제
		5. 요소 변경
		6. 종료
		>> 메뉴 선택(1~6) : 5

		변경할 요소 입력 : 밥

		[변경 결과 출력]
		변경할 대상이 존재하지 않습니다.

		[메뉴 선택]
		1. 요소 추가
		2. 요소 출력
		3. 요소 검색
		4. 요소 삭제
		5. 요소 변경
		6. 종료
		>> 메뉴 선택(1~6) : 5

		변경할 요소 입력 : 떡볶이
		수정할 내용 입력 : 치킨

		[변경 결과 출력]
		변경이 완료되었습니다.

		[메뉴 선택]
		1. 요소 추가
		2. 요소 출력
		3. 요소 검색
		4. 요소 삭제
		5. 요소 변경
		6. 종료
		>> 메뉴 선택(1~6) : 6

		프로그램 종료
	계속하려면 아무 키나 누르세요...


*/

import java.util.Vector;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Menus    //--완성
{
	public static final int E_ADD = 1;     //-- 요소 추가
	public static final int E_DISP = 2;    //-- 요소 출력
	public static final int E_FIND = 3;    //-- 요소 검색
	public static final int E_DEL = 4;     //-- 요소 삭제
	public static final int E_CHA = 5;     //-- 요소 변경
	public static final int E_EXIT = 6;    //-- 종료

}



public class Test159
{

	// 주요 속성 구성 -- 완성
	private static final Vector<Object> vt;
	private static BufferedReader br;
	private static Integer sel;         //-- 선택 값
	private static String con;	        //-- 계속 여부

	// static 초기화 블럭 -- 완성
	static
	{
		//Vector 자료구조 생성
		vt = new Vector<Object>();

		// BufferedReader 인스턴스 생성
		br = new BufferedReader(new InputStreamReader(System.in));

		// 사용자 입력값 초기화
		sel = 1;
		con = "Y";
	}

	//메뉴 출력 메소드
	public static void menuDisp()
	{
		System.out.println("\n\t[메뉴 선택]");
		System.out.println("\t1. 요소 추가");
		System.out.println("\t2. 요소 출력");
		System.out.println("\t3. 요소 검색");
		System.out.println("\t4. 요소 삭제");
		System.out.println("\t5. 요소 변경");
		System.out.println("\t6. 종     료");
		System.out.println();
		System.out.print("\t>> 메뉴 선택(1~6) : ");
	}

	// 메뉴 선택 메소드
	public static void menuSelect() throws IOException
	{
		
		do
		{
			//System.out.print("\t>> 메뉴 선택(1~6) : ");   //-- 여기에 해도 상관없음
			sel = Integer.parseInt(br.readLine());	
		}
		while (sel<1 || sel>6);
			
	}

	// 선택된 메뉴 실행에 따른 기능 호출 메소드
	public static void menuRun() throws IOException, NumberFormatException
	{
			/*
			if (sel ==1)	
			{
				addElement();
			}

			else if (sel ==2)
			{
				dispElement();
			}

			else if (sel ==3)
			{
				findElement();
			}
			else if (sel ==4)    
			{
				delElement();
			}
			else if (sel ==5)    
			{
				chaElement();
			}
			else if (sel ==6)    
			{
				exit();
			}
			*/
			switch (sel)
			{
				case Menus.E_ADD  : addElement(); break;
				case Menus.E_DISP : dispElement(); break;
				case Menus.E_FIND : findElement(); break;
				case Menus.E_DEL  : delElement(); break;
				case Menus.E_CHA  : chaElement(); break;
				case Menus.E_EXIT : exit(); break;     //만약 456을 안적으면 exit가 실행된다!
				default : System.out.println("\t >> 메뉴 선택 오류~!!!"); break;
			}

	}

	// 요소 추가(입력) 메소드
	public static void addElement() throws IOException
	{		
		do
		{
			System.out.printf("\t%d번째 요소 입력 : " ,vt.size()+1);     //check~!!    처음에는 요소가 없고
			String temp = br.readLine();
			vt.add(temp);    //--boolean 사용해도 됨! 확인!
			System.out.println();
			System.out.printf("\t%d번째 요소 입력 성공~!!!",vt.size());    //check~!!  여기선 추가요소가 있으니까!!!
			System.out.println();
			System.out.print("\t요소 입력 계속(Y/N)? : ");
			con = br.readLine().toUpperCase();  //check~!!
			//con = br.readLine()
		}
		//while (con != "n" || con != "N" || con != "y" || con != "Y");
		//while(con.equals("y") || con.equals("Y"));
		while(con.equals("Y"));  //.toUpperCase() 나 .toLowerCase()쓰면 하나만 쓰면됨~!

		System.out.println();

		//if(con.equals("y") || con.equals("Y"))
			//addElement();   //-- 재귀 함수
	}

	// 요소 출력 메소드
	public static void dispElement() 
	{
		System.out.println();
		// 벡터 자료구조 v 의 전체 요소 출력
		System.out.println("\t[백터 전체 출력]");
		for (int i=0; i<vt.size();i++)
			System.out.printf("%s\n", vt.get(i));	
		System.out.println("\t벡터 전체 출력 완료~!!!");

	}

	// 요소 검색 메소드
	public static void findElement() throws IOException
	{
		System.out.println();
		String temp = "";

		System.out.print("\t검색할 요소 입력 : ");
		temp = br.readLine();

		int i = vt.indexOf(temp);

		System.out.println("\t[검색 결과 출력]");
		if (i<0)
			System.out.println("\t항목이 존재하지 않습니다.");		
		else
			System.out.println("\t항목이 존재합니다.");		
	}

	// 요소 삭제 메소드
	public static void delElement() throws IOException
	{
		System.out.println();
		System.out.print("\t삭제할 요소 입력 : ");
		String temp = br.readLine();
		System.out.println();
		
		System.out.println("\t[검색 결과 출력]");
		if (vt.contains(temp))     
		{
			int i = vt.indexOf(temp);
			vt.remove(i);            //--boolean 사용해도 됨! 확인!
			System.out.printf("\t%s 항목이 삭제되었습니다.\n",temp);
		}
		else
			System.out.println("\t항목이 존재하지 않아 삭제할 수 없습니다.");

	}

	// 요소 수정(변경) 메소드
	public static void chaElement() throws IOException
	{
		System.out.println();
		System.out.print("\t변경할 요소 입력 : ");
		String temp = br.readLine();
		if (vt.contains(temp))     
		{
			System.out.print("\t수정할 내용 입력 :");
			String change = br.readLine();	
			int i = vt.indexOf(temp);
			vt.set(i, change);

			System.out.println();
			System.out.println("\t[변경 결과 출력]");
			System.out.println("\t변경이 완료되었습니다.");
		}
		else
		{
			System.out.println("\n\t[변경 결과 출력]");
			System.out.println("\t변경할 대상 존재하지 않습니다.");
		}
	}

	//프로그램 종료 메소드 -- 완성
	public static void exit()
	{
		System.out.println("\t프로그램 종료~!!!");
		System.exit(-1);
	}


	
	// main() 메소드 -- 완성
	public static void main(String[] args) throws IOException
	{
		do
		{
			menuDisp();
			menuSelect();
			menuRun();

		}
		while (true);
	}

}

/*
[메뉴 선택]
1. 요소 추가
2. 요소 출력
3. 요소 검색
4. 요소 삭제
5. 요소 변경
6. 종료

>> 메뉴 선택(1~6) : 1
1번째 요소 입력 : 정효진

1번째 요소 입력 성공~!!!
요소 입력 계속(Y/N)? : y
2번째 요소 입력 : 김효진

2번째 요소 입력 성공~!!!
요소 입력 계속(Y/N)? : n

[메뉴 선택]
1. 요소 추가
2. 요소 출력
3. 요소 검색
4. 요소 삭제
5. 요소 변경
6. 종료

>> 메뉴 선택(1~6) : 2

[백터 전체 출력]
정효진
김효진
벡터 전체 출력 완료~!!!
[메뉴 선택]
1. 요소 추가
2. 요소 출력
3. 요소 검색
4. 요소 삭제
5. 요소 변경
6. 종료

>> 메뉴 선택(1~6) : 3

검색할 요소 입력 : 정효진
[검색 결과 출력]
항목이 존재합니다.
[메뉴 선택]
1. 요소 추가
2. 요소 출력
3. 요소 검색
4. 요소 삭제
5. 요소 변경
6. 종료

>> 메뉴 선택(1~6) : 4

삭제할 요소 입력 : 정효진

[검색 결과 출력]
정효진 항목이 삭제되었습니다.
[메뉴 선택]
1. 요소 추가
2. 요소 출력
3. 요소 검색
4. 요소 삭제
5. 요소 변경
6. 종료

>> 메뉴 선택(1~6) : 5

변경할 요소 입력 : 김효진
수정할 내용 입력 :김연경

[변경 결과 출력]
변경이 완료되었습니다.
[메뉴 선택]
1. 요소 추가
2. 요소 출력
3. 요소 검색
4. 요소 삭제
5. 요소 변경
6. 종료

>> 메뉴 선택(1~6) : 2

[백터 전체 출력]
김연경
벡터 전체 출력 완료~!!!
[메뉴 선택]
1. 요소 추가
2. 요소 출력
3. 요소 검색
4. 요소 삭제
5. 요소 변경
6. 종료

>> 메뉴 선택(1~6) : 6
        프로그램 종료~!!!
계속하려면 아무 키나 누르십시오 . . .
*/
