/* =============================================
���� Ŭ���� ��� ����
- ��ø Ŭ����   (�ǹ����� ������ ���� ���� ^__^ ~)
================================================*/

//outer
class InnerOuterTest
{
	static int a = 10;
	int b = 20;

	//inner
	class InnerNested
	{
		int c = 30;

		void write()
		{
			System.out.println("inner�� write()...");
			System.out.println("a : " + a);
			System.out.println("b : " + b);
			System.out.println("b : " + c);
		}

		
	}// end class InnerNested

	void write()
		{
			System.out.println("outer�� write()...");
			InnerNested ob1 = new InnerNested();
			ob1.write();
		}

}// end class InnerOuterTest


// main() �޼ҵ带 �����ϰ� �ִ� �ܺ��� �ٸ� Ŭ����
public class Test120
{
	public static void main(String[] args)
	{
		//outer�� �ν��Ͻ� ����
		InnerOuterTest ob2 = new InnerOuterTest();          //-- �տ��� �� ����ó�� Ȯ���� �� ����~!!
		ob2.write();   //-- outer��  write() �޼ҵ� ȣ��


		// Test118.java���� ������ ������� �õ�  // static�� �پ��ִ� �����̿��� ����
		//InnerOuterTest.InnerNested ob3 = new InnerOuterTest.InnerNested();
		//--==>> ���� �߻� (������ ����)    


		// �Ϲ����� �ν��Ͻ� ���� ������� �õ�  // �Ϲ����� �ν��Ͻ� ���������ε� �ȴ�
		//InnerNested ob4 = new InnerNested();
		//--==>> ���� �߻� (������ ����)     

		// �� ��ø ���� Ŭ����(static ��ø Ŭ����) �ʹ� �޸�
		//	  �ܺ� Ŭ������ �ν��Ͻ�(��ü)�� ������� �ʰ�
		//	  �ܵ����� ���� Ŭ������ �ν��Ͻ� �����ϴ� ���� �Ұ����ϴ�.

		// �׷��� �ܺ�Ŭ���� �ν��Ͻ��� ����ϸ� ���� Ŭ���� �ν��Ͻ� ������ �����ϴٴ� ��~!!

		// ��  check~!!!
		// ��  test118.java ���ϰ� ���� ��~!!!

		// ��new InnerOuterTest().new InnerNested();��                  //--check~!!!! �� �� ����ϱ� ��
		
		InnerOuterTest.InnerNested ob5 = ob2.new InnerNested();
		ob5.write();
		//--==>>inner�� write()...
		//		a : 10
		//		b : 20
		//		b : 30

		InnerOuterTest.InnerNested ob6 = new InnerOuterTest().new InnerNested();
		ob6.write();
		//--==>>inner�� write()...
		//		a : 10
		//		b : 20
		//		b : 30

		/*
		outerŬ������.innerŬ������ ���������� = new outer������().new inner������();
		*/

		// cf) static -> ��ø ���� Ŭ����
		// Test.StaticNested ob = new Test.StaticNested();

		// outerŬ������.innerŬ������ ���������� = new outerŬ������.inner������();
	}
}

