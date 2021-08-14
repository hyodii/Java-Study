/* ====================================================
  ���� �÷��� �����ӿ�ũ(Collection Framework) ����
=======================================================*/

//  ���� �ڷᱸ�� ��ü ���� �� ���� ��
//  ����� ���� Ŭ���� Ȱ�� �� �ڷ���


import java.util.Vector;

// ����� ���� Ŭ���� ���� �� �ڷ���ó�� Ȱ��
class MyData
{
	// �ֿ� �Ӽ� ���� �� �ֿ� ���� ����(��� ����)
	private String name;	  //-- �̸�
	private int age;	      //-- ����

	// getXxx() �� getter
	// setXxx() �� setter
	//Setter�� Main �Լ����� �ν��Ͻ� �ʵ忡 �����ؼ� ����ϴ� �Լ�
	//Getter�� Main �Լ����� �ν��Ͻ� �ʵ忡 �����ؼ� ����ϴ� �Լ�


	//  getter / setter ����
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	// ������ (�Ű����� 2���� ������)  ��  ����� ���� ������
	public MyData(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	// ������ (�Ű����� ���� ������) �� ����� ���� ������
	public MyData()
	{
		name = "";
		age = 0;
	}


}

public class Test158
{
	public static void main(String[] args)
	{
		// ���� �ڷᱸ�� ����
		Vector<MyData> v = new Vector<MyData>();

		// ���� �ڷᱸ�� v ��
		// Ȳ���� 13�� / �迬�� 7�� / ������ 50 ��
		// ��Ƴ���

		/*
		// ����� 
		MyData st1 = new MyData();
		st1.setName("Ȳ����");
		st1.setAge(13);
		v.add(st1);

		MyData st2 = new MyDate();
		st2.setName("�迬��");
		st2.setAge(7);
		v.add(st2);

		MyData st3 = new MyDate();
		st3.setName("������");
		st3.setAge(50);
		v.add(st3);
		*/

		/*
		// �����
		// ���̵����� Ÿ�� �ν��Ͻ� ����
		MyData st1 = new MyData("Ȳ����",13);
		v.add(st1);
		MyData st2 = new myData("�迬��",7);
		v.add(st2);
		MyData st3 = new myData("������",50);
		v.add(st3);
		*/

		// �����
		v.add(new MyData("Ȳ����",13));
		v.add(new MyData("�迬��",7));
		v.add(new MyData("������",50));

		/* ���� Ǭ �߰��ϴ� ��
		v.addElement(new MyData("Ȳ����",13));
		v.addElement(new MyData("�迬��", 7));
		v.addElement(new MyData("������", 50));
		System.out.println("������ ��� ���� : " + length);


		// ���� �ڷᱸ�� v �� ��ü ��� ���
		System.out.print("��ü ��� ��� : ");
		for (MyData str :v )
		{
			System.out.print(str +  " ");
		}
		System.out.println();
		//--==>> 
		*/

		// ���� �ڷᱸ�� v �� ��� ����(���) ��ü ����ϱ�
		// ���� ��)
		// �̸� : Ȳ����, ���� : 13��
		// �̸� : �迬��, ���� : 7��
		// �̸� : ������, ���� : 50��
		

		// ����� 
		for (MyData m : v)
		{
			//System.out.println("�̸� : " + m.getName() + ", " + "���� : " + m.getAge() + "��");  //m.name ���ϰ� ���Ƴ��� m.getName()
			System.out.printf("�̸�:%s, ����:%d��\n",m.getName(),m.getAge());
		}
		System.out.println();
		//�̸�:Ȳ����, ����:13��
		//�̸�:�迬��, ����:7��
		//�̸�:������, ����:50��

		//���� RecordŬ������ �迭�� �ν��Ͻ� �־ �ߴ���ó�� ���� ���� �ϳ��� ��Ҹ��� ������ MyData �ν��Ͻ��� �� �ִٰ� ����


		// �����
		for (int i=0; i<v.size();i++)
		{
			System.out.printf("�̸�:%s, ����:%d��\n",v.elementAt(i).getName(),v.elementAt(i).getAge());
		}
		System.out.println();
		//�̸�:Ȳ����, ����:13��
		//�̸�:�迬��, ����:7��
		//�̸�:������, ����:50��

		// �����
		for (Object temp : v)
		{
			System.out.printf("�̸�:%s, ����:%d��\n",((MyData)temp).getName(), ((MyData)temp).getAge());
													//------------ �ٿ� ĳ����
		}
		System.out.println();
		//�̸�:Ȳ����, ����:13��
		//�̸�:�迬��, ����:7��
		//�̸�:������, ����:50��
		
 	}
}
