import java.util.Scanner;

public class Advantage
{
	private static final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int t = sc.nextInt();

		while (t-- > 0)
		{
			int max = Integer.MIN_VALUE;
			int secondMax = Integer.MIN_VALUE;
			for (int i = 0 ; i < 3 ; i++)
			{
				int current = sc.nextInt();
				if (current > max)
				{
					secondMax = max;
					max = current;
				}
				else if (current > secondMax)
				{
					secondMax = current;
				}
			}
			System.out.println(secondMax);

		}
	}
}
