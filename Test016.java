/* =================================================
���� �ڹ� �⺻ ���α׷��� ����
- �ڹ��� �⺻ ����� : java.util.Scanner
===================================================*/

// �� java.util.Scanner
/*
�ܶ� ���� ������ ����Ͽ� �Է��� ��ū�� ���� �����ϸ�
����Ʈ(default)�� ���Ǵ� �ܶ����ڴ� �����̴�.
�ۼ��� ���� ��ū�� next() �޼ҵ带 ���
�ٸ� ����(�ڷ���)�� ������ ��ȯ�� �� �ִ�.

���۵帮������ ���߿� ���԰�, �� �����ؼ� ���ͼ� ����

��ǻ�ʹ� ����� ������ ������ �� ������
*/

//�Է� : "��� ���� �ٳ���" -> ���۵帮���� �ϳ��ϳ� �Է¹��� ��ĳ�ʴ� �ܶ����� �߶�
//��ĳ�ʴ� �ڷ�����ȯ�ؼ� ������

import java.util.Scanner; //�̰� �������!!

public class Test016
{
	public static void main(String[] args) //throws IOException ���ص� ��
	{
		// �� Scanner �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in); //InputStreamReader �� �ʿ����
		
		
		String name; //�̸�
		int kor, eng, mat; //����, ����, ���� ����

		// �� ���� �� ó��
		System.out.print("�̸��� �Է��ϼ��� : ");
		//br.readLine();
		name = sc.next();

		System.out.print("���� ������ �Է��ϼ��� : ");
		//kor = Integer.parseInt(br.readLine());
		//kor = Integer.parseInt(sc.next());
		kor = sc.nextInt();

		System.out.print("���� ������ �Է��ϼ��� : ");
		eng = sc.nextInt();

		System.out.print("���� ������ �Է��ϼ��� : ");
		mat = sc.nextInt();



		// �� ��� ���
		System.out.println();
		System.out.println(">> �̸� : " + name);
		System.out.println(">> ���� : " + (kor + eng + mat)); //(��ȣ)���ϸ� 908070�̷������� ����



	}
}
/* ���� ���
�̸��� �Է��ϼ��� : ��ȿ��
���� ������ �Է��ϼ��� : 90
���� ������ �Է��ϼ��� : 80
���� ������ �Է��ϼ��� : 70

>> �̸� : ��ȿ��
>> ���� : 240
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/