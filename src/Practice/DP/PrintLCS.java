package Practice.DP;

public class PrintLCS
{
	String getLCS(String str1, String str2)
	{
		int[][] sol = new int[str1.length() + 1][str2.length() + 1];

		for (int i = 0 ; i <= str1.length() ; i++)
		{
			for (int j = 0 ; j <= str2.length() ; j++)
			{
				if (i == 0 || j == 0)
				{
					sol[i][j] = 0;
				}
				else
				{
					sol[i][j] = str1.charAt(i - 1) == str2.charAt(j - 1) ?
						sol[i - 1][j - 1] + 1 : Math.max(sol[i - 1][j], sol[i][j - 1]);
				}
			}
		}

		int i = str1.length();
		int j = str2.length();
		String res = "";
		while (i > 0 && j > 0)
		{
			if (str1.charAt(i - 1) == str2.charAt(j - 1))
			{
				res += str1.charAt(i - 1);
				i--;
				j--;
			}
			else
			{
				if (sol[i - 1][j] > sol[i][j - 1])
					i--;
				else
					j--;
			}
		}

		return new StringBuilder(res).reverse().toString();
	}
}
