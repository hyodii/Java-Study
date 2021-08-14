/* ===============================
■■■ 클래스와 인스턴스 ■■■
- 클래스와 인스턴스 활용
==================================*/

// 1. record 클래스
//	 - 속성만 존재하는 클래스로 설계할 것~!!

public class Record
{
	// 학생 한 명을 표현할 수 있는 속성들로 구성
	String name;
	//int kor, eng, mat;
	int[] score = new int[3]; // score[0] = 국어, score[1] = 영어, score[2] = 수학
	int tot;
	double avg;
	int rank;
}