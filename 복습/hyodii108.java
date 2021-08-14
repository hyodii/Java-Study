class SuperTest108
{
	protected double area;
	private String title;

	public SuperTest108()
	{
		System.out.println("SuperTest108... ���� ���� ������");
	}

	public SuperTest108(String title)
	{
		this.title = title;
		System.out.println("SuperTest108... ���ڿ��� ���ڷ� �޴� ������");
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
		//super();  //�ڵ����� ����
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
		System.out.println("�簢�� - " + area);
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
		//--==>>SuperTest108... ���� ���� ������
		//		W: 10, h : 20
		//		�簢�� - 200.0

		Circle108 ob2 = new Circle108("���� ���̸� ���غ���!");
		ob2.calc(11);
		//--==>>SuperTest108... ���ڿ��� ���ڷ� �޴� ������
		//		���� ���̸� ���غ���! - 380.132632
		
	}
}