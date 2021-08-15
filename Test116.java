// 인터페이스
interface ADemo
{
	public void write();
}

// 인터페이스
interface BDemo
{
	public void print();
}

// ※ 클래스는 다중 상속을 지원하지 않지만,
//	  인터페이스는 다중 상속을 지원한다.

// 두 인터페이스(ADemo,BDemo)를 상속받은 인터페이스
interface CDemo extends ADemo, BDemo
{
	//public void write();
	//public void print();

	public void test();
}

// 클래스
// class Demoimpl
//	↓
// 추상 클래스 - CDemo 인터페이스를 구현하는 추상 클래스
// 두 인터페이스(ADemo,BDemo)를 상속받은 인터페이스(CDemo)를 구현한 추상 클래스
//abstract class DemoImpl implements CDemo
//	↓
// 두 인터페이스(ADemo,BDemo)를 상속받은 인터페이스(CDemo)를 구현한 후 모든 메소드를 재정의한 클래스
class DemoImpl implements CDemo
{
	@Override
	public void test()
	{
		System.out.println("test()...");
	}
	
	@Override
	public void write()
	{
		System.out.println("write()...");
	}
	
	@Override
	public void print()
	{
		System.out.println("print()...");
	}
}

// main()메소드를 포함하고 있는 외부의 다른 클래스
public class Test116
{
	public static void main(String[] args)
	{
		// 두 인터페이스르 상속받은 인터페이스를 구현하고
		// 모든 메소드를 재정의한 클래스에 대한 인스턴스 생성
		DemoImpl ob = new DemoImpl();

		ob.test();
		ob.write();
		ob.print();
	}
}

/*
test()...
write()...
print()...
계속하려면 아무 키나 누르십시오 . . .
*/
