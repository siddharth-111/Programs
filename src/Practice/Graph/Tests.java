package Practice.Graph;

import org.junit.jupiter.api.Test;

public class Tests
{
	@Test
	public void testPreReq()
	{
		var res = new TasksPrerequisite().isPossible(4,3, new int[][]
			{
				{1, 0},
				{2, 1},
				{3,2}
			});
		System.out.println(res);
	}
}
