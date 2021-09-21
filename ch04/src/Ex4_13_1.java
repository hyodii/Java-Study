class Ex4_13_1 {
	public static void main(String[] args) {
		int sum = 0;
		int i=0;
		// i를 1씩 증가시켜 sum에 계속 더해준다 언제까지? 100을 안넘길때까지
		while(sum<100)
		{
			System.out.printf("%d - %d\n",i,sum);
			sum += ++i;
		}
	} // main의 끝
}
/*
0 - 0
1 - 1
2 - 3
3 - 6
4 - 10
5 - 15
6 - 21
7 - 28
8 - 36
9 - 45
10 - 55
11 - 66
12 - 78
13 - 91
*/