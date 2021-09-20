import java.util.Scanner;

class Ex4_6_1 {
	public static void main(String[] args) 
	{ 
		System.out.print("현재 월을 입력해주세요>>");
		Scanner sc = new Scanner(System.in);		
		int month = sc.nextInt();
		
		switch(month)
		{
			case 3:
			case 4:
			case 5:
				System.out.println("현재 계절은 봄입니다!");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("현재 계절은 여름입니다!");
				break;
			case 9: case 10: case 11:
				System.out.println("현재 계절은 가을입니다!");
				break;
			//case 12: case 1: case 2:
			default:
				System.out.println("현재 계절은 겨울입니다!");	
		
		}// switch 끝
		
	} // main의 끝
}