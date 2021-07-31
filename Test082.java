public class Test082
{
	public static void main(String[] args)
	{
		int[][] a = new int[5][5];

		for (int i=0; i<a.length; i++)
		{
			int n = i+1;                   //----check~!!!
			for (int j=0; j<a[i].length;j++ )
			{
				a[i][j] = n;
				n++;
			}
		}

		for (int i=0; i<a.length; i++)
		{
			for (int j=0; j<a.length;j++ )
			{
				System.out.printf("%3d",a[i][j]);
			}System.out.println();
		}

	}
}
