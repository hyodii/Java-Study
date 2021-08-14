/* ====================================
■■■ 클래스와 인스턴스 ■■■
- 생성자(Constructor)
=======================================*/

class NumberTest2
{
	int num;

	NumberTest2(int n)
	{
		num = n;
		System.out.println("생성사 호출 시 매개변수 전달 : " + n);
	}

	int getNum()
	{
		return num;
	}

}

public class hyodii070
{
	public static void main(String[] args)
	{
		//NumberTest2 ob1 = new NumberTest2(); 에러남

		NumberTest2 ob1 = new NumberTest2(10);
		NumberTest2 ob2 = new NumberTest2(5214);
		System.out.println("메소드 반환 값 : " + ob2.getNum());
	}
}