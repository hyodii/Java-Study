import java.util.*;

class Ex4_18_1 {
	public static void main(String[] args) { 
		int menu = 0;
		int num = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("(1) ����");
			System.out.println("(2) ������");
			System.out.println("(3) ��");
			System.out.println("���ϴ� �޴�(1~3)�� �����ϼ���.(����:0) >>");
			
			String temp = sc.nextLine();
			menu = Integer.parseInt(temp);
			
			if(menu==0)
			{
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			else if(!(1<=menu && menu<=3))
			{
				System.out.println("�޴��� �߸� �����ϼ̽��ϴ�.(����� 0)");
				continue;
			}
			System.out.println("�����Ͻ� �޴���"+menu+"�� �Դϴ�.");
		}
	} // main�� ��
}