/* =================================================
■■■ 자바 기본 프로그래밍 ■■■
- 자바의 기본 입출력 : System.in.read()
- print() / println() / printf()
===================================================*/

public class Test015
{
	public static void main(String[] args)
	{
		System.out.print("AAA");
		System.out.print("BBB");
		//System.out.print("CCC"\n);  -> 컴파일 에러발생(문자열 안에서 개행해야함!)
		System.out.print("CCC\n");

		System.out.println(); //개행
		//System.out.print(); // 에러 발생(컴파일 에러)

		System.out.printf("1234567890");
		System.out.printf("1234567890\n"); // \n개행
		System.out.printf("1234567890%n"); // %n개행

		//System.out.printf(); //에러 발생(컴파일 에러)

		System.out.printf("%d + %d = %d%n", 10, 20, 30);
		System.out.printf("%d\n",123);
		System.out.printf("%10d\n",123); // %10d -> 총 10자리 앞에 7자리 비우고 세자리 등장하는 개념
		System.out.printf("%8d\n", 1234); // %8d -> 총 8자리 앞에 4자리 비우고 4자기 등장
		System.out.printf("%010d\n",123); //%010d -> 총 10자리인데 앞에 0으로 채워짐
		/*
		123
		123
		1234
		0000000123
		계속하려면 아무 키나 누르십시오 . . .
		*/
		System.out.printf("%+d\n",365);
		System.out.printf("+%d\n",365); // 이 방법 쓰기를 권장!! 음수는 위에처럼 쓰면 에러남!!
		/*
		+365
        +365
		*/

		System.out.printf("%d\n",+365);
		// => 365

		// System.out.printf("-d%\n",365); -> 런타임 에러 발생
		System.out.printf("-%d\n",365);
		//-365
		System.out.printf("%d\n",-365);
		//-365

		System.out.printf("%(d\n",-365); //음수는 괄호안에
		//(365)
		System.out.printf("%(d\n",365);  //양수는 그냥 숫자
		//365

		//System.out.printf("%d\n",'A');
		// 런타임 에러 발생

		System.out.printf("%c\n",'A'); //%s는 문자열 %c는 문자!
		// A

		//System.out.printf("%c\n","ABCD");
		// -> 런타임 에러
		System.out.printf("%s\n","ABCD");
		// ABCD

		System.out.printf("%d\n",365);
		System.out.printf("%h\n",365);
		//16d(16진수)
		System.out.printf("%o\n",24);
		//30 (8진수)

		System.out.printf("%b\n",true);  //  true   vs  "true"    -> 앞음 boolean 뒤는 문자열
		//true (불린형은 %b)

		System.out.printf("%f\n",123.23);
		//123.230000 (소수점 이하 6자리까지 나옴)
		System.out.printf("%.2f\n",123.23);
		//123.23
		System.out.printf("%.2f\n",123.231);
		//123.23
		System.out.printf("%.2f\n",123.236);
		//123.24
		
		//System.out.printf("%.10d\n",123);  //이건 공간확보
		System.out.printf("%8.2f\n",123.236); // 공간 8칸 확보 그리고 소숫점 이하 두번째까지 표현 . 도 자리차지
		//  123.24 (공백2개)

		System.out.printf("%2.2f\n",123.236); // 내가 가지고있는 것보다 작은 자리수를 나타내면 무시되고 실행됨
		//123.24


	}
}
/* 실행 결과
AAABBBCCC

12345678901234567890
1234567890
10 + 20 = 30
123
       123
    1234
0000000123
+365
+365
365
-365
-365
(365)
365
A
ABCD
365
16d
30
true
123.230000
123.23
123.23
123.24
  123.24
123.24
계속하려면 아무 키나 누르십시오 . . .


*/