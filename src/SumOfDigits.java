public class SumOfDigits
{
	public static void main(String args[])
	{
		System.out.println(addDigits(11));
	}

	public static int addDigits(int num) {
		int result = getSumOfDigits(num);

		if(getDigits(result) > 1)
			return addDigits(result);

		return result;
	}

	static int getSumOfDigits(int num)
	{
		int sumOfDigits = 0;

		while(num != 0)
		{
			sumOfDigits += (num % 10);
			num /= 10;
		}

		return sumOfDigits;
	}

	static int getDigits(int num)
	{
		int res = 0;
		while(num != 0)
		{
			num /= 10;
			res++;
		}

		return res;
	}
}
