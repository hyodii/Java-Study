class Ex4_16_1 {
	public static void main(String[] args) { 
		int sum = 0;
		int i   = 0;

		while(true) { // ���� �ݺ��� for(;;;){}  while �� true ���� �Ұ�!!
			if(sum>100)
				break;	// �ڽ��� ���� �ϳ��� �ݺ����� �����.
			++i;
			sum += i;
		} // end of while

		System.out.println("i=" + i);
		System.out.println("sum=" + sum);
	}   
}
/*
i=14
sum=105
*/