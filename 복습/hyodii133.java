public class hyodii133
{
	public static void main(String[] args)
	{
		String s = "seoul korea";
		System.out.println(s);
		// seoul korea

		// ○ 문자열 추출
		System.out.println(s.substring(6,9));
		// kor

		System.out.println(s.substring(7));
		// orea
		
		// ○ 문자열의 데이터(값) 비교
		System.out.println(s.equals("seoul korea"));
		System.out.println(s.equals("Souel korea"));
		// true
		// false
		//-- 대소문자 구분

		System.out.println(s.equalsIgnoreCase("Seoul KorEA"));
		// true

		System.out.println(s.indexOf("kor"));
		// 6

		System.out.println(s.indexOf("ea"));
		// 9

		System.out.println(s.indexOf("e"));
		// 1

		System.out.println(s.indexOf("tt"));
		// -1   '음수' 를 반환~!!


	}
}