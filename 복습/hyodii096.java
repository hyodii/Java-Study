public class hyodii096
{
	static int a = 10;

	int b = 20;

	void write()
	{
		System.out.println("클래스 변수 a : " + a);
		System.out.println("인스턴스 변수 b : " + b);
	}

	static void print()
	{
		System.out.println("클래스 변수 a : " + a);  
		//System.out.println("인스턴스 변수 b : " +b); //접근 불가능
	}


	public static void main(String[] args)
	{
		System.out.println("main() -> 클래스 변수 a : " + hyodii096.a);

		System.out.println("main() -> 클래스 변수 a : " + a);
		
		hyodii096.print();
		print();

		//System.out.println("main() -> 인스턴스 변수 b : " + b);  //접근 불가능
		//hyodii096.write();  //접근 불가능
		
		hyodii096 ob = new hyodii096();
		System.out.println("main() -> 인스턴스 변수 b : " + ob.b);

		ob.write();

		System.out.println("main() -> 클래스 변수 a : " +ob.a);

		ob.print();

		//3가지 방법 --- 2번째가 일반적임
		System.out.println("main() -> 클래스 변수 a : " + a);
		System.out.println("main() -> 클래스 변수 a : " + hyodii096.a);
		System.out.println("main() -> 클래스 별수 a : " + ob.a);


		hyodii096 ob2 = new hyodii096();

		ob2.a = 10000;
		ob2.b = 20000;

		System.out.println("ob2확인 ---------------------------");
		ob2.write();
		ob2.print();

		System.out.println();
		System.out.println("ob확인 ---------------------------");
		ob.write();
		ob.print();
	}
}