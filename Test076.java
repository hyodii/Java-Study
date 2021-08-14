/* =====================
■■■ 배열 ■■■
- 배열의 선언과 초기화
- 배열의 기본적 활용
=========================*/

/*
『char』자료형의 배열을 만들어
그 배열에 각 방에 알파벳 대문자를 채우고
채워진 그 배열의 전체 요소를 출력하는 프로그램을 구현한다.
단, 채우는 구문과 출력하는 구문을 따로 분리하여 처리한다.

실행 예)
A B C D E F G ... W X Y Z
계속하려면 아무 키나 누르세요...
*/


public class Test076
{
	public static void main(String[] argss)
	{
		/*
		//영문 알파벳 대문자 배열 구성
		// 방법 1
		char[] arr1;
		arr1 = new int[26];
		arr1[0] = 'A';
		arr1[1] = 'B';
		arr1[2] = 'C';
		arr1[3] = 'D';
		arr1[4] = 'E';
		arr1[5] = 'F';
		arr1[6] = 'G';
		arr1[7] = 'H';
		arr1[8] = 'I';
		arr1[9] = 'J';
		arr1[10] = 'K';
		arr1[11] = 'L';
		arr1[12] = 'M';
		arr1[13] = 'N';
		arr1[14] = 'O';
		arr1[15] = 'P';
		arr1[16] = 'Q';
		arr1[17] = 'R';
		arr1[18] = 'S';
		arr1[19] = 'T';
		arr1[20] = 'U';
		arr1[21] = 'V';
		arr1[22] = 'W';
		arr1[23] = 'X';
		arr1[24] = 'Y';
		arr1[25] = 'Z';
		*/
	
		// 방법 2
		//char[] arr2 = {A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z};
		//char[] arr2 = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		
		
		
		// 방법 3  대문자 총갯수 26
		char[] arr = new char[26];

		
		
		for (int i=0, ch=65; i<arr.length ; i++, ch++) //for에는 여러개 가능 조건식은 2개이상은 논리연산 ----check~!! 
		{
			arr[i] = (char) ch;
				   //(char)(i+65); //arr 배열이 char형이니까 ----check~!!
				   //(char)i+65; 는 에러남
		}

		for (int i=0; i<arr.length;i++ )
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		
	}
}
/*
A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
계속하려면 아무 키나 누르십시오 . . .
*/
