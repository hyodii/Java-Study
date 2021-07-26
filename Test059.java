public class Test059
{
	public static void main(String[] args)
	{
		for (int i=1; i<=5; i++)         //행의 갯수 1 2 3 4 5
		{
				for (int j=0; j<5-i;j++)       //5행까지의 공백 수 4 3 2 1 0
				{
					System.out.print("-");
				}
				for (int j=0;j<(2*i)-1;j++)    //5행까지의 별의 수  1 3 5 7 9
				{
					System.out.print("*");
				}
				System.out.println();
				
		}//end 첫 번째 for
		 
		for (int i=4; i>0;i--)          //행의 갯수 1 2 3 4 
		{
			for (int j=0;j<5-i;j++)                     //6행부터 공백 수 1 2 3 4
				{
					System.out.print("-");
				}
				for (int j=0;j<(2*i)-1;j++)                     //6행부터 별의 수 7 5 3 1
				{
					System.out.print("*");
				}
				System.out.println();
		}//end 두 번째 for
				
			
	
	}//end main
}//end 클래스
/*
----*
---***
--*****
-*******
*********
-*******
--*****
---***
----*
계속하려면 아무 키나 누르십시오 . . .
*/
