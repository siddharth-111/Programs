
import java.util.Scanner;

public class Candies
{
	private static final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int t = sc.nextInt();

		while (t-- > 0)
		{
			int n = sc.nextInt();
			int evenSum = 0;
			int oddSum = 0;
			while (n-- > 0)
			{
				int num = sc.nextInt();
				if (num % 2 == 0)
				{
					evenSum += num;
				}
				else
				{
					oddSum += num;
				}
			}
			System.out.println(evenSum > oddSum ? "YES" : "NO");
		}
	}
}
