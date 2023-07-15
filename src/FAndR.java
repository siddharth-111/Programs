import java.util.HashMap;
import java.util.Scanner;

public class FAndR
{
	private static final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int t = sc.nextInt();

		while (t-- > 0)
		{
			int n = sc.nextInt();
			String str = sc.next();
			System.out.println(validString(str));
		}
	}

	static String validString(String str)
	{
		HashMap<Character, Integer> map = new HashMap<>();
		int counter = 0;
		for (int i = 0 ; i < str.length() ; i++)
		{
			char current = str.charAt(i);
			if (map.containsKey(current))
			{
				if (map.get(current) != counter)
				{
					return "NO";
				}
			}
			else
			{
				map.put(current, counter);
			}
			counter = counter == 0 ? 1 : 0;
		}

		return "YES";
	}
}
