/* ====================================
■■■ 클래스와 인스턴스(instance) ■■■
=======================================*/
// 직사각형 클래스 설계
/*
직사각형의 넓이와 둘레 계산, 클래스로 표현

가로 입력 : 10
세로 입력 : 20
가로 : 10
세로 : 20
넓이 : 200
돌레 : 60
계속하려면 아무 키나 누르십시오 . . .
*/

import java.util.Scanner;

class Rect
{
	int w,h;

	void input()  //입력만 받고 반환값(return)이 없으니까 void
		{
			Scanner sc = new Scanner(System.in);
			System.out.print("가로 입력 : ");
			w = sc.nextInt();
			System.out.print("세로 입력 : ");
			h = sc.nextInt();
		}

		int calArea()
		{
			int res=0;
			res = w * h;
			return res;
		}

		int calLength()
		{
			int res = 0;
			res = (w + h) * 2;
			return res;
		}

		void print(int a,int l)
		{
			System.out.println("가로 : " + w);
			System.out.println("세로 : " + h);
			System.out.println("넓이 : " + a);
			System.out.println("둘레 : " + l);
		}

}

public class hyodii065
{
	public static void main(String[] args)
	{
		Rect ob = new Rect();

		ob.input();

		int a = ob.calArea();
		int l = ob.calLength();

		ob.print(a,l);
	}
}
/*
가로 입력 : 50
세로 입력 : 2
가로 : 50
세로 : 2
넓이 : 100
둘레 : 104
계속하려면 아무 키나 누르십시오 . . .
*/