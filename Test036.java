import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test036
{
  public static void main(String[] args) throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("이름 입력 : ");
    String name = br.readLine();
    
    System.out.print("국어 점수 입력 : ");
    int kor = Integer.parseInt(br.readLine());
    System.out.print("영어 점수 입력 : ");
    int eng = Integer.parseInt(br.readLine()); 
    System.out.print("수학 점수 입력 : ");
    int mat = Integer.parseInt(br.readLine());
    
    int avg = (kor + eng + mat) / 3;
    char grade;
    
    switch(avg/10)
    {
      case 10: case 9: grade = 'A'; break;
      case 8: grade = 'B';break;
      case 7: grade = 'C';break;
      case 6: grade = 'D';break;
      default : grade = 'F'; break;
    }
    System.out.printf("\n당신의 이름은 %s 입니다.\n", name);
    System.out.printf("총점은 %d, 평균은 %d 입니다.\n",(kor+eng+mat),avg);
    System.out.printf("등급은 %c 입니다.\n",grade);
    
  }
}
/* 실행 결과
이름 입력 : 정효진
국어 점수 입력 : 90
영어 점수 입력 : 80
수학 점수 입력 : 70

당신의 이름은 정효진 입니다.
총점은 240, 평균은 80 입니다.
등급은 B 입니다.
계속하려면 아무 키나 누르십시오 . . .
*/
