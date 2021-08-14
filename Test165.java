/* ====================================================
  ���� �÷��� �����ӿ�ũ(Collection Framework) ����
=======================================================*/
//Ʈ���κ� ��ȭ��

/*
// Set -> HashSet, TreeSet
- ���� ����.
- �ߺ��� ������� �ʴ� ����(�⺻)

�� TreeSet<E>

	java.util.TreeSet<E> Ŭ������
	Set �������̽��� ����� SortedSet �������̽��� ������ Ŭ������
	�����͸� �߰��ϸ� �����͵��� �ڵ����� �������� ������ ����ȴ�.

	�ڵ������� ���ԵǾ������ϱ� �޸𸮼Һ� ���ϰ� �� ������ ��.
	�������� �����͸� ����� ��������� �������� �����Ϳ��� �Ⱦ� ���ɶ�����

*/

import java.util.TreeSet;
import java.util.Iterator;
import java.util.Comparator;


public class Test165
{
	public static void main(String[] args)
	{
		// TreeSet �ڷᱸ�� �ν��Ͻ� ����
		TreeSet<String> set = new TreeSet<String>();

		//TreeSet �ڷᱸ�� set �� ��� �߰� -> add();
		set.add("�Ͽ��ǿ����̴¼�");
		set.add("�̿��������");
		set.add("�Ʊ����Ѹ�");
		set.add("�͸���Į��");
		set.add("�ܿ�ձ�");
		set.add("¯���¸�����");
		set.add("�λ��̵�ƿ�");
		set.add("�̷��ҳ��ڳ�");
		set.add("���ɰ���");

		// Iterator �� Ȱ���� set ��� ��ü ���
		System.out.print("��ü ��� ��� : ");
		Iterator<String> it = set.iterator();
		while (it.hasNext())
		{
			System.out.print(it.next() + " ");
		}
		System.out.println();
		//--==>> ��ü ��� ��� : �ܿ�ձ� �͸���Į�� �̷��ҳ��ڳ� �Ʊ����Ѹ� ���ɰ��� �̿�������� �λ��̵�ƿ� ¯���¸����� �Ͽ��ǿ����̴¼�
		// �����ٶ󸶹ٻ�... ����(�ڵ����� �������� ����)


		
		// TreeSet �ڷᱸ�� �ν��Ͻ� ����
		//TreeSet<String> set2 = new TreeSet<String>();
		//TreeSet<GradeVO> set2 = new TreeSet<GradeVO>();
		TreeSet<GradeVO> set2 = new TreeSet<GradeVO>(new MyComparator<GradeVO>());

		
		//GradeVO ob = new GradeVO();

		//set2.add(GradeVO);  //-- �ν��Ͻ��� �����������!!
		//set2(ob);
		set2.add(new GradeVO("20211523","��ȿ��",90,80,70));  // ob ��ſ� new GradeVO()s�־��ټ�����
		set2.add(new GradeVO("20211524","��ȿ��",91,81,71));
		set2.add(new GradeVO("20211525","��ȿ��",98,78,88));
		set2.add(new GradeVO("20211526","��ȿ��",72,49,99));
		set2.add(new GradeVO("20211527","��ȿ��",56,31,90));
		
		// Iterator �� Ȱ���� set2 ��� ��ü ���
		//Iterator<String> it = treeset.iterator;  �̰žƴϴ�....
		/*
		Iterator<GradeVO> it2 = set2.iterator();
		while (it2.hasNext())
		{
			System.out.println(it2.next() + " ");  //�ؽ�Ʈ�� �����ϴ°� ���� �׷��̵���̿�Ÿ���̴�
		}
		System.out.println();
		*/
		//--==>> ���� �߻�

		//Ʈ���±����� ���Ϸ��� ������ �Ǿ��־���ϴµ� �׷��� ���ؼ� ���� �߻�
		//==>class MyComparator<T> implements Comparator<T>Ŭ���� ������ְ�
		//TreeSet<GradeVO> set2 = new TreeSet<GradeVO>(new MyComparator<GradeVO>()); �߰�����!

		// MyComparator Ŭ���� ����/ TreeSet ���� ���� ���� �� �ٽ� ����
		/*
		Iterator<GradeVO> it2 = set2.iterator();
		while (it2.hasNext())
		{
			System.out.println(it2.next() + " ");  //�ؽ�Ʈ�� �����ϴ°� ���� �׷��̵���̿�Ÿ���̴�
		}
		System.out.println();
		//--==>> �ؽ��ڵ�� ����(�̰ɷ� ����� ����� �Ǿ����� Ȯ���� ����)
		*/
		
		Iterator<GradeVO> it2 = set2.iterator();
		while (it2.hasNext())
		{
			GradeVO vo = it2.next();
			System.out.printf("%7s %7s %4d %4d %4d %6d\n"
							, vo.getHak(), vo.getName()
							, vo.getKor(), vo.getEng(), vo.getMat()
							, vo.getTot());
		}
		System.out.println();

		
	}
}

