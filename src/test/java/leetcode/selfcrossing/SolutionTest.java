package leetcode.selfcrossing;

import static org.junit.Assert.*;

import org.junit.Test;

import leetcode.selfcrossing.Solution;

public class SolutionTest {

	@Test
	public void test() {
		int[] x = {2,1,1,2};
		Solution solution = new Solution();
		assertTrue(solution.isSelfCrossing(x));
	}

}
