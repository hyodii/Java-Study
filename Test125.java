/* ======================================
  ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
  - Object Ŭ����
=========================================*/

class NewCar
{
	private int velocity;    //-- �ڵ����� �ӵ�
	private int wheelNum;	 //-- �ڵ����� ���� ����
	private String carName;  //-- �ڵ����� �̸�


	NewCar(int speed, String name, int wheel)
	{
		velocity = speed;
		carName = name;
		wheelNum = wheel;
	}


}

public class Test125
{
	public static void main(String[] args)
	{
		//NewCar nCar1 = new NewCar();   //-- ��������� �����ڸ� ������ ���� �̷��� ����� ����
		NewCar nCar1 = new NewCar(100, "k5", 4);
		NewCar nCar2 = new NewCar(120, "�̴�����",4);

		// equals()
		System.out.println("1-1 : " + nCar1.equals(nCar2));
		System.out.println("1-2 : " + (nCar1 == nCar2));
		//--==>> 1-1 : false
		//		 1-2 : false
		//�ּҰ� �ٸ���!

		NewCar nCar3 = nCar1;  //-- ��ü ����  -> ���� �ǹ� ����(������)
							   //  -> �ּҰ� ����

		System.out.println("2-1 : " + nCar1.equals(nCar3));
		System.out.println("2-2 : " + (nCar1 == nCar3));
		//--==>> 2-1 : true
		//		 2-2 : true
		////�ּҰ� ����!

		// toString()
		System.out.println("3-1 : " + nCar1.toString());
		System.out.println("3-2 : " + nCar2.toString());
		System.out.println("3-3 : " + nCar3.toString());
		//--==>> 3-1 : NewCar@15db9742
		//		 3-2 : NewCar@6d06d69c
		//		 3-3 : NewCar@15db9742

		//hashCode()
		System.out.println("4-1 : "  + nCar1.hashCode());
		System.out.println("4-2 : "  + nCar2.hashCode());
		System.out.println("4-3 : "  + nCar3.hashCode());
		//--==>> 4-1 : 366712642
		//		 4-2 : 1829164700
		//		 4-3 : 366712642
		//-- ������� 16���� ���·� �ٲٰ� �Ǹ�
		//   ��toString���޼ҵ尡 ��ȯ�� ����� Ȯ�� ����


		//getClass()
		System.out.println("5-1 : " +nCar1.getClass());
		System.out.println("5-2 : " +nCar2.getClass());
		System.out.println("5-3 : " +nCar3.getClass());
		//--==>> 5-1 : class NewCar
		//		 5-2 : class NewCar
		//		 5-3 : class NewCar
		//-- ������ ��ü�� ���� 
		//	 ��� ���赵 Ŭ������ Ȯ���� ���ִ� ����� ���� �޼ҵ�

		

		// clone()       //-- ��ü ����

		// finalize()    // ��ü ����ȭ

		// ��Ÿ ������ �޼ҵ�� ������ ó���� ������ �ִ�.



	}
}