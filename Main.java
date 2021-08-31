public class Main
{
	public static void main(String[] args)
	{
			String str = "123::4:67:10::::";
			String[] noLimit = str.split(":");
			String[] limitTwo = str.split(":",2);
			String[] limitSeven = str.split(":",7);
			String[] limitZero = str.split(":",0);
			String[] limitMinus = str.split(":",-1);

			System.out.println("------noLimit-------");
			for (int cnt=0; cnt<noLimit.length; cnt++)
				System.out.println(cnt + "위치 : " + noLimit[cnt]);

			System.out.println("------limitTwo-------");
			for (int cnt=0;cnt<limitTwo.length; cnt++)
				System.out.println(cnt + "위치 : " + limitTwo[cnt]);

			System.out.println("------limitSeven-------");
			for (int cnt=0;cnt<limitSeven.length; cnt++)
				System.out.println(cnt + "위치 : " + limitSeven[cnt]);

			System.out.println("------limitZero-------");
			for(int cnt=0; cnt<limitZero.length; cnt++)
				System.out.println(cnt + "위치 : " + limitZero[cnt]);

			System.out.println("------limitMinus-------");
			for(int cnt=0; cnt<limitMinus.length;cnt++)
				System.out.println(cnt + "위치 : " + limitMinus[cnt]);
	}
}
/*
------noLimit-------
0위치 : 123
1위치 :
2위치 : 4
3위치 : 67
4위치 : 10
------limitTwo-------
0위치 : 123
1위치 : :4:67:10::::
------limitSeven-------
0위치 : 123
1위치 :
2위치 : 4
3위치 : 67
4위치 : 10
5위치 :
6위치 : ::
------limitZero-------
0위치 : 123
1위치 :
2위치 : 4
3위치 : 67
4위치 : 10
------limitMinus-------
0위치 : 123
1위치 :
2위치 : 4
3위치 : 67
4위치 : 10
5위치 :
6위치 :
7위치 :
8위치 :
계속하려면 아무 키나 누르십시오 . . .
*/
