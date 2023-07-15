package Recursion;

import org.junit.jupiter.api.Test;

public class Tests
{

	@Test
	public void testPermSpaces()
	{
		var res = new PermSpaces().permutation("ABC");
		for (var perm : res)
		{
			System.out.println(perm);
		}
	}
}