// VO   �� Value Object�� ���Ӹ�
// DTO  �� Data Transfer Object    VO�� DTO�� ���� ���� �������� ��(�ǹ�������)
// DAO  �� Data Access Object


class GradeVO
{
	//  �ֿ� �Ӽ� ����
	private String hak;          //-- �й�
	private String name;         //-- �̸�
	private int kor, eng, mat;   //-- ��������, ��������, ��������

	// ������(����� ���� ������ -> 5���� �Ű������� ���� ������)
	GradeVO(String hak, String name, int kor, int eng, int mat)
	{
		this.hak = hak;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

	// ������(����� ���� ������ -> �Ű����� ���� ������)
	//-- �Ű������� �����ϴ� ������ ����� ���ǻ����ڷ� �����Ͽ��� ������
	//   default �����ڰ� �ڵ����� ���Ե��� ���� ���� ����Ͽ�
	//   �߰��� ������ ������
	GradeVO()
	{
	}

	//�� getter/ setter�����
	// hak getter
	String getHak()   //public ���� ��
	{
		return hak;
	}
	// hak setter
	void setHak(String hak)
	{
		this.hak = hak;
	}

	// name getter
	String getName()
	{
		return name;
	}
	// name setter
	void setName(String name)
	{
		this.name = name;
	}
	//	kor getter
	int getKor()
	{
		return kor;
	}

	void setKor(int kor)
	{
		this.kor = kor;
	}

	int getEng()
	{
		return eng;
	}

	void setEng(int eng)
	{
		this.eng = eng;
	}

	int getMat()
	{
		return mat;
	}

	void setMat(int mat)
	{
		this.mat = mat;
	}

	// �߰� �޼ҵ� ����(���� ����)
	int getTot()
	{
		return kor + eng + mat;
	}

		

	
}


class MyComparator<T> implements Comparator<T>
{
	@Override
	public int compare(T o1,T o2)  //�յ� ���ؼ� �ڰ� �� ū��(-1) ������(1) ������(0) �˷��ִ� �޼ҵ�
	{
		GradeVO s1 = (GradeVO)o1;
		GradeVO s2 = (GradeVO)o2;

		/*
		//�й� ����(��������)
		return Integer.parseInt(s1.getHak()) - Integer.parseInt(s2.getHak());   //String Ÿ���̴ϱ� Integer.parseInt
		//						 "20211523"                    "20211524"
		//return Integer.parseInt( "20211523") - Integer.parseInt("20211524");
		//return 20211523 - 20211524
		//return -1
		*/

		//�й� ����(��������)
		//return Integer.parseInt(s2.getHak()) - Integer.parseInt(s1.getHak());

		//���� ����(��������)
		//return s1.getTot() - s2.getTot();

		//���� ����(��������)
		//return s2.getTot() - s1.getTot();

		// �̸� ��� (��������)  // API��ť��Ʈ �����ؼ� ã�ƺ���!   String �� compareTo
		//return s2.getName() - s2.getName();                       //--check~!!  �̸��� �̷��� ���� �� ����!
		// return ������;
		//System.out.println(s1.getName().compareTo(s2.getName()));

		//return s1.getName().compareTo(s2.getName());

		// �̸� ��� (��������)
		return s2.getName().compareTo(s1.getName());


		// ���ڿ� compareTo �޼ҵ�
		// ���ڿ� compareTo �޼ҵ�� int���� �ٸ��� ���ϰ��� �ٸ���.
		//  1. ���ڿ��� ���� ��� 0 ����
		//  2. �񱳴���� ���ڿ��� ���ԵǾ� �ִ� ��� s1.length -  s2.lenth����
		//  3. �ٸ� ���ڿ��� ��� �ش� ������ �ƽ�Ű�ڵ��� ���̸� �����Ѵ�.


   
	}
}