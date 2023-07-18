package Practice.Trees;

import java.util.ArrayList;
import java.util.List;

public class RootToNodePath
{
	List<Integer> rootToNode(TreeNode root, int key)
	{
		List<Integer> result = new ArrayList<>();
		List<Integer> path = new ArrayList<>();
		populateRootToNode(root, path, result, key);
		return result;
	}

	void populateRootToNode(TreeNode root, List<Integer> path, List<Integer> result, int key)
	{
		if (root == null)
			return;
		if (root.val == key)
		{
			for (var node : path)
			{
				result.add(node);
			}
			result.add(root.val);
			return;
		}

		path.add(root.val);
		populateRootToNode(root.left, path, result, key);
		populateRootToNode(root.right, path, result, key);
		path.remove(path.size() - 1);
	}
}
