package leetcode.buyandsell;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestBuyAndSell {
	@Test
	public void test() {
		int[] x = {2,1,2,0,1};
		leetcode.buyandsell.Solution solution = new leetcode.buyandsell.Solution();
		assertTrue(solution.maxProfit(x)==2);
	}
	
	@Test
	public void test2() {
		int[] x = {1,2};
		leetcode.buyandsell.Solution solution = new leetcode.buyandsell.Solution();
		assertTrue(solution.maxProfit(x)==1);
	}
}
