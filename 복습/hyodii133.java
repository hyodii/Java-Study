public class hyodii133
{
	public static void main(String[] args)
	{
		String s = "seoul korea";
		System.out.println(s);
		// seoul korea

		// �� ���ڿ� ����
		System.out.println(s.substring(6,9));
		// kor

		System.out.println(s.substring(7));
		// orea
		
		// �� ���ڿ��� ������(��) ��
		System.out.println(s.equals("seoul korea"));
		System.out.println(s.equals("Souel korea"));
		// true
		// false
		//-- ��ҹ��� ����

		System.out.println(s.equalsIgnoreCase("Seoul KorEA"));
		// true

		System.out.println(s.indexOf("kor"));
		// 6

		System.out.println(s.indexOf("ea"));
		// 9

		System.out.println(s.indexOf("e"));
		// 1

		System.out.println(s.indexOf("tt"));
		// -1   '����' �� ��ȯ~!!


	}
}