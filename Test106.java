/* ======================================
■■■ 정렬(sort) 알고리즘 ■■■
=========================================*/

// 사용자로부터 여러 학생의 성적 데이터를 입력받아
// 점수가 높은 순에서 낮은 순으로 등수를 부여하는
// 결과를 출력하는 프로그램을 구현한다.
// 단, 배열과 정렬 알고리즘을 활용하여 작성할 수 있도록 한다.

// 실행 예)
// 인원 수 입력 : 5
// 이름 점수 입력(1) : 정효진 90
// 이름 점수 입력(2) : 김연경 80
// 이름 점수 입력(3) : 김희진 85
// 이름 점수 입력(4) : 염혜선 75
// 이름 점수 입력(5) : 양효진 95

/*
-------------------
1등 양효진 95
2등 정효진 90
3등 김희진 85
4등 김연경 80
5등 염혜선 75
------------------
계속하려면 아무 키나 느르세요...
*/


import java.util.Scanner;

public class Test106
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int n;
		int i=0, j;
		//boolean flag;

		
		System.out.print("인원 수 입력 : ");
		n = sc.nextInt();

		
		String name[] = new String[n];	
		int score[] = new int[n];		
		

		for (i=0; i<n; i++)
		{
			System.out.printf("이름 점수 입력(%d) : ",i+1);
			name[i] = sc.next();
			score[i] = sc.nextInt();
		}

		String temp=" ";

		
		// 선택정렬
		for (i=0; i<n-1; i++)
		{
			for (j=i+1; j<n; j++)
			{
				if (score[i]<score[j])
				{
					score[i] = score[i]^score[j];
					score[j] = score[j]^score[i];
					score[i] = score[i]^score[j];

					temp = name[i];
					name[i] = name[j];
					name[j] = temp;
				}

			}

		}
		

		/*
		// 버블정렬
		int k;
		
		for (i=1; i<n; i++)
		{
			for (j=0,k=0;j<n-1;j++)
			{
				if (score[j]>score[j+1])
				{
					score[j] = score[j]^score[j+1];
					score[j+1] = score[j+1]^score[j];
					score[j] = score[j]^score[j+1];

					temp = name[j];
					name[j] = name[j+1];
					name[j+1] = temp;

					k++;
				}
			}
		}
		*/


		int rank[] = new int[n];

		for (i=0; i<n; i++)
		{
			rank[i] = 1;
			for (j=0; j<n;j++ )
			{
				if (score[i]<score[j])
				{
					rank[i]++;
				}
			}

		}
		
		// 결과 출력
		System.out.println("--------------");

		for (i=1; i<=n; i++)
		{
			System.out.printf("%d등 %s %d\n",rank[i-1],name[i-1],score[i-1]);
		}
	

		System.out.println("--------------");


		
	}
}
/*
인원 수 입력 : 3
이름 점수 입력(1) : 정효진 98
이름 점수 입력(2) : 김연경 55
이름 점수 입력(3) : 김희진 87
--------------
1등 정효진 98
2등 김희진 87
3등 김연경 55
--------------
계속하려면 아무 키나 누르십시오 . . .
*/