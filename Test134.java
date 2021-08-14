/* ===========================================
  ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
  - StringBuffer Ŭ���� 
==============================================*/

// �ӽ÷� ���� ���ֵ� ������ ����!

// ���ڿ��� �ٷ�� Ŭ������ String / StringBuffer / StringBuilder
//							--���ϰ�  ---��� ����   ---���� ����

/*
�� StringBuffer Ŭ������ ���ڿ��� ó���ϴ� Ŭ������
	String Ŭ�������� ��������
	String Ŭ������ ���� ���ڿ� �������� ������ �Ұ���������
	StringBuffer Ŭ������ ���ڿ��� ����� ��
	���� ���ڿ��� ���� �ܰ�(��Ÿ�� ����)���� ������ �� �ִ�.

	��, StringBuffer ��ü�� �������� ���̸� �����Ƿ�
	��ü�� �����ϴ� �������� �̸� �� ũ�⳪ ���� �����ϰų�
	���� ������ ������ ũ�⸦ �ٲ� �� �ִ� ����� �����Ѵ�.

	����, JDK 1.5 ���ĺ��ʹ�
	���ڿ��� ó���ϴ� StringBuilder��� Ŭ������ �����Ѵ�.
	StringBuilder Ŭ������ ����� StringBuffer Ŭ������ ����������
	���� ū �������� multi-thread unsafe ��� ���̴�.
	��, Syncronization �� ���� ������
	StringBuffer ���� ������ ���ü�(����ȭ) ������ ���ٸ�
	StringBuilder�� ����ϴ� ���� ������ ����ų �� �ִ�.
*/

