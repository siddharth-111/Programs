import java.util.Scanner;

public class FavProblem
{
	private static final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int t = sc.nextInt();

		while (t-- > 0)
		{
			int n = sc.nextInt();
			String str = sc.next();
			int max = 0;
			for (int i = 0 ; i < n ; i++)
			{
				int current = str.charAt(i) - 'a' + 1;
				max = current > max ? current : max;
			}
			System.out.println(max);
		}
	}
}
