/* ====================================================
  ���� �÷��� �����ӿ�ũ(Collection Framework) ����
=======================================================*/

/*

//asList()�޼ҵ�� toArray()�޼ҵ�

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
		String[] sArrays = mList.toArray(new String[mList.size()]);  //��Ʈ���迭�� ���·� ����Ʈ�� �迭�� ����

		for (String s:sArrays)
		{
			System.out.print(s +" ");
		}
		System.out.println();
		//--==>> 1 2 3

		// String[] -> list
		List<String> mNewList = Arrays.asList(sArrays);
		// �� ��Arrays.asList()���� ��ȯ �ڷ��� List�̱� ������

		for (String s : mNewList)
		{
			System.out.print(s + " ");
		}
		System.out.println();
		//--==>> 1 2 3




	}
}