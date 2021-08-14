/* ====================================================
  ���� �÷��� �����ӿ�ũ(Collection Framework) ����
=======================================================*/

import java.util.Stack;

public class Test151
{
	// ���� ���ڿ� �迭 ���� �� �ʱ�ȭ
	private static final String[] colors = {"����", "���", "�ʷ�", "�Ķ�", "����", "����"};
	
	//����� ���� ������
		public Test151()
		{
			// st��� Stack �ڷᱸ�� ����
			// ���׸��� Ȱ���Ͽ� �ڷᱸ���� ���� ������ ǥ�� �� <String>
			Stack<String> st = new Stack<String>();

			// st ��� Stack �ڷᱸ���� ������ ���
			//st = colors;  (X)

			for(String color : colors)
			{
				st.push(color);
			}

			st.push("����");
			
			//st.push(10);  //->�ִ°� String�̶�� ���س��� ���ִ´�
			//st.push(10.0); 
			//--==>> ���� �߻�(������ ����)
			//-- ���׸� ǥ������ ���� �����ϰ� �ִ�
			//   String �� �ƴ� �ٸ� �ڷ���(int �� double) ��
			//	 ���ÿ� push()�Ϸ��� �߱� ����...




			// ��� �޼ҵ� ȣ��
			popStack(st);
		}

		//��� �޼ҵ�
		private void popStack(Stack<String> st)
		{
			System.out.print("pop : ");
			while (!st.empty())  //add �� push�� ������ó�� empty�� isempty ����!
				System.out.print(st.pop() + " ");
			System.out.println();
		}
		

	public static void main(String[] args)
	{ 
		new Test151();
	}
}

/*
pop : ���� ���� ���� �Ķ� �ʷ� ��� ����
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/