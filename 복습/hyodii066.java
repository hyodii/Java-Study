/* ====================================
���� Ŭ������ �ν��Ͻ� ����
=======================================*/

// �� CircleTest.java ���ϰ� ��Ʈ~!!!
/*
���� ���̿� �ѷ� ���ϱ�
���� ���̿� �ѷ��� ���� �� �ִ� Ŭ������ �����Ѵ�.
(Ŭ������ : CircleTest) -> CircleTest.java
Test065.java ������ �����ϵ�
���� ���� �� ���� ���Ϸ� ������ �۾��� �����Ѵ�.
����, BufferedReader�� Ȱ���Ѵ�.

���� ���� = ������ * ������ * 3.141592
���� �ѷ� = ������ * 2 * 3.141592

���� ��)
������ �Է� : 13

�������� 13�� ����
���� : xxx.xx
�ѷ� : xxx.xx
����Ϸ��� �ƹ� Ű�� ��������...
*/
import java.io.IOException;

public class hyodii066
{
	public static void main(String[] args) throws IOException
	{
		CircleTest ob = new CircleTest();

		ob.input();
		double a = ob.calArea();
		double b = ob.calLength();

		ob.print(a,b);
	}
}
/*
������ �Է� : 5

�������� 5�� ����
���� : 78.54
�ѷ� : 31.42
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/