import java.util.Scanner;

public class EvenOrOdd
{
	private static final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int t = sc.nextInt();

		while (t-- > 0)
		{
			int n = sc.nextInt();
			int q = sc.nextInt();
			int[] arr = new int[n];
			int[] prefixSum = new int[n];
			for (int i = 0 ; i < n ; i++)
			{
				arr[i] = sc.nextInt();
				prefixSum[i] = arr[i] + ((i == 0) ? 0 : prefixSum[i - 1]);
			}

			while (q-- > 0)
			{
				int l = sc.nextInt() - 1;
				int r = sc.nextInt() - 1;
				int k = sc.nextInt();

				int sumToAdd = (r - l + 1) * k;
				int sumToDiff = (l == 0) ? prefixSum[r] : prefixSum[r] - prefixSum[l - 1];

				System.out.println((prefixSum[n - 1] + sumToAdd - sumToDiff) % 2 != 0 ? "YES" :
					"NO");
			}
		}
	}
}
