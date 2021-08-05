class SuperTest108
{
	protected double area;  // protected를 썻다!? -> 이거는 거의 상속을 염두해도 만들었다고 봐도 됨
	private String title;   // 프라이베잇은 자식이 접근을 못함!

	//부모 클래스의 인자없는 사용자 정의 생성자
	public SuperTest108()
	{
		System.out.println("SuperTest108... 인자 없는 생성자");
	}

	//부모 클래스의 문자열을 인자로 받는 사용자 정의 생성자
	public SuperTest108(String title)
	{
		this.title = title;
		System.out.println("SuperTest108... 문자열을 인자로 받는 생성자");
	}

	public void write()
	{
		System.out.println(title + " - " + area);
	}


	

}

// SuperTest108 클래스를 상속받는 자식 클래스
class Rect108  extends SuperTest108
{
	/* 이거 두개 상속받은것!!

	protected double area;  // protected를 썻다!? -> 이거는 거의 상속을 염두해도 만들었다고 봐도 됨
	

	public void write()
	{
		System.out.println(title + " - " + area);
	}

	*/
	
	private int w, h;  //w,h,area 가지고있는 변수 위에 상속까지

	//자식 클래스의 사용자 정의 생성자
	public Rect108()
	{
		// 자동으로 삽입
		//super();      //== SuperTest108();

		//super는 내가 속해있는 클래스 Rect108의 상속인 SuperTest108
	}

	public void calc(int w, int h)
	{
		this.w = w;
		this.h = h;
		//area = (double)this.w * h;// 이러면 매개변수 h이고 this.있으면 위에 private의 h
		area = (double)this.w * this.h;  //여기서 area는 물려받은 area
		//super.area = (double)this.w * this.h;  //라고 해도됨
		//this.area = (double)this.w * this.h;   //내가 가진 area라고 해도됨

		write();
	}

	@Override           //-- 어노테이션(annotation) - metadata - JDK 1.5 이상부터 지원됨
	public void write()
	{
		System.out.println("w : " + w + ", h : " + h);
		System.out.println("사각형 - " + area);
	}

	// ※ 메소드 오버라이딩(Method Overriding)

	//		상위 클래스(부모 클래스)를 상속받은 하위 클래스(자식 클래스)에서
	//		상위 클래스에 정의된 메소드를 다시 정의하는 것으로(재정의)
	//		객체 지향 프로그래밍의 특징인 다형성을 나타낸다.
	//		재정의(Overriding)는 반드시 상속 관계에 있어야 하며,
	//		메소드의 이름, 리던타입, 매개변수의 갯수나 타입이
	//		완전히 일치해야 한다.

	// 메소드 오버로딩은 가져가다 쓰는 것이고 메소드 오버라이딩은 가져다가 !덮어쓰는것!
}

// SuperTest108 클래스를 상속받는 자식 클래스
class Circle108  extends SuperTest108
{
	/* 이거 두개 상속받은것!!

	protected double area;  // protected를 썻다!? -> 이거는 거의 상속을 염두해도 만들었다고 봐도 됨
	

	public void write()
	{
		System.out.println(title + " - " + area);
	}

	*/
	
	/*
	// default생성자 -> 아래의 사용자 정의 생성자가 있기 때문에 생성자가 생기지 않음!!!
	public Circle108()
	{
		
	}
	*/
	
	//자식 클래스의 문자열을 인자로 받는 사용자 정의 생성자
	public Circle108(String title)
	{	//supet(); 가 자동으로 삽입되기 때문에 인자없는생성자가 호출되는데 밑에 써주면 문자열로 인자를받는 생성자 호출!	
		super(title);
	}

	
	public void calc(int r)
	{
		area = r * r * 3.141592;
		write();
	}
}

// main() 메소드를 포함하고 있는 외부의 다른 클래스
public class Test108
{
	public static void main(String[] args)
	{
		Rect108 ob1 = new Rect108();
		//--==>> SuperTest108... 인자 없는 생성자  

		//Circle108 ob2 = new Circle108();
		//--==>> 에러 발생(컴파일 에러)
		//-- 현재 Circle108 클래스에는
		//	 매개변수를 필요로 하는 사용자 정의 생성자가 만들어져 있으며
		//   이로 인해 default 생성자가 자동으로 삽입되지 않은 상황.

		Circle108 ob2 = new Circle108("원");
		//--==>> SuperTest108... 문자열을 인자로 받는 생성자
	}
}
