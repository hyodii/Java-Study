/* =================================================
���� �ڹ� �⺻ ���α׷��� ����
- ������ �ڷ���
- �ڹ��� �⺻ ����� : BufferedReader Ŭ����
===================================================*/
// ����ڷκ��� �̸�, ��������, ��������, �������� �� �Է¹޾�
// �̸��� ������ ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// �̸��� �Է��ϼ��� : ��ȿ��
// ���� ���� �Է� : 90
// ���� ���� �Է� : 80
// ���� ���� �Է� : 70

// ====[���]====
// �̸� : ��ȿ��
// ���� : 240
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test013
{
	public static void main(String[] args) throws IOException
	{
		//[���� Ǯ���� ����]
		/*-----------------------------------------------------------------------------------------------
		// �� �ֿ� ���� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int kor, eng, math, sum;
		String name;




		// �� ���� �� ó��
		// 1. ����ڿ��� �ȳ� �޼��� ���
		System.out.print("�̸��� �Է��ϼ��� : ");
		// 2. ����ڰ� �Է��� �����͸� ���� ���·� ��ȯ�� �� ��Ƴ���
		name = br.readLine();  //String �϶��� �̷���!
		
		//3. �ȳ� �޼��� ���
		System.out.print("���� ���� �Է� : ");
		//4. ����ڰ� �Է��� �����͸� ���� ���·� ��ȯ�� �� ��Ƴ���
		kor = Integer.parseInt(br.readLine());
		
		//5. �ȳ� �޼��� ���
		System.out.print("���� ���� �Է� : ");
		eng = Integer.parseInt(br.readLine());
		
		//6. ����ڰ� �Է��� �����͸� ���� ���·� ��ȯ�� �� ��Ƴ���
		System.out.print("���� ���� �Է� : ");
		math = Integer.parseInt(br.readLine());
		
		//7.���� ����
		sum = kor + eng + math;

		// �� ��� ���
		System.out.println();  //����
		System.out.println("====[���]====");
		System.out.printf("�̸� : %s\n", name);
		System.out.printf("���� : %d\n", sum);
		
		--------------------------------------------------------------------------------------------------*/

		//[�Բ� Ǯ���� ����] -> BufferedReader �ν��Ͻ� �������� & strTemp ����
		// �� �ֿ� ���� ����
		//BufferedReader �ν��Ͻ� ����
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //�Ʒ�ó�� ǥ���� �� ���� /�Ѵ� ������ �� �־����!!
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		//int kor, eng, math, sum;
		//�밡���� ǥ��� ������ �̸��� ���� ���� �˼��ְ�!
		String strName; // �̸� ����
		int nKor, nEng, nMat; //����, ����, ���� ���� ����
		int nTot; // ��������

		String strTemp; // ���ڿ� ������ �ӽ� ���� ����



		// �� ���� �� ó��
		// - ����ڿ��� �ȳ� �޼��� ���(�̸� �Է� �ȳ�)
		System.out.print("�̸��� �Է��ϼ��� : ");
		// - ����ڰ� �Է��� �����͸� ���� ���·� ��ȯ�� �� ��Ƴ���
		strName = br.readLine(); //String �϶��� �̷���!
		
		//- �ȳ� �޼��� ���(���� ���� �Է� �ȳ�)
		System.out.print("���� ���� �Է� : ");
		
		//- ����ڰ� �Է��� ��(�ܺ� ������)�� ������ ��Ƴ���
		strTemp = br.readLine();
		//- ���� ���� ���� strTemp �� ����ִ� ���� �� ��ȯ �� ���� ���� ������ ��Ƴ���
		nKor = Integer.parseInt(strTemp);

		//- ����ڰ� �Է��� �����͸� ���� ���·� ��ȯ�� �� ��Ƴ���
		nKor = Integer.parseInt(strTemp);
		
		//- �ȳ� �޼��� ���
		System.out.print("���� ���� �Է� : ");
		strTemp = br.readLine();
		nEng = Integer.parseInt(strTemp);
		
		//- ����ڰ� �Է��� �����͸� ���� ���·� ��ȯ�� �� ��Ƴ���
		System.out.print("���� ���� �Է� : ");
		strTemp = br.readLine();
		nMat = Integer.parseInt(strTemp);
		
		//- ���� ����
		nTot = nKor + nEng + nMat;

		// �� ��� ���
		System.out.println();  //����
		System.out.println("====[���]====");
		System.out.printf("�̸� : %s\n", strName);
		System.out.printf("���� : %d\n", nTot);
		//System.out.println("�̸� : " + strName);
		//System.out.println("���� : " + nTot);


	
	}
}

/* 
�̸��� �Է��ϼ��� : ��ȿ��
���� ���� �Է� : 90
���� ���� �Է� : 80
���� ���� �Է� : 70

====[���]====
�̸� : ��ȿ��
���� : 240
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/