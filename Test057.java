public class Test057
{
	public static void main(String[] args)
	{
		 System.out.println("방법1 : i가 0부터 시작");
		 for (int i=0; i<5; i++) //행 수
		 {
			 for (int j=0; j<4-i; j++) //공백의 수 4 3 2 1 0
			 {
				 System.out.print("-");
			 }
			 for (int j=0; j<2*i+1;j++) //별의 수 1 3 5 7 9
			 {
				 System.out.print("*");
			 }
			 System.out.println();

		 }
		 System.out.println("방법2 : i가 1부터 시작");
		 for (int i=1; i<=5; i++) //행 수
		 {
			 for (int j=0; j<5-i; j++) //공백의 수 4 3 2 1 0
			 {
				 System.out.print("-");
			 }
			 for (int j=0; j<(2*i)-1;j++) //별의 수 1 3 5 7 9
			 {
				 System.out.print("*");
			 }
			 System.out.println();
		 }
	}
}
/*
방법1 : i가 0부터 시작
----*
---***
--*****
-*******
*********
방법2 : i가 1부터 시작
----*
---***
--*****
-*******
*********
계속하려면 아무 키나 누르십시오 . . .
*/
