/* =======================================================
■■■ 클래스와 인스턴스 ■■■
- 생성자(Constructor)와 초기화 블럭(Initialized Block)
==========================================================*/

public class hyodii073
{
	int n;
	int m;

	hyodii073()
	{
		n = 1000;
		m = 2000;
		System.out.println("생성자 실행...");
	}

	{
		n = 100;
		m = 200;
		System.out.println("초기화 블럭 실행...");
	}

	hyodii073(int n, int m)
	{
		this.n = n;
		this.m = m;
		System.out.println("매개변수가 있는 생성자 실행...");
	}
	
	void write()
	{
		System.out.println("n:" + n + ", m:" + m);
	}
	public static void main(String[] args)
	{
		hyodii073 ob1 = new hyodii073();
		ob1.write();

		hyodii073 ob2 = new hyodii073(1234,5678);
		ob2.write();
	}
}