import java.util.Scanner;

public class BitPlus
{
	private static final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();

		int x = 0;
		while (n-- > 0)
		{
			x = sc.next().contains("+") ? x + 1 : x - 1;
		}
		System.out.println(x);
	}
}
