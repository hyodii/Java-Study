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

//��ȿ��,90, 80, 70
//��ȿ�� *90 *80 *70
//��ȿ�� -90 -80 -70
import java.util.Scanner;

public class Test018
{
	public static void main(String[] args)
	{
		// �� �ֿ� ���� ����
		Scanner sc = new Scanner(System.in);
		String name;
		int kor, eng, mat, tot;

		// �� ���� �� ó��
		System.out.print("�̸�,��������,��������,�������� �Է�(,����) : ");
		sc = new Scanner(sc.next()).useDelimiter("\\s*,\\s*");
		//               ��ȿ��,90,80,70
		// Deliter �� ������!
		// \ns* -> ���ǹ��ڿ�  \s*�� ���;��ϴϱ� \\s*�Է�

		name = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();

		tot = kor + eng + mat;
				
		// �� ��� ���
		System.out.println("\n >> �̸� : " + name);
		System.out.println(" >> ���� : " + tot);

	}
}
/* ���� ��� (�� �Է��� �� ���������� �ȵ� ,�θ� ����!!)
�̸�, ��������, ��������, �������� �Է�(, ����) : ��ȿ��,80,70,90

 >> �̸� : ��ȿ��
 >> ���� : 240
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/