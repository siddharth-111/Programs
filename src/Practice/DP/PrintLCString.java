package Practice.DP;

public class PrintLCString
{
	int longestCommonSubstr(String S1, String S2, int n, int m){
		return lcStringDP(S1, S2, n, m);
	}

	int lcString(String s1, String s2, int n, int m, int lcs)
	{
		if (n == 0 || m == 0)
			return lcs;

		if (s1.charAt(n - 1) == s2.charAt(m - 1))
		{
			lcs = lcString(s1, s2, n - 1, m - 1, lcs + 1);
		}

		int lcs1 = lcString(s1, s2, n, m - 1, 0);
		int lcs2 = lcString(s1, s2, n - 1, m, 0);

		return Math.max(lcs, Math.max(lcs1, lcs2));
	}

	int lcStringDP(String s1, String s2, int n, int m)
	{
		int[][] sol = new int[n + 1][m + 1];
		for (int i = 0 ; i <= n ; i++)
		{
			for (int j = 0 ; j <= m ; j++)
			{
				if (i == 0 || j == 0)
				{
					sol[i][j] = 0;
				}
				else
				{
					if ((s1.charAt(i - 1) == s2.charAt(j - 1)))
					{
						sol[i][j] = 1 + sol[i - 1][j - 1];
					}
					else
					{
						sol[i][j] = 0;
					}
				}
			}
		}

		int maxLen = 0;

		for (int i = 0 ; i <= n ; i++)
		{
			for (int j = 0 ; j <= m ; j++)
			{
				maxLen = Math.max(maxLen, sol[i][j]);
			}
		}

		return maxLen;
	}

	String printLCStringDP(String s1, String s2)
	{
		return printLCStringDP(s1, s2, s1.length(), s2.length());
	}
	String printLCStringDP(String s1, String s2, int n, int m)
	{
		int[][] sol = new int[n + 1][m + 1];
		for (int i = 0 ; i <= n ; i++)
		{
			for (int j = 0 ; j <= m ; j++)
			{
				if (i == 0 || j == 0)
				{
					sol[i][j] = 0;
				}
				else
				{
					if ((s1.charAt(i - 1) == s2.charAt(j - 1)))
					{
							sol[i][j] = 1 + sol[i - 1][j - 1];
					}
					else
					{
						sol[i][j] = 0;
					}
				}
			}
		}



		int maxLen = 0;
		int maxRow = 0;
		for (int i = 0 ; i <= n ; i++)
		{
			for (int j = 0 ; j <= m ; j++)
			{
				if (sol[i][j] > maxLen)
				{
					maxRow = i;
					maxLen = sol[i][j];
				}
			}
		}

		String res = "";
		while (maxLen-- > 0)
		{
			res += s1.charAt(maxRow - 1);
			maxRow--;
		}


		return new StringBuilder(res).reverse().toString();
	}
}
