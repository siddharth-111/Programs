import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SubseqAddition
{
	private static final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int t = sc.nextInt();

		while (t-- > 0)
		{
			int n = sc.nextInt();
			int[] c = new int[n];
			for (int i = 0 ; i < n ; i++)
			{
				c[i] = sc.nextInt();
			}
			Arrays.sort(c);
			System.out.println(subsetContainString(c));
		}
	}

	static String subsetContainString(int[] c)
	{
		if (c[0] != 1)
			return "NO";

		List<Integer> a = new ArrayList<>();
		a.add(1);

		for (int i = 1 ; i < c.length ; i++)
		{
			if (!containsSubset(a, a.size(), c[i], new Boolean[a.size() + 1][c[i] + 1]))
				return "NO";
			a.add(c[i]);
		}

		return "YES";
	}

	static boolean containsSubset(List<Integer> arr, int n, int sum, Boolean[][] memo)
	{
		boolean[][] sol = new boolean[n + 1][sum + 1];

		for (int i = 0 ; i <= n ; i++)
		{
			for (int j = 0 ; j <= sum ; j++)
			{
				if (i == 0)
				{
					sol[i][j] = j == 0;
				}
				else if (j == 0)
				{
					sol[i][j] = true;
				}
				else
				{
					sol[i][j] = arr.get(i - 1) <= j ?
						(sol[i - 1][j - arr.get(i - 1)] || sol[i - 1][j]) : sol[i - 1][j];
				}
			}
		}

		return sol[n][sum];
	}
}
