package Practice.Trees;

import java.util.ArrayList;

public class LCA
{
//	Node lca(Node root, int n1,int n2)
//	{
//		ArrayList<Node> path1 = new ArrayList<>();
//		ArrayList<Node> path2 = new ArrayList<>();
//		getRootToNodePath(root, path1, n1);
//		getRootToNodePath(root, path2, n2);
//
//		Node lca = null;
//
//		for (int i = 0 ; i < path1.size() && i < path2.size() ; i++)
//		{
//			if (path1.get(i).data == path2.get(i).data)
//				lca = path1.get(i);
//		}
//
//		return lca;
//	}
//
//	boolean getRootToNodePath(Node root, ArrayList<Node> path, int key)
//	{
//		if (root == null)
//			return false;
//
//		path.add(root);
//
//		if (root.data == key)
//			return true;
//
//
//		if (getRootToNodePath(root.left, path, key) || getRootToNodePath(root.right, path, key))
//		{
//			return true;
//		}
//
//		path.remove(path.size() - 1);
//
//		return false;
//	}

	Node lca(Node root, int n1,int n2)
	{
		if (root == null)
			return null;

		if (root.data == n1 || root.data == n2)
			return root;

		Node leftChild = lca(root.left, n1, n2);
		Node rightChild = lca(root.right, n1, n2);

		if (leftChild != null && rightChild != null)
			return root;

		if (leftChild != null)
			return leftChild;

		return rightChild;
	}
}
