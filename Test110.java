/* ======================================
���� Ŭ���� ��� ����
- ���(Inheritance)
=========================================*/

/*
�� �޼ҵ� �������̵�(Method Overriding)�� Ư¡

	- �޼ҵ� �̸�, ����Ÿ��, �Ķ���� ���� Ÿ���� ������ ��ġ�ؾ� �Ѵ�.
	- �ݵ�� ��� ���谡 �־�� �Ѵ�.
	- �����ǵ� ���� Ŭ������ �޼ҵ� �������������ڴ�
	  ���� Ŭ������ �޼ҵ� �������������ں��� ������ ũ�ų� ���ƾ� �Ѵ�.
	  ���� ���, ���� Ŭ���� �޼ҵ��� �������������ڰ� ��protected���� ���
	  ���� Ŭ������ �� �޼ҵ带 �������̵�(Overriding)�ϴ� ���
	  �������������ڴ� ��protected�� �Ǵ� ��public���̾�� �Ѵ�.
	- ��static��,��final��,��private�� �޼ҵ�� �������̵�(Overriding)�� �� ����.
	- Exception�� �߰��� �Ұ����ϴ�.
	  ��, ���� Ŭ������ �޼ҵ尡 ������ �ִ� ���� ���� ���׿�
	  ���ο� Exception �� �߰��ϴ� ���� �Ұ����ϴٴ� ���̴�.

	  -> @Override
	  	 void �޼ҵ�(int n) throws IOException, A   �Ұ���!!
		 								      ----
 */


// �θ� Ŭ����(���� Ŭ����, super class)
class SuperTest110
{
	private int a = 5;
	protected int b = 10;
	public int c = 20;

	public void write()
	{
		System.out.println("Super...write() : " + a + " : " + b + " : " + c);
		//System.out.println("Sub...print() : " + b + " : " + c);
	}
}

// �ڽ� Ŭ����(���� Ŭ����, sub class)
class SubTest110 extends SuperTest110
{
	protected int b = 100;

	public void print()
	{
		//System.out.println("Sub...print() : " + a + " : " + b + " : " + c);
		//--==>> ���� �߻�(������ ����)
		//-- ���� Ŭ�������� ����� ���� a ���� ������ �� ����.
		// -> private �����̱� ������....

		System.out.println("1 Sub...print() : " + b + " : " + c);

		System.out.println("2 Sub...print() : " + b);
		System.out.println("3 Sub...print() : " + this.b);
		System.out.println("4 Sub...print() : " + super.b);
		//-- ���� b�� ���� ����� ���� �ٸ� b�� ���� �� ����� �̷������.
		//		���� Ŭ�������� ����� b, ���� Ŭ�������� ����� b

		System.out.println("5 Sub...print() : " + c);
		System.out.println("6 Sub...print() : " + this.c);
		System.out.println("7 Sub...print() : " + super.c);
		//-- ���� c �� �����ϴµ� �ƹ��� ����� ������ ����.
		//   ���� Ŭ�������� ����� c
	}

	@Override
	public void write()
	{
		//System.out.println("Sub...write() : " + a + " : " + b + " : " + c);
		//-- �̷��� ������
		//-- �������̵��ϸ� ���̻� �θ�޼ҵ尡 �ƴϰ� ���� ����� ��!!
		//--==>> ���� �߻�(������ ����)
		//-- ���� Ŭ�������� ����� ���� a ���� ������ �� ����.
		// -> private �����̱� ������....
		System.out.println("Override Sub...write() : " + b + " : " + c);
		// a �� �������!

	}
}

public class Test110
{
	public static void main(String[] args)
	{
		// ���� Ŭ����(SubTest110) �ν��Ͻ� ����
		SubTest110 ob = new SubTest110();

		ob.print();
		//--==>> Sub...print() : 100 : 20

		ob.write();
		//--==>> Sub...print() : 5 : 10 : 20

		System.out.println("-------------------------------------------------���м�");

		System.out.println(ob.b);  
		//--==>> 100

		System.out.println(ob.b);  //�θ�κ��� �������� ��ü(10)�� �ܺ�Ŭ���������� �ҷ��ü�������?
		System.out.println(((SuperTest110)ob).b); 
		//--==>> 10
		// �ؽ��� �θ���  (��ȣ check~!!!)

		((SuperTest110)ob).write();
		//--==>> Override Sub...write() : 100 : 20
		// �� �޼ҵ�� ������ ��~!!! �����Ͽ� ������ ��!!!!


	}
}