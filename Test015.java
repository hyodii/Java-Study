/* =================================================
���� �ڹ� �⺻ ���α׷��� ����
- �ڹ��� �⺻ ����� : System.in.read()
- print() / println() / printf()
===================================================*/

public class Test015
{
	public static void main(String[] args)
	{
		System.out.print("AAA");
		System.out.print("BBB");
		//System.out.print("CCC"\n);  -> ������ �����߻�(���ڿ� �ȿ��� �����ؾ���!)
		System.out.print("CCC\n");

		System.out.println(); //����
		//System.out.print(); // ���� �߻�(������ ����)

		System.out.printf("1234567890");
		System.out.printf("1234567890\n"); // \n����
		System.out.printf("1234567890%n"); // %n����

		//System.out.printf(); //���� �߻�(������ ����)

		System.out.printf("%d + %d = %d%n", 10, 20, 30);
		System.out.printf("%d\n",123);
		System.out.printf("%10d\n",123); // %10d -> �� 10�ڸ� �տ� 7�ڸ� ���� ���ڸ� �����ϴ� ����
		System.out.printf("%8d\n", 1234); // %8d -> �� 8�ڸ� �տ� 4�ڸ� ���� 4�ڱ� ����
		System.out.printf("%010d\n",123); //%010d -> �� 10�ڸ��ε� �տ� 0���� ä����
		/*
		123
		123
		1234
		0000000123
		����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
		*/
		System.out.printf("%+d\n",365);
		System.out.printf("+%d\n",365); // �� ��� ���⸦ ����!! ������ ����ó�� ���� ������!!
		/*
		+365
        +365
		*/

		System.out.printf("%d\n",+365);
		// => 365

		// System.out.printf("-d%\n",365); -> ��Ÿ�� ���� �߻�
		System.out.printf("-%d\n",365);
		//-365
		System.out.printf("%d\n",-365);
		//-365

		System.out.printf("%(d\n",-365); //������ ��ȣ�ȿ�
		//(365)
		System.out.printf("%(d\n",365);  //����� �׳� ����
		//365

		//System.out.printf("%d\n",'A');
		// ��Ÿ�� ���� �߻�

		System.out.printf("%c\n",'A'); //%s�� ���ڿ� %c�� ����!
		// A

		//System.out.printf("%c\n","ABCD");
		// -> ��Ÿ�� ����
		System.out.printf("%s\n","ABCD");
		// ABCD

		System.out.printf("%d\n",365);
		System.out.printf("%h\n",365);
		//16d(16����)
		System.out.printf("%o\n",24);
		//30 (8����)

		System.out.printf("%b\n",true);  //  true   vs  "true"    -> ���� boolean �ڴ� ���ڿ�
		//true (�Ҹ����� %b)

		System.out.printf("%f\n",123.23);
		//123.230000 (�Ҽ��� ���� 6�ڸ����� ����)
		System.out.printf("%.2f\n",123.23);
		//123.23
		System.out.printf("%.2f\n",123.231);
		//123.23
		System.out.printf("%.2f\n",123.236);
		//123.24
		
		//System.out.printf("%.10d\n",123);  //�̰� ����Ȯ��
		System.out.printf("%8.2f\n",123.236); // ���� 8ĭ Ȯ�� �׸��� �Ҽ��� ���� �ι�°���� ǥ�� . �� �ڸ�����
		//  123.24 (����2��)

		System.out.printf("%2.2f\n",123.236); // ���� �������ִ� �ͺ��� ���� �ڸ����� ��Ÿ���� ���õǰ� �����
		//123.24


	}
}
/* ���� ���
AAABBBCCC

12345678901234567890
1234567890
10 + 20 = 30
123
       123
    1234
0000000123
+365
+365
365
-365
-365
(365)
365
A
ABCD
365
16d
30
true
123.230000
123.23
123.23
123.24
  123.24
123.24
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .


*/