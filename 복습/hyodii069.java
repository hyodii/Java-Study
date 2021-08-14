/* ====================================
■■■ 클래스와 인스턴스 ■■■
- 생성자(Constructor)
=======================================*/
class numberTest
{
	int n;

	numberTest()
	{
		n = 10;
		System.out.println("사용자 정의 생성자 호출");
	}

	int getN()
	{
		return n;
	}
}
public class hyodii069
{
	public static void main(String[] args)
	{
		numberTest ob = new numberTest();

		//ob.numberTest();  에러남

		System.out.println(ob.getN());  //()붙이기!!
		ob.n = 100;
		System.out.println(ob.getN());

		numberTest ob2 = new numberTest();
		int result = ob2.getN();
		System.out.println(result);
	}
}