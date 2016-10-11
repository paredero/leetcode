package leetcode;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;
import leetcode.MyQueue;

public class LeetTest {

	@Test
	public void test() {
		MyQueue q = new MyQueue();
		q.push(1);
		q.push(2);
		assertEquals(q.peek(), 1);
	}

}
