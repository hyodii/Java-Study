/* ====================================
���� Ŭ������ �ν��Ͻ� ����
- ������(Constructor)
=======================================*/
class numberTest
{
	int n;

	numberTest()
	{
		n = 10;
		System.out.println("����� ���� ������ ȣ��");
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

		//ob.numberTest();  ������

		System.out.println(ob.getN());  //()���̱�!!
		ob.n = 100;
		System.out.println(ob.getN());

		numberTest ob2 = new numberTest();
		int result = ob2.getN();
		System.out.println(result);
	}
}