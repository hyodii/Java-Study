/* ===========================================
  ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
  - StringBuffer Ŭ���� 
==============================================*/

public class Test135
{
	public static void main(String[] args)
	{
		String s1 = "123456789";
		s1 = (s1 + "123").replace('2','A');
		//"123456789"
		//"123456789123"
		//"1A34567891A3"
		System.out.println(s1);
		//--==>> 1A34567891A3

		
		StringBuffer s2 = new StringBuffer("123456789");
		s2.delete(0,3).replace(1,3,"24").delete(4,6);
		//"123456789"
		//"123456789".delete(0,3).replace(1,3,"24").delete(4,6);
		//"456789".replace(1,3,"24").delete(4,6);
		//"456789".replace(1,3,"24").delete(4,6);
		//                 ---���ؽ� 1��°~3��°������ 24�� �ٲ��
		//"424789".delete(4,6);
		//"4247"

		System.out.println(s2);
		//--==>> 4247

		StringBuffer s3 = new StringBuffer("123456789");
		String s4 = s3.substring(3,6);
		//"123456789".substring(3,6);
		// "456"
		System.out.println(s4);
		//--==>> 456

		StringBuffer s5 = new StringBuffer("123456789");                            //-- check~!! ����~!!
		s5.delete(0,3).delete(1,3).delete(2,5).insert(1,"24");
		//123456789.delete(0,3).delete(1,3).delete(2,5).insert(1,"24");
		//456789.delete(1,3).delete(2,5).insert(1,"24");
		//4789.delete(2,5).insert(1,"24");
		//47.insert(1,"24");
		//4247
		System.out.println(s5);
		//--==>> 4247



	}
}