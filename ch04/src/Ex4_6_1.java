import java.util.Scanner;

class Ex4_6_1 {
	public static void main(String[] args) 
	{ 
		System.out.print("���� ���� �Է����ּ���>>");
		Scanner sc = new Scanner(System.in);		
		int month = sc.nextInt();
		
		switch(month)
		{
			case 3:
			case 4:
			case 5:
				System.out.println("���� ������ ���Դϴ�!");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("���� ������ �����Դϴ�!");
				break;
			case 9: case 10: case 11:
				System.out.println("���� ������ �����Դϴ�!");
				break;
			//case 12: case 1: case 2:
			default:
				System.out.println("���� ������ �ܿ��Դϴ�!");	
		
		}// switch ��
		
	} // main�� ��
}