import java.util.Scanner;

public class BinaryInversion
{
	private static final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int t = sc.nextInt();

		while (t-- > 0)
		{
			int n = sc.nextInt();
			if (n == 1)
			{
				System.out.println(0);
			}
			else
			{
				int[] array = new int[n];
				int zeroCount = 0;
				int oneCount = 0;
				int firstZeroIndex = -1;
				int lastOneIndex = -1;

				for (int i = 0 ; i < n ; i++)
				{
					int current = sc.nextInt();
					array[i] = current;
					if (current == 0)
					{
						zeroCount++;
						if (firstZeroIndex == -1)
							firstZeroIndex = i;
					}
					else
					{
						oneCount++;
						lastOneIndex = i;
					}
				}

				if (oneCount >= zeroCount)
				{
					array[lastOneIndex] = 0;
					oneCount--;
					zeroCount++;
				}
				else {
					array[firstZeroIndex] = 1;
					oneCount++;
					zeroCount--;
				}

				int count = 0;
				for (int i = 0 ; i < array.length ; i++)
				{
					if (array[i] == 1)
					{
						count += zeroCount;
					}
					else
					{
						zeroCount--;
					}
				}
				System.out.println(count);
			}
		}
	}
}
