/* ======================================
  ■■■ 자바의 주요(중요) 클래스 ■■■
  - Wrapper(래퍼) 클래스
=========================================*/

public class Test127
{
	public static void main(String[] args)
	{
		/*
		boolean bi = true;                   //1 byte 기본 자료형
		Boolean wrapBi = new Boolean(bi);    // 불린 클래스타임의 객체 형식
		Boolean wBi = bi;                    //--(오토 박싱) 원칙적으로 기본형에 객체를 넣는거 안되는데 이제 된다! 

		int ni = 300;
		Integer wrapNi = new Integer(ni);
		int ni2 = wrapNi;                   //-- (오토 언박싱) 

		float fi = 300.3f;
		Float wrapFi = new Float(fi);       

		System.out.println(wrapBi.toString());     //-- 객체형식
		System.out.println(wrapNi.toString());     //-- 객체형식
		System.out.println(wrapFi.toString());     //-- 객체형식
		//--==>> true
		//		 300
		//		 300.3

		System.out.println(wrapBi);
		System.out.println(wrapNi);
		System.out.println(wrapFi);
		//--==>> true
		//		 300
		//		 300.3
		
		int ni 겹치니까 잠시 주석처리 */


		// Integer 클래스
		String sn = "12";
		int ni = Integer.parseInt(sn);
		System.out.printf("ni : %3d\n", ni);
		//--==>> ni :  12

		ni = Integer.parseInt("0101",2);     //--매개변수가 2개인 parseInt도 있다.  오버로딩
		System.out.printf("ni : %3d\n",ni);
		//--==>> ni :   5
		
		ni = Integer.parseInt("12",8);
		System.out.printf("ni : %3d\n",ni);
		//--==>> ni :  10

		ni = Integer.parseInt("A",16);
		System.out.printf("ni : %3d\n",ni);
		//--==>  ni :  10

		sn = Integer.toBinaryString(20);         //2진수
		System.out.printf("sn : %s\n",sn);
		//--==>> sn : 10100

		sn = Integer.toHexString(31);         //16진수
		System.out.printf("sn : %s\n",sn);
		//--==>> sn : 1f

		sn = Integer.toOctalString(31);         //8진수
		System.out.printf("sn : %s\n",sn);
		//--==>> sn : 37

		Integer num = new Integer(50);
		System.out.println(num.toString());
		//--==>> 50

		int n3 = 345;
		Integer n4 = Integer.valueOf(n3);
		System.out.println(n4);
		//--==>> 345

	}
}