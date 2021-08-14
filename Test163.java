/* ====================================================
  ■■■ 컬렉션 프레임워크(Collection Framework) ■■■
=======================================================*/

/*

//asList()메소드와 toArray()메소드

String[] -> List : Arrays.asList()
List -> String[] : List.toArray()
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Test163
{
	public static void main(String[] args)
	{
		List<String> mList = new ArrayList<String>();

		mList.add("1");
		mList.add("2");
		mList.add("3");

		// List -> String[]
		String[] sArrays = mList.toArray(new String[mList.size()]);  //스트링배열의 형태로 리스트를 배열로 변경

		for (String s:sArrays)
		{
			System.out.print(s +" ");
		}
		System.out.println();
		//--==>> 1 2 3

		// String[] -> list
		List<String> mNewList = Arrays.asList(sArrays);
		// ※ 『Arrays.asList()』의 반환 자료형 List이기 때문에

		for (String s : mNewList)
		{
			System.out.print(s + " ");
		}
		System.out.println();
		//--==>> 1 2 3




	}
}