class SuperTest108
{
	protected double area;
	private String title;

	public SuperTest108()
	{
		System.out.println("SuperTest108... 인자 없는 생성자");
	}

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

class Rect108 extends SuperTest108
{
	private int w, h;  // w, h, area
	
	public Rect108()
	{
		//super();  //자동으로 삽입
	}

	public void calc(int w, int h)
	{
		this.w = w;
		this.h = h;
		area = (double)this.w * this.h;

		write();
	}

	@Override
	public void write()
	{
		System.out.println("W: " + w + ", h : " + h);
		System.out.println("사각형 - " + area);
	}
}//end class Rect108

class Circle108 extends SuperTest108
{
	public Circle108(String title)
	{
		super(title);
	}

	public void calc(int r)
	{
		area = r * r * 3.141592;
		write();
	}
}

public class hyodii108
{
	public static void main(String[] args)
	{
		Rect108 ob1 = new Rect108();
		
		ob1.calc(10,20);
		//--==>>SuperTest108... 인자 없는 생성자
		//		W: 10, h : 20
		//		사각형 - 200.0

		Circle108 ob2 = new Circle108("원의 널이를 구해보자!");
		ob2.calc(11);
		//--==>>SuperTest108... 문자열을 인자로 받는 생성자
		//		원의 널이를 구해보자! - 380.132632
		
	}
}