/* =======================================================
■■■ 실행 흐름의 컨트롤(제어문, 조건문과 반복문) ■■■
- 반복문(while) 실습
==========================================================*/
/*
사용자로부터 임의의 정수를 입력받아
입력받은 정수가 소수인지 아닌지를 판별하여
결과를 출력하는 프로그램을 구현한다.

실행 예)
임의의 정수 입력 : 10
10 -> 소수아님
계속하려면...

임의의 정수 입력 : 11
11 -> 소수
계속하려면...

※ 소수 : 1  과 자기 자신의 값 이외의 어떤 수로도 나누어 떨어지지 않는 수.
          단, 1은 소수 아님.
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test046
{
	public static void main(String[] args) throws IOException
	{
		/*----------------------------------------------------------------------
		//내가푼코드
		int n,i = 1;
		String	res = "소수";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("임의의 정수 입력 : ");
		n = Integer.parseInt(br.readLine());
		
		
		
		while (i<=n)
		{	
			i++;  //나눌수 차례대로 증가
		
			
			if(n==1) //입력값이 1일 때
			{
				res = "소수 아님"; 
				break;
			}
			if(n==i) //입려값과 나눌수가 같을 때(자기 자신)
			{
				res = "소수"; 
				break;
			}
			if(n%i==0)
			{
				res = "소수 아님"; 
				break;	
			}			
	
		}	
			
		System.out.printf("%d -> %s\n",n,res);
		-------------------------------------------------------------------*/
		//함께푼코드
		//주요 변수 선언
		int num; //입력하는 값
		int n = 2; //입력값을 대상으로 나눗셈 연산을 수행할 변수 
		           //(1씩 증가해야함) 입력한 값 : 5 면 2 3 4 
		
		boolean flag = true; //-- 소수 여부를 받을 변수  - 우왓 소수다~!!

		
		String	res = "소수";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("임의의 정수 입력 : ");
		num = Integer.parseInt(br.readLine());
		
		

		//연산 및 처리
		while (n<num) // nun = 5 -> n = 2~4  //num = 15 -> n=2~14
		{
			//입력값(num)이 n로 나누어 떨어지는지 확인
			if(num%n==0)
			{
				//n은 소수가 아니다.(단, 1일때의 경우가 남음) 
				//여기서 결론을 낼수 없으므로 깃발변수 사용
				//플래그함수 boolean
				flag = false;
				break; //이러면 나누어서 0나오는 애들은 while문을 빠져나오게됨 (이게 없으면 n을 증가시켜서 계속 나눠보는작업 반복)
					   //n이 2고 num이 100인거 확인했으면 나와야되는데 break없으면 3도확인하고 99까지 확인함(비효율)
			}

		
			n++;
		}
		
		
		//결과 출력(출력 전에 수행해야 할 추가 확인 -> 1인지 아닌지에 대한 추가 검토)

			if (flag && num!=1) //flag는 true 아니면 flase 이니까 굳이 안써도 이건 true
				System.out.printf("%d -> 소수~!!!\n",num);

			else
				System.out.printf("%d -> 소수 아님!!!!!\n",num);



		
	}
}
/*
임의의 정수 입력 : 1
1 -> 소수 아님
계속하려면 아무 키나 누르십시오 . . .

임의의 정수 입력 : 101
101 -> 소수
계속하려면 아무 키나 누르십시오 . . .

임의의 정수 입력 : 4
4 -> 소수 아님
계속하려면 아무 키나 누르십시오 . . .

*/