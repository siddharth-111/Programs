package Practice.Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TasksPrerequisite
{
	public boolean isPossible(int N,int P, int[][] prerequisites)
	{
		ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

		for (int i = 0 ; i < N ; i++)
		{
			adj.add(new ArrayList<>());
		}

		for (var prereq : prerequisites)
		{
			adj.get(prereq[1]).add(prereq[0]);
		}

		int[] indegree = new int[N];

		for (var node : adj)
		{
			for (var neighbor : node)
			{
				indegree[neighbor]++;
			}
		}

		Queue<Integer> queue = new LinkedList<>();

		for (int i = 0; i < N; i++) {
			if (indegree[i] == 0)
				queue.add(i);
		}

		int count = 0;
		while (!queue.isEmpty())
		{
			int current = queue.poll();
			count++;

			for (var neighbor : adj.get(current))
			{
				indegree[neighbor]--;
				if (indegree[neighbor] == 0)
					queue.add(neighbor);
			}
		}

		return count == N;
	}

	static int[] findOrder(int n, int m, ArrayList<ArrayList<Integer>> prerequisites)
	{
		ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

		for (int i = 0 ; i < n ; i++)
		{
			adj.add(new ArrayList<>());
		}

		for (var prereq : prerequisites)
		{
			adj.get(prereq.get(1)).add(prereq.get(0));
		}

		int[] indegree = new int[n];

		for (var node : adj)
		{
			for (var neighbor : node)
			{
				indegree[neighbor]++;
			}
		}

		Queue<Integer> queue = new LinkedList<>();

		for (int i = 0; i < n; i++) {
			if (indegree[i] == 0)
				queue.add(i);
		}

		List<Integer> order = new ArrayList<>();
		while (!queue.isEmpty())
		{
			int current = queue.poll();
			order.add(current);

			for (var neighbor : adj.get(current))
			{
				indegree[neighbor]--;
				if (indegree[neighbor] == 0)
					queue.add(neighbor);
			}
		}

		return order.stream().mapToInt(i -> i).toArray();
	}
}
