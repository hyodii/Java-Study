public class Test058
{
	public static void main(String[] args)
	{
		for (int i=1; i<=5; i++)              //행 수 1 2 3 4 5
		{
			for (int j=0; j<i-1;j++ )    //공백의 갯수 0 1 2 3 4
			{
				System.out.print("-");
				
			}
			
			for (int j=9; j>=(2*i)-1; j--) //별의 갯수 9 7 5 3 1
			{
				System.out.print("*");
			}
			System.out.println();	
		}
		
	}
}
/*
*********
-*******
--*****
---***
----*
계속하려면 아무 키나 누르십시오 . . .
*/
