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
*/

//��ȿ�� 90 80 70
import java.util.Scanner;

public class Test017
{
	public static void main(String[] args)
	{
		// �� �ֿ� ���� ����
		Scanner sc = new Scanner(System.in);
		String name;
		int kor, eng, mat, tot;
		
		// �� ���� �� ó��
		System.out.print("�̸� �������� �������� �������� �Է�(���� ����) ");

		// ����ڰ� �Է��� �����͸� ������ ������ ��Ƴ���
		name = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();

		// ���� ����
		//tot = name + kor + eng + mat; �̷��� ���� ���ڿ�
		tot = kor + eng + mat; //�̷��� �������

		// �� ��� ���
		System.out.println();
		System.out.println(">> �̸� : " + name);
		System.out.println(">> ���� : " + tot);
	}
}
/* ���� ���
�̸� �������� �������� �������� �Է�(���� ����) ��ȿ�� 90 80 70

>> �̸� : ��ȿ��
>> ���� : 240
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/