public class Test134
{
	public static void main(String[] args)
	{
		StringBuffer sb1 = new StringBuffer("korea");
		StringBuffer sb2 = new StringBuffer("korea");
		
		System.out.println(sb1 == sb2);
		System.out.println(sb1.equals(sb2));
		//--==>> false
		//--==>> false
		// StringBuffer�� ���� �ּҰ� ��!
		// String�̾��ٸ� equals�� ���� true�� ���� => StringBuffer�� �������̵� ���� �ʾҴ�.

		System.out.println(sb1);
		//                 ---- �̸�ŭ�� StringBufferŸ��
		//--==>> korea
		// toString�� �������̵� �ߴ�!

		System.out.println(sb1.toString());
		//                ---------------  �̸�ū�� ���ڿ�
		//--==>> korea

		System.out.println(sb1.toString().equals(sb2.toString()));
		//--==>> true
		// ���⼭ �� equals�� String�� equals ���� �� StringBuffer�� equals

		StringBuffer sb3 = new StringBuffer();
		//-- StringBuffer �⺻ ������ ȣ�� �� (�ν��Ͻ� ���� ����)
		//	 �⺻������ �����Ǵ� ���� ũ��� ��16��

		// capacity()
		System.out.println("���� ũ�� : " + sb3.capacity());
		//--==>> ���� ũ�� : 16

		////////////////////////////////////////////////////////////////////

		System.out.println(sb3);
		//--==>> ��

		String name = "ȫ�浿";
		name += "�̼���";
		name += "������";
		System.out.println(name);
		//--==>> ȫ�浿�̼��Ű�����

		sb3.append("seoul");  //sb3 += "seoul"
		sb3.append("korea");
		sb3.append("�츮����");
		sb3.append("���ѹα�");

		System.out.println(sb3);
		System.out.println(sb3.toString());
		//--==>> seoulkorea�츮������ѹα�
		//		 seoulkorea�츮������ѹα�


		System.out.println("����ũ�� : " + sb3.capacity());
		//--==>> ����ũ�� : 34
		//������ ũ��� �ѱ��ھ� �þ�� ���� �ƴϴ�!!(���ڼ� 18)

		/////////////////////////////////////////////////////////////////////////

		String temp1 = "java and oracle";
		System.out.println(temp1.toUpperCase());
		//--==>> JAVA AND ORACLE   //�빮�ڷ� ��ȯ�ϴ� �޼ҵ�~_~

		String temp2 = "JAVA AND ORACLE";
		System.out.println(temp2.toLowerCase());
		//--==>> java and oracle

		//System.out.println(sb3.toUpperCase());
		//dSystem.out.println(sb3.toUpperCase());
		//--==>> ���� �߻�(������ ����)
		// sb3�� StringBuffer���� String Ŭ�������� ���������� String Buffer���� �������� ����

		String temp3 = sb3.toString();
		System.out.println(temp3.toUpperCase());
		//--==>> SEOULKOREA�츮������ѹα�


		// sb3�� ���� seoulkorea�츮������ѹα� �������!
		System.out.println(sb3);
		//--==>> seoulkorea�츮������ѹα�

		// �� ��� ���ڿ�(sb3) �� seoul �տ�
		//		��"�ѱ�"���̶�� ���ڿ� �߰�
		sb3.insert(0,"�ѱ�");
		System.out.println("seoul �տ� ���ѱ��� �߰� : " + sb3.toString());
		//--==>> seoul �տ� ���ѱ��� �߰� : �ѱ�seoulkorea�츮������ѹα�

		// sb3�� �ѱ�seoulkorea�츮������ѹα�

		// �� ��� ���ڿ�(sb3) �� korea ���ڿ� �ڿ�
		//		��"���"���̶�� ���ڿ� �߰�
		//		��, ��� ���ڿ��� �ε����� ���� Ȯ������ ����...

		
		// �׽�Ʈ1 - ���� sb3
		System.out.println(sb3.toString());
		//--==>> �ѱ�seoulkorea�츮������ѹα�

		// �׽�Ʈ2 - �̷��� �ذᰡ��������!
		//sb3.insert(12,"���");
		//System.out.println("korea �ڿ� ������� �߰� : " + sb3.toString());

		// ���� Ǭ�� 
		//sb3.insert(sb3.lastIndexOf("��"),"���");
		//System.out.println("korea �ڿ� ������� �߰� : " + sb3.toString());
		//--==>> korea �ڿ� ������� �߰� : �ѱ�seoulkorea����츮������ѹα�

		// �׽�Ʈ 3
		//sb3.indexOf("korea");
		//System.out.println(sb3.indexOf("korea"));
		//--==>> 7

		// �Բ� Ǭ �ڵ�
		//sb3.insert(sb3.indexOf("korea") + 5,"���");  //�̷��� �Ǿ���ϰ� (+5)
		//sb3.insert("korea"���ڿ��ε��� + "korea"���ڿ�����, "���");
		sb3.insert(sb3.indexOf("korea") + "korea".length(),"���"); 
		//          -------------------     ---------------
		//			       7                      5
		System.out.println("korea �ڿ� ������� �߰� : " + sb3.toString());
		//--==>> korea �ڿ� ������� �߰� : �ѱ�seoulkorea����츮������ѹα�


		// �� ���츮����	���ڿ� ����    //--------delete() �޼ҵ�� ù ��° �Ű������� ���޵� �ε������� 
		//sb3.delete(14,18);               //--------�� ��° �Ű������� ���޵� �ε��� �ٷ� ���� ���ڱ����� �����ϴ� �޼ҵ�
		//System.out.println(sb3);                                                     ----��---
		//--==>> �ѱ�seoulkorea������ѹα�

		sb3.delete(sb3.indexOf("�츮����"), + sb3.indexOf("�츮����") + "�츮����".length());
		//             -------------------     --------------------------------------------
		//			       14                                      18
		System.out.println(sb3);
		//--==>> �ѱ�seoulkorea������ѹα�

		// �� ��� ���ڿ�(sb3)����
		//		��korea������ ���ڿ� ����(korea ����)
		//		��, ó�� ��� ���ѱ� seoul���� ������...
		//sb3.delete(7,18);
		sb3.delete(sb3.indexOf("korea"),sb3.length());
		System.out.println(sb3);
		//--==>> �ѱ�seoul

		////////////////////////////////////////////////////////////////////////////////////////

		// ���� ũ�� Ȯ��
		System.out.println("���� ũ�� : " + sb3.capacity());
		//--==>> ���� ũ�� : 34                          //--check~!! ���ڿ��� ���̴� �÷��ִµ� �ٿ����� ����

		// ���ڿ�(sb3)�� ���� Ȯ��
		System.out.println("���ڿ��� ���� : " + sb3.length());
		//--==>> ���ڿ��� ���� : 7

		// ���� ũ�� ����
		// -> ���� ���ڿ��� ��Ƶ� �� �ִ� ������ ũ���...
		sb3.trimToSize();

		// ���� ũ�� ���� ���� ���� ũ�� �ٽ� Ȯ��
		System.out.println("���� ũ�� : " + sb3.capacity());
		//--==>> ���� ũ�� : 7

	}
}