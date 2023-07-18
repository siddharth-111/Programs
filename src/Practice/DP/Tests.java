package Practice.DP;

import org.junit.jupiter.api.Test;

public class Tests
{
	@Test
	public void TestLCS()
	{
		var lcs = new PrintLCS().getLCS("axa", "aba");
		System.out.println(lcs);

		lcs = new PrintLCS().getLCS("AGGTAB", "GXTXAYB");
		System.out.println(lcs);
	}

	@Test
	public void TestPrintLCString()
	{
		var lcs = new PrintLCString().printLCStringDP("axa", "aba");
		System.out.println(lcs);

		lcs = new PrintLCString().printLCStringDP("GeeksforGeeks", "GeeksQuiz");
		System.out.println(lcs);

		lcs = new PrintLCString().printLCStringDP("zxabcdezy", "yzabcdezx");
		System.out.println(lcs);
	}
}
