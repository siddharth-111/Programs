package Recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PermSpaces
{
	ArrayList<String> permutation(String S){

		ArrayList<String> permutation = new ArrayList<>();

		perm(permutation, S, "", S.length());

		Collections.sort(permutation, Comparator.reverseOrder());

		return permutation;
	}

	void perm(ArrayList<String> permutation, String input, String output,
		int idx)
	{
		if (idx == 1)
		{
			output = input.charAt(idx - 1) + output;
			permutation.add(output);
			return;
		}

		String output1 = input.charAt(idx - 1) + output;
		String output2 = " " + input.charAt(idx - 1) + output;

		perm(permutation, input, output1, idx - 1);
		perm(permutation, input, output2, idx - 1);
	}
}
