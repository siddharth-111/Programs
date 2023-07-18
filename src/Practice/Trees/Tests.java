package Practice.Trees;

import org.junit.jupiter.api.Test;

public class Tests
{
	@Test
	public void testRToleaf()
	{
		TreeNode root = TreeUtils.formTree(new Integer[]{1,2,3,4,5,null,null,null,null,6,7});
		var res = new RootToNodePath().rootToNode(root, 7);

		for (var node : res)
		{
			System.out.print(node + " ");
		}
		System.out.println();
		res = new RootToNodePath().rootToNode(root, 6);

		for (var node : res)
		{
			System.out.print(node + " ");
		}
		System.out.println();
		res = new RootToNodePath().rootToNode(root, 5);

		for (var node : res)
		{
			System.out.print(node + " ");
		}
	}
}
