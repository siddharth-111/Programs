import java.util.HashMap;
import java.util.Scanner;

public class Main
{
	private static final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int t = sc.nextInt();

		while (t-- > 0)
		{
			int n = sc.nextInt();
			HashMap<String, Integer> map = new HashMap<>();
			map.put("01", Integer.MAX_VALUE);
			map.put("10", Integer.MAX_VALUE);
			map.put("11", Integer.MAX_VALUE);
			while (n-- > 0)
			{
				int time = sc.nextInt();
				String skill = sc.next();
				if (map.containsKey(skill))
				{
					map.put(skill, Math.min(map.get(skill), time));
				}
			}

			int minCombined =
				map.get("01") == Integer.MAX_VALUE || map.get("10") == Integer.MAX_VALUE ?
					Integer.MAX_VALUE : map.get("01") + map.get("10");
			int minTime = Math.min(map.get("11"), minCombined);

			System.out.println(minTime != Integer.MAX_VALUE ? minTime : -1);
		}
	}
